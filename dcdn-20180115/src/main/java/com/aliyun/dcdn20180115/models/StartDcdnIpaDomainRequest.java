// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dcdn20180115.models;

import com.aliyun.tea.*;

public class StartDcdnIpaDomainRequest extends TeaModel {
    @NameInMap("DomainName")
    public String domainName;

    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("SecurityToken")
    public String securityToken;

    public static StartDcdnIpaDomainRequest build(java.util.Map<String, ?> map) throws Exception {
        StartDcdnIpaDomainRequest self = new StartDcdnIpaDomainRequest();
        return TeaModel.build(map, self);
    }

    public StartDcdnIpaDomainRequest setDomainName(String domainName) {
        this.domainName = domainName;
        return this;
    }
    public String getDomainName() {
        return this.domainName;
    }

    public StartDcdnIpaDomainRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public StartDcdnIpaDomainRequest setSecurityToken(String securityToken) {
        this.securityToken = securityToken;
        return this;
    }
    public String getSecurityToken() {
        return this.securityToken;
    }

}
