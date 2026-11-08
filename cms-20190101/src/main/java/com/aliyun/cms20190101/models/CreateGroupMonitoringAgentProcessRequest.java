// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20190101.models;

import com.aliyun.tea.*;

public class CreateGroupMonitoringAgentProcessRequest extends TeaModel {
    /**
     * <p>The list of alert rule configurations.</p>
     * <p>Valid values of N: 1 to 3.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("AlertConfig")
    public java.util.List<CreateGroupMonitoringAgentProcessRequestAlertConfig> alertConfig;

    /**
     * <p>The application group ID.</p>
     * <p>For information about how to obtain the application group ID, see <a href="https://help.aliyun.com/document_detail/115032.html">DescribeMonitorGroups</a>.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>3607****</p>
     */
    @NameInMap("GroupId")
    public String groupId;

    /**
     * <p>The list of match conditional expressions.</p>
     * <p>Valid values of N: 1 to 3.</p>
     */
    @NameInMap("MatchExpress")
    public java.util.List<CreateGroupMonitoringAgentProcessRequestMatchExpress> matchExpress;

    /**
     * <p>The logical relation for matching instances. Valid values:</p>
     * <ul>
     * <li>all: all.</li>
     * <li>and: AND.</li>
     * <li>or: OR.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>and</p>
     */
    @NameInMap("MatchExpressFilterRelation")
    public String matchExpressFilterRelation;

    /**
     * <p>The process name.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>Process_Java</p>
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
         * <p>For information about how to obtain the ARN of a resource, see <a href="https://help.aliyun.com/document_detail/121592.html">DescribeMetricRuleTargets</a>.</p>
         * <p>The ARN is in the following format: <code>acs:{service abbreviation}:{regionId}:{userId}:/{resource type}/{resource name}/message</code>. Example: <code>acs:mns:cn-hangzhou:120886317861****:/queues/test123/message</code>. The parameters are described as follows:</p>
         * <ul>
         * <li><p>{service abbreviation}: the abbreviation of the cloud service. Only Simple Message Queue (formerly MNS) is supported.</p>
         * </li>
         * <li><p>{userId}: the Alibaba Cloud account ID.</p>
         * </li>
         * <li><p>{regionId}: the region where the Simple Message Queue (formerly MNS) queue or topic resides.</p>
         * </li>
         * <li><p>{resource type}: the type of the resource that receives alert notifications. Valid values:</p>
         * <ul>
         * <li><strong>queues</strong>: queue.</li>
         * <li><strong>topics</strong>: topic.</li>
         * </ul>
         * </li>
         * <li><p>{resource name}: the name of the resource.</p>
         * <ul>
         * <li>If the resource type is <strong>queues</strong>, the resource name is the queue name.</li>
         * <li>If the resource type is <strong>topics</strong>, the resource name is the topic name.</li>
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
         * <p>The ID of the alert target.</p>
         * <p>For information about how to obtain the ID of an alert target, see <a href="https://help.aliyun.com/document_detail/121592.html">DescribeMetricRuleTargets</a>.</p>
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
         * <li>INFO: informational.</li>
         * <li>WARN: warning.</li>
         * <li>CRITICAL: critical.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>[&quot;INFO&quot;, &quot;WARN&quot;, &quot;CRITICAL&quot;]</p>
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
         * <p>The comparison operator for the threshold. Valid values:</p>
         * <ul>
         * <li>GreaterThanOrEqualToThreshold: greater than or equal to.</li>
         * <li>GreaterThanThreshold: greater than.</li>
         * <li>LessThanOrEqualToThreshold: less than or equal to.</li>
         * <li>LessThanThreshold: less than.</li>
         * <li>NotEqualToThreshold: not equal to.</li>
         * <li>GreaterThanYesterday: greater than the value at the same time yesterday.</li>
         * <li>LessThanYesterday: less than the value at the same time yesterday.</li>
         * <li>GreaterThanLastWeek: greater than the value at the same time last week.</li>
         * <li>LessThanLastWeek: less than the value at the same time last week.</li>
         * <li>GreaterThanLastPeriod: greater than the value in the previous period.</li>
         * <li>LessThanLastPeriod: less than the value in the previous period.</li>
         * </ul>
         * <p>Valid values of N: 1 to 3.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>GreaterThanOrEqualToThreshold</p>
         */
        @NameInMap("ComparisonOperator")
        public String comparisonOperator;

