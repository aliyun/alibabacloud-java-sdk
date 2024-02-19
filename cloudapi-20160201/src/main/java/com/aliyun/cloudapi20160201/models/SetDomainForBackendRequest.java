// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20160201.models;

import com.aliyun.tea.*;

public class SetDomainForBackendRequest extends TeaModel {
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

    public static SetDomainForBackendRequest build(java.util.Map<String, ?> map) throws Exception {
        SetDomainForBackendRequest self = new SetDomainForBackendRequest();
        return TeaModel.build(map, self);
    }

    public SetDomainForBackendRequest setCertificateBody(String certificateBody) {
        this.certificateBody = certificateBody;
        return this;
    }
    public String getCertificateBody() {
        return this.certificateBody;
    }

    public SetDomainForBackendRequest setCertificateName(String certificateName) {
        this.certificateName = certificateName;
        return this;
    }
    public String getCertificateName() {
        return this.certificateName;
    }

    public SetDomainForBackendRequest setCertificatePrivateKey(String certificatePrivateKey) {
        this.certificatePrivateKey = certificatePrivateKey;
        return this;
    }
    public String getCertificatePrivateKey() {
        return this.certificatePrivateKey;
    }

    public SetDomainForBackendRequest setDomainName(String domainName) {
        this.domainName = domainName;
        return this;
    }
    public String getDomainName() {
        return this.domainName;
    }

    public SetDomainForBackendRequest setGroupId(String groupId) {
        this.groupId = groupId;
        return this;
    }
    public String getGroupId() {
        return this.groupId;
    }

    public SetDomainForBackendRequest setSecurityToken(String securityToken) {
        this.securityToken = securityToken;
        return this;
    }
    public String getSecurityToken() {
        return this.securityToken;
    }

}
