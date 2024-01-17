// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20160201.models;

import com.aliyun.tea.*;

public class SetAccessPermissionByApisRequest extends TeaModel {
    @NameInMap("ApiIds")
    public String apiIds;

    @NameInMap("AppId")
    public Long appId;

    @NameInMap("Description")
    public String description;

    @NameInMap("GroupId")
    public String groupId;

    @NameInMap("StageName")
    public String stageName;

    public static SetAccessPermissionByApisRequest build(java.util.Map<String, ?> map) throws Exception {
        SetAccessPermissionByApisRequest self = new SetAccessPermissionByApisRequest();
        return TeaModel.build(map, self);
    }

    public SetAccessPermissionByApisRequest setApiIds(String apiIds) {
        this.apiIds = apiIds;
        return this;
    }
    public String getApiIds() {
        return this.apiIds;
    }

    public SetAccessPermissionByApisRequest setAppId(Long appId) {
        this.appId = appId;
        return this;
    }
    public Long getAppId() {
        return this.appId;
    }

    public SetAccessPermissionByApisRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public SetAccessPermissionByApisRequest setGroupId(String groupId) {
        this.groupId = groupId;
        return this;
    }
    public String getGroupId() {
        return this.groupId;
    }

    public SetAccessPermissionByApisRequest setStageName(String stageName) {
        this.stageName = stageName;
        return this;
    }
    public String getStageName() {
        return this.stageName;
    }

}
