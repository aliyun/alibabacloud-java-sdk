// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class ManageRecordingRuleRequest extends TeaModel {
    // The ID of the cluster.
    @NameInMap("ClusterId")
    public String clusterId;

    // The ID of the user.
    @NameInMap("QueryUserId")
    public String queryUserId;

    // The ID of the region.
    @NameInMap("RegionId")
    public String regionId;

    // The recording rule.
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
