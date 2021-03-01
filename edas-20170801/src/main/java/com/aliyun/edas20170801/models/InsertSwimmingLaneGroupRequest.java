// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.edas20170801.models;

import com.aliyun.tea.*;

public class InsertSwimmingLaneGroupRequest extends TeaModel {
    @NameInMap("Name")
    public String name;

    @NameInMap("EntryApp")
    public String entryApp;

    @NameInMap("AppIds")
    public String appIds;

    @NameInMap("LogicalRegionId")
    public String logicalRegionId;

    public static InsertSwimmingLaneGroupRequest build(java.util.Map<String, ?> map) throws Exception {
        InsertSwimmingLaneGroupRequest self = new InsertSwimmingLaneGroupRequest();
        return TeaModel.build(map, self);
    }

    public InsertSwimmingLaneGroupRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public InsertSwimmingLaneGroupRequest setEntryApp(String entryApp) {
        this.entryApp = entryApp;
        return this;
    }
    public String getEntryApp() {
        return this.entryApp;
    }

    public InsertSwimmingLaneGroupRequest setAppIds(String appIds) {
        this.appIds = appIds;
        return this;
    }
    public String getAppIds() {
        return this.appIds;
    }

    public InsertSwimmingLaneGroupRequest setLogicalRegionId(String logicalRegionId) {
        this.logicalRegionId = logicalRegionId;
        return this;
    }
    public String getLogicalRegionId() {
        return this.logicalRegionId;
    }

}
