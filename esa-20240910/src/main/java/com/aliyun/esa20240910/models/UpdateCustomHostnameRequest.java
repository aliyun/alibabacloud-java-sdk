// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class UpdateCustomHostnameRequest extends TeaModel {
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
     * <p>cas</p>
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
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1234567890123</p>
     */
    @NameInMap("HostnameId")
    public Long hostnameId;

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
     * 
     * <strong>example:</strong>
     * <p>1234567890123</p>
     */
    @NameInMap("RecordId")
    public Long recordId;

    /**
     * <p>SSL开关</p>
     * 
     * <strong>example:</strong>
     * <p>on</p>
     */
    @NameInMap("SslFlag")
    public String sslFlag;

    public static UpdateCustomHostnameRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateCustomHostnameRequest self = new UpdateCustomHostnameRequest();
        return TeaModel.build(map, self);
    }

    public UpdateCustomHostnameRequest setCasId(Long casId) {
        this.casId = casId;
        return this;
    }
    public Long getCasId() {
        return this.casId;
    }

    public UpdateCustomHostnameRequest setCasRegion(String casRegion) {
        this.casRegion = casRegion;
        return this;
    }
    public String getCasRegion() {
        return this.casRegion;
    }

    public UpdateCustomHostnameRequest setCertType(String certType) {
        this.certType = certType;
        return this;
    }
    public String getCertType() {
        return this.certType;
    }

    public UpdateCustomHostnameRequest setCertificate(String certificate) {
        this.certificate = certificate;
        return this;
    }
    public String getCertificate() {
        return this.certificate;
    }

    public UpdateCustomHostnameRequest setHostnameId(Long hostnameId) {
        this.hostnameId = hostnameId;
        return this;
    }
    public Long getHostnameId() {
        return this.hostnameId;
    }

    public UpdateCustomHostnameRequest setPrivateKey(String privateKey) {
        this.privateKey = privateKey;
        return this;
    }
    public String getPrivateKey() {
        return this.privateKey;
    }

    public UpdateCustomHostnameRequest setRecordId(Long recordId) {
        this.recordId = recordId;
        return this;
    }
    public Long getRecordId() {
        return this.recordId;
    }

    public UpdateCustomHostnameRequest setSslFlag(String sslFlag) {
        this.sslFlag = sslFlag;
        return this;
    }
    public String getSslFlag() {
        return this.sslFlag;
    }

}
