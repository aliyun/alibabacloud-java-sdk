// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cas20200407.models;

import com.aliyun.tea.*;

public class ListUserCertificateOrderRequest extends TeaModel {
    /**
     * <p>The number of the page to return.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("CurrentPage")
    public Long currentPage;

    /**
     * <p>The domain name that is bound or the ID of the resource. Fuzzy match is supported.</p>
     * 
     * <strong>example:</strong>
     * <p>cert-instanceId</p>
     */
    @NameInMap("Keyword")
    public String keyword;

    /**
     * <p>The type of the order. Default value: <strong>CPACK</strong>. Valid values:</p>
     * <ul>
     * <li><strong>CPACK</strong>: virtual resource order. If you set OrderType to CPACK, only the information about orders that are generated to consume the certificate quota is returned.</li>
     * <li><strong>BUY</strong>: purchase order. If you set OrderType to BUY, only the information about purchase orders is returned. In most cases, this type of order can be ignored.</li>
     * <li><strong>UPLOAD</strong>: uploaded certificate. If you set OrderType to UPLOAD, only uploaded certificates are returned.</li>
     * <li><strong>CERT</strong>: certificate. If you set OrderType to CERT, both issued certificates and uploaded certificates are returned.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>CPACK</p>
     */
    @NameInMap("OrderType")
    public String orderType;

    /**
     * <p>The ID of the resource group. You can call the <a href="https://help.aliyun.com/document_detail/2716559.html">ListResources</a> operation to obtain the ID.</p>
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
     * <p>The certificate status of the order. Valid values:</p>
     * <ul>
     * <li><strong>PAYED</strong>: pending application. You can set Status to PAYED only if you set OrderType to CPACK or BUY.</li>
     * <li><strong>CHECKING</strong>: validating. You can set Status to CHECKING only if you set OrderType to CPACK or BUY.</li>
     * <li><strong>CHECKED_FAIL</strong>: validation failed. You can set Status to CHECKED_FAIL only if you set OrderType to CPACK or BUY.</li>
     * <li><strong>ISSUED</strong>: issued.</li>
     * <li><strong>WILLEXPIRED</strong>: about to expire.</li>
     * <li><strong>EXPIRED</strong>: expired.</li>
     * <li><strong>NOTACTIVATED</strong>: not activated. You can set Status to NOTACTIVATED only if you set OrderType to CPACK or BUY.</li>
     * <li><strong>REVOKED</strong>: revoked. You can set Status to REVOKED only if you set OrderType to CPACK or BUY.</li>
     * </ul>
     * <p>If you set OrderType to CERT or UPLOAD and Status is left empty, valid certificates are returned by default, including issued certificates and certificates that are about to expire. If you set OrderType to CPACK or BUY and Status is left empty, all orders are returned by default.</p>
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
