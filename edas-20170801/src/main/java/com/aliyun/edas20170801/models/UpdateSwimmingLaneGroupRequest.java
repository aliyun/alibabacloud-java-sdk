// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.edas20170801.models;

import com.aliyun.tea.*;

public class UpdateSwimmingLaneGroupRequest extends TeaModel {
    /**
     * <p>The list of application IDs related to the lane group.</p>
     */
    @NameInMap("AppIds")
    public String appIds;

    /**
     * <p>The ingress application. The application is in the EDAS:{application ID} format.</p>
     */
    @NameInMap("EntryApp")
    public String entryApp;

    /**
     * <p>The ID of the lane group.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("GroupId")
    public Long groupId;

    /**
     * <p>The name of the lane group.</p>
     */
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
