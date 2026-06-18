// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class SetCertificateRequest extends TeaModel {
    /**
     * <p>The cloud certificate ID. This parameter is required when Type is set to cas.</p>
     * 
     * <strong>example:</strong>
     * <p>30000478</p>
     */
    @NameInMap("CasId")
    public Long casId;

    /**
     * <p>The certificate content. This parameter is required when Type is set to upload.</p>
     * 
     * <strong>example:</strong>
     * <p>-----BEGIN CERTIFICATE-----</p>
     */
    @NameInMap("Certificate")
    public String certificate;

    /**
     * <p>The certificate ID. Certificates of the free type (created by calling the ApplyCertificate operation) are not supported. Certificates of the cas and upload types are supported.</p>
     * 
     * <strong>example:</strong>
     * <p>babae7c40fef412d887688b91c9e****</p>
     */
    @NameInMap("Id")
    public String id;

    /**
     * <p>The keyless server ID. This parameter takes effect only when Type is set to keyless.</p>
     * 
     * <strong>example:</strong>
     * <p>1233112****</p>
     */
    @NameInMap("KeyServerId")
    public String keyServerId;

    /**
     * <p>The certificate name. This parameter is required when Type is set to upload.</p>
     * 
     * <strong>example:</strong>
     * <p>yourCertName</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>The certificate private key. This parameter is required when Type is set to upload.</p>
     * 
     * <strong>example:</strong>
     * <p>-----BEGIN PRIVATE KEY-----</p>
     */
    @NameInMap("PrivateKey")
    public String privateKey;

    /**
     * <p>The region. This parameter is required when Type is set to cas. Valid values:</p>
     * <ul>
     * <li><p>China site accounts: cn-hangzhou.</p>
     * </li>
     * <li><p>International site accounts: ap-southeast-1.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("Region")
    public String region;

    @NameInMap("SecurityToken")
    public String securityToken;

    /**
     * <p>The site ID. You can call the <a href="https://help.aliyun.com/document_detail/2850189.html">ListSites</a> operation to obtain the site ID.</p>
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
     * <li><p><strong>cas</strong>: certificate from SSL Certificates Service.</p>
     * </li>
     * <li><p><strong>upload</strong>: custom uploaded certificate.</p>
     * </li>
     * <li><p><strong>keyless</strong>: keyless certificate.</p>
     * </li>
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