        /**
         * <p>The effective period of the alert rule.</p>
         * <p>Valid values of N: 1 to 3.</p>
         * 
         * <strong>example:</strong>
         * <p>07:00-22:59</p>
         */
        @NameInMap("EffectiveInterval")
        public String effectiveInterval;

        /**
         * <p>The alert level. Valid values:</p>
         * <ul>
         * <li>critical: critical. This is the default value.</li>
         * <li>warn: warning.</li>
         * <li>info: informational.</li>
         * </ul>
         * <p>Valid values of N: 1 to 3.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>warn</p>
         */
        @NameInMap("EscalationsLevel")
        public String escalationsLevel;

        /**
         * <p><strong>[Deprecated]</strong> This parameter is deprecated and no longer requires attention.</p>
         * 
         * <strong>example:</strong>
         * <p>00:00-05:30</p>
         */
        @NameInMap("NoEffectiveInterval")
        public String noEffectiveInterval;

        /**
         * <p>The mute period. Unit: seconds. Minimum value: 3600, which indicates 1 hour. Default value: 86400, which indicates 1 day.</p>
         * <p>Valid values of N: 1 to 3.</p>
         * <blockquote>
         * <p>If the monitoring data continuously exceeds the alert rule threshold, the system sends only one alert notification within each mute period.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>86400</p>
         */
        @NameInMap("SilenceTime")
        public String silenceTime;

        /**
         * <p>The statistical method for alerts.</p>
         * <p>Valid values of N: 1 to 3.</p>
         * <blockquote>
         * <p>Only Average is supported.</p>
         * </blockquote>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>Average</p>
         */
        @NameInMap("Statistics")
        public String statistics;

        /**
         * <p>The list of alert targets.</p>
         */
        @NameInMap("TargetList")
        public java.util.List<CreateGroupMonitoringAgentProcessRequestAlertConfigTargetList> targetList;

        /**
         * <p>The alert threshold.</p>
         * <p>Valid values of N: 1 to 3.</p>
         * <p>Unit: count.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>5</p>
         */
        @NameInMap("Threshold")
        public String threshold;

        /**
         * <p>The number of consecutive times the alert level is triggered. Default value: 3.</p>
         * <p>Valid values of N: 1 to 3.</p>
         * <blockquote>
         * <p>An alert is triggered only when the alert level is reached for the specified number of consecutive times and the alert threshold is met.</p>
         * </blockquote>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
        @NameInMap("Times")
        public String times;

        /**
         * <p>The webhook URL for alert callbacks.</p>
         * <p>Valid values of N: 1 to 3.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://www.aliyun.com">https://www.aliyun.com</a></p>
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
         * <p>The match condition. Valid values:</p>
         * <ul>
         * <li>all: matches all. This is the default value.</li>
         * <li>startWith: matches the prefix.</li>
         * <li>endWith: matches the suffix.</li>
         * <li>contains: contains the specified string.</li>
         * <li>notContains: does not contain the specified string.</li>
         * <li>equals: exactly matches.</li>
         * </ul>
         * <p>Valid values of N: 1 to 3.</p>
         * 
         * <strong>example:</strong>
         * <p>startWith</p>
         */
        @NameInMap("Function")
        public String function;

        /**
         * <p>The type of the match condition.</p>
         * <p>Valid values of N: 1 to 3.</p>
         * <blockquote>
         * <p>Only Name, which indicates the instance name, is supported.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>name1</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The name of the matched instance.</p>
         * <p>Valid values of N: 1 to 3.</p>
         * 
         * <strong>example:</strong>
         * <p>portalHost</p>
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
