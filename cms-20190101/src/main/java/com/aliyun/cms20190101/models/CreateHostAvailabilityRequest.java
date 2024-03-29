// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20190101.models;

import com.aliyun.tea.*;

public class CreateHostAvailabilityRequest extends TeaModel {
    @NameInMap("AlertConfig")
    public CreateHostAvailabilityRequestAlertConfig alertConfig;

    @NameInMap("TaskOption")
    public CreateHostAvailabilityRequestTaskOption taskOption;

    /**
     * <p>None</p>
     */
    @NameInMap("AlertConfigEscalationList")
    public java.util.List<CreateHostAvailabilityRequestAlertConfigEscalationList> alertConfigEscalationList;

    /**
     * <p>The information about the resources for which alerts are triggered.</p>
     */
    @NameInMap("AlertConfigTargetList")
    public java.util.List<CreateHostAvailabilityRequestAlertConfigTargetList> alertConfigTargetList;

    /**
     * <p>The ID of the application group.</p>
     */
    @NameInMap("GroupId")
    public Long groupId;

    /**
     * <p>The ECS instances that are monitored. Valid values of N: 1 to 21.</p>
     * <br>
     * <p>> This parameter must be specified when `TaskScope` is set to `GROUP_SPEC_INSTANCE`.</p>
     */
    @NameInMap("InstanceList")
    public java.util.List<String> instanceList;

    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The name of the availability monitoring task. The name must be 4 to 100 characters in length, and can contain letters, digits, and underscores (\_).</p>
     */
    @NameInMap("TaskName")
    public String taskName;

    /**
     * <p>The range of instances that are monitored by the availability monitoring task. Valid values:</p>
     * <br>
     * <p>*   GROUP: All Elastic Compute Service (ECS) instances in the application group are monitored.</p>
     * <p>*   GROUP_SPEC_INSTANCE: Specified ECS instances in the application group are monitored. The TaskScope parameter must be used in combination with the InstanceList.N parameter. The InstanceList.N parameter specifies the ECS instances to be monitored.</p>
     */
    @NameInMap("TaskScope")
    public String taskScope;

    /**
     * <p>The monitoring type of the availability monitoring task. Valid values:</p>
     * <br>
     * <p>*   PING</p>
     * <p>*   TELNET</p>
     * <p>*   HTTP</p>
     */
    @NameInMap("TaskType")
    public String taskType;

