// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.edas20170801.models;

import com.aliyun.tea.*;

public class UpdateSwimmingLaneGroupRequest extends TeaModel {
    /**
     * <p>The list of application IDs related to the lane group.</p>
     * 
     * <strong>example:</strong>
     * <p>8e7689af-6ddd-4676-8ee6-5fbecdf2****,f72deaac-26ba-429a-948d-5fa47c4a****,5049d2c8-f997-4fc9-92a2-153506a6****,99a2d4b5-99a5-4e25-a964-1bd03a17****</p>
     */
    @NameInMap("AppIds")
    public String appIds;

    /**
     * <p>The ingress application. The application is in the EDAS:{application ID} format.</p>
     * 
     * <strong>example:</strong>
     * <p>EDAS:dd2690a7-3fe4-4975-9a4c-5a60ffd6****</p>
     */
    @NameInMap("EntryApp")
    public String entryApp;

    /**
     * <p>The ID of the lane group.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>98</p>
     */
    @NameInMap("GroupId")
    public Long groupId;

    /**
     * <p>The name of the lane group.</p>
     * 
     * <strong>example:</strong>
     * <p>test-swimlanegroup</p>
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
