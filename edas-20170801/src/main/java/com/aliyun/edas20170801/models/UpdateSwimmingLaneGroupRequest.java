// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.edas20170801.models;

import com.aliyun.tea.*;

public class UpdateSwimmingLaneGroupRequest extends TeaModel {
    @NameInMap("AppIds")
    public String appIds;

    @NameInMap("EntryApp")
    public String entryApp;

    @NameInMap("GroupId")
    public Long groupId;

    @NameInMap("Name")
    public String name;

    public static UpdateSwimmingLaneGroupRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateSwimmingLaneGroupRequest self = new UpdateSwimmingLaneGroupRequest();
        return TeaModel.build(map, self);
    }

    public UpdateSwimmingLaneGroupRequest setAppIds(String appIds) {
        this.appIds = appIds;
        return this;
    }
    public String getAppIds() {
        return this.appIds;
    }

    public UpdateSwimmingLaneGroupRequest setEntryApp(String entryApp) {
        this.entryApp = entryApp;
        return this;
    }
    public String getEntryApp() {
        return this.entryApp;
    }

    public UpdateSwimmingLaneGroupRequest setGroupId(Long groupId) {
        this.groupId = groupId;
        return this;
    }
    public Long getGroupId() {
        return this.groupId;
    }

    public UpdateSwimmingLaneGroupRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

}
