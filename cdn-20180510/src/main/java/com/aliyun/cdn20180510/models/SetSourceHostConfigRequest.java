// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cdn20180510.models;

import com.aliyun.tea.*;

public class SetSourceHostConfigRequest extends TeaModel {
    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("SecurityToken")
    public String securityToken;

    @NameInMap("DomainName")
    public String domainName;

    @NameInMap("Enable")
    public String enable;

    @NameInMap("BackSrcDomain")
    public String backSrcDomain;

    public static SetSourceHostConfigRequest build(java.util.Map<String, ?> map) throws Exception {
        SetSourceHostConfigRequest self = new SetSourceHostConfigRequest();
        return TeaModel.build(map, self);
    }

    public SetSourceHostConfigRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public SetSourceHostConfigRequest setSecurityToken(String securityToken) {
        this.securityToken = securityToken;
        return this;
    }
    public String getSecurityToken() {
        return this.securityToken;
    }

    public SetSourceHostConfigRequest setDomainName(String domainName) {
        this.domainName = domainName;
        return this;
    }
    public String getDomainName() {
        return this.domainName;
    }

    public SetSourceHostConfigRequest setEnable(String enable) {
        this.enable = enable;
        return this;
    }
    public String getEnable() {
        return this.enable;
    }

    public SetSourceHostConfigRequest setBackSrcDomain(String backSrcDomain) {
        this.backSrcDomain = backSrcDomain;
        return this;
    }
    public String getBackSrcDomain() {
        return this.backSrcDomain;
    }

}
