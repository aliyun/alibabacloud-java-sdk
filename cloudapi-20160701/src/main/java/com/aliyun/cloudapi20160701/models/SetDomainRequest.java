// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20160701.models;

import com.aliyun.tea.*;

public class SetDomainRequest extends TeaModel {
    @NameInMap("BindStageName")
    public String bindStageName;

    @NameInMap("CertificateBody")
    public String certificateBody;

    @NameInMap("CertificateName")
    public String certificateName;

    @NameInMap("DomainName")
    public String domainName;

    @NameInMap("GroupId")
    public String groupId;

    @NameInMap("IsForce")
    public Boolean isForce;

    @NameInMap("PrivateKey")
    public String privateKey;

    @NameInMap("SecurityToken")
    public String securityToken;

    public static SetDomainRequest build(java.util.Map<String, ?> map) throws Exception {
        SetDomainRequest self = new SetDomainRequest();
        return TeaModel.build(map, self);
    }

    public SetDomainRequest setBindStageName(String bindStageName) {
        this.bindStageName = bindStageName;
        return this;
    }
    public String getBindStageName() {
        return this.bindStageName;
    }

    public SetDomainRequest setCertificateBody(String certificateBody) {
        this.certificateBody = certificateBody;
        return this;
    }
    public String getCertificateBody() {
        return this.certificateBody;
    }

    public SetDomainRequest setCertificateName(String certificateName) {
        this.certificateName = certificateName;
        return this;
    }
    public String getCertificateName() {
        return this.certificateName;
    }

    public SetDomainRequest setDomainName(String domainName) {
        this.domainName = domainName;
        return this;
    }
    public String getDomainName() {
        return this.domainName;
    }

    public SetDomainRequest setGroupId(String groupId) {
        this.groupId = groupId;
        return this;
    }
    public String getGroupId() {
        return this.groupId;
    }

    public SetDomainRequest setIsForce(Boolean isForce) {
        this.isForce = isForce;
        return this;
    }
    public Boolean getIsForce() {
        return this.isForce;
    }

    public SetDomainRequest setPrivateKey(String privateKey) {
        this.privateKey = privateKey;
        return this;
    }
    public String getPrivateKey() {
        return this.privateKey;
    }

    public SetDomainRequest setSecurityToken(String securityToken) {
        this.securityToken = securityToken;
        return this;
    }
    public String getSecurityToken() {
        return this.securityToken;
    }

}
