// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20160714.models;

import com.aliyun.tea.*;

public class RemoveApisAuthoritiesRequest extends TeaModel {
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

    public static RemoveApisAuthoritiesRequest build(java.util.Map<String, ?> map) throws Exception {
        RemoveApisAuthoritiesRequest self = new RemoveApisAuthoritiesRequest();
        return TeaModel.build(map, self);
    }

    public RemoveApisAuthoritiesRequest setApiIds(String apiIds) {
        this.apiIds = apiIds;
        return this;
    }
    public String getApiIds() {
        return this.apiIds;
    }

    public RemoveApisAuthoritiesRequest setAppId(Long appId) {
        this.appId = appId;
        return this;
    }
    public Long getAppId() {
        return this.appId;
    }

    public RemoveApisAuthoritiesRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public RemoveApisAuthoritiesRequest setGroupId(String groupId) {
        this.groupId = groupId;
        return this;
    }
    public String getGroupId() {
        return this.groupId;
    }

    public RemoveApisAuthoritiesRequest setStageName(String stageName) {
        this.stageName = stageName;
        return this;
    }
    public String getStageName() {
        return this.stageName;
    }

}
