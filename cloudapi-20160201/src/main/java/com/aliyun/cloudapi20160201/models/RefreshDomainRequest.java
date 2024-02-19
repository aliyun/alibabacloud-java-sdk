// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20160201.models;

import com.aliyun.tea.*;

public class RefreshDomainRequest extends TeaModel {
    @NameInMap("DomainName")
    public String domainName;

    @NameInMap("GroupId")
    public String groupId;

    @NameInMap("SecurityToken")
    public String securityToken;

    public static RefreshDomainRequest build(java.util.Map<String, ?> map) throws Exception {
        RefreshDomainRequest self = new RefreshDomainRequest();
        return TeaModel.build(map, self);
    }

    public RefreshDomainRequest setDomainName(String domainName) {
        this.domainName = domainName;
        return this;
    }
    public String getDomainName() {
        return this.domainName;
    }

    public RefreshDomainRequest setGroupId(String groupId) {
        this.groupId = groupId;
        return this;
    }
    public String getGroupId() {
        return this.groupId;
    }

    public RefreshDomainRequest setSecurityToken(String securityToken) {
        this.securityToken = securityToken;
        return this;
    }
    public String getSecurityToken() {
        return this.securityToken;
    }

}
