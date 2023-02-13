// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cas20200630.models;

import com.aliyun.tea.*;

public class ListClientCertificateRequest extends TeaModel {
    /**
     * <p>The number of the page to return. Default value: **1**.</p>
     */
    @NameInMap("CurrentPage")
    public Integer currentPage;

    /**
     * <p>The number of certificates to return on each page. Default value: **20**.</p>
     */
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
