// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class CreateCustomHostnameRequest extends TeaModel {
    /**
     * <p>云盾证书ID，使用云盾证书时必填</p>
     * 
     * <strong>example:</strong>
     * <p>30000478</p>
     */
    @NameInMap("CasId")
    public Long casId;

    /**
     * <p>云盾证书所在地域，使用云盾证书时必填</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("CasRegion")
    public String casRegion;

    /**
     * <p>证书类型，SSL 开启时必填</p>
     * 
     * <strong>example:</strong>
     * <p>free</p>
     */
    @NameInMap("CertType")
    public String certType;

    /**
     * <p>证书公钥，使用上传证书时必填</p>
     * 
     * <strong>example:</strong>
     * <p>-----BEGIN CERTIFICATE-----</p>
     */
    @NameInMap("Certificate")
    public String certificate;

    /**
     * <p>自定义主机名</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>custom.site.com</p>
     */
    @NameInMap("Hostname")
    public String hostname;

    /**
     * <p>证书私钥，使用上传证书时必填</p>
     * 
     * <strong>example:</strong>
     * <p>-----BEGIN PRIVATE KEY-----</p>
     */
    @NameInMap("PrivateKey")
    public String privateKey;

    /**
     * <p>绑定的源站记录ID</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1234567890123</p>
     */
    @NameInMap("RecordId")
    public Long recordId;

    /**
     * <p>关联站点ID</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1234567890123</p>
     */
    @NameInMap("SiteId")
    public Long siteId;

    /**
     * <p>SSL开关</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>on</p>
     */
    @NameInMap("SslFlag")
    public String sslFlag;

    public static CreateCustomHostnameRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateCustomHostnameRequest self = new CreateCustomHostnameRequest();
        return TeaModel.build(map, self);
    }

    public CreateCustomHostnameRequest setCasId(Long casId) {
        this.casId = casId;
        return this;
    }
    public Long getCasId() {
        return this.casId;
    }

    public CreateCustomHostnameRequest setCasRegion(String casRegion) {
        this.casRegion = casRegion;
        return this;
    }
    public String getCasRegion() {
        return this.casRegion;
    }

    public CreateCustomHostnameRequest setCertType(String certType) {
        this.certType = certType;
        return this;
    }
    public String getCertType() {
        return this.certType;
    }

    public CreateCustomHostnameRequest setCertificate(String certificate) {
        this.certificate = certificate;
        return this;
    }
    public String getCertificate() {
        return this.certificate;
    }

    public CreateCustomHostnameRequest setHostname(String hostname) {
        this.hostname = hostname;
        return this;
    }
    public String getHostname() {
        return this.hostname;
    }

    public CreateCustomHostnameRequest setPrivateKey(String privateKey) {
        this.privateKey = privateKey;
        return this;
    }
    public String getPrivateKey() {
        return this.privateKey;
    }

    public CreateCustomHostnameRequest setRecordId(Long recordId) {
        this.recordId = recordId;
        return this;
    }
    public Long getRecordId() {
        return this.recordId;
    }

    public CreateCustomHostnameRequest setSiteId(Long siteId) {
        this.siteId = siteId;
        return this;
    }
    public Long getSiteId() {
        return this.siteId;
    }

    public CreateCustomHostnameRequest setSslFlag(String sslFlag) {
        this.sslFlag = sslFlag;
        return this;
    }
    public String getSslFlag() {
        return this.sslFlag;
    }

}
