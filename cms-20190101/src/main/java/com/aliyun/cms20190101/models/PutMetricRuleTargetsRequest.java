// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20190101.models;

import com.aliyun.tea.*;

public class PutMetricRuleTargetsRequest extends TeaModel {
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The list of resources that failed to be created or modified.</p>
     */
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
        /**
         * <p>The ARN of the resource.</p>
         * <br>
         * <p>Format: `acs:{Service name abbreviation}:{regionId}:{userId}:/{Resource type}/{Resource name}/message`. Example: `acs:mns:cn-hangzhou:120886317861****:/queues/test123/message`. Fields:</p>
         * <br>
         * <p>*   {Service name abbreviation}: the abbreviation of the service name. Valid value: mns.</p>
         * <p>*   {userId}: the ID of the Alibaba Cloud account.</p>
         * <p>*   {regionId}: the region ID of the message queue or topic.</p>
         * <p>*   {Resource type}`: the type of the resource for which alerts are triggered. Valid values: - **queues** - **topics** {Resource name}: the name of the resource. - If the resource type is set to **queues**, the resource name is the name of the message queue. - If the resource type is set to **topics**, the resource name is the name of the topic.`</p>
         */
        @NameInMap("Arn")
        public String arn;

        /**
         * <p>The ID of the resource for which alerts are triggered.</p>
         * <br>
         * <p>For information about how to obtain the ID of a resource for which alerts are triggered, see [DescribeMetricRuleTargets](~~121592~~).</p>
         */
        @NameInMap("Id")
        public String id;

        /**
         * <p>The ID of the resource for which alerts are triggered.</p>
         */
        @NameInMap("JsonParams")
        public String jsonParams;

        /**
         * <p>The HTTP status code.</p>
         * <br>
         * <p>>  The status code 200 indicates that the call was successful.</p>
         */
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
