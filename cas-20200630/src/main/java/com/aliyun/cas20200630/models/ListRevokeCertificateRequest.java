// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cas20200630.models;

import com.aliyun.tea.*;

public class ListRevokeCertificateRequest extends TeaModel {
    /**
     * <p>The name of the department in the organization. The organization is associated with the intermediate certificate authority (CA) certificate from which the certificate is issued.</p>
     */
    @NameInMap("CurrentPage")
    public Integer currentPage;

    /**
     * <p>The signature algorithm of the certificate.</p>
     */
    @NameInMap("ShowSize")
    public Integer showSize;

    public static ListRevokeCertificateRequest build(java.util.Map<String, ?> map) throws Exception {
        ListRevokeCertificateRequest self = new ListRevokeCertificateRequest();
        return TeaModel.build(map, self);
    }

    public ListRevokeCertificateRequest setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    public ListRevokeCertificateRequest setShowSize(Integer showSize) {
        this.showSize = showSize;
        return this;
    }
    public Integer getShowSize() {
        return this.showSize;
    }

}
