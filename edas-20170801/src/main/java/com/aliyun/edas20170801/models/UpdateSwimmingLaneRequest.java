// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.edas20170801.models;

import com.aliyun.tea.*;

public class UpdateSwimmingLaneRequest extends TeaModel {
    /**
     * <p>The list of applications that are related to the lane.</p>
     * 
     * <strong>example:</strong>
     * <p>[{&quot;appId&quot;:&quot;8e7689af-6ddd-4676-8ee6-5fbecdf2****&quot;},{&quot;appId&quot;:&quot;f72deaac-26ba-429a-948d-5fa47c4a****&quot;},{&quot;appId&quot;:&quot;99a2d4b5-99a5-4e25-a964-1bd03a17****&quot;}]</p>
     */
    @NameInMap("AppInfos")
    public String appInfos;

    /**
     * <p>Specifies whether to enable the throttling rule.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("EnableRules")
    public Boolean enableRules;

    /**
     * <p>The configuration of the throttling rule.</p>
     * 
     * <strong>example:</strong>
     * <p>[{&quot;priority&quot;:1,&quot;path&quot;:&quot;/traffictest&quot;,&quot;condition&quot;:&quot;AND&quot;,&quot;restItems&quot;:[{&quot;type&quot;:&quot;header&quot;,&quot;name&quot;:&quot;testheader&quot;,&quot;value&quot;:&quot;testheadervalue&quot;,&quot;cond&quot;:&quot;==&quot;,&quot;operator&quot;:&quot;rawvalue&quot;}]}]</p>
     */
    @NameInMap("EntryRules")
    public String entryRules;

    /**
     * <p>The ID of the lane.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>224</p>
     */
    @NameInMap("LaneId")
    public Long laneId;

    /**
     * <p>The name of the lane.</p>
     * 
     * <strong>example:</strong>
     * <p>test-swimlane</p>
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
