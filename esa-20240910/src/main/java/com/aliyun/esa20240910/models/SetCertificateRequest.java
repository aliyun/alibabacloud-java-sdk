// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class SetCertificateRequest extends TeaModel {
    /**
     * <p>The certificate ID on Certificate Management Service.</p>
     * 
     * <strong>example:</strong>
     * <p>30000478</p>
     */
    @NameInMap("CasId")
    public Long casId;

    /**
     * <p>The certificate content.</p>
     * 
     * <strong>example:</strong>
     * <p>-----BEGIN CERTIFICATE-----</p>
     */
    @NameInMap("Certificate")
    public String certificate;

    /**
     * <p>The certificate ID on ESA.</p>
     * 
     * <strong>example:</strong>
     * <p>30001303</p>
     */
    @NameInMap("Id")
    public String id;

    @NameInMap("KeyServerId")
    public String keyServerId;

    /**
     * <p>The certificate name.</p>
     * 
     * <strong>example:</strong>
     * <p>yourCertName</p>
     */
    @NameInMap("Name")
    public String name;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The private key of the certificate.</p>
     * 
     * <strong>example:</strong>
     * <p>-----BEGIN PRIVATE KEY-----</p>
     */
    @NameInMap("PrivateKey")
    public String privateKey;

    /**
     * <p>The region.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("Region")
    public String region;

    @NameInMap("SecurityToken")
    public String securityToken;

    /**
     * <p>The website ID, which can be obtained by calling the <a href="https://help.aliyun.com/document_detail/2850189.html">ListSites</a> operation.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1234567890123</p>
     */
    @NameInMap("SiteId")
    public Long siteId;

    /**
     * <p>The certificate type. Valid values:</p>
     * <ul>
     * <li>cas: a certificate purchased by using Certificate Management Service.</li>
     * <li>upload: a custom certificate that you upload.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cas</p>
     */
    @NameInMap("Type")
    public String type;

    public static SetCertificateRequest build(java.util.Map<String, ?> map) throws Exception {
        SetCertificateRequest self = new SetCertificateRequest();
        return TeaModel.build(map, self);
    }

    public SetCertificateRequest setCasId(Long casId) {
        this.casId = casId;
        return this;
    }
    public Long getCasId() {
        return this.casId;
    }

    public SetCertificateRequest setCertificate(String certificate) {
        this.certificate = certificate;
        return this;
    }
    public String getCertificate() {
        return this.certificate;
    }

    public SetCertificateRequest setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public SetCertificateRequest setKeyServerId(String keyServerId) {
        this.keyServerId = keyServerId;
        return this;
    }
    public String getKeyServerId() {
        return this.keyServerId;
    }

    public SetCertificateRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public SetCertificateRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public SetCertificateRequest setPrivateKey(String privateKey) {
        this.privateKey = privateKey;
        return this;
    }
    public String getPrivateKey() {
        return this.privateKey;
    }

    public SetCertificateRequest setRegion(String region) {
        this.region = region;
        return this;
    }
    public String getRegion() {
        return this.region;
    }

    public SetCertificateRequest setSecurityToken(String securityToken) {
        this.securityToken = securityToken;
        return this;
    }
    public String getSecurityToken() {
        return this.securityToken;
    }

    public SetCertificateRequest setSiteId(Long siteId) {
        this.siteId = siteId;
        return this;
    }
    public Long getSiteId() {
        return this.siteId;
    }

    public SetCertificateRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

}
