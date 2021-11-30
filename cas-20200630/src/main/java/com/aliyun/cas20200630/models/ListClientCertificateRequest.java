// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cas20200630.models;

import com.aliyun.tea.*;

public class ListClientCertificateRequest extends TeaModel {
    @NameInMap("CurrentPage")
    public Integer currentPage;

    @NameInMap("ShowSize")
    public Integer showSize;

    public static ListClientCertificateRequest build(java.util.Map<String, ?> map) throws Exception {
        ListClientCertificateRequest self = new ListClientCertificateRequest();
        return TeaModel.build(map, self);
    }

    public ListClientCertificateRequest setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    public ListClientCertificateRequest setShowSize(Integer showSize) {
        this.showSize = showSize;
        return this;
    }
    public Integer getShowSize() {
        return this.showSize;
    }

}
