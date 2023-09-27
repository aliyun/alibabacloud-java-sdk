// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20180601.models;

import com.aliyun.tea.*;

public class RemoveAccessPermissionByAppsRequest extends TeaModel {
    @NameInMap("ApiId")
    public String apiId;

    @NameInMap("AppIds")
    public String appIds;

    @NameInMap("GroupId")
    public String groupId;

    @NameInMap("SecurityToken")
    public String securityToken;

    @NameInMap("StageName")
    public String stageName;

    public static RemoveAccessPermissionByAppsRequest build(java.util.Map<String, ?> map) throws Exception {
        RemoveAccessPermissionByAppsRequest self = new RemoveAccessPermissionByAppsRequest();
        return TeaModel.build(map, self);
    }

    public RemoveAccessPermissionByAppsRequest setApiId(String apiId) {
        this.apiId = apiId;
        return this;
    }
    public String getApiId() {
        return this.apiId;
    }

    public RemoveAccessPermissionByAppsRequest setAppIds(String appIds) {
        this.appIds = appIds;
        return this;
    }
    public String getAppIds() {
        return this.appIds;
    }

    public RemoveAccessPermissionByAppsRequest setGroupId(String groupId) {
        this.groupId = groupId;
        return this;
    }
    public String getGroupId() {
        return this.groupId;
    }

    public RemoveAccessPermissionByAppsRequest setSecurityToken(String securityToken) {
        this.securityToken = securityToken;
        return this;
    }
    public String getSecurityToken() {
        return this.securityToken;
    }

    public RemoveAccessPermissionByAppsRequest setStageName(String stageName) {
        this.stageName = stageName;
        return this;
    }
    public String getStageName() {
        return this.stageName;
    }

}
