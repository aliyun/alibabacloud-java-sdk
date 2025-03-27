// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class UploadSiteOriginClientCertificateRequest extends TeaModel {
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
     * <p>The private key of the certificate.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>-----BEGIN PRIVATE KEY-----</p>
     */
    @NameInMap("PrivateKey")
    public String privateKey;

    /**
     * <p>Site ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>123456789****</p>
     */
    @NameInMap("SiteId")
    public Long siteId;

    public static UploadSiteOriginClientCertificateRequest build(java.util.Map<String, ?> map) throws Exception {
        UploadSiteOriginClientCertificateRequest self = new UploadSiteOriginClientCertificateRequest();
        return TeaModel.build(map, self);
    }

    public UploadSiteOriginClientCertificateRequest setCertificate(String certificate) {
        this.certificate = certificate;
        return this;
    }
    public String getCertificate() {
        return this.certificate;
    }

    public UploadSiteOriginClientCertificateRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public UploadSiteOriginClientCertificateRequest setPrivateKey(String privateKey) {
        this.privateKey = privateKey;
        return this;
    }
    public String getPrivateKey() {
        return this.privateKey;
    }

    public UploadSiteOriginClientCertificateRequest setSiteId(Long siteId) {
        this.siteId = siteId;
        return this;
    }
    public Long getSiteId() {
        return this.siteId;
    }

}
