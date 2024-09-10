// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20190101.models;

import com.aliyun.tea.*;

public class ModifyGroupMonitoringAgentProcessRequest extends TeaModel {
    /**
     * <p>The alert rule configurations.</p>
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
     * <p>The ID of the process monitoring task.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>92E3065F-0980-4E31-9AA0-BA6****</p>
     */
    @NameInMap("Id")
    public String id;

    /**
     * <p>The logical operator used between conditional expressions that are used to match instances. Valid values:</p>
     * <ul>
     * <li>all</li>
     * <li>and</li>
     * <li>or</li>
     * </ul>
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
         * <p>For information about how to obtain the ARN of a resource, see <a href="https://help.aliyun.com/document_detail/121592.html">DescribeMetricRuleTargets</a>.</p>
         * <p>Format: <code>acs:{Service name abbreviation}:{regionId}:{userId}:/{Resource type}/{Resource name}/message</code>. Example: <code>acs:mns:cn-hangzhou:120886317861****:/queues/test123/message</code>. Fields:</p>
         * <ul>
         * <li>{Service name abbreviation}: the abbreviation of the service name. Valid value: mns.</li>
         * <li>{userId}: the ID of the Alibaba Cloud account.</li>
         * <li>{regionId}: the region ID of the message queue or topic.</li>
         * <li>{Resource type}: the type of the resource for which alerts are triggered. Valid values: <ul>
         * <li><strong>queues</strong> </li>
         * <li><strong>topics</strong></li>
         * </ul>
         * </li>
         * <li>{Resourcename}: the name of the resource. <ul>
         * <li>If the resource type is set to <strong>queues</strong>, the resource name is the name of the message queue. </li>
         * <li>If the resource type is set to <strong>topics</strong>, the resource name is the name of the topic.`</li>
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
         * <p>The ID of the resource for which alerts are triggered.</p>
         * <p>For information about how to obtain the ID of a resource for which alerts are triggered, see <a href="https://help.aliyun.com/document_detail/121592.html">DescribeMetricRuleTargets</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Id")
        public String id;

        /**
         * <p>The parameters of the alert callback. The parameters are in the JSON format.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;customField1&quot;:&quot;value1&quot;,&quot;customField2&quot;:&quot;$.name&quot;}</p>
         */
        @NameInMap("JsonParams")
        public String jsonParams;

        /**
         * <p>The level of the alert. Valid values:</p>
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
         * <p>The comparison operator that is used to compare the metric value with the threshold. Valid values of N: 1 to 200. Valid values:</p>
         * <ul>
         * <li>GreaterThanOrEqualToThreshold: greater than or equal to the threshold</li>
         * <li>GreaterThanThreshold: greater than the threshold</li>
         * <li>LessThanOrEqualToThreshold: less than or equal to the threshold</li>
         * <li>LessThanThreshold: less than the threshold.</li>
         * <li>NotEqualToThreshold: not equal to the threshold</li>
         * <li>GreaterThanYesterday: greater than the metric value at the same time yesterday.</li>
         * <li>LessThanYesterday: less than the metric value at the same time yesterday</li>
         * <li>GreaterThanLastWeek: greater than the metric value at the same time last week</li>
         * <li>LessThanLastWeek: less than the metric value at the same time last week</li>
         * <li>GreaterThanLastPeriod: greater than the metric value in the last monitoring cycle</li>
         * <li>LessThanLastPeriod: less than the metric value in the last monitoring cycle</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>GreaterThanOrEqualToThreshold</p>
         */
        @NameInMap("ComparisonOperator")
        public String comparisonOperator;

        /**
         * <p>The time period during which the alert rule is effective. Valid values of N: 1 to 200.</p>
         * 
         * <strong>example:</strong>
         * <p>00:00-22:59</p>
         */
        @NameInMap("EffectiveInterval")
        public String effectiveInterval;

        /**
         * <p>The level of the alert. Valid values of N: 1 to 200. Valid values:</p>
         * <ul>
         * <li>critical (default value): critical</li>
         * <li>warn: warning</li>
         * <li>info: information</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>warn</p>
         */
        @NameInMap("EscalationsLevel")
        public String escalationsLevel;

        /**
         * <p>The time period during which the alert rule is ineffective. Valid values of N: 1 to 200.</p>
         * 
         * <strong>example:</strong>
         * <p>23:00-23:59</p>
         */
        @NameInMap("NoEffectiveInterval")
        public String noEffectiveInterval;

        /**
         * <p>The mute period during which new alerts are not sent even if the trigger conditions are met. Valid values of N: 1 to 200.</p>
         * <p>Unit: seconds. Minimum value: 3600, which is equivalent to one hour. Default value: 86400, which is equivalent to one day.</p>
         * <blockquote>
         * <p> Only one alert notification is sent during a mute period even if the metric value exceeds the alert threshold during consecutive checks.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>86400</p>
         */
        @NameInMap("SilenceTime")
        public String silenceTime;

        /**
         * <p>The statistical aggregation method that is used to calculate the metric values. Valid values of N: 1 to 200.</p>
         * <blockquote>
         * <p> Set the value to Average.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>Average</p>
         */
        @NameInMap("Statistics")
        public String statistics;

        /**
         * <p>The alert trigger.</p>
         */
        @NameInMap("TargetList")
        public java.util.List<ModifyGroupMonitoringAgentProcessRequestAlertConfigTargetList> targetList;

        /**
         * <p>The alert threshold. Valid values of N: 1 to 200.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>5</p>
         */
        @NameInMap("Threshold")
        public String threshold;

        /**
         * <p>The number of times for which the threshold can be consecutively exceeded. Valid values of N: 1 to 200. Default value: 3.</p>
         * <blockquote>
         * <p> A metric triggers an alert only after the metric value reaches the threshold consecutively for the specified times.</p>
         * </blockquote>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
        @NameInMap("Times")
        public String times;

        /**
         * <p>The callback URL to which a POST request is sent when an alert is triggered based on the alert rule. Valid values of N: 1 to 200.</p>
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
