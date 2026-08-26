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
     * <li><strong>upload</strong>: an uploaded certificate.</li>
     * <li><strong>cas</strong>: a certificate from SSL Certificates Service.</li>
     * <li><strong>free</strong>: a personal test certificate (Free Edition).</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>free</p>
     */
    @NameInMap("CertType")
    public String certType;

    /**
     * <p>The accelerated domain name to which the certificate belongs. The domain name is of the <code>https</code> acceleration type.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>developer.aliyundoc.com</p>
     */
    @NameInMap("DomainName")
    public String domainName;

    /**
     * <p>Specifies whether to perform only a dry run, without actually executing the operation. Valid values:</p>
     * <ul>
     * <li>true: sends a dry run request. If the request passes the check, the operation is not actually executed.</li>
     * <li>false (default): sends a normal request. If the request passes the check, the operation is actually executed.</li>
     * </ul>
     * <p>The dry run checks parameter validity, RAM permissions, and resource status. If the dry run fails, the corresponding error code is returned. If the dry run succeeds, the operation is not actually executed.</p>
     */
    @NameInMap("DryRun")
    public Boolean dryRun;

    /**
     * <p>Ignores the check for duplicate certificate names and overwrites the existing certificate information with the same name. Fixed value: <strong>1</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("ForceSet")
    public String forceSet;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The private key content.</p>
     * <blockquote>
     * <p>This parameter is required only when SSLProtocol is set to on.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <hr>
     */
    @NameInMap("SSLPri")
    public String SSLPri;

    /**
     * <p>Specifies whether to enable the HTTPS certificate. Valid values: </p>
     * <ul>
     * <li><strong>on</strong>: enabled. If the value is <strong>on</strong>, you must also set the SSLPub and SSLPri request parameters.</li>
     * <li><strong>off</strong> (default): disabled.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>off</p>
     */
    @NameInMap("SSLProtocol")
    public String SSLProtocol;

    /**
     * <p>The public key content.</p>
     * <blockquote>
     * <p>This parameter is required only when SSLProtocol is set to on.</p>
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

    public SetLiveDomainCertificateRequest setDryRun(Boolean dryRun) {
        this.dryRun = dryRun;
        return this;
    }
    public Boolean getDryRun() {
        return this.dryRun;
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
