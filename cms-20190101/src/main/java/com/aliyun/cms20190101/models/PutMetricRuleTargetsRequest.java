// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20190101.models;

import com.aliyun.tea.*;

public class PutMetricRuleTargetsRequest extends TeaModel {
    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("RuleId")
    public String ruleId;

    @NameInMap("Targets")
    public java.util.List<PutMetricRuleTargetsRequestTargets> targets;

    public static PutMetricRuleTargetsRequest build(java.util.Map<String, ?> map) throws Exception {
        PutMetricRuleTargetsRequest self = new PutMetricRuleTargetsRequest();
        return TeaModel.build(map, self);
    }

    public PutMetricRuleTargetsRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public PutMetricRuleTargetsRequest setRuleId(String ruleId) {
        this.ruleId = ruleId;
        return this;
    }
    public String getRuleId() {
        return this.ruleId;
    }

    public PutMetricRuleTargetsRequest setTargets(java.util.List<PutMetricRuleTargetsRequestTargets> targets) {
        this.targets = targets;
        return this;
    }
    public java.util.List<PutMetricRuleTargetsRequestTargets> getTargets() {
        return this.targets;
    }

    public static class PutMetricRuleTargetsRequestTargets extends TeaModel {
        @NameInMap("Arn")
        public String arn;

        @NameInMap("Id")
        public String id;

        @NameInMap("JsonParams")
        public String jsonParams;

        @NameInMap("Level")
        public String level;

        public static PutMetricRuleTargetsRequestTargets build(java.util.Map<String, ?> map) throws Exception {
            PutMetricRuleTargetsRequestTargets self = new PutMetricRuleTargetsRequestTargets();
            return TeaModel.build(map, self);
        }

        public PutMetricRuleTargetsRequestTargets setArn(String arn) {
            this.arn = arn;
            return this;
        }
        public String getArn() {
            return this.arn;
        }

        public PutMetricRuleTargetsRequestTargets setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public PutMetricRuleTargetsRequestTargets setJsonParams(String jsonParams) {
            this.jsonParams = jsonParams;
            return this;
        }
        public String getJsonParams() {
            return this.jsonParams;
        }

        public PutMetricRuleTargetsRequestTargets setLevel(String level) {
            this.level = level;
            return this;
        }
        public String getLevel() {
            return this.level;
        }

    }

}
