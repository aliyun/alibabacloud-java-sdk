// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class AddRecordingRuleRequest extends TeaModel {
    /**
     * <p>The cluster ID.</p>
     */
    @NameInMap("ClusterId")
    public String clusterId;

    /**
     * <p>The region ID.</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The custom recording rule. The value is in the YAML format.</p>
     */
    @NameInMap("RuleYaml")
    public String ruleYaml;

    public static AddRecordingRuleRequest build(java.util.Map<String, ?> map) throws Exception {
        AddRecordingRuleRequest self = new AddRecordingRuleRequest();
        return TeaModel.build(map, self);
    }

    public AddRecordingRuleRequest setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

    public AddRecordingRuleRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public AddRecordingRuleRequest setRuleYaml(String ruleYaml) {
        this.ruleYaml = ruleYaml;
        return this;
    }
    public String getRuleYaml() {
        return this.ruleYaml;
    }

}
