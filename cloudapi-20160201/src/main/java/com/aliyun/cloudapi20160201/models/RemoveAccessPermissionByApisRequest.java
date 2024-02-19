// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20160201.models;

import com.aliyun.tea.*;

public class RemoveAccessPermissionByApisRequest extends TeaModel {
    @NameInMap("ApiIds")
    public String apiIds;

    @NameInMap("AppId")
    public Long appId;

    @NameInMap("Description")
    public String description;

    @NameInMap("GroupId")
    public String groupId;

    @NameInMap("SecurityToken")
    public String securityToken;

    @NameInMap("StageName")
    public String stageName;

    public static RemoveAccessPermissionByApisRequest build(java.util.Map<String, ?> map) throws Exception {
        RemoveAccessPermissionByApisRequest self = new RemoveAccessPermissionByApisRequest();
        return TeaModel.build(map, self);
    }

    public RemoveAccessPermissionByApisRequest setApiIds(String apiIds) {
        this.apiIds = apiIds;
        return this;
    }
    public String getApiIds() {
        return this.apiIds;
    }

    public RemoveAccessPermissionByApisRequest setAppId(Long appId) {
        this.appId = appId;
        return this;
    }
    public Long getAppId() {
        return this.appId;
    }

    public RemoveAccessPermissionByApisRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public RemoveAccessPermissionByApisRequest setGroupId(String groupId) {
        this.groupId = groupId;
        return this;
    }
    public String getGroupId() {
        return this.groupId;
    }

    public RemoveAccessPermissionByApisRequest setSecurityToken(String securityToken) {
        this.securityToken = securityToken;
        return this;
    }
    public String getSecurityToken() {
        return this.securityToken;
    }

    public RemoveAccessPermissionByApisRequest setStageName(String stageName) {
        this.stageName = stageName;
        return this;
    }
    public String getStageName() {
        return this.stageName;
    }

}
