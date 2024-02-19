// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20160201.models;

import com.aliyun.tea.*;

public class ReactivateDomainForBackendRequest extends TeaModel {
    @NameInMap("Aliuid")
    public Long aliuid;

    @NameInMap("DomainName")
    public String domainName;

    @NameInMap("GroupId")
    public String groupId;

    @NameInMap("SecurityToken")
    public String securityToken;

    public static ReactivateDomainForBackendRequest build(java.util.Map<String, ?> map) throws Exception {
        ReactivateDomainForBackendRequest self = new ReactivateDomainForBackendRequest();
        return TeaModel.build(map, self);
    }

    public ReactivateDomainForBackendRequest setAliuid(Long aliuid) {
        this.aliuid = aliuid;
        return this;
    }
    public Long getAliuid() {
        return this.aliuid;
    }

    public ReactivateDomainForBackendRequest setDomainName(String domainName) {
        this.domainName = domainName;
        return this;
    }
    public String getDomainName() {
        return this.domainName;
    }

    public ReactivateDomainForBackendRequest setGroupId(String groupId) {
        this.groupId = groupId;
        return this;
    }
    public String getGroupId() {
        return this.groupId;
    }

    public ReactivateDomainForBackendRequest setSecurityToken(String securityToken) {
        this.securityToken = securityToken;
        return this;
    }
    public String getSecurityToken() {
        return this.securityToken;
    }

}
