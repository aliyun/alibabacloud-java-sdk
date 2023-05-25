// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20160714.models;

import com.aliyun.tea.*;

public class SetDomainCertificateRequest extends TeaModel {
    @NameInMap("CaCertificateBody")
    public String caCertificateBody;

    @NameInMap("CertificateBody")
    public String certificateBody;

    @NameInMap("CertificateName")
    public String certificateName;

    @NameInMap("CertificatePrivateKey")
    public String certificatePrivateKey;

    @NameInMap("DomainName")
    public String domainName;

    @NameInMap("GroupId")
    public String groupId;

    @NameInMap("SecurityToken")
    public String securityToken;

    @NameInMap("SslVerifyDepth")
    public String sslVerifyDepth;

    public static SetDomainCertificateRequest build(java.util.Map<String, ?> map) throws Exception {
        SetDomainCertificateRequest self = new SetDomainCertificateRequest();
        return TeaModel.build(map, self);
    }

    public SetDomainCertificateRequest setCaCertificateBody(String caCertificateBody) {
        this.caCertificateBody = caCertificateBody;
        return this;
    }
    public String getCaCertificateBody() {
        return this.caCertificateBody;
    }

    public SetDomainCertificateRequest setCertificateBody(String certificateBody) {
        this.certificateBody = certificateBody;
        return this;
    }
    public String getCertificateBody() {
        return this.certificateBody;
    }

    public SetDomainCertificateRequest setCertificateName(String certificateName) {
        this.certificateName = certificateName;
        return this;
    }
    public String getCertificateName() {
        return this.certificateName;
    }

    public SetDomainCertificateRequest setCertificatePrivateKey(String certificatePrivateKey) {
        this.certificatePrivateKey = certificatePrivateKey;
        return this;
    }
    public String getCertificatePrivateKey() {
        return this.certificatePrivateKey;
    }

    public SetDomainCertificateRequest setDomainName(String domainName) {
        this.domainName = domainName;
        return this;
    }
    public String getDomainName() {
        return this.domainName;
    }

    public SetDomainCertificateRequest setGroupId(String groupId) {
        this.groupId = groupId;
        return this;
    }
    public String getGroupId() {
        return this.groupId;
    }

    public SetDomainCertificateRequest setSecurityToken(String securityToken) {
        this.securityToken = securityToken;
        return this;
    }
    public String getSecurityToken() {
        return this.securityToken;
    }

    public SetDomainCertificateRequest setSslVerifyDepth(String sslVerifyDepth) {
        this.sslVerifyDepth = sslVerifyDepth;
        return this;
    }
    public String getSslVerifyDepth() {
        return this.sslVerifyDepth;
    }

}
