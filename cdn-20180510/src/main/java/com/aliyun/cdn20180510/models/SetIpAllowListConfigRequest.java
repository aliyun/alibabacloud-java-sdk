// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cdn20180510.models;

import com.aliyun.tea.*;

public class SetIpAllowListConfigRequest extends TeaModel {
    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("SecurityToken")
    public String securityToken;

    @NameInMap("DomainName")
    public String domainName;

    @NameInMap("AllowIps")
    public String allowIps;

    public static SetIpAllowListConfigRequest build(java.util.Map<String, ?> map) throws Exception {
        SetIpAllowListConfigRequest self = new SetIpAllowListConfigRequest();
        return TeaModel.build(map, self);
    }

    public SetIpAllowListConfigRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public SetIpAllowListConfigRequest setSecurityToken(String securityToken) {
        this.securityToken = securityToken;
        return this;
    }
    public String getSecurityToken() {
        return this.securityToken;
    }

    public SetIpAllowListConfigRequest setDomainName(String domainName) {
        this.domainName = domainName;
        return this;
    }
    public String getDomainName() {
        return this.domainName;
    }

    public SetIpAllowListConfigRequest setAllowIps(String allowIps) {
        this.allowIps = allowIps;
        return this;
    }
    public String getAllowIps() {
        return this.allowIps;
    }

}
