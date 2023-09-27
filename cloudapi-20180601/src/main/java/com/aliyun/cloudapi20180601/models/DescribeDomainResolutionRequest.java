// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20180601.models;

import com.aliyun.tea.*;

public class DescribeDomainResolutionRequest extends TeaModel {
    @NameInMap("DomainNames")
    public String domainNames;

    @NameInMap("GroupId")
    public String groupId;

    @NameInMap("SecurityToken")
    public String securityToken;

    public static DescribeDomainResolutionRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeDomainResolutionRequest self = new DescribeDomainResolutionRequest();
        return TeaModel.build(map, self);
    }

    public DescribeDomainResolutionRequest setDomainNames(String domainNames) {
        this.domainNames = domainNames;
        return this;
    }
    public String getDomainNames() {
        return this.domainNames;
    }

    public DescribeDomainResolutionRequest setGroupId(String groupId) {
        this.groupId = groupId;
        return this;
    }
    public String getGroupId() {
        return this.groupId;
    }

    public DescribeDomainResolutionRequest setSecurityToken(String securityToken) {
        this.securityToken = securityToken;
        return this;
    }
    public String getSecurityToken() {
        return this.securityToken;
    }

}
