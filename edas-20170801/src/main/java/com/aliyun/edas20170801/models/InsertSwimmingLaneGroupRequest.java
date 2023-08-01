// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.edas20170801.models;

import com.aliyun.tea.*;

public class InsertSwimmingLaneGroupRequest extends TeaModel {
    /**
     * <p>IDs of all applications that are related to the lane group. Separate multiple applications with commas (,).</p>
     */
    @NameInMap("AppIds")
    public String appIds;

    /**
     * <p>The ingress application. The application is in the EDAS:{application ID} format.</p>
     */
    @NameInMap("EntryApp")
    public String entryApp;

    /**
     * <p>The ID of the custom namespace. The ID is in the physical region ID:custom namespace identifier format. Example: cn-hangzhou:test.</p>
     */
    @NameInMap("LogicalRegionId")
    public String logicalRegionId;

    /**
     * <p>The name of the lane group.</p>
     */
    @NameInMap("Name")
    public String name;

    public static InsertSwimmingLaneGroupRequest build(java.util.Map<String, ?> map) throws Exception {
        InsertSwimmingLaneGroupRequest self = new InsertSwimmingLaneGroupRequest();
        return TeaModel.build(map, self);
    }

    public InsertSwimmingLaneGroupRequest setAppIds(String appIds) {
        this.appIds = appIds;
        return this;
    }
    public String getAppIds() {
        return this.appIds;
    }

    public InsertSwimmingLaneGroupRequest setEntryApp(String entryApp) {
        this.entryApp = entryApp;
        return this;
    }
    public String getEntryApp() {
        return this.entryApp;
    }

    public InsertSwimmingLaneGroupRequest setLogicalRegionId(String logicalRegionId) {
        this.logicalRegionId = logicalRegionId;
        return this;
    }
    public String getLogicalRegionId() {
        return this.logicalRegionId;
    }

    public InsertSwimmingLaneGroupRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

}
