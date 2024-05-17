// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.edas20170801.models;

import com.aliyun.tea.*;

public class UpdateSwimmingLaneRequest extends TeaModel {
    /**
     * <p>The list of applications that are related to the lane.</p>
     */
    @NameInMap("AppInfos")
    public String appInfos;

    /**
     * <p>Specifies whether to enable the throttling rule.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("EnableRules")
    public Boolean enableRules;

    /**
     * <p>The configuration of the throttling rule.</p>
     */
    @NameInMap("EntryRules")
    public String entryRules;

    /**
     * <p>The ID of the lane.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("LaneId")
    public Long laneId;

    /**
     * <p>The name of the lane.</p>
     */
    @NameInMap("Name")
    public String name;

    public static UpdateSwimmingLaneRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateSwimmingLaneRequest self = new UpdateSwimmingLaneRequest();
        return TeaModel.build(map, self);
    }

    public UpdateSwimmingLaneRequest setAppInfos(String appInfos) {
        this.appInfos = appInfos;
        return this;
    }
    public String getAppInfos() {
        return this.appInfos;
    }

    public UpdateSwimmingLaneRequest setEnableRules(Boolean enableRules) {
        this.enableRules = enableRules;
        return this;
    }
    public Boolean getEnableRules() {
        return this.enableRules;
    }

    public UpdateSwimmingLaneRequest setEntryRules(String entryRules) {
        this.entryRules = entryRules;
        return this;
    }
    public String getEntryRules() {
        return this.entryRules;
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

}
