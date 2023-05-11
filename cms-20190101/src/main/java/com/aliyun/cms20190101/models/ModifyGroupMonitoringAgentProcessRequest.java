// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20190101.models;

import com.aliyun.tea.*;

public class ModifyGroupMonitoringAgentProcessRequest extends TeaModel {
    @NameInMap("AlertConfig")
    public java.util.List<ModifyGroupMonitoringAgentProcessRequestAlertConfig> alertConfig;

    /**
     * <p>The ID of the application group.</p>
     */
    @NameInMap("GroupId")
    public String groupId;

    /**
     * <p>The statistical aggregation method that is used to calculate the metric values. Valid values of N: 1 to 200.</p>
     * <br>
     * <p>>  Set the value to Average.</p>
     */
    @NameInMap("Id")
    public String id;

    /**
     * <p>The comparison operator that is used to compare the metric value with the threshold. Valid values of N: 1 to 200. Valid values:</p>
     * <br>
     * <p>*   GreaterThanOrEqualToThreshold: greater than or equal to the threshold</p>
     * <p>*   GreaterThanThreshold: greater than the threshold</p>
     * <p>*   LessThanOrEqualToThreshold: less than or equal to the threshold</p>
     * <p>*   LessThanThreshold: less than the threshold.</p>
     * <p>*   NotEqualToThreshold: not equal to the threshold</p>
     * <p>*   GreaterThanYesterday: greater than the metric value at the same time yesterday.</p>
     * <p>*   LessThanYesterday: less than the metric value at the same time yesterday</p>
     * <p>*   GreaterThanLastWeek: greater than the metric value at the same time last week</p>
     * <p>*   LessThanLastWeek: less than the metric value at the same time last week</p>
     * <p>*   GreaterThanLastPeriod: greater than the metric value in the last monitoring cycle</p>
     * <p>*   LessThanLastPeriod: less than the metric value in the last monitoring cycle</p>
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
         * <br>
         * <p>For information about how to obtain the ARN of a resource, see [DescribeMetricRuleTargets](~~121592~~).</p>
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
         * <p>The time period during which the alert rule is ineffective. Valid values of N: 1 to 200.</p>
         */
        @NameInMap("Id")
        public String id;

        /**
         * <p>The alert threshold. Valid values of N: 1 to 200.</p>
         */
        @NameInMap("JsonParams")
        public String jsonParams;

        /**
         * <p>The callback URL to which a POST request is sent when an alert is triggered based on the alert rule. Valid values of N: 1 to 200.</p>
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
         * <p>The level of the alert. Valid values:</p>
         * <br>
         * <p>*   INFO: information</p>
         * <p>*   WARN: warning</p>
         * <p>*   CRITICAL: critical</p>
         */
        @NameInMap("ComparisonOperator")
        public String comparisonOperator;

        /**
         * <p>The error message.</p>
         */
        @NameInMap("EffectiveInterval")
        public String effectiveInterval;

        /**
         * <p>The time period during which the alert rule is effective. Valid values of N: 1 to 200.</p>
         */
        @NameInMap("EscalationsLevel")
        public String escalationsLevel;

        /**
         * <p>The ID of the process monitoring task.</p>
         */
        @NameInMap("NoEffectiveInterval")
        public String noEffectiveInterval;

        /**
         * <p>The logical operator used between conditional expressions that are used to match instances. Valid values:</p>
         * <br>
         * <p>*   all</p>
         * <p>*   and</p>
         * <p>*   or</p>
         */
        @NameInMap("SilenceTime")
        public String silenceTime;

        /**
         * <p>The level of the alert. Valid values of N: 1 to 200. Valid values:</p>
         * <br>
         * <p>*   critical (default value): critical</p>
         * <p>*   warn: warning</p>
         * <p>*   info: information</p>
         */
        @NameInMap("Statistics")
        public String statistics;

        @NameInMap("TargetList")
        public java.util.List<ModifyGroupMonitoringAgentProcessRequestAlertConfigTargetList> targetList;

        /**
         * <p>The mute period during which new alerts are not sent even if the trigger conditions are met. Valid values of N: 1 to 200.</p>
         * <br>
         * <p>Unit: seconds. Minimum value: 3600, which is equivalent to one hour. Default value: 86400, which is equivalent to one day.</p>
         * <br>
         * <p>>  Only one alert notification is sent during a mute period even if the metric value exceeds the alert threshold during consecutive checks.</p>
         */
        @NameInMap("Threshold")
        public String threshold;

        /**
         * <p>The operation that you want to perform. Set the value to **ModifyGroupMonitoringAgentProcess**.</p>
         */
        @NameInMap("Times")
        public String times;

        /**
         * <p>The HTTP status code.</p>
         * <br>
         * <p>>  The status code 200 indicates that the call was successful.</p>
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
