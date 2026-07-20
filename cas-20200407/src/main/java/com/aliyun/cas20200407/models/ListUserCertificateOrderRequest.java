// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cas20200407.models;

import com.aliyun.tea.*;

public class ListUserCertificateOrderRequest extends TeaModel {
    /**
     * <p>The page number of the current page in a paginated query.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("CurrentPage")
    public Long currentPage;

    /**
     * <p>The keyword for fuzzy search. Matches the domain name or the corresponding resource ID.</p>
     * 
     * <strong>example:</strong>
     * <p>cert-instanceId</p>
     */
    @NameInMap("Keyword")
    public String keyword;

    /**
     * <p>The resource type. Default value: <strong>CPACK</strong>. Valid values:</p>
     * <ul>
     * <li><strong>CPACK</strong>: resource virtual order. Only orders generated from quotas are returned.</li>
     * <li><strong>BUY</strong>: purchase order. Only orders generated from purchases are returned. You can ignore this type in most cases.</li>
     * <li><strong>UPLOAD</strong>: uploaded certificate. Only uploaded certificates are returned.</li>
     * <li><strong>CERT</strong>: certificate. Both issued certificates and uploaded certificates are returned.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>CPACK</p>
     */
    @NameInMap("OrderType")
    public String orderType;

    /**
     * <p>The resource group ID. You can obtain this ID by calling the <a href="https://help.aliyun.com/document_detail/2716559.html">ListResources</a> operation.</p>
     * 
     * <strong>example:</strong>
     * <p>rg-ae******4wia</p>
     */
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    /**
     * <p>The number of entries per page in a paginated query. Default value: 50.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("ShowSize")
    public Long showSize;

    /**
     * <p>The order status. Valid values:</p>
     * <ul>
     * <li><strong>PAYED</strong>: Pending application. Valid when OrderType is set to CPACK or BUY.</li>
     * <li><strong>CHECKING</strong>: Under review. Valid when OrderType is set to CPACK or BUY.</li>
     * <li><strong>CHECKED_FAIL</strong>: Review failed. Valid when OrderType is set to CPACK or BUY.</li>
     * <li><strong>ISSUED</strong>: Issued.</li>
     * <li><strong>WILLEXPIRED</strong>: About to expire.</li>
     * <li><strong>EXPIRED</strong>: Expired.</li>
     * <li><strong>NOTACTIVATED</strong>: Not activated. Valid when OrderType is set to CPACK or BUY.</li>
     * <li><strong>REVOKED</strong>: Revoked. Valid when OrderType is set to CPACK or BUY.</li>
     * </ul>
     * <p>If OrderType is set to CERT or UPLOAD and Status is empty, valid certificates are returned by default, including issued and about-to-expire certificates. If OrderType is set to CPACK or BUY and Status is empty, all orders are returned by default.</p>
     * 
     * <strong>example:</strong>
     * <p>ISSUED</p>
     */
    @NameInMap("Status")
    public String status;

    public static ListUserCertificateOrderRequest build(java.util.Map<String, ?> map) throws Exception {
        ListUserCertificateOrderRequest self = new ListUserCertificateOrderRequest();
        return TeaModel.build(map, self);
    }

    public ListUserCertificateOrderRequest setCurrentPage(Long currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Long getCurrentPage() {
        return this.currentPage;
    }

    public ListUserCertificateOrderRequest setKeyword(String keyword) {
        this.keyword = keyword;
        return this;
    }
    public String getKeyword() {
        return this.keyword;
    }

    public ListUserCertificateOrderRequest setOrderType(String orderType) {
        this.orderType = orderType;
        return this;
    }
    public String getOrderType() {
        return this.orderType;
    }

    public ListUserCertificateOrderRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public ListUserCertificateOrderRequest setShowSize(Long showSize) {
        this.showSize = showSize;
        return this;
    }
    public Long getShowSize() {
        return this.showSize;
    }

    public ListUserCertificateOrderRequest setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

}
