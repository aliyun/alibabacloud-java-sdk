// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class UploadOriginCaCertificateRequest extends TeaModel {
    /**
     * <p>The content of the CA certificate.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>-----BEGIN CERTIFICATE-----</p>
     */
    @NameInMap("Certificate")
    public String certificate;

    /**
     * <p>The name of the certificate.</p>
     * 
     * <strong>example:</strong>
     * <p>example</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>The site ID. You can call the <a href="~~ListSites~~">ListSites</a> operation to get this ID.</p>
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
