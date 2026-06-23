// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class CreateCustomHostnameRequest extends TeaModel {
    /**
     * <p>The SSL Certificates Service certificate ID. This parameter is required when CertType is set to cas.</p>
     * 
     * <strong>example:</strong>
     * <p>30000478</p>
     */
    @NameInMap("CasId")
    public Long casId;

    /**
     * <p>The region of the SSL Certificates Service certificate. This parameter is required when CertType is set to cas.</p>
     * <ul>
     * <li>For Chinese site accounts, set this parameter to cn-hangzhou.</li>
     * <li>For International site accounts, set this parameter to ap-southeast-1.</li>
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
     * <p>free</p>
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
     * <p>The SaaS domain name.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>custom.site.com</p>
     */
    @NameInMap("Hostname")
    public String hostname;

    /**
     * <p>The certificate private key. This parameter is required when CertType is set to upload.</p>
     * 
     * <strong>example:</strong>
     * <p>-----BEGIN PRIVATE KEY-----</p>
     */
    @NameInMap("PrivateKey")
    public String privateKey;

    /**
     * <p>The ID of the record to bind. You can call the <a href="https://help.aliyun.com/document_detail/2850265.html">ListRecords</a> operation to obtain the record ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1234567890123</p>
     */
    @NameInMap("RecordId")
    public Long recordId;

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
     * <p>Specifies whether to enable SSL. Valid values:</p>
     * <ul>
     * <li><strong>on</strong>: Enable SSL.</li>
     * <li><strong>off</strong>: Disable SSL.</li>
     * </ul>
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
