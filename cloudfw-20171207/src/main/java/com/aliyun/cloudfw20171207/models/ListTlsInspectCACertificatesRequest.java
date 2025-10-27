// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class ListTlsInspectCACertificatesRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>C3E91391-16CD-1BFC-A133-******D429</p>
     */
    @NameInMap("CaCertId")
    public String caCertId;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("CurrentPage")
    public Integer currentPage;

    /**
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    public static ListTlsInspectCACertificatesRequest build(java.util.Map<String, ?> map) throws Exception {
        ListTlsInspectCACertificatesRequest self = new ListTlsInspectCACertificatesRequest();
        return TeaModel.build(map, self);
    }

    public ListTlsInspectCACertificatesRequest setCaCertId(String caCertId) {
        this.caCertId = caCertId;
        return this;
    }
    public String getCaCertId() {
        return this.caCertId;
    }

    public ListTlsInspectCACertificatesRequest setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    public ListTlsInspectCACertificatesRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

}
