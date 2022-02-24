// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cas20200407.models;

import com.aliyun.tea.*;

public class ListUserCertificateOrderRequest extends TeaModel {
    @NameInMap("CurrentPage")
    public Long currentPage;

    @NameInMap("Keyword")
    public String keyword;

    @NameInMap("OrderType")
    public String orderType;

    @NameInMap("ShowSize")
    public Long showSize;

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
