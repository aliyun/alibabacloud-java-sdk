// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class ActivateClientCertificateRequest extends TeaModel {
    /**
     * <p>The certificate ID, which can be obtained by calling the <a href="https://help.aliyun.com/document_detail/2852848.html">ListClientCertificates</a> operation.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>babaded901474b9693acf530e0fb****</p>
     */
    @NameInMap("Id")
    public String id;

    /**
     * <p>The website ID, which can be obtained by calling the <a href="https://help.aliyun.com/document_detail/2850189.html">ListSites</a> operation.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1234567890123</p>
     */
    @NameInMap("SiteId")
    public Long siteId;

    public static ActivateClientCertificateRequest build(java.util.Map<String, ?> map) throws Exception {
        ActivateClientCertificateRequest self = new ActivateClientCertificateRequest();
        return TeaModel.build(map, self);
    }

    public ActivateClientCertificateRequest setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public ActivateClientCertificateRequest setSiteId(Long siteId) {
        this.siteId = siteId;
        return this;
    }
    public Long getSiteId() {
        return this.siteId;
    }

}
