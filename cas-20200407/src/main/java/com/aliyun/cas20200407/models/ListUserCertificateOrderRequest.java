// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cas20200407.models;

import com.aliyun.tea.*;

public class ListUserCertificateOrderRequest extends TeaModel {
    /**
     * <p>The page number. Default value: 1.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("CurrentPage")
    public Long currentPage;

    /**
     * <p>Performs a fuzzy query. The keyword can be a domain name or a resource ID.</p>
     * 
     * <strong>example:</strong>
     * <p>cert-instanceId</p>
     */
    @NameInMap("Keyword")
    public String keyword;

    /**
     * <p>The resource type. Default value: <strong>CPACK</strong>. Valid values:</p>
     * <ul>
     * <li><p><strong>CPACK</strong>: An order for a resource plan. Only orders created from a resource plan are returned.</p>
     * </li>
     * <li><p><strong>BUY</strong>: A direct purchase. Only orders created from direct purchases are returned. You can ignore this type in most cases.</p>
     * </li>
     * <li><p><strong>UPLOAD</strong>: An uploaded certificate. Only uploaded certificates are returned.</p>
     * </li>
     * <li><p><strong>CERT</strong>: A certificate. Both issued and uploaded certificates are returned.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>CPACK</p>
     */
    @NameInMap("OrderType")
    public String orderType;

    /**
     * <p>The ID of the resource group. For more information, see <a href="https://help.aliyun.com/document_detail/2716559.html">ListResources</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>rg-ae******4wia</p>
     */
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    /**
     * <p>The number of entries to return on each page. Default value: 50.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("ShowSize")
    public Long showSize;

    /**
     * <p>The status of the order. Valid values:</p>
     * <ul>
     * <li><p><strong>PAYED</strong>: The certificate is pending application. This value is valid only when OrderType is set to CPACK or BUY.</p>
     * </li>
     * <li><p><strong>CHECKING</strong>: The certificate is under review. This value is valid only when OrderType is set to CPACK or BUY.</p>
     * </li>
     * <li><p><strong>CHECKED_FAIL</strong>: The review failed. This value is valid only when OrderType is set to CPACK or BUY.</p>
     * </li>
     * <li><p><strong>ISSUED</strong>: The certificate is issued.</p>
     * </li>
     * <li><p><strong>WILLEXPIRED</strong>: The certificate is about to expire.</p>
     * </li>
     * <li><p><strong>EXPIRED</strong>: The certificate has expired.</p>
     * </li>
     * <li><p><strong>NOTACTIVATED</strong>: The certificate is not activated. This value is valid only when OrderType is set to CPACK or BUY.</p>
     * </li>
     * <li><p><strong>REVOKED</strong>: The certificate is revoked. This value is valid only when OrderType is set to CPACK or BUY.</p>
     * </li>
     * </ul>
     * <p>If OrderType is CERT or UPLOAD and you leave this parameter empty, active certificates are returned by default. Active certificates are those in the ISSUED or WILLEXPIRED state. If OrderType is CPACK or BUY and you leave this parameter empty, all orders are returned by default.</p>
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
