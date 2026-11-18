// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20190101.models;

import com.aliyun.tea.*;

public class PutMetricRuleTargetsRequest extends TeaModel {
    /**
     * <p>Specifies whether to perform a dry run.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("DryRun")
    public Boolean dryRun;

    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The ID of the alert rule.</p>
     * <p>For more information about how to obtain the ID of an alert rule, see <a href="https://help.aliyun.com/document_detail/114941.html">DescribeMetricRuleList</a>.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ae06917_75a8c43178ab66****</p>
     */
    @NameInMap("RuleId")
    public String ruleId;

    /**
     * <p>None.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("Targets")
    public java.util.List<PutMetricRuleTargetsRequestTargets> targets;

    public static PutMetricRuleTargetsRequest build(java.util.Map<String, ?> map) throws Exception {
        PutMetricRuleTargetsRequest self = new PutMetricRuleTargetsRequest();
        return TeaModel.build(map, self);
    }

    public PutMetricRuleTargetsRequest setDryRun(Boolean dryRun) {
        this.dryRun = dryRun;
        return this;
    }
    public Boolean getDryRun() {
        return this.dryRun;
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
         * <p>The ARN of the resource. Simple Message Queue (formerly MNS), Auto Scaling (ESS), Simple Log Service (SLS), and Function Compute (FC) are supported.</p>
         * <p>The ARN parameters for Simple Message Queue (formerly MNS) are as follows:</p>
         * <p><code>acs:mns:{regionId}:{userId}:/{resource type}/{resource name}/message</code>.</p>
         * <ul>
         * <li><p>{regionId}: the region where the Simple Message Queue (formerly MNS) queue or topic resides.</p>
         * </li>
         * <li><p>{userId}: the Alibaba Cloud account to which the resource belongs.</p>
         * </li>
         * <li><p>{resource type}: the type of the resource that accepts alerts. Valid values:</p>
         * <ul>
         * <li><strong>queues</strong>: queue</li>
         * <li><strong>topics</strong>: topic</li>
         * </ul>
         * </li>
         * <li><p>{resource name}: the name of the resource.</p>
         * <ul>
         * <li>If the resource type is <strong>queues</strong>, the resource name is the queue name.</li>
         * <li>If the resource type is <strong>topics</strong>, the resource name is the topic name.</li>
         * </ul>
         * </li>
         * </ul>
         * <p>The ARN for Auto Scaling:</p>
         * <p>acs:ess:{regionId}:{userId}:scalingGroupId/{scaling group ID}:scalingRuleId/{scaling rule ID}</p>
         * <p>The ARN for Simple Log Service:</p>
         * <p>acs:log:{regionId}:{userId}:project/{project name}/logstore/{Logstore name}</p>
         * <p>The ARN for Function Compute:</p>
         * <p>acs:fc:{regionId}:{userId}:services/{service name}/functions/{function name}</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>acs:mns:cn-hangzhou:120886317861****:/queues/test/message</p>
         */
        @NameInMap("Arn")
        public String arn;

        /**
         * <p>The ID of the alert trigger target.</p>
         * <p>For more information about how to obtain the ID of an alert trigger target, see <a href="https://help.aliyun.com/document_detail/121592.html">DescribeMetricRuleTargets</a>.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Id")
        public String id;

        /**
         * <p>The JSON-formatted parameters for the alert callback.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;customField1&quot;:&quot;value1&quot;,&quot;customField2&quot;:&quot;$.name&quot;}</p>
         */
        @NameInMap("JsonParams")
        public String jsonParams;

        /**
         * <p>The alert level. Valid values:</p>
         * <ul>
         * <li>INFO: information</li>
         * <li>WARN: warning</li>
         * <li>CRITICAL: critical</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>[&quot;INFO&quot;, &quot;WARN&quot;, &quot;CRITICAL&quot;]</p>
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
