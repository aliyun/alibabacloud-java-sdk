// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dcdn20180115.models;

import com.aliyun.tea.*;

public class BatchSetDcdnDomainCertificateRequest extends TeaModel {
    /**
     * <p>The name of the certificate.</p>
     * 
     * <strong>example:</strong>
     * <p>cert-te**.com</p>
     */
    @NameInMap("CertName")
    public String certName;

    /**
     * <p>The type of the certificate. Valid values:</p>
     * <ul>
     * <li><strong>upload</strong>: a custom certificate that you upload.</li>
     * <li><strong>cas</strong>: a certificate that is acquired through Certificate Management Service.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>cas</p>
     */
    @NameInMap("CertType")
    public String certType;

    /**
     * <p>The accelerated domain name for which you want to configure the HTTPS certificate. The accelerated domain must have HTTPS acceleration enabled. You can specify multiple domain names and separate them with commas (,).</p>
     * <blockquote>
     * <p>You can configure up to 10 domain names in each request.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p><strong>example</strong>.com</p>
     */
    @NameInMap("DomainName")
    public String domainName;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The ID of the region.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("Region")
    public String region;

    /**
     * <p>The private key. This parameter is required only if you enable the certificate.</p>
     * 
     * <strong>example:</strong>
     * <p>y****</p>
     */
    @NameInMap("SSLPri")
    public String SSLPri;

    /**
     * <p>Specifies whether to enable the HTTPS certificate. Valid values:</p>
     * <ul>
     * <li><strong>on</strong>: enables the HTTPS certificate.</li>
     * <li><strong>off</strong>: does not enable the HTTPS certificate.</li>
     * </ul>
     * <p>This is the default value.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>on</p>
     */
    @NameInMap("SSLProtocol")
    public String SSLProtocol;

    /**
     * <p>The content of the certificate. This parameter is required only if you enable the certificate.</p>
     * 
     * <strong>example:</strong>
     * <p>x****</p>
     */
    @NameInMap("SSLPub")
    public String SSLPub;

    @NameInMap("SecurityToken")
    public String securityToken;

    public static BatchSetDcdnDomainCertificateRequest build(java.util.Map<String, ?> map) throws Exception {
        BatchSetDcdnDomainCertificateRequest self = new BatchSetDcdnDomainCertificateRequest();
        return TeaModel.build(map, self);
    }

    public BatchSetDcdnDomainCertificateRequest setCertName(String certName) {
        this.certName = certName;
        return this;
    }
    public String getCertName() {
        return this.certName;
    }

    public BatchSetDcdnDomainCertificateRequest setCertType(String certType) {
        this.certType = certType;
        return this;
    }
    public String getCertType() {
        return this.certType;
    }

    public BatchSetDcdnDomainCertificateRequest setDomainName(String domainName) {
        this.domainName = domainName;
        return this;
    }
    public String getDomainName() {
        return this.domainName;
    }

    public BatchSetDcdnDomainCertificateRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public BatchSetDcdnDomainCertificateRequest setRegion(String region) {
        this.region = region;
        return this;
    }
    public String getRegion() {
        return this.region;
    }

    public BatchSetDcdnDomainCertificateRequest setSSLPri(String SSLPri) {
        this.SSLPri = SSLPri;
        return this;
    }
    public String getSSLPri() {
        return this.SSLPri;
    }

    public BatchSetDcdnDomainCertificateRequest setSSLProtocol(String SSLProtocol) {
        this.SSLProtocol = SSLProtocol;
        return this;
    }
    public String getSSLProtocol() {
        return this.SSLProtocol;
    }

    public BatchSetDcdnDomainCertificateRequest setSSLPub(String SSLPub) {
        this.SSLPub = SSLPub;
        return this;
    }
    public String getSSLPub() {
        return this.SSLPub;
    }

    public BatchSetDcdnDomainCertificateRequest setSecurityToken(String securityToken) {
        this.securityToken = securityToken;
        return this;
    }
    public String getSecurityToken() {
        return this.securityToken;
    }

}
