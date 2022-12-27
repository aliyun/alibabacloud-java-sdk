// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cdn20180510.models;

import com.aliyun.tea.*;

public class BatchSetCdnDomainServerCertificateRequest extends TeaModel {
    // The name of the certificate.
    @NameInMap("CertName")
    public String certName;

    // The type of the SSL certificate. Valid values:
    // 
    // *   **upload**: a user-uploaded SSL certificate.
    // *   **cas**: a certificate that is issued by SSL Certificates Service.
    @NameInMap("CertType")
    public String certType;

    // The accelerated domain name to which the SSL certificate belongs. The type of request supported by the accelerated domain name must be HTTPS. You can specify multiple accelerated domain names and separate them with commas (,).
    // 
    // >  You can manage the SSL certificates of up to 50 accelerated domain names in each call.
    @NameInMap("DomainName")
    public String domainName;

    // Specifies whether to check the certificate name for duplicates. If you set the value to 1, the system does not perform the check and overwrites the information about the existing certificate that uses the same name.
    @NameInMap("ForceSet")
    public String forceSet;

    @NameInMap("OwnerId")
    public Long ownerId;

    // The region.
    @NameInMap("Region")
    public String region;

    // The private key. Specify the private key only if you enable the SSL certificate.
    @NameInMap("SSLPri")
    public String SSLPri;

    // Specifies whether to enable the SSL certificate. Valid values:
    // 
    // *   **on**: enables the SSL certificate.
    // *   **off**: disables the SSL certificate. This is the default value.
    @NameInMap("SSLProtocol")
    public String SSLProtocol;

    // The content of the SSL certificate. Specify the content of the certificate only if you want to enable the SSL certificate.
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
