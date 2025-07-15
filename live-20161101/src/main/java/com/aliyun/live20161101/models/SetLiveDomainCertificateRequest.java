// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class SetLiveDomainCertificateRequest extends TeaModel {
    /**
     * <p>The certificate name.</p>
     * 
     * <strong>example:</strong>
     * <p>Cert-****</p>
     */
    @NameInMap("CertName")
    public String certName;

    /**
     * <p>The certificate type. Valid values:</p>
     * <ul>
     * <li><strong>upload</strong>: a custom certificate</li>
     * <li><strong>cas</strong>: a certificate that is purchased from Certificate Management Service</li>
     * <li><strong>free</strong>: a free certificate (for testing)</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>free</p>
     */
    @NameInMap("CertType")
    public String certType;

    /**
     * <p>The domain name that is secured by the certificate. The domain name uses <code>HTTPS</code>-based acceleration.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>developer.aliyundoc.com</p>
     */
    @NameInMap("DomainName")
    public String domainName;

    /**
     * <p>Specifies whether to check the certificate name for duplicates. A value of 1 indicates that the system does not perform the check and overwrites the information about the certificate that has the same name. Set the value to <strong>1</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("ForceSet")
    public String forceSet;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The private key.</p>
     * <blockquote>
     * <p> This parameter is required only if you set the SSLProtocol parameter to on.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <hr>
     */
    @NameInMap("SSLPri")
    public String SSLPri;

    /**
     * <p>Specifies whether to enable the HTTPS certificate. Valid values:</p>
     * <ul>
     * <li><strong>on</strong>. If you set this parameter to <strong>on</strong>, you must also specify the SSLPub and SSLPri parameters.</li>
     * <li><strong>off</strong>. This is the default value.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>off</p>
     */
    @NameInMap("SSLProtocol")
    public String SSLProtocol;

    /**
     * <p>The public key.</p>
     * <blockquote>
     * <p> This parameter is required only if you set the SSLProtocol parameter to on.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <hr>
     */
    @NameInMap("SSLPub")
    public String SSLPub;

    @NameInMap("SecurityToken")
    public String securityToken;

    public static SetLiveDomainCertificateRequest build(java.util.Map<String, ?> map) throws Exception {
        SetLiveDomainCertificateRequest self = new SetLiveDomainCertificateRequest();
        return TeaModel.build(map, self);
    }

    public SetLiveDomainCertificateRequest setCertName(String certName) {
        this.certName = certName;
        return this;
    }
    public String getCertName() {
        return this.certName;
    }

    public SetLiveDomainCertificateRequest setCertType(String certType) {
        this.certType = certType;
        return this;
    }
    public String getCertType() {
        return this.certType;
    }

    public SetLiveDomainCertificateRequest setDomainName(String domainName) {
        this.domainName = domainName;
        return this;
    }
    public String getDomainName() {
        return this.domainName;
    }

    public SetLiveDomainCertificateRequest setForceSet(String forceSet) {
        this.forceSet = forceSet;
        return this;
    }
    public String getForceSet() {
        return this.forceSet;
    }

    public SetLiveDomainCertificateRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public SetLiveDomainCertificateRequest setSSLPri(String SSLPri) {
        this.SSLPri = SSLPri;
        return this;
    }
    public String getSSLPri() {
        return this.SSLPri;
    }

    public SetLiveDomainCertificateRequest setSSLProtocol(String SSLProtocol) {
        this.SSLProtocol = SSLProtocol;
        return this;
    }
    public String getSSLProtocol() {
        return this.SSLProtocol;
    }

    public SetLiveDomainCertificateRequest setSSLPub(String SSLPub) {
        this.SSLPub = SSLPub;
        return this;
    }
    public String getSSLPub() {
        return this.SSLPub;
    }

    public SetLiveDomainCertificateRequest setSecurityToken(String securityToken) {
        this.securityToken = securityToken;
        return this;
    }
    public String getSecurityToken() {
        return this.securityToken;
    }

}