    public static CreateHostAvailabilityRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateHostAvailabilityRequest self = new CreateHostAvailabilityRequest();
        return TeaModel.build(map, self);
    }

    public CreateHostAvailabilityRequest setAlertConfig(CreateHostAvailabilityRequestAlertConfig alertConfig) {
        this.alertConfig = alertConfig;
        return this;
    }
    public CreateHostAvailabilityRequestAlertConfig getAlertConfig() {
        return this.alertConfig;
    }

    public CreateHostAvailabilityRequest setTaskOption(CreateHostAvailabilityRequestTaskOption taskOption) {
        this.taskOption = taskOption;
        return this;
    }
    public CreateHostAvailabilityRequestTaskOption getTaskOption() {
        return this.taskOption;
    }

    public CreateHostAvailabilityRequest setAlertConfigEscalationList(java.util.List<CreateHostAvailabilityRequestAlertConfigEscalationList> alertConfigEscalationList) {
        this.alertConfigEscalationList = alertConfigEscalationList;
        return this;
    }
    public java.util.List<CreateHostAvailabilityRequestAlertConfigEscalationList> getAlertConfigEscalationList() {
        return this.alertConfigEscalationList;
    }

    public CreateHostAvailabilityRequest setAlertConfigTargetList(java.util.List<CreateHostAvailabilityRequestAlertConfigTargetList> alertConfigTargetList) {
        this.alertConfigTargetList = alertConfigTargetList;
        return this;
    }
    public java.util.List<CreateHostAvailabilityRequestAlertConfigTargetList> getAlertConfigTargetList() {
        return this.alertConfigTargetList;
    }

    public CreateHostAvailabilityRequest setGroupId(Long groupId) {
        this.groupId = groupId;
        return this;
    }
    public Long getGroupId() {
        return this.groupId;
    }

    public CreateHostAvailabilityRequest setInstanceList(java.util.List<String> instanceList) {
        this.instanceList = instanceList;
        return this;
    }
    public java.util.List<String> getInstanceList() {
        return this.instanceList;
    }

    public CreateHostAvailabilityRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public CreateHostAvailabilityRequest setTaskName(String taskName) {
        this.taskName = taskName;
        return this;
    }
    public String getTaskName() {
        return this.taskName;
    }

    public CreateHostAvailabilityRequest setTaskScope(String taskScope) {
        this.taskScope = taskScope;
        return this;
    }
    public String getTaskScope() {
        return this.taskScope;
    }

    public CreateHostAvailabilityRequest setTaskType(String taskType) {
        this.taskType = taskType;
        return this;
    }
    public String getTaskType() {
        return this.taskType;
    }

    public static class CreateHostAvailabilityRequestAlertConfig extends TeaModel {
        /**
         * <p>The end of the time range during which the alert rule is effective. Valid values: 0 to 23.</p>
         * <br>
         * <p>For example, if the `AlertConfig.StartTime` parameter is set to 0 and the `AlertConfig.EndTime` parameter is set to 22, the alert rule is effective from 00:00:00 to 22:00:00.</p>
         * <br>
         * <p>> Alert notifications are sent based on the specified threshold only if the alert rule is effective.</p>
         */
        @NameInMap("EndTime")
        public Integer endTime;

        /**
         * <p>The alert notification methods. Valid values:</p>
         * <br>
         * <p>0: Alert notifications are sent by using emails and DingTalk chatbots.</p>
         */
        @NameInMap("NotifyType")
        public Integer notifyType;

        /**
         * <p>The mute period during which new alerts are not sent even if the trigger conditions are met. Unit: seconds. Default value: 86400. The default value indicates one day.</p>
         */
        @NameInMap("SilenceTime")
        public Integer silenceTime;

        /**
         * <p>The beginning of the time range during which the alert rule is effective. Valid values: 0 to 23.</p>
         * <br>
         * <p>For example, if the `AlertConfig.StartTime` parameter is set to 0 and the `AlertConfig.EndTime` parameter is set to 22, the alert rule is effective from 00:00:00 to 22:00:00.</p>
         * <br>
         * <p>> Alert notifications are sent based on the specified threshold only if the alert rule is effective.</p>
         */
        @NameInMap("StartTime")
        public Integer startTime;

        /**
         * <p>The callback URL.</p>
         */
        @NameInMap("WebHook")
        public String webHook;

        public static CreateHostAvailabilityRequestAlertConfig build(java.util.Map<String, ?> map) throws Exception {
            CreateHostAvailabilityRequestAlertConfig self = new CreateHostAvailabilityRequestAlertConfig();
            return TeaModel.build(map, self);
        }

        public CreateHostAvailabilityRequestAlertConfig setEndTime(Integer endTime) {
            this.endTime = endTime;
            return this;
        }
        public Integer getEndTime() {
            return this.endTime;
        }

        public CreateHostAvailabilityRequestAlertConfig setNotifyType(Integer notifyType) {
            this.notifyType = notifyType;
            return this;
        }
        public Integer getNotifyType() {
            return this.notifyType;
        }

        public CreateHostAvailabilityRequestAlertConfig setSilenceTime(Integer silenceTime) {
            this.silenceTime = silenceTime;
            return this;
        }
        public Integer getSilenceTime() {
            return this.silenceTime;
        }

        public CreateHostAvailabilityRequestAlertConfig setStartTime(Integer startTime) {
            this.startTime = startTime;
            return this;
        }
        public Integer getStartTime() {
            return this.startTime;
        }

        public CreateHostAvailabilityRequestAlertConfig setWebHook(String webHook) {
            this.webHook = webHook;
            return this;
        }
        public String getWebHook() {
            return this.webHook;
        }

    }

    public static class CreateHostAvailabilityRequestTaskOption extends TeaModel {
        /**
         * <p>The header of the HTTP request. Format: `Parameter name:Parameter value`. Separate multiple parameters with carriage return characters. Example:</p>
         * <br>
         * <p>    params1:value1</p>
         * <p>    params2:value2</p>
         */
        @NameInMap("HttpHeader")
        public String httpHeader;

        /**
         * <p>The HTTP request method. Valid values:</p>
         * <br>
         * <p>*   GET</p>
         * <p>*   POST</p>
         * <p>*   HEAD</p>
         * <br>
         * <p>> This parameter must be specified when TaskType is set to HTTP.</p>
         */
        @NameInMap("HttpMethod")
        public String httpMethod;

        /**
         * <p>The method to trigger an alert. The alert can be triggered based on whether the specified alert rule is included in the response body. Valid values:</p>
         * <br>
         * <p>*   true: If the HTTP response body includes the alert rule, an alert is triggered.</p>
         * <p>*   false: If the HTTP response does not include the alert rule, an alert is triggered.</p>
         * <br>
         * <p>> This parameter must be specified when TaskType is set to HTTP.</p>
         */
        @NameInMap("HttpNegative")
        public Boolean httpNegative;

        /**
         * <p>The content of the HTTP POST request.</p>
         */
        @NameInMap("HttpPostContent")
        public String httpPostContent;

        /**
         * <p>The character set that is used in the HTTP response.</p>
         * <br>
         * <p>> Only UTF-8 is supported.</p>
         */
        @NameInMap("HttpResponseCharset")
        public String httpResponseCharset;

        /**
         * <p>The response to the HTTP request.</p>
         */
        @NameInMap("HttpResponseMatchContent")
        public String httpResponseMatchContent;

        /**
         * <p>The URI that you want to monitor. This parameter must be specified when TaskType is set to HTTP.</p>
         */
        @NameInMap("HttpURI")
        public String httpURI;

        /**
         * <p>The interval at which detection requests are sent. Unit: seconds. Valid values: 15, 30, 60, 120, 300, 900, 1800, and 3600.</p>
         * <br>
         * <p>> This parameter is available only for the CloudMonitor agent V3.5.1 or later.</p>
         */
        @NameInMap("Interval")
        public Integer interval;

        /**
         * <p>The domain name or IP address that you want to monitor.</p>
         * <br>
         * <p>> This parameter must be specified when TaskType is set to PING or TELNET.</p>
         */
        @NameInMap("TelnetOrPingHost")
        public String telnetOrPingHost;

        public static CreateHostAvailabilityRequestTaskOption build(java.util.Map<String, ?> map) throws Exception {
            CreateHostAvailabilityRequestTaskOption self = new CreateHostAvailabilityRequestTaskOption();
            return TeaModel.build(map, self);
        }

        public CreateHostAvailabilityRequestTaskOption setHttpHeader(String httpHeader) {
            this.httpHeader = httpHeader;
            return this;
        }
        public String getHttpHeader() {
            return this.httpHeader;
        }

        public CreateHostAvailabilityRequestTaskOption setHttpMethod(String httpMethod) {
            this.httpMethod = httpMethod;
            return this;
        }
        public String getHttpMethod() {
            return this.httpMethod;
        }

        public CreateHostAvailabilityRequestTaskOption setHttpNegative(Boolean httpNegative) {
            this.httpNegative = httpNegative;
            return this;
        }
        public Boolean getHttpNegative() {
            return this.httpNegative;
        }

        public CreateHostAvailabilityRequestTaskOption setHttpPostContent(String httpPostContent) {
            this.httpPostContent = httpPostContent;
            return this;
        }
        public String getHttpPostContent() {
            return this.httpPostContent;
        }

        public CreateHostAvailabilityRequestTaskOption setHttpResponseCharset(String httpResponseCharset) {
            this.httpResponseCharset = httpResponseCharset;
            return this;
        }
        public String getHttpResponseCharset() {
            return this.httpResponseCharset;
        }

        public CreateHostAvailabilityRequestTaskOption setHttpResponseMatchContent(String httpResponseMatchContent) {
            this.httpResponseMatchContent = httpResponseMatchContent;
            return this;
        }
        public String getHttpResponseMatchContent() {
            return this.httpResponseMatchContent;
        }

        public CreateHostAvailabilityRequestTaskOption setHttpURI(String httpURI) {
            this.httpURI = httpURI;
            return this;
        }
        public String getHttpURI() {
            return this.httpURI;
        }

        public CreateHostAvailabilityRequestTaskOption setInterval(Integer interval) {
            this.interval = interval;
            return this;
        }
        public Integer getInterval() {
            return this.interval;
        }

        public CreateHostAvailabilityRequestTaskOption setTelnetOrPingHost(String telnetOrPingHost) {
            this.telnetOrPingHost = telnetOrPingHost;
            return this;
        }
        public String getTelnetOrPingHost() {
            return this.telnetOrPingHost;
        }

    }

    public static class CreateHostAvailabilityRequestAlertConfigEscalationList extends TeaModel {
        /**
         * <p>The method used to calculate the metric values that trigger alerts. Valid values of N: 1 to 21. Valid values:</p>
         * <br>
         * <p>*   HttpStatus: Value</p>
         * <p>*   HttpLatency: Average</p>
         * <p>*   TelnetStatus: Value</p>
         * <p>*   TelnetLatency: Average</p>
         * <p>*   PingLostRate: Average</p>
         * <br>
         * <p>> The value Value indicates the original value and is used for metrics such as status codes. The value Average indicates the average value and is used for metrics such as the latency and packet loss rate.</p>
         */
        @NameInMap("Aggregate")
        public String aggregate;

        /**
         * <p>The metric for which the alert feature is enabled. Valid values of N: 1 to 21. Valid values:</p>
         * <br>
         * <p>*   HttpStatus: HTTP status code</p>
         * <p>*   HttpLatency: HTTP response time</p>
         * <p>*   TelnetStatus: Telnet status code</p>
         * <p>*   TelnetLatency: Telnet response time</p>
         * <p>*   PingLostRate: Ping packet loss rate</p>
         */
        @NameInMap("MetricName")
        public String metricName;

        /**
         * <p>The comparison operator that is used in the alert rule. Valid values of N: 1 to 21. Valid values:</p>
         * <br>
         * <p>*   `>`</p>
         * <p>*   `>=`</p>
         * <p>*   `<`</p>
         * <p>*   `<=`</p>
         * <p>*   `=`</p>
         */
        @NameInMap("Operator")
        public String operator;

        /**
         * <p>The consecutive number of times for which the metric value meets the alert condition before an alert is triggered. Valid values of N: 1 to 21.</p>
         */
        @NameInMap("Times")
        public Integer times;

        /**
         * <p>The alert threshold. Valid values of N: 1 to 21.</p>
         */
        @NameInMap("Value")
        public String value;

        public static CreateHostAvailabilityRequestAlertConfigEscalationList build(java.util.Map<String, ?> map) throws Exception {
            CreateHostAvailabilityRequestAlertConfigEscalationList self = new CreateHostAvailabilityRequestAlertConfigEscalationList();
            return TeaModel.build(map, self);
        }

        public CreateHostAvailabilityRequestAlertConfigEscalationList setAggregate(String aggregate) {
            this.aggregate = aggregate;
            return this;
        }
        public String getAggregate() {
            return this.aggregate;
        }

        public CreateHostAvailabilityRequestAlertConfigEscalationList setMetricName(String metricName) {
            this.metricName = metricName;
            return this;
        }
        public String getMetricName() {
            return this.metricName;
        }

        public CreateHostAvailabilityRequestAlertConfigEscalationList setOperator(String operator) {
            this.operator = operator;
            return this;
        }
        public String getOperator() {
            return this.operator;
        }

        public CreateHostAvailabilityRequestAlertConfigEscalationList setTimes(Integer times) {
            this.times = times;
            return this;
        }
        public Integer getTimes() {
            return this.times;
        }

        public CreateHostAvailabilityRequestAlertConfigEscalationList setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class CreateHostAvailabilityRequestAlertConfigTargetList extends TeaModel {
        /**
         * <p>The Alibaba Cloud Resource Name (ARN) of the resource. Format: `acs:{Service name abbreviation}:{regionId}:{userId}:/{Resource type}/{Resource name}/message`. Example: `acs:mns:cn-hangzhou:120886317861****:/queues/test123/message`. Fields:</p>
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
         */
        @NameInMap("Id")
        public String id;

        /**
         * <p>The parameters of the alert callback. The parameters are in the JSON format.</p>
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

        public static CreateHostAvailabilityRequestAlertConfigTargetList build(java.util.Map<String, ?> map) throws Exception {
            CreateHostAvailabilityRequestAlertConfigTargetList self = new CreateHostAvailabilityRequestAlertConfigTargetList();
            return TeaModel.build(map, self);
        }

        public CreateHostAvailabilityRequestAlertConfigTargetList setArn(String arn) {
            this.arn = arn;
            return this;
        }
        public String getArn() {
            return this.arn;
        }

        public CreateHostAvailabilityRequestAlertConfigTargetList setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public CreateHostAvailabilityRequestAlertConfigTargetList setJsonParams(String jsonParams) {
            this.jsonParams = jsonParams;
            return this;
        }
        public String getJsonParams() {
            return this.jsonParams;
        }

        public CreateHostAvailabilityRequestAlertConfigTargetList setLevel(String level) {
            this.level = level;
            return this;
        }
        public String getLevel() {
            return this.level;
        }

    }

}
