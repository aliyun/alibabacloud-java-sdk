// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20190101.models;

import com.aliyun.tea.*;

public class ModifyHostAvailabilityRequest extends TeaModel {
    @NameInMap("AlertConfig")
    public ModifyHostAvailabilityRequestAlertConfig alertConfig;

    @NameInMap("TaskOption")
    public ModifyHostAvailabilityRequestTaskOption taskOption;

    @NameInMap("AlertConfigEscalationList")
    public java.util.List<ModifyHostAvailabilityRequestAlertConfigEscalationList> alertConfigEscalationList;

    @NameInMap("AlertConfigTargetList")
    public java.util.List<ModifyHostAvailabilityRequestAlertConfigTargetList> alertConfigTargetList;

    /**
     * <p>The Alibaba Cloud Resource Name (ARN) of the resource.</p>
     * <br>
     * <p>Format: `acs:{Service name abbreviation}:{regionId}:{userId}:/{Resource type}/{Resource name}/message`. Example: `acs:mns:cn-hangzhou:120886317861****:/queues/test123/message`. Fields:</p>
     * <br>
     * <p>*   {Service name abbreviation}: the abbreviation of the service name. Valid value: mns.</p>
     * <p>*   {userId}: the ID of the Alibaba Cloud account.</p>
     * <p>*   {regionId}: the region ID of the message queue or topic.</p>
     * <p>*   {Resource type}`: the type of the resource for which alerts are triggered. Valid values: - **queues** - **topics** {Resource name}: the name of the resource. - If the resource type is set to **queues**, the resource name is the name of the message queue. - If the resource type is set to **topics**, the resource name is the name of the topic.`</p>
     */
    @NameInMap("GroupId")
    public Long groupId;

    /**
     * <p>The metric for which the alert feature is enabled. Valid values of N: 1 to 21. Valid values:</p>
     * <br>
     * <p>*   HttpStatus: HTTP status code</p>
     * <p>*   HttpLatency: HTTP response time</p>
     * <p>*   TelnetStatus: Telnet status code</p>
     * <p>*   TelnetLatency: Telnet response time</p>
     * <p>*   PingLostRate: Ping packet loss rate</p>
     */
    @NameInMap("Id")
    public Long id;

    @NameInMap("InstanceList")
    public java.util.List<String> instanceList;

    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The HTTP status code.</p>
     * <br>
     * <p>>  The status code 200 indicates that the call was successful.</p>
     */
    @NameInMap("TaskName")
    public String taskName;

    /**
     * <p>The comparison operator that is used in the alert rule. Valid values of N: 1 to 21. Valid values:</p>
     * <br>
     * <p>*   `>`</p>
     * <p>*   `>=`</p>
     * <p>*   `<`</p>
     * <p>*   `<=`</p>
     * <p>*   `=`</p>
     */
    @NameInMap("TaskScope")
    public String taskScope;

    public static ModifyHostAvailabilityRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyHostAvailabilityRequest self = new ModifyHostAvailabilityRequest();
        return TeaModel.build(map, self);
    }

    public ModifyHostAvailabilityRequest setAlertConfig(ModifyHostAvailabilityRequestAlertConfig alertConfig) {
        this.alertConfig = alertConfig;
        return this;
    }
    public ModifyHostAvailabilityRequestAlertConfig getAlertConfig() {
        return this.alertConfig;
    }

    public ModifyHostAvailabilityRequest setTaskOption(ModifyHostAvailabilityRequestTaskOption taskOption) {
        this.taskOption = taskOption;
        return this;
    }
    public ModifyHostAvailabilityRequestTaskOption getTaskOption() {
        return this.taskOption;
    }

    public ModifyHostAvailabilityRequest setAlertConfigEscalationList(java.util.List<ModifyHostAvailabilityRequestAlertConfigEscalationList> alertConfigEscalationList) {
        this.alertConfigEscalationList = alertConfigEscalationList;
        return this;
    }
    public java.util.List<ModifyHostAvailabilityRequestAlertConfigEscalationList> getAlertConfigEscalationList() {
        return this.alertConfigEscalationList;
    }

    public ModifyHostAvailabilityRequest setAlertConfigTargetList(java.util.List<ModifyHostAvailabilityRequestAlertConfigTargetList> alertConfigTargetList) {
        this.alertConfigTargetList = alertConfigTargetList;
        return this;
    }
    public java.util.List<ModifyHostAvailabilityRequestAlertConfigTargetList> getAlertConfigTargetList() {
        return this.alertConfigTargetList;
    }

    public ModifyHostAvailabilityRequest setGroupId(Long groupId) {
        this.groupId = groupId;
        return this;
    }
    public Long getGroupId() {
        return this.groupId;
    }

    public ModifyHostAvailabilityRequest setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

    public ModifyHostAvailabilityRequest setInstanceList(java.util.List<String> instanceList) {
        this.instanceList = instanceList;
        return this;
    }
    public java.util.List<String> getInstanceList() {
        return this.instanceList;
    }

    public ModifyHostAvailabilityRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ModifyHostAvailabilityRequest setTaskName(String taskName) {
        this.taskName = taskName;
        return this;
    }
    public String getTaskName() {
        return this.taskName;
    }

    public ModifyHostAvailabilityRequest setTaskScope(String taskScope) {
        this.taskScope = taskScope;
        return this;
    }
    public String getTaskScope() {
        return this.taskScope;
    }

    public static class ModifyHostAvailabilityRequestAlertConfig extends TeaModel {
        /**
         * <p>The ID of the availability monitoring task.</p>
         */
        @NameInMap("EndTime")
        public Integer endTime;

        /**
         * <p>The content of the HTTP POST request.</p>
         */
        @NameInMap("NotifyType")
        public Integer notifyType;

        /**
         * <p>The interval at which detection requests are sent. Unit: seconds. Valid values: 15, 30, 60, 120, 300, 900, 1800, and 3600.</p>
         * <br>
         * <p>>  This parameter is available only for the CloudMonitor agent V3.5.1 or later.</p>
         */
        @NameInMap("SilenceTime")
        public Integer silenceTime;

        /**
         * <p>The method used to calculate metric values that trigger alerts. Valid values of N: 1 to 21. The value of this parameter varies based on the metric. The following points describe the correspondence between metrics and calculation methods:</p>
         * <br>
         * <p>*   HttpStatus: Value</p>
         * <p>*   HttpLatency: Average</p>
         * <p>*   TelnetStatus: Value</p>
         * <p>*   TelnetLatency: Average</p>
         * <p>*   PingLostRate: Average</p>
         * <br>
         * <p>>  The value Value indicates the original value and is used for metrics such as status codes. The value Average indicates the average value and is used for metrics, such as the latency and packet loss rate.</p>
         */
        @NameInMap("StartTime")
        public Integer startTime;

        /**
         * <p>The name of the availability monitoring task.</p>
         */
        @NameInMap("WebHook")
        public String webHook;

        public static ModifyHostAvailabilityRequestAlertConfig build(java.util.Map<String, ?> map) throws Exception {
            ModifyHostAvailabilityRequestAlertConfig self = new ModifyHostAvailabilityRequestAlertConfig();
            return TeaModel.build(map, self);
        }

        public ModifyHostAvailabilityRequestAlertConfig setEndTime(Integer endTime) {
            this.endTime = endTime;
            return this;
        }
        public Integer getEndTime() {
            return this.endTime;
        }

        public ModifyHostAvailabilityRequestAlertConfig setNotifyType(Integer notifyType) {
            this.notifyType = notifyType;
            return this;
        }
        public Integer getNotifyType() {
            return this.notifyType;
        }

        public ModifyHostAvailabilityRequestAlertConfig setSilenceTime(Integer silenceTime) {
            this.silenceTime = silenceTime;
            return this;
        }
        public Integer getSilenceTime() {
            return this.silenceTime;
        }

        public ModifyHostAvailabilityRequestAlertConfig setStartTime(Integer startTime) {
            this.startTime = startTime;
            return this;
        }
        public Integer getStartTime() {
            return this.startTime;
        }

        public ModifyHostAvailabilityRequestAlertConfig setWebHook(String webHook) {
            this.webHook = webHook;
            return this;
        }
        public String getWebHook() {
            return this.webHook;
        }

    }

    public static class ModifyHostAvailabilityRequestTaskOption extends TeaModel {
        /**
         * <p>The alert notification methods. Valid values:</p>
         * <br>
         * <p>0: Alert notifications are sent by using emails and DingTalk chatbots.</p>
         */
        @NameInMap("HttpHeader")
        public String httpHeader;

        /**
         * <p>The consecutive number of times for which the metric value meets the alert condition before an alert is triggered. Valid values of N: 1 to 21.</p>
         */
        @NameInMap("HttpMethod")
        public String httpMethod;

        /**
         * <p>The level of the alert. Valid values:</p>
         * <br>
         * <p>*   INFO: information</p>
         * <p>*   WARN: warning</p>
         * <p>*   CRITICAL: critical</p>
         */
        @NameInMap("HttpNegative")
        public Boolean httpNegative;

        /**
         * <p>The domain name or IP address that you want to monitor.</p>
         * <br>
         * <p>>  If the TaskType parameter is set to PING or TELNET, this parameter is required. For more information about how to set the TaskType parameter, see [CreateHostAvailability](~~115317~~).</p>
         */
        @NameInMap("HttpPostContent")
        public String httpPostContent;

        /**
         * <p>The error message.</p>
         */
        @NameInMap("HttpResponseCharset")
        public String httpResponseCharset;

        /**
         * <p>The ID of the application group.</p>
         */
        @NameInMap("HttpResponseMatchContent")
        public String httpResponseMatchContent;

        /**
         * <p>The operation that you want to perform. Set the value to **ModifyHostAvailability**.</p>
         */
        @NameInMap("HttpURI")
        public String httpURI;

        /**
         * <p>The header of the HTTP request. Format: `Parameter name:Parameter value`. Separate multiple parameters with carriage return characters. Example:</p>
         * <br>
         * <p>```</p>
         * <br>
         * <p>params1:value1</p>
         * <p>params2:value2</p>
         * <p>```</p>
         */
        @NameInMap("Interval")
        public Integer interval;

        /**
         * <p>The URI that you want to monitor. If the TaskType parameter is set to HTTP, this parameter is required.</p>
         */
        @NameInMap("TelnetOrPingHost")
        public String telnetOrPingHost;

        public static ModifyHostAvailabilityRequestTaskOption build(java.util.Map<String, ?> map) throws Exception {
            ModifyHostAvailabilityRequestTaskOption self = new ModifyHostAvailabilityRequestTaskOption();
            return TeaModel.build(map, self);
        }

        public ModifyHostAvailabilityRequestTaskOption setHttpHeader(String httpHeader) {
            this.httpHeader = httpHeader;
            return this;
        }
        public String getHttpHeader() {
            return this.httpHeader;
        }

        public ModifyHostAvailabilityRequestTaskOption setHttpMethod(String httpMethod) {
            this.httpMethod = httpMethod;
            return this;
        }
        public String getHttpMethod() {
            return this.httpMethod;
        }

        public ModifyHostAvailabilityRequestTaskOption setHttpNegative(Boolean httpNegative) {
            this.httpNegative = httpNegative;
            return this;
        }
        public Boolean getHttpNegative() {
            return this.httpNegative;
        }

        public ModifyHostAvailabilityRequestTaskOption setHttpPostContent(String httpPostContent) {
            this.httpPostContent = httpPostContent;
            return this;
        }
        public String getHttpPostContent() {
            return this.httpPostContent;
        }

        public ModifyHostAvailabilityRequestTaskOption setHttpResponseCharset(String httpResponseCharset) {
            this.httpResponseCharset = httpResponseCharset;
            return this;
        }
        public String getHttpResponseCharset() {
            return this.httpResponseCharset;
        }

        public ModifyHostAvailabilityRequestTaskOption setHttpResponseMatchContent(String httpResponseMatchContent) {
            this.httpResponseMatchContent = httpResponseMatchContent;
            return this;
        }
        public String getHttpResponseMatchContent() {
            return this.httpResponseMatchContent;
        }

        public ModifyHostAvailabilityRequestTaskOption setHttpURI(String httpURI) {
            this.httpURI = httpURI;
            return this;
        }
        public String getHttpURI() {
            return this.httpURI;
        }

        public ModifyHostAvailabilityRequestTaskOption setInterval(Integer interval) {
            this.interval = interval;
            return this;
        }
        public Integer getInterval() {
            return this.interval;
        }

        public ModifyHostAvailabilityRequestTaskOption setTelnetOrPingHost(String telnetOrPingHost) {
            this.telnetOrPingHost = telnetOrPingHost;
            return this;
        }
        public String getTelnetOrPingHost() {
            return this.telnetOrPingHost;
        }

    }

    public static class ModifyHostAvailabilityRequestAlertConfigEscalationList extends TeaModel {
        /**
         * <p>The ECS instances that are monitored. Valid values of N: 1 to 21.</p>
         * <br>
         * <p>>  If the `TaskScope` parameter is set to `GROUP_SPEC_INSTANCE`, this parameter is required.</p>
         */
        @NameInMap("Aggregate")
        public String aggregate;

        /**
         * <p>The character set that is used in the HTTP response.</p>
         * <br>
         * <p>>  Valid value: UTF-8.</p>
         */
        @NameInMap("MetricName")
        public String metricName;

        /**
         * <p>The method to trigger an alert. The alert can be triggered based on whether the specified alert rule is included in the response body. Valid values:</p>
         * <br>
         * <p>*   true: If the HTTP response body includes the alert rule, an alert is triggered.</p>
         * <p>*   false: If the HTTP response does not include the alert rule, an alert is triggered.</p>
         * <br>
         * <p>>  If the TaskType parameter is set to HTTP, this parameter is required. For more information about how to set the TaskType parameter, see [CreateHostAvailability](~~115317~~).</p>
         */
        @NameInMap("Operator")
        public String operator;

        /**
         * <p>The parameters of the alert callback. The parameters are in the JSON format.</p>
         */
        @NameInMap("Times")
        public Integer times;

        /**
         * <p>The callback URL.</p>
         */
        @NameInMap("Value")
        public String value;

        public static ModifyHostAvailabilityRequestAlertConfigEscalationList build(java.util.Map<String, ?> map) throws Exception {
            ModifyHostAvailabilityRequestAlertConfigEscalationList self = new ModifyHostAvailabilityRequestAlertConfigEscalationList();
            return TeaModel.build(map, self);
        }

        public ModifyHostAvailabilityRequestAlertConfigEscalationList setAggregate(String aggregate) {
            this.aggregate = aggregate;
            return this;
        }
        public String getAggregate() {
            return this.aggregate;
        }

        public ModifyHostAvailabilityRequestAlertConfigEscalationList setMetricName(String metricName) {
            this.metricName = metricName;
            return this;
        }
        public String getMetricName() {
            return this.metricName;
        }

        public ModifyHostAvailabilityRequestAlertConfigEscalationList setOperator(String operator) {
            this.operator = operator;
            return this;
        }
        public String getOperator() {
            return this.operator;
        }

        public ModifyHostAvailabilityRequestAlertConfigEscalationList setTimes(Integer times) {
            this.times = times;
            return this;
        }
        public Integer getTimes() {
            return this.times;
        }

        public ModifyHostAvailabilityRequestAlertConfigEscalationList setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class ModifyHostAvailabilityRequestAlertConfigTargetList extends TeaModel {
        /**
         * <p>The mute period during which new alerts are not sent even if the trigger conditions are met. Unit: seconds. Default value: 86400. The default value indicates one day.</p>
         */
        @NameInMap("Arn")
        public String arn;

        /**
         * <p>The end of the time period during which the alert rule is effective. Valid values: 0 to 23.</p>
         * <br>
         * <p>For example, if the `AlertConfig.StartTime` parameter is set to 0 and the `AlertConfig.EndTime` parameter is set to 22, the alert rule is effective from 00:00:00 to 22:00:00.</p>
         * <br>
         * <p>>  Alert notifications are sent based on the specified threshold only if the alert rule is effective.</p>
         */
        @NameInMap("Id")
        public String id;

        /**
         * <p>The ID of the request.</p>
         */
        @NameInMap("JsonParams")
        public String jsonParams;

        /**
         * <p>The range of instances that are monitored by the availability monitoring task. Valid values:</p>
         * <br>
         * <p>*   GROUP: All ECS instances in the application group are monitored.</p>
         * <p>*   GROUP_SPEC_INSTANCE: Specified ECS instances in the application group are monitored. The TaskScope parameter must be used in combination with the InstanceList.N parameter. The InstanceList.N parameter specifies the ECS instances to be monitored.</p>
         */
        @NameInMap("Level")
        public String level;

        public static ModifyHostAvailabilityRequestAlertConfigTargetList build(java.util.Map<String, ?> map) throws Exception {
            ModifyHostAvailabilityRequestAlertConfigTargetList self = new ModifyHostAvailabilityRequestAlertConfigTargetList();
            return TeaModel.build(map, self);
        }

        public ModifyHostAvailabilityRequestAlertConfigTargetList setArn(String arn) {
            this.arn = arn;
            return this;
        }
        public String getArn() {
            return this.arn;
        }

        public ModifyHostAvailabilityRequestAlertConfigTargetList setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public ModifyHostAvailabilityRequestAlertConfigTargetList setJsonParams(String jsonParams) {
            this.jsonParams = jsonParams;
            return this;
        }
        public String getJsonParams() {
            return this.jsonParams;
        }

        public ModifyHostAvailabilityRequestAlertConfigTargetList setLevel(String level) {
            this.level = level;
            return this;
        }
        public String getLevel() {
            return this.level;
        }

    }

}
