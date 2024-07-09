// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cdn20180510.models;

import com.aliyun.tea.*;

public class BatchSetCdnDomainServerCertificateRequest extends TeaModel {
    /**
     * <p>The name of the certificate.</p>
     * 
     * <strong>example:</strong>
     * <p>yourCertName</p>
     */
    @NameInMap("CertName")
    public String certName;

    /**
     * <p>The type of the SSL certificate. Valid values:</p>
     * <ul>
     * <li><strong>upload</strong>: a user-uploaded SSL certificate.</li>
     * <li><strong>cas</strong>: a certificate that is issued by SSL Certificates Service.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>cas</p>
     */
    @NameInMap("CertType")
    public String certType;

    /**
     * <p>The accelerated domain name to which the SSL certificate belongs. The type of request supported by the accelerated domain name must be HTTPS. You can specify multiple accelerated domain names and separate them with commas (,).</p>
     * <blockquote>
     * <p> You can manage the SSL certificates of up to 50 accelerated domain names in each call.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>example.com</p>
     */
    @NameInMap("DomainName")
    public String domainName;

    /**
     * <p>Specifies whether to check the certificate name for duplicates. If you set the value to 1, the system does not perform the check and overwrites the information about the existing certificate that uses the same name.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("ForceSet")
    public String forceSet;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The region.</p>
     * 
     * <strong>example:</strong>
     * <p>your region</p>
     */
    @NameInMap("Region")
    public String region;

    /**
     * <p>The private key. Specify the private key only if you enable the SSL certificate.</p>
     * 
     * <strong>example:</strong>
     * <p>yourSSLPri</p>
     */
    @NameInMap("SSLPri")
    public String SSLPri;

    /**
     * <p>Specifies whether to enable the SSL certificate. Valid values:</p>
     * <ul>
     * <li><strong>on</strong>: enables the SSL certificate.</li>
     * <li><strong>off</strong>: disables the SSL certificate. This is the default value.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>on</p>
     */
    @NameInMap("SSLProtocol")
    public String SSLProtocol;

    /**
     * <p>The content of the SSL certificate. Specify the content of the certificate only if you want to enable the SSL certificate.</p>
     * 
     * <strong>example:</strong>
     * <p>yourSSLPub</p>
     */
    @NameInMap("SSLPub")
    public String SSLPub;

    @NameInMap("SecurityToken")
    public String securityToken;

    public static BatchSetCdnDomainServerCertificateRequest build(java.util.Map<String, ?> map) throws Exception {
        BatchSetCdnDomainServerCertificateRequest self = new BatchSetCdnDomainServerCertificateRequest();
        return TeaModel.build(map, self);
    }

    public BatchSetCdnDomainServerCertificateRequest setCertName(String certName) {
        this.certName = certName;
        return this;
    }
    public String getCertName() {
        return this.certName;
    }

    public BatchSetCdnDomainServerCertificateRequest setCertType(String certType) {
        this.certType = certType;
        return this;
    }
    public String getCertType() {
        return this.certType;
    }

    public BatchSetCdnDomainServerCertificateRequest setDomainName(String domainName) {
        this.domainName = domainName;
        return this;
    }
    public String getDomainName() {
        return this.domainName;
    }

    public BatchSetCdnDomainServerCertificateRequest setForceSet(String forceSet) {
        this.forceSet = forceSet;
        return this;
    }
    public String getForceSet() {
        return this.forceSet;
    }

    public BatchSetCdnDomainServerCertificateRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public BatchSetCdnDomainServerCertificateRequest setRegion(String region) {
        this.region = region;
        return this;
    }
    public String getRegion() {
        return this.region;
    }

    public BatchSetCdnDomainServerCertificateRequest setSSLPri(String SSLPri) {
        this.SSLPri = SSLPri;
        return this;
    }
    public String getSSLPri() {
        return this.SSLPri;
    }

    public BatchSetCdnDomainServerCertificateRequest setSSLProtocol(String SSLProtocol) {
        this.SSLProtocol = SSLProtocol;
        return this;
    }
    public String getSSLProtocol() {
        return this.SSLProtocol;
    }

    public BatchSetCdnDomainServerCertificateRequest setSSLPub(String SSLPub) {
        this.SSLPub = SSLPub;
        return this;
    }
    public String getSSLPub() {
        return this.SSLPub;
    }

    public BatchSetCdnDomainServerCertificateRequest setSecurityToken(String securityToken) {
        this.securityToken = securityToken;
        return this;
    }
    public String getSecurityToken() {
        return this.securityToken;
    }

}
