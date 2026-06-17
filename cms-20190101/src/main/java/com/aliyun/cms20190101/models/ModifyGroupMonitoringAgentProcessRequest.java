// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20190101.models;

import com.aliyun.tea.*;

public class ModifyGroupMonitoringAgentProcessRequest extends TeaModel {
    /**
     * <p>The configurations of the alert rule.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("AlertConfig")
    public java.util.List<ModifyGroupMonitoringAgentProcessRequestAlertConfig> alertConfig;

    /**
     * <p>The ID of the application group.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>6780****</p>
     */
    @NameInMap("GroupId")
    public String groupId;

    /**
     * <p>The ID of the process monitoring job for the application group.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>92E3065F-0980-4E31-9AA0-BA6****</p>
     */
    @NameInMap("Id")
    public String id;

    /**
     * <p>This parameter is deprecated. You can ignore it.</p>
     * 
     * <strong>example:</strong>
     * <p>and</p>
     */
    @NameInMap("MatchExpressFilterRelation")
    public String matchExpressFilterRelation;

    @NameInMap("RegionId")
    public String regionId;

    public static ModifyGroupMonitoringAgentProcessRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyGroupMonitoringAgentProcessRequest self = new ModifyGroupMonitoringAgentProcessRequest();
        return TeaModel.build(map, self);
    }

    public ModifyGroupMonitoringAgentProcessRequest setAlertConfig(java.util.List<ModifyGroupMonitoringAgentProcessRequestAlertConfig> alertConfig) {
        this.alertConfig = alertConfig;
        return this;
    }
    public java.util.List<ModifyGroupMonitoringAgentProcessRequestAlertConfig> getAlertConfig() {
        return this.alertConfig;
    }

    public ModifyGroupMonitoringAgentProcessRequest setGroupId(String groupId) {
        this.groupId = groupId;
        return this;
    }
    public String getGroupId() {
        return this.groupId;
    }

    public ModifyGroupMonitoringAgentProcessRequest setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public ModifyGroupMonitoringAgentProcessRequest setMatchExpressFilterRelation(String matchExpressFilterRelation) {
        this.matchExpressFilterRelation = matchExpressFilterRelation;
        return this;
    }
    public String getMatchExpressFilterRelation() {
        return this.matchExpressFilterRelation;
    }

    public ModifyGroupMonitoringAgentProcessRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public static class ModifyGroupMonitoringAgentProcessRequestAlertConfigTargetList extends TeaModel {
        /**
         * <p>The Alibaba Cloud Resource Name (ARN) of the resource.</p>
         * <p>For more information, see <a href="https://help.aliyun.com/document_detail/121592.html">DescribeMetricRuleTargets</a>.</p>
         * <p>The ARN of a resource is in the following format: <code>acs:{product-abbreviation}:{regionId}:{userId}:/{resource-type}/{resource-name}/message</code>. For example: <code>acs:mns:cn-hangzhou:120886317861****:/queues/test123/message</code>. The parameters are described as follows:</p>
         * <ul>
         * <li><p>{product-abbreviation}: Currently, only Simple Message Queue (formerly MNS) is supported.</p>
         * </li>
         * <li><p>{userId}: The ID of your Alibaba Cloud account.</p>
         * </li>
         * <li><p>{regionId}: The region where the Simple Message Queue (formerly MNS) queue or subject is located.</p>
         * </li>
         * <li><p>{resource-type}: The type of the resource that receives alerts. Valid values:</p>
         * <ul>
         * <li><p><strong>queues</strong>: a queue.</p>
         * </li>
         * <li><p><strong>topics</strong>: a subject.</p>
         * </li>
         * </ul>
         * </li>
         * <li><p>{resource-name}: The name of the resource.</p>
         * <ul>
         * <li><p>If the resource type is <strong>queues</strong>, the resource name is the queue name.</p>
         * </li>
         * <li><p>If the resource type is <strong>topics</strong>, the resource name is the subject name.</p>
         * </li>
         * </ul>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>acs:mns:cn-hangzhou:120886317861****:/queues/test/message</p>
         */
        @NameInMap("Arn")
        public String arn;

        /**
         * <p>The ID of the alert-triggered target.</p>
         * <p>For more information, see <a href="https://help.aliyun.com/document_detail/121592.html">DescribeMetricRuleTargets</a>.</p>
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
         * <li><p>INFO: information</p>
         * </li>
         * <li><p>WARN: warning</p>
         * </li>
         * <li><p>CRITICAL: critical</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>[&quot;INFO&quot;, &quot;WARN&quot;, &quot;CRITICAL&quot;]</p>
         */
        @NameInMap("Level")
        public String level;

        public static ModifyGroupMonitoringAgentProcessRequestAlertConfigTargetList build(java.util.Map<String, ?> map) throws Exception {
            ModifyGroupMonitoringAgentProcessRequestAlertConfigTargetList self = new ModifyGroupMonitoringAgentProcessRequestAlertConfigTargetList();
            return TeaModel.build(map, self);
        }

        public ModifyGroupMonitoringAgentProcessRequestAlertConfigTargetList setArn(String arn) {
            this.arn = arn;
            return this;
        }
        public String getArn() {
            return this.arn;
        }

        public ModifyGroupMonitoringAgentProcessRequestAlertConfigTargetList setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public ModifyGroupMonitoringAgentProcessRequestAlertConfigTargetList setJsonParams(String jsonParams) {
            this.jsonParams = jsonParams;
            return this;
        }
        public String getJsonParams() {
            return this.jsonParams;
        }

        public ModifyGroupMonitoringAgentProcessRequestAlertConfigTargetList setLevel(String level) {
            this.level = level;
            return this;
        }
        public String getLevel() {
            return this.level;
        }

    }

    public static class ModifyGroupMonitoringAgentProcessRequestAlertConfig extends TeaModel {
        /**
         * <p>The comparison operator for the threshold of the Critical alert level. The value of N can be 1 to 200. Valid values:</p>
         * <ul>
         * <li><p>GreaterThanOrEqualToThreshold: greater than or equal to</p>
         * </li>
         * <li><p>GreaterThanThreshold: greater than</p>
         * </li>
         * <li><p>LessThanOrEqualToThreshold: less than or equal to</p>
         * </li>
         * <li><p>LessThanThreshold: less than</p>
         * </li>
         * <li><p>NotEqualToThreshold: not equal to</p>
         * </li>
         * <li><p>GreaterThanYesterday: greater than the value at the same time yesterday</p>
         * </li>
         * <li><p>LessThanYesterday: less than the value at the same time yesterday</p>
         * </li>
         * <li><p>GreaterThanLastWeek: greater than the value at the same time last week</p>
         * </li>
         * <li><p>LessThanLastWeek: less than the value at the same time last week</p>
         * </li>
         * <li><p>GreaterThanLastPeriod: greater than the value in the last monitoring cycle</p>
         * </li>
         * <li><p>LessThanLastPeriod: less than the value in the last monitoring cycle</p>
         * </li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>GreaterThanOrEqualToThreshold</p>
         */
        @NameInMap("ComparisonOperator")
        public String comparisonOperator;

        /**
         * <p>The time period when the alert rule is effective. The value of N can be 1 to 200.</p>
         * 
         * <strong>example:</strong>
         * <p>00:00-22:59</p>
         */
        @NameInMap("EffectiveInterval")
        public String effectiveInterval;

        /**
         * <p>The alert level. The value of N can be 1 to 200. Valid values:</p>
         * <ul>
         * <li><p>critical (default): critical</p>
         * </li>
         * <li><p>warn: warning</p>
         * </li>
         * <li><p>info: information</p>
         * </li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>warn</p>
         */
        @NameInMap("EscalationsLevel")
        public String escalationsLevel;

        /**
         * <p>This parameter is deprecated. You can ignore it.</p>
         * 
         * <strong>example:</strong>
         * <p>00:00-05:30</p>
         */
        @NameInMap("NoEffectiveInterval")
        public String noEffectiveInterval;

        /**
         * <p>The mute period. The value of N can be 1 to 200.</p>
         * <p>Unit: seconds. Minimum value: 3600. Default value: 86400.</p>
         * <blockquote>
         * <p>If monitoring data continuously exceeds the alert threshold, an alert notification is sent only once during each mute period.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>86400</p>
         */
        @NameInMap("SilenceTime")
        public String silenceTime;

        /**
         * <p>The statistical method for alerts. The value of N can be 1 to 200.</p>
         * <blockquote>
         * <p>Only Average is supported.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>Average</p>
         */
        @NameInMap("Statistics")
        public String statistics;

        /**
         * <p>None.</p>
         */
        @NameInMap("TargetList")
        public java.util.List<ModifyGroupMonitoringAgentProcessRequestAlertConfigTargetList> targetList;

        /**
         * <p>The alert threshold. The value of N can be 1 to 200.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>5</p>
         */
        @NameInMap("Threshold")
        public String threshold;

        /**
         * <p>The number of consecutive times that the alert level is reached. The value of N can be 1 to 200. Default value: 3.</p>
         * <blockquote>
         * <p>An alert is triggered only when the alert level is reached the specified number of consecutive times and the threshold is met.</p>
         * </blockquote>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
        @NameInMap("Times")
        public String times;

        /**
         * <p>The callback URL. A POST request is sent to this URL when an alert is triggered. The value of N can be 1 to 200.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="http://www.aliyun.com">http://www.aliyun.com</a></p>
         */
        @NameInMap("Webhook")
        public String webhook;

        public static ModifyGroupMonitoringAgentProcessRequestAlertConfig build(java.util.Map<String, ?> map) throws Exception {
            ModifyGroupMonitoringAgentProcessRequestAlertConfig self = new ModifyGroupMonitoringAgentProcessRequestAlertConfig();
            return TeaModel.build(map, self);
        }

        public ModifyGroupMonitoringAgentProcessRequestAlertConfig setComparisonOperator(String comparisonOperator) {
            this.comparisonOperator = comparisonOperator;
            return this;
        }
        public String getComparisonOperator() {
            return this.comparisonOperator;
        }

        public ModifyGroupMonitoringAgentProcessRequestAlertConfig setEffectiveInterval(String effectiveInterval) {
            this.effectiveInterval = effectiveInterval;
            return this;
        }
        public String getEffectiveInterval() {
            return this.effectiveInterval;
        }

        public ModifyGroupMonitoringAgentProcessRequestAlertConfig setEscalationsLevel(String escalationsLevel) {
            this.escalationsLevel = escalationsLevel;
            return this;
        }
        public String getEscalationsLevel() {
            return this.escalationsLevel;
        }

        public ModifyGroupMonitoringAgentProcessRequestAlertConfig setNoEffectiveInterval(String noEffectiveInterval) {
            this.noEffectiveInterval = noEffectiveInterval;
            return this;
        }
        public String getNoEffectiveInterval() {
            return this.noEffectiveInterval;
        }

        public ModifyGroupMonitoringAgentProcessRequestAlertConfig setSilenceTime(String silenceTime) {
            this.silenceTime = silenceTime;
            return this;
        }
        public String getSilenceTime() {
            return this.silenceTime;
        }

        public ModifyGroupMonitoringAgentProcessRequestAlertConfig setStatistics(String statistics) {
            this.statistics = statistics;
            return this;
        }
        public String getStatistics() {
            return this.statistics;
        }

        public ModifyGroupMonitoringAgentProcessRequestAlertConfig setTargetList(java.util.List<ModifyGroupMonitoringAgentProcessRequestAlertConfigTargetList> targetList) {
            this.targetList = targetList;
            return this;
        }
        public java.util.List<ModifyGroupMonitoringAgentProcessRequestAlertConfigTargetList> getTargetList() {
            return this.targetList;
        }

        public ModifyGroupMonitoringAgentProcessRequestAlertConfig setThreshold(String threshold) {
            this.threshold = threshold;
            return this;
        }
        public String getThreshold() {
            return this.threshold;
        }

        public ModifyGroupMonitoringAgentProcessRequestAlertConfig setTimes(String times) {
            this.times = times;
            return this;
        }
        public String getTimes() {
            return this.times;
        }

        public ModifyGroupMonitoringAgentProcessRequestAlertConfig setWebhook(String webhook) {
            this.webhook = webhook;
            return this;
        }
        public String getWebhook() {
            return this.webhook;
        }

    }

}
