// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class UpdateCustomHostnameRequest extends TeaModel {
    /**
     * <p>The ID of the SSL Certificates Service certificate. This parameter is required when CertType is set to cas.</p>
     * 
     * <strong>example:</strong>
     * <p>30000478</p>
     */
    @NameInMap("CasId")
    public Long casId;

    /**
     * <p>The region of the SSL Certificates Service certificate. This parameter is required when CertType is set to cas. Valid values:</p>
     * <ul>
     * <li>Chinese mainland accounts: cn-hangzhou.</li>
     * <li>International accounts: ap-southeast-1.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("CasRegion")
    public String casRegion;

    /**
     * <p>The certificate type. This parameter is required when SslFlag is set to on. Valid values:</p>
     * <ul>
     * <li><strong>free</strong>: free certificate.</li>
     * <li><strong>upload</strong>: uploaded certificate.</li>
     * <li><strong>cas</strong>: SSL Certificates Service certificate.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>cas</p>
     */
    @NameInMap("CertType")
    public String certType;

    /**
     * <p>The certificate content. This parameter is required when CertType is set to upload.</p>
     * 
     * <strong>example:</strong>
     * <p>-----BEGIN CERTIFICATE-----</p>
     */
    @NameInMap("Certificate")
    public String certificate;

    /**
     * <p>The ID of the SaaS domain name. You can obtain the ID by calling the <a href="https://help.aliyun.com/document_detail/3018667.html">ListCustomHostnames</a> operation.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1234567890123</p>
     */
    @NameInMap("HostnameId")
    public Long hostnameId;

    /**
     * <p>The certificate private key. This parameter is required when CertType is set to upload.</p>
     * 
     * <strong>example:</strong>
     * <p>-----BEGIN PRIVATE KEY-----</p>
     */
    @NameInMap("PrivateKey")
    public String privateKey;

    /**
     * <p>The ID of the record to bind. You can obtain the ID by calling the <a href="https://help.aliyun.com/document_detail/2850265.html">ListRecords</a> operation.</p>
     * 
     * <strong>example:</strong>
     * <p>1234567890123</p>
     */
    @NameInMap("RecordId")
    public Long recordId;

    /**
     * <p>The SSL switch. Valid values:</p>
     * <ul>
     * <li><strong>on</strong>: Enables SSL.</li>
     * <li><strong>off</strong>: Disables SSL.</li>
     * </ul>
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
