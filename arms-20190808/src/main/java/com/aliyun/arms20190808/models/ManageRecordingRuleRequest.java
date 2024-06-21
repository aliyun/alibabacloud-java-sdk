// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class ManageRecordingRuleRequest extends TeaModel {
    /**
     * <p>The cluster ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cf09705f5a82f454db0d50420b6b4e904</p>
     */
    @NameInMap("ClusterId")
    public String clusterId;

    /**
     * <p>The user ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>87348589207</p>
     */
    @NameInMap("QueryUserId")
    public String queryUserId;

    /**
     * <p>The region ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The recording rule.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>groups:\n- interval: 60s\n  name: auto_analyzer_recording_rule_60s\n  rules:\n  - expr: sum(node_cpu_seconds_total)\n    record: sum:node_cpu_seconds_total:recording_rule_hash_f341458c0f7d\n</p>
     */
    @NameInMap("RuleYaml")
    public String ruleYaml;

    public static ManageRecordingRuleRequest build(java.util.Map<String, ?> map) throws Exception {
        ManageRecordingRuleRequest self = new ManageRecordingRuleRequest();
        return TeaModel.build(map, self);
    }

    public ManageRecordingRuleRequest setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

    public ManageRecordingRuleRequest setQueryUserId(String queryUserId) {
        this.queryUserId = queryUserId;
        return this;
    }
    public String getQueryUserId() {
        return this.queryUserId;
    }

    public ManageRecordingRuleRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ManageRecordingRuleRequest setRuleYaml(String ruleYaml) {
        this.ruleYaml = ruleYaml;
        return this;
    }
    public String getRuleYaml() {
        return this.ruleYaml;
    }

}
