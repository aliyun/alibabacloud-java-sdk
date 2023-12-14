// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cas20200407.models;

import com.aliyun.tea.*;

public class ListUserCertificateOrderRequest extends TeaModel {
    /**
     * <p>The number of the page to return.</p>
     */
    @NameInMap("CurrentPage")
    public Long currentPage;

    /**
     * <p>The domain names that are bound or the ID of the order. Fuzzy match is supported.</p>
     */
    @NameInMap("Keyword")
    public String keyword;

    /**
     * <p>The type of the order. Valid values:</p>
     * <br>
     * <p>*   **CPACK**: virtual resource order. If you set OrderType to CPACK, only the information about orders that are generated to consume the certificate quota is returned.</p>
     * <p>*   **BUY**: purchase order. If you set OrderType to BUY, only the information about purchase orders is returned. In most cases, this type of order can be ignored.</p>
     * <p>*   **UPLOAD**: uploaded certificate. If you set OrderType to UPLOAD, only uploaded certificates are returned.</p>
     * <p>*   **CERT**: certificate. If you set OrderType to CERT, both issued certificates and uploaded certificates are returned.</p>
     */
    @NameInMap("OrderType")
    public String orderType;

    /**
     * <p>The ID of the resource group.</p>
     */
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    /**
     * <p>The number of entries to return on each page. Default value: 50.</p>
     */
    @NameInMap("ShowSize")
    public Long showSize;

    /**
     * <p>The certificate status of the order. Valid values:</p>
     * <br>
     * <p>*   **PAYED**: pending application. You can set Status to PAYED only if you set OrderType to CPACK or BUY.</p>
     * <p>*   **CHECKING**: reviewing. You can set Status to CHECKING only if you set OrderType to CPACK or BUY.</p>
     * <p>*   **CHECKED_FAIL**: review failed. You can set Status to CHECKED_FAIL only if you set OrderType to CPACK or BUY.</p>
     * <p>*   **ISSUED**: issued.</p>
     * <p>*   **WILLEXPIRED**: about to expire.</p>
     * <p>*   **EXPIRED**: expired.</p>
     * <p>*   **NOTACTIVATED**: not activated. You can set Status to NOTACTIVATED only if you set OrderType to CPACK or BUY.</p>
     * <p>*   **REVOKED**: revoked. You can set Status to REVOKED only if you set OrderType to CPACK or BUY.</p>
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
