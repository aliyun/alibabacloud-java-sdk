// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class UploadOriginCaCertificateRequest extends TeaModel {
    /**
     * <p>The certificate content.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>-----BEGIN CERTIFICATE-----</p>
     */
    @NameInMap("Certificate")
    public String certificate;

    /**
     * <p>The certificate name.</p>
     * 
     * <strong>example:</strong>
     * <p>example</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>The website ID, which can be obtained by calling the <a href="https://help.aliyun.com/document_detail/2850189.html">ListSites</a> operation.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1234567890***</p>
     */
    @NameInMap("SiteId")
    public Long siteId;

    public static UploadOriginCaCertificateRequest build(java.util.Map<String, ?> map) throws Exception {
        UploadOriginCaCertificateRequest self = new UploadOriginCaCertificateRequest();
        return TeaModel.build(map, self);
    }

    public UploadOriginCaCertificateRequest setCertificate(String certificate) {
        this.certificate = certificate;
        return this;
    }
    public String getCertificate() {
        return this.certificate;
    }

    public UploadOriginCaCertificateRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public UploadOriginCaCertificateRequest setSiteId(Long siteId) {
        this.siteId = siteId;
        return this;
    }
    public Long getSiteId() {
        return this.siteId;
    }

}
