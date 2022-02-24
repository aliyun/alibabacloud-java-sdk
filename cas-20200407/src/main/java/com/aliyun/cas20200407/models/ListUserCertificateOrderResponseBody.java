// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cas20200407.models;

import com.aliyun.tea.*;

public class ListUserCertificateOrderResponseBody extends TeaModel {
    @NameInMap("CertificateOrderList")
    public String certificateOrderList;

    @NameInMap("CurrentPage")
    public Long currentPage;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ShowSize")
    public Long showSize;

    @NameInMap("TotalCount")
    public Long totalCount;

    public static ListUserCertificateOrderResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListUserCertificateOrderResponseBody self = new ListUserCertificateOrderResponseBody();
        return TeaModel.build(map, self);
    }

    public ListUserCertificateOrderResponseBody setCertificateOrderList(String certificateOrderList) {
        this.certificateOrderList = certificateOrderList;
        return this;
    }
    public String getCertificateOrderList() {
        return this.certificateOrderList;
    }

    public ListUserCertificateOrderResponseBody setCurrentPage(Long currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Long getCurrentPage() {
        return this.currentPage;
    }

    public ListUserCertificateOrderResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListUserCertificateOrderResponseBody setShowSize(Long showSize) {
        this.showSize = showSize;
        return this;
    }
    public Long getShowSize() {
        return this.showSize;
    }

    public ListUserCertificateOrderResponseBody setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

}
