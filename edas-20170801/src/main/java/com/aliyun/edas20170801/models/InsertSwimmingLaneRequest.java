// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.edas20170801.models;

import com.aliyun.tea.*;

public class InsertSwimmingLaneRequest extends TeaModel {
    @NameInMap("LogicalRegionId")
    public String logicalRegionId;

    @NameInMap("Name")
    public String name;

    @NameInMap("Tag")
    public String tag;

    @NameInMap("GroupId")
    public Long groupId;

    @NameInMap("EntryRules")
    public String entryRules;

    @NameInMap("EnableRules")
    public Boolean enableRules;

    @NameInMap("AppInfos")
    public String appInfos;

    public static InsertSwimmingLaneRequest build(java.util.Map<String, ?> map) throws Exception {
        InsertSwimmingLaneRequest self = new InsertSwimmingLaneRequest();
        return TeaModel.build(map, self);
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

    public InsertSwimmingLaneRequest setGroupId(Long groupId) {
        this.groupId = groupId;
        return this;
    }
    public Long getGroupId() {
        return this.groupId;
    }

    public InsertSwimmingLaneRequest setEntryRules(String entryRules) {
        this.entryRules = entryRules;
        return this;
    }
    public String getEntryRules() {
        return this.entryRules;
    }

    public InsertSwimmingLaneRequest setEnableRules(Boolean enableRules) {
        this.enableRules = enableRules;
        return this;
    }
    public Boolean getEnableRules() {
        return this.enableRules;
    }

    public InsertSwimmingLaneRequest setAppInfos(String appInfos) {
        this.appInfos = appInfos;
        return this;
    }
    public String getAppInfos() {
        return this.appInfos;
    }

}
