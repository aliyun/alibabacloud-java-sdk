// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cdn20180510.models;

import com.aliyun.tea.*;

public class SetCdnDomainSSLCertificateRequest extends TeaModel {
    /**
     * <p>The ID of the certificate.</p>
     */
    @NameInMap("CertId")
    public Long certId;

    /**
     * <p>The name of the SSL certificate. You can specify only one certificate name.</p>
     */
    @NameInMap("CertName")
    public String certName;

    /**
     * <p>The region ID of the certificate. Valid values: **cn-hangzhou** and **ap-southeast-1**. Default value: **cn-hangzhou**.</p>
     */
    @NameInMap("CertRegion")
    public String certRegion;

    /**
     * <p>The type of the certificate.</p>
     * <br>
     * <p>*   **upload**: a user-uploaded SSL certificate.</p>
     * <p>*   **cas**: a certificate that is acquired through Certificate Management Service.</p>
     */
    @NameInMap("CertType")
    public String certType;

    /**
     * <p>The accelerated domain name for which you want to configure the SSL certificate. The type of request supported by the domain name must be HTTPS. You can specify only one domain name in each request.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("DomainName")
    public String domainName;

    /**
     * <p>Specifies whether the certificate is issued in canary releases. If you set this parameter to **staging**, the certificate is issued in canary releases. If you do not specify this parameter or set this parameter to other values, the certificate is officially issued.</p>
     */
    @NameInMap("Env")
    public String env;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The private key. Specify the private key only if you want to enable the SSL certificate.</p>
     */
    @NameInMap("SSLPri")
    public String SSLPri;

    /**
     * <p>Specifies whether to enable the SSL certificate.</p>
     * <br>
     * <p>*   **on**</p>
     * <p>*   **off**</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("SSLProtocol")
    public String SSLProtocol;

    /**
     * <p>The content of the SSL certificate. Specify the content of the SSL certificate only if you want to enable the SSL certificate.</p>
     */
    @NameInMap("SSLPub")
    public String SSLPub;

    @NameInMap("SecurityToken")
    public String securityToken;

    public static SetCdnDomainSSLCertificateRequest build(java.util.Map<String, ?> map) throws Exception {
        SetCdnDomainSSLCertificateRequest self = new SetCdnDomainSSLCertificateRequest();
        return TeaModel.build(map, self);
    }

    public SetCdnDomainSSLCertificateRequest setCertId(Long certId) {
        this.certId = certId;
        return this;
    }
    public Long getCertId() {
        return this.certId;
    }

    public SetCdnDomainSSLCertificateRequest setCertName(String certName) {
        this.certName = certName;
        return this;
    }
    public String getCertName() {
        return this.certName;
    }

    public SetCdnDomainSSLCertificateRequest setCertRegion(String certRegion) {
        this.certRegion = certRegion;
        return this;
    }
    public String getCertRegion() {
        return this.certRegion;
    }

    public SetCdnDomainSSLCertificateRequest setCertType(String certType) {
        this.certType = certType;
        return this;
    }
    public String getCertType() {
        return this.certType;
    }

    public SetCdnDomainSSLCertificateRequest setDomainName(String domainName) {
        this.domainName = domainName;
        return this;
    }
    public String getDomainName() {
        return this.domainName;
    }

    public SetCdnDomainSSLCertificateRequest setEnv(String env) {
        this.env = env;
        return this;
    }
    public String getEnv() {
        return this.env;
    }

    public SetCdnDomainSSLCertificateRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public SetCdnDomainSSLCertificateRequest setSSLPri(String SSLPri) {
        this.SSLPri = SSLPri;
        return this;
    }
    public String getSSLPri() {
        return this.SSLPri;
    }

    public SetCdnDomainSSLCertificateRequest setSSLProtocol(String SSLProtocol) {
        this.SSLProtocol = SSLProtocol;
        return this;
    }
    public String getSSLProtocol() {
        return this.SSLProtocol;
    }

    public SetCdnDomainSSLCertificateRequest setSSLPub(String SSLPub) {
        this.SSLPub = SSLPub;
        return this;
    }
    public String getSSLPub() {
        return this.SSLPub;
    }

    public SetCdnDomainSSLCertificateRequest setSecurityToken(String securityToken) {
        this.securityToken = securityToken;
        return this;
    }
    public String getSecurityToken() {
        return this.securityToken;
    }

}
