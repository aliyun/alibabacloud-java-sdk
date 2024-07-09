// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cdn20180510.models;

import com.aliyun.tea.*;

public class SetDomainServerCertificateRequest extends TeaModel {
    /**
     * <p>The name of the SSL certificate. You can specify only one name.</p>
     * 
     * <strong>example:</strong>
     * <p>myCert1</p>
     */
    @NameInMap("CertName")
    public String certName;

    /**
     * <p>The type of the certificate. Valid values:</p>
     * <ul>
     * <li><strong>upload</strong>: a user-uploaded SSL certificate.</li>
     * <li><strong>cas</strong>: a certificate that is purchased from Alibaba Cloud SSL Certificates Service.</li>
     * </ul>
     * <blockquote>
     * <p>If this parameter is set to <strong>cas</strong>, the <strong>PrivateKey</strong> parameter is optional.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>cas</p>
     */
    @NameInMap("CertType")
    public String certType;

    /**
     * <p>The accelerated domain name for which you want to configure the SSL certificate. The type of request supported by the domain name must be HTTPS.</p>
     * <p>You can specify one domain name in each call.</p>
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
     * <p>The private key. Specify the private key only if you want to enable the SSL certificate.</p>
     * 
     * <strong>example:</strong>
     * <p>----BEGIN RSA PRIVATE KEY-----QswCQ****----END RSA PRIVATE KEY-----</p>
     */
    @NameInMap("PrivateKey")
    public String privateKey;

    @NameInMap("SecurityToken")
    public String securityToken;

    /**
     * <p>The content of the SSL certificate. Specify the content of the SSL certificate only if you want to enable the SSL certificate. You can use one of the following methods to obtain the content of the SSL certificate:</p>
     * <ul>
     * <li>Method 1: Call the <a href="https://help.aliyun.com/document_detail/91182.html">DescribeDomainCertificateInfo</a> API operation to query the information about the SSL certificate corresponding to the accelerated domain name and obtain the public key of the ServerCertificate certificate from the returned data.</li>
     * <li>Method 2: Call the <a href="https://help.aliyun.com/document_detail/91181.html">DescribeCdnCertificateList</a> API operation to query the SSL certificate list corresponding to the accelerated domain name, and obtain the value of CertName from the returned data. Then, Call the <a href="https://help.aliyun.com/document_detail/131905.html">DescribeCdnCertificateDetail</a> API operation with CertName as a parameter to obtain the details about the certificate, and obtain the public key of the Cert certificate from the returned data.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>----BEGIN CERTIFICATE----- MIIFz****-----END CERTIFICATE-----</p>
     */
    @NameInMap("ServerCertificate")
    public String serverCertificate;

    /**
     * <p>Specifies whether to enable the SSL certificate. Default value: off. Valid values:</p>
     * <ul>
     * <li><strong>on</strong> : enables the SSL certificate.</li>
     * <li><strong>off</strong>: disables the SSL certificate.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>on</p>
     */
    @NameInMap("ServerCertificateStatus")
    public String serverCertificateStatus;

    public static SetDomainServerCertificateRequest build(java.util.Map<String, ?> map) throws Exception {
        SetDomainServerCertificateRequest self = new SetDomainServerCertificateRequest();
        return TeaModel.build(map, self);
    }

    public SetDomainServerCertificateRequest setCertName(String certName) {
        this.certName = certName;
        return this;
    }
    public String getCertName() {
        return this.certName;
    }

    public SetDomainServerCertificateRequest setCertType(String certType) {
        this.certType = certType;
        return this;
    }
    public String getCertType() {
        return this.certType;
    }

    public SetDomainServerCertificateRequest setDomainName(String domainName) {
        this.domainName = domainName;
        return this;
    }
    public String getDomainName() {
        return this.domainName;
    }

    public SetDomainServerCertificateRequest setForceSet(String forceSet) {
        this.forceSet = forceSet;
        return this;
    }
    public String getForceSet() {
        return this.forceSet;
    }

    public SetDomainServerCertificateRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public SetDomainServerCertificateRequest setPrivateKey(String privateKey) {
        this.privateKey = privateKey;
        return this;
    }
    public String getPrivateKey() {
        return this.privateKey;
    }

    public SetDomainServerCertificateRequest setSecurityToken(String securityToken) {
        this.securityToken = securityToken;
        return this;
    }
    public String getSecurityToken() {
        return this.securityToken;
    }

    public SetDomainServerCertificateRequest setServerCertificate(String serverCertificate) {
        this.serverCertificate = serverCertificate;
        return this;
    }
    public String getServerCertificate() {
        return this.serverCertificate;
    }

    public SetDomainServerCertificateRequest setServerCertificateStatus(String serverCertificateStatus) {
        this.serverCertificateStatus = serverCertificateStatus;
        return this;
    }
    public String getServerCertificateStatus() {
        return this.serverCertificateStatus;
    }

}
