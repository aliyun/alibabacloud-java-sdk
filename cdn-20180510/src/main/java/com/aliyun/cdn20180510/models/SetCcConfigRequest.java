// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cdn20180510.models;

import com.aliyun.tea.*;

public class SetCcConfigRequest extends TeaModel {
    @NameInMap("AllowIps")
    public String allowIps;

    @NameInMap("BlockIps")
    public String blockIps;

    @NameInMap("DomainName")
    public String domainName;

    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("SecurityToken")
    public String securityToken;

    public static SetCcConfigRequest build(java.util.Map<String, ?> map) throws Exception {
        SetCcConfigRequest self = new SetCcConfigRequest();
        return TeaModel.build(map, self);
    }

    public SetCcConfigRequest setAllowIps(String allowIps) {
        this.allowIps = allowIps;
        return this;
    }
    public String getAllowIps() {
        return this.allowIps;
    }

    public SetCcConfigRequest setBlockIps(String blockIps) {
        this.blockIps = blockIps;
        return this;
    }
    public String getBlockIps() {
        return this.blockIps;
    }

    public SetCcConfigRequest setDomainName(String domainName) {
        this.domainName = domainName;
        return this;
    }
    public String getDomainName() {
        return this.domainName;
    }

    public SetCcConfigRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public SetCcConfigRequest setSecurityToken(String securityToken) {
        this.securityToken = securityToken;
        return this;
    }
    public String getSecurityToken() {
        return this.securityToken;
    }

}
