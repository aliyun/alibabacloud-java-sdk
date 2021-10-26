// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20160714.models;

import com.aliyun.tea.*;

public class RemoveApisAuthoritiesRequest extends TeaModel {
    @NameInMap("SecurityToken")
    public String securityToken;

    @NameInMap("GroupId")
    public String groupId;

    @NameInMap("AppId")
    public Long appId;

    @NameInMap("StageName")
    public String stageName;

    @NameInMap("ApiIds")
    public String apiIds;

    @NameInMap("Description")
    public String description;

    public static RemoveApisAuthoritiesRequest build(java.util.Map<String, ?> map) throws Exception {
        RemoveApisAuthoritiesRequest self = new RemoveApisAuthoritiesRequest();
        return TeaModel.build(map, self);
    }

    public RemoveApisAuthoritiesRequest setSecurityToken(String securityToken) {
        this.securityToken = securityToken;
        return this;
    }
    public String getSecurityToken() {
        return this.securityToken;
    }

    public RemoveApisAuthoritiesRequest setGroupId(String groupId) {
        this.groupId = groupId;
        return this;
    }
    public String getGroupId() {
        return this.groupId;
    }

    public RemoveApisAuthoritiesRequest setAppId(Long appId) {
        this.appId = appId;
        return this;
    }
    public Long getAppId() {
        return this.appId;
    }

    public RemoveApisAuthoritiesRequest setStageName(String stageName) {
        this.stageName = stageName;
        return this;
    }
    public String getStageName() {
        return this.stageName;
    }

    public RemoveApisAuthoritiesRequest setApiIds(String apiIds) {
        this.apiIds = apiIds;
        return this;
    }
    public String getApiIds() {
        return this.apiIds;
    }

    public RemoveApisAuthoritiesRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

}
