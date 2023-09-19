// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20190101.models;

import com.aliyun.tea.*;

public class CreateGroupMonitoringAgentProcessRequest extends TeaModel {
    /**
     * <p>The alert rule configurations.</p>
     * <br>
     * <p>Valid values of N: 1 to 3.</p>
     */
    @NameInMap("AlertConfig")
    public java.util.List<CreateGroupMonitoringAgentProcessRequestAlertConfig> alertConfig;

    /**
     * <p>The ID of the application group.</p>
     * <br>
     * <p>For more information about how to obtain the ID of an application group, see [DescribeMonitorGroups](~~115032~~).</p>
     */
    @NameInMap("GroupId")
    public String groupId;

    /**
     * <p>The expressions used to match instances.</p>
     * <br>
     * <p>Valid values of N: 1 to 3.</p>
     */
    @NameInMap("MatchExpress")
    public java.util.List<CreateGroupMonitoringAgentProcessRequestMatchExpress> matchExpress;

    /**
     * <p>The logical operator used between conditional expressions that are used to match instances. Valid values:</p>
     * <br>
     * <p>*   all</p>
     * <p>*   and</p>
     * <p>*   or</p>
     */
    @NameInMap("MatchExpressFilterRelation")
    public String matchExpressFilterRelation;

    /**
     * <p>The process name.</p>
     */
    @NameInMap("ProcessName")
    public String processName;

    @NameInMap("RegionId")
    public String regionId;

    public static CreateGroupMonitoringAgentProcessRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateGroupMonitoringAgentProcessRequest self = new CreateGroupMonitoringAgentProcessRequest();
        return TeaModel.build(map, self);
    }

    public CreateGroupMonitoringAgentProcessRequest setAlertConfig(java.util.List<CreateGroupMonitoringAgentProcessRequestAlertConfig> alertConfig) {
        this.alertConfig = alertConfig;
        return this;
    }
    public java.util.List<CreateGroupMonitoringAgentProcessRequestAlertConfig> getAlertConfig() {
        return this.alertConfig;
    }

    public CreateGroupMonitoringAgentProcessRequest setGroupId(String groupId) {
        this.groupId = groupId;
        return this;
    }
    public String getGroupId() {
        return this.groupId;
    }

    public CreateGroupMonitoringAgentProcessRequest setMatchExpress(java.util.List<CreateGroupMonitoringAgentProcessRequestMatchExpress> matchExpress) {
        this.matchExpress = matchExpress;
        return this;
    }
    public java.util.List<CreateGroupMonitoringAgentProcessRequestMatchExpress> getMatchExpress() {
        return this.matchExpress;
    }

    public CreateGroupMonitoringAgentProcessRequest setMatchExpressFilterRelation(String matchExpressFilterRelation) {
        this.matchExpressFilterRelation = matchExpressFilterRelation;
        return this;
    }
    public String getMatchExpressFilterRelation() {
        return this.matchExpressFilterRelation;
    }

    public CreateGroupMonitoringAgentProcessRequest setProcessName(String processName) {
        this.processName = processName;
        return this;
    }
    public String getProcessName() {
        return this.processName;
    }

    public CreateGroupMonitoringAgentProcessRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public static class CreateGroupMonitoringAgentProcessRequestAlertConfigTargetList extends TeaModel {
        /**
         * <p>The Alibaba Cloud Resource Name (ARN) of the resource.</p>
         * <br>
         * <p>For information about how to obtain the ARN of a resource, see [DescribeMetricRuleTargets](~~121592~~).</p>
         * <br>
         * <p>Format: `acs:{Service name abbreviation}:{regionId}:{userId}:/{Resource type}/{Resource name}/message`. Example: `acs:mns:cn-hangzhou:120886317861****:/queues/test123/message`. Fields:</p>
         * <br>
         * <p>*   {Service name abbreviation}: the abbreviation of the service name. Valid value: mns.</p>
         * <br>
         * <p>*   {userId}: the ID of the Alibaba Cloud account.</p>
         * <br>
         * <p>*   {regionId}: the region ID of the message queue or topic.</p>
         * <br>
         * <p>*   {Resource type}: the type of the resource that triggers the alert. Valid values:</p>
         * <br>
         * <p>    *   **queues**</p>
         * <p>    *   **topics**</p>
         * <br>
         * <p>*   {Resource name}: the resource name.</p>
         * <br>
         * <p>    *   If the resource type is **queues**, the resource name is the queue name.</p>
         * <p>    *   If the resource type is **topics**, the resource name is the topic name.</p>
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
         * <p>The parameters of the alert callback. Specify the parameters in the JSON format.</p>
         */
        @NameInMap("JsonParams")
        public String jsonParams;

        /**
         * <p>The alert level. Valid values:</p>
         * <br>
         * <p>*   INFO</p>
         * <p>*   WARN</p>
         * <p>*   CRITICAL</p>
         */
        @NameInMap("Level")
        public String level;

        public static CreateGroupMonitoringAgentProcessRequestAlertConfigTargetList build(java.util.Map<String, ?> map) throws Exception {
            CreateGroupMonitoringAgentProcessRequestAlertConfigTargetList self = new CreateGroupMonitoringAgentProcessRequestAlertConfigTargetList();
            return TeaModel.build(map, self);
        }

        public CreateGroupMonitoringAgentProcessRequestAlertConfigTargetList setArn(String arn) {
            this.arn = arn;
            return this;
        }
        public String getArn() {
            return this.arn;
        }

        public CreateGroupMonitoringAgentProcessRequestAlertConfigTargetList setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public CreateGroupMonitoringAgentProcessRequestAlertConfigTargetList setJsonParams(String jsonParams) {
            this.jsonParams = jsonParams;
            return this;
        }
        public String getJsonParams() {
            return this.jsonParams;
        }

        public CreateGroupMonitoringAgentProcessRequestAlertConfigTargetList setLevel(String level) {
            this.level = level;
            return this;
        }
        public String getLevel() {
            return this.level;
        }

    }

    public static class CreateGroupMonitoringAgentProcessRequestAlertConfig extends TeaModel {
        /**
         * <p>The operator that is used to compare the metric value with the threshold. Valid values:</p>
         * <br>
         * <p>*   GreaterThanOrEqualToThreshold: greater than or equal to the threshold</p>
         * <p>*   GreaterThanThreshold: greater than the threshold</p>
         * <p>*   LessThanOrEqualToThreshold: less than or equal to the threshold</p>
         * <p>*   LessThanThreshold: less than the threshold</p>
         * <p>*   NotEqualToThreshold: not equal to the threshold</p>
         * <p>*   GreaterThanYesterday: greater than the metric value at the same time yesterday</p>
         * <p>*   LessThanYesterday: less than the metric value at the same time yesterday</p>
         * <p>*   GreaterThanLastWeek: greater than the metric value at the same time last week</p>
         * <p>*   LessThanLastWeek: less than the metric value at the same time last week</p>
         * <p>*   GreaterThanLastPeriod: greater than the metric value in the last monitoring cycle</p>
         * <p>*   LessThanLastPeriod: less than the metric value in the last monitoring cycle</p>
         * <br>
         * <p>Valid values of N: 1 to 3.</p>
         */
        @NameInMap("ComparisonOperator")
        public String comparisonOperator;

        /**
         * <p>The time period during which the alert rule is effective.</p>
         * <br>
         * <p>Valid values of N: 1 to 3.</p>
         */
        @NameInMap("EffectiveInterval")
        public String effectiveInterval;

        /**
         * <p>The alert level. Valid values:</p>
         * <br>
         * <p>*   critical (default)</p>
         * <p>*   warn</p>
         * <p>*   info</p>
         * <br>
         * <p>Valid values of N: 1 to 3.</p>
         */
        @NameInMap("EscalationsLevel")
        public String escalationsLevel;

        /**
         * <p>The time period during which the alert rule is ineffective.</p>
         * <br>
         * <p>Valid values of N: 1 to 3.</p>
         */
        @NameInMap("NoEffectiveInterval")
        public String noEffectiveInterval;

        /**
         * <p>The mute period during which new alert notifications are not sent even if the trigger conditions are met. Unit: seconds. Minimum value: 3600, which is equivalent to 1 hour. Default value: 86400, which is equivalent to one day.</p>
         * <br>
         * <p>Valid values of N: 1 to 3.</p>
         * <br>
         * <p>>  Only one alert notification is sent during each mute period even if the metric value exceeds the alert threshold several times.</p>
         */
        @NameInMap("SilenceTime")
        public String silenceTime;

        /**
         * <p>The statistical method for alerts.</p>
         * <br>
         * <p>Valid values of N: 1 to 3.</p>
         * <br>
         * <p>>  Set the value to Average.</p>
         */
        @NameInMap("Statistics")
        public String statistics;

        /**
         * <p>The alert triggers.</p>
         */
        @NameInMap("TargetList")
        public java.util.List<CreateGroupMonitoringAgentProcessRequestAlertConfigTargetList> targetList;

        /**
         * <p>The alert threshold.</p>
         * <br>
         * <p>Valid values of N: 1 to 3.</p>
         */
        @NameInMap("Threshold")
        public String threshold;

        /**
         * <p>The number of times for which the threshold can be consecutively exceeded. Default value: 3.</p>
         * <br>
         * <p>Valid values of N: 1 to 3.</p>
         * <br>
         * <p>>  An alert is triggered only if the number of times for which the threshold can be consecutively exceeded is reached.</p>
         */
        @NameInMap("Times")
        public String times;

        /**
         * <p>The callback URL.</p>
         * <br>
         * <p>Valid values of N: 1 to 3.</p>
         */
        @NameInMap("Webhook")
        public String webhook;

        public static CreateGroupMonitoringAgentProcessRequestAlertConfig build(java.util.Map<String, ?> map) throws Exception {
            CreateGroupMonitoringAgentProcessRequestAlertConfig self = new CreateGroupMonitoringAgentProcessRequestAlertConfig();
            return TeaModel.build(map, self);
        }

        public CreateGroupMonitoringAgentProcessRequestAlertConfig setComparisonOperator(String comparisonOperator) {
            this.comparisonOperator = comparisonOperator;
            return this;
        }
        public String getComparisonOperator() {
            return this.comparisonOperator;
        }

        public CreateGroupMonitoringAgentProcessRequestAlertConfig setEffectiveInterval(String effectiveInterval) {
            this.effectiveInterval = effectiveInterval;
            return this;
        }
        public String getEffectiveInterval() {
            return this.effectiveInterval;
        }

        public CreateGroupMonitoringAgentProcessRequestAlertConfig setEscalationsLevel(String escalationsLevel) {
            this.escalationsLevel = escalationsLevel;
            return this;
        }
        public String getEscalationsLevel() {
            return this.escalationsLevel;
        }

        public CreateGroupMonitoringAgentProcessRequestAlertConfig setNoEffectiveInterval(String noEffectiveInterval) {
            this.noEffectiveInterval = noEffectiveInterval;
            return this;
        }
        public String getNoEffectiveInterval() {
            return this.noEffectiveInterval;
        }

        public CreateGroupMonitoringAgentProcessRequestAlertConfig setSilenceTime(String silenceTime) {
            this.silenceTime = silenceTime;
            return this;
        }
        public String getSilenceTime() {
            return this.silenceTime;
        }

        public CreateGroupMonitoringAgentProcessRequestAlertConfig setStatistics(String statistics) {
            this.statistics = statistics;
            return this;
        }
        public String getStatistics() {
            return this.statistics;
        }

        public CreateGroupMonitoringAgentProcessRequestAlertConfig setTargetList(java.util.List<CreateGroupMonitoringAgentProcessRequestAlertConfigTargetList> targetList) {
            this.targetList = targetList;
            return this;
        }
        public java.util.List<CreateGroupMonitoringAgentProcessRequestAlertConfigTargetList> getTargetList() {
            return this.targetList;
        }

        public CreateGroupMonitoringAgentProcessRequestAlertConfig setThreshold(String threshold) {
            this.threshold = threshold;
            return this;
        }
        public String getThreshold() {
            return this.threshold;
        }

        public CreateGroupMonitoringAgentProcessRequestAlertConfig setTimes(String times) {
            this.times = times;
            return this;
        }
        public String getTimes() {
            return this.times;
        }

        public CreateGroupMonitoringAgentProcessRequestAlertConfig setWebhook(String webhook) {
            this.webhook = webhook;
            return this;
        }
        public String getWebhook() {
            return this.webhook;
        }

    }

    public static class CreateGroupMonitoringAgentProcessRequestMatchExpress extends TeaModel {
        /**
         * <p>The matching condition. Valid values:</p>
         * <br>
         * <p>*   all (default value): matches all</p>
         * <p>*   startWith: starts with a prefix</p>
         * <p>*   endWith: ends with a suffix</p>
         * <p>*   contains: contains</p>
         * <p>*   notContains: does not contain</p>
         * <p>*   equals: equals</p>
         * <br>
         * <p>Valid values of N: 1 to 3.</p>
         */
        @NameInMap("Function")
        public String function;

        /**
         * <p>The criteria based on which the instances are matched.</p>
         * <br>
         * <p>Valid values of N: 1 to 3.</p>
         * <br>
         * <p>> Set the value to name. The value name indicates that the instances are matched based on the instance name.</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The keyword used to match the instance name.</p>
         * <br>
         * <p>Valid values of N: 1 to 3.</p>
         */
        @NameInMap("Value")
        public String value;

        public static CreateGroupMonitoringAgentProcessRequestMatchExpress build(java.util.Map<String, ?> map) throws Exception {
            CreateGroupMonitoringAgentProcessRequestMatchExpress self = new CreateGroupMonitoringAgentProcessRequestMatchExpress();
            return TeaModel.build(map, self);
        }

        public CreateGroupMonitoringAgentProcessRequestMatchExpress setFunction(String function) {
            this.function = function;
            return this;
        }
        public String getFunction() {
            return this.function;
        }

        public CreateGroupMonitoringAgentProcessRequestMatchExpress setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public CreateGroupMonitoringAgentProcessRequestMatchExpress setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}
