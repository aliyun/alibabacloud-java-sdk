// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.edas20170801.models;

import com.aliyun.tea.*;

public class InsertSwimmingLaneGroupRequest extends TeaModel {
    /**
     * <p>IDs of all applications that are related to the lane group. Separate multiple applications with commas (,).</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>bdb251cc-02a6-48dd-891b-2ab21b25****,ee33ed0c-fddc-47b5-9f63-e1ccc4be****</p>
     */
    @NameInMap("AppIds")
    public String appIds;

    /**
     * <p>The ingress application. The application is in the EDAS:{application ID} format.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>EDAS:5cc89013-9232-4b36-b3eb-ff89b3d2****</p>
     */
    @NameInMap("EntryApp")
    public String entryApp;

    /**
     * <p>The ID of the custom namespace. The ID is in the physical region ID:custom namespace identifier format. Example: cn-hangzhou:test.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou:test</p>
     */
    @NameInMap("LogicalRegionId")
    public String logicalRegionId;

    /**
     * <p>The name of the lane group.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>test</p>
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
