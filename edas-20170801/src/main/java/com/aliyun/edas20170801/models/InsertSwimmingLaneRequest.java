// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.edas20170801.models;

import com.aliyun.tea.*;

public class InsertSwimmingLaneRequest extends TeaModel {
    /**
     * <p>The information about applications related to the lane.</p>
     */
    @NameInMap("AppInfos")
    public String appInfos;

    /**
     * <p>Specifies whether to enable the throttling rule.</p>
     */
    @NameInMap("EnableRules")
    public Boolean enableRules;

    /**
     * <p>The throttling conditions.</p>
     */
    @NameInMap("EntryRules")
    public String entryRules;

    /**
     * <p>The ID of the lane group.</p>
     */
    @NameInMap("GroupId")
    public Long groupId;

    /**
     * <p>The ID of the custom namespace. The ID is in the `physical region ID:custom namespace identifier` format. Example: `cn-hangzhou:test`.</p>
     */
    @NameInMap("LogicalRegionId")
    public String logicalRegionId;

    /**
     * <p>The name of the lane.</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>The tag.</p>
     */
    @NameInMap("Tag")
    public String tag;

    public static InsertSwimmingLaneRequest build(java.util.Map<String, ?> map) throws Exception {
        InsertSwimmingLaneRequest self = new InsertSwimmingLaneRequest();
        return TeaModel.build(map, self);
    }

    public InsertSwimmingLaneRequest setAppInfos(String appInfos) {
        this.appInfos = appInfos;
        return this;
    }
    public String getAppInfos() {
        return this.appInfos;
    }

    public InsertSwimmingLaneRequest setEnableRules(Boolean enableRules) {
        this.enableRules = enableRules;
        return this;
    }
    public Boolean getEnableRules() {
        return this.enableRules;
    }

    public InsertSwimmingLaneRequest setEntryRules(String entryRules) {
        this.entryRules = entryRules;
        return this;
    }
    public String getEntryRules() {
        return this.entryRules;
    }

    public InsertSwimmingLaneRequest setGroupId(Long groupId) {
        this.groupId = groupId;
        return this;
    }
    public Long getGroupId() {
        return this.groupId;
    }

    public InsertSwimmingLaneRequest setLogicalRegionId(String logicalRegionId) {
        this.logicalRegionId = logicalRegionId;
        return this;
    }
    public String getLogicalRegionId() {
        return this.logicalRegionId;
    }

    public InsertSwimmingLaneRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public InsertSwimmingLaneRequest setTag(String tag) {
        this.tag = tag;
        return this;
    }
    public String getTag() {
        return this.tag;
    }

}
