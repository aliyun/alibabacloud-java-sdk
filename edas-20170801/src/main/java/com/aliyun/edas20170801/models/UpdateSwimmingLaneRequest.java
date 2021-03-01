// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.edas20170801.models;

import com.aliyun.tea.*;

public class UpdateSwimmingLaneRequest extends TeaModel {
    @NameInMap("LaneId")
    public Long laneId;

    @NameInMap("Name")
    public String name;

    @NameInMap("EnableRules")
    public Boolean enableRules;

    @NameInMap("AppInfos")
    public String appInfos;

    @NameInMap("EntryRules")
    public String entryRules;

    public static UpdateSwimmingLaneRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateSwimmingLaneRequest self = new UpdateSwimmingLaneRequest();
        return TeaModel.build(map, self);
    }

    public UpdateSwimmingLaneRequest setLaneId(Long laneId) {
        this.laneId = laneId;
        return this;
    }
    public Long getLaneId() {
        return this.laneId;
    }

    public UpdateSwimmingLaneRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public UpdateSwimmingLaneRequest setEnableRules(Boolean enableRules) {
        this.enableRules = enableRules;
        return this;
    }
    public Boolean getEnableRules() {
        return this.enableRules;
    }

    public UpdateSwimmingLaneRequest setAppInfos(String appInfos) {
        this.appInfos = appInfos;
        return this;
    }
    public String getAppInfos() {
        return this.appInfos;
    }

    public UpdateSwimmingLaneRequest setEntryRules(String entryRules) {
        this.entryRules = entryRules;
        return this;
    }
    public String getEntryRules() {
        return this.entryRules;
    }

}
