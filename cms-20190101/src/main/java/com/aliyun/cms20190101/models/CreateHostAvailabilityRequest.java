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
     * <p>This parameter is required.</p>
     */
    @NameInMap("AlertConfigEscalationList")
    public java.util.List<CreateHostAvailabilityRequestAlertConfigEscalationList> alertConfigEscalationList;

    /**
     * <p>The resources for which alerts are triggered.</p>
     */
    @NameInMap("AlertConfigTargetList")
    public java.util.List<CreateHostAvailabilityRequestAlertConfigTargetList> alertConfigTargetList;

    /**
     * <p>The ID of the application group.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>123456</p>
     */
    @NameInMap("GroupId")
    public Long groupId;

    /**
     * <p>The ECS instances that are monitored. Valid values of N: 1 to 21.</p>
     * <blockquote>
     * <p>This parameter must be specified when <code>TaskScope</code> is set to <code>GROUP_SPEC_INSTANCE</code>.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>i-absdfkwl321****</p>
     */
    @NameInMap("InstanceList")
    public java.util.List<String> instanceList;

    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The name of the availability monitoring task. The name must be 4 to 100 characters in length, and can contain letters, digits, and underscores (_).</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>task1</p>
     */
    @NameInMap("TaskName")
    public String taskName;

    /**
     * <p>The range of instances that are monitored by the availability monitoring task. Valid values:</p>
     * <ul>
     * <li>GROUP: All Elastic Compute Service (ECS) instances in the application group are monitored.</li>
     * <li>GROUP_SPEC_INSTANCE: Specified ECS instances in the application group are monitored. The TaskScope parameter must be used in combination with the InstanceList.N parameter. The InstanceList.N parameter specifies the ECS instances to be monitored.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>GROUP</p>
     */
    @NameInMap("TaskScope")
    public String taskScope;

    /**
     * <p>The monitoring type of the availability monitoring task. Valid values:</p>
     * <ul>
     * <li>PING</li>
     * <li>TELNET</li>
     * <li>HTTP</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>HTTP</p>
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
         * <p>For example, if the <code>AlertConfig.StartTime</code> parameter is set to 0 and the <code>AlertConfig.EndTime</code> parameter is set to 22, the alert rule is effective from 00:00:00 to 22:00:00.</p>
         * <blockquote>
         * <p>Alert notifications are sent based on the specified threshold only if the alert rule is effective.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>22</p>
         */
        @NameInMap("EndTime")
        public Integer endTime;

        /**
         * <p>The alert notification methods. Valid values:</p>
         * <p>0: Alert notifications are sent by using emails and DingTalk chatbots.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("NotifyType")
        public Integer notifyType;

        /**
         * <p>The mute period during which new alerts are not sent even if the trigger conditions are met. Unit: seconds. Default value: 86400. The default value indicates one day.</p>
         * 
         * <strong>example:</strong>
         * <p>86400</p>
         */
        @NameInMap("SilenceTime")
        public Integer silenceTime;

        /**
         * <p>The beginning of the time range during which the alert rule is effective. Valid values: 0 to 23.</p>
         * <p>For example, if the <code>AlertConfig.StartTime</code> parameter is set to 0 and the <code>AlertConfig.EndTime</code> parameter is set to 22, the alert rule is effective from 00:00:00 to 22:00:00.</p>
         * <blockquote>
         * <p>Alert notifications are sent based on the specified threshold only if the alert rule is effective.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("StartTime")
        public Integer startTime;

        /**
         * <p>The callback URL.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://www.aliyun.com/webhook.json">https://www.aliyun.com/webhook.json</a></p>
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
         * <p>The header of the HTTP request. Format: <code>Parameter name:Parameter value</code>. Separate multiple parameters with carriage return characters. Example:</p>
         * <pre><code>params1:value1
         * params2:value2
         * </code></pre>
         * 
         * <strong>example:</strong>
         * <p>token:testTokenValue</p>
         */
        @NameInMap("HttpHeader")
        public String httpHeader;

        /**
         * <p>The HTTP request method. Valid values:</p>
         * <ul>
         * <li>GET</li>
         * <li>POST</li>
         * <li>HEAD</li>
         * </ul>
         * <blockquote>
         * <p>This parameter must be specified when TaskType is set to HTTP.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>GET</p>
         */
        @NameInMap("HttpMethod")
        public String httpMethod;

        /**
         * <p>The method to trigger an alert. The alert can be triggered based on whether the specified alert rule is included in the response body. Valid values:</p>
         * <ul>
         * <li>true: If the HTTP response body includes the alert rule, an alert is triggered.</li>
         * <li>false: If the HTTP response does not include the alert rule, an alert is triggered.</li>
         * </ul>
         * <blockquote>
         * <p>This parameter must be specified when TaskType is set to HTTP.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("HttpNegative")
        public Boolean httpNegative;

        /**
         * <p>The content of the HTTP POST request.</p>
         * 
         * <strong>example:</strong>
         * <p>params1=paramsValue1</p>
         */
        @NameInMap("HttpPostContent")
        public String httpPostContent;

        /**
         * <p>The character set that is used in the HTTP response.</p>
         * <blockquote>
         * <p>Only UTF-8 is supported.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>UTF-8</p>
         */
        @NameInMap("HttpResponseCharset")
        public String httpResponseCharset;

        /**
         * <p>The response to the HTTP request.</p>
         * 
         * <strong>example:</strong>
         * <p>ok</p>
         */
        @NameInMap("HttpResponseMatchContent")
        public String httpResponseMatchContent;

        /**
         * <p>The URI that you want to monitor. This parameter is required if the TaskType parameter is set to HTTP or Telnet.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://www.aliyun.com">https://www.aliyun.com</a></p>
         */
        @NameInMap("HttpURI")
        public String httpURI;

        /**
         * <p>The interval at which detection requests are sent. Unit: seconds. Valid values: 15, 30, 60, 120, 300, 900, 1800, and 3600.</p>
         * <blockquote>
         * <p>This parameter is available only for the CloudMonitor agent V3.5.1 or later.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>60</p>
         */
        @NameInMap("Interval")
        public Integer interval;

        /**
         * <p>The domain name or IP address that you want to monitor.</p>
         * <blockquote>
         * <p> This parameter is required if the TaskType parameter is set to PING.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p><a href="http://www.aliyun.com">www.aliyun.com</a></p>
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
         * <ul>
         * <li>HttpStatus: Value</li>
         * <li>HttpLatency: Average</li>
         * <li>TelnetStatus: Value</li>
         * <li>TelnetLatency: Average</li>
         * <li>PingLostRate: Average</li>
         * </ul>
         * <blockquote>
         * <p>The value Value indicates the original value and is used for metrics such as status codes. The value Average indicates the average value and is used for metrics such as the latency and packet loss rate.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>Value</p>
         */
        @NameInMap("Aggregate")
        public String aggregate;

        /**
         * <p>The metric for which the alert feature is enabled. Valid values of N: 1 to 21. Valid values:</p>
         * <ul>
         * <li>HttpStatus: HTTP status code</li>
         * <li>HttpLatency: HTTP response time</li>
         * <li>TelnetStatus: Telnet status code</li>
         * <li>TelnetLatency: Telnet response time</li>
         * <li>PingLostRate: Ping packet loss rate</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>HttpStatus</p>
         */
        @NameInMap("MetricName")
        public String metricName;

        /**
         * <p>The comparison operator that is used in the alert rule. Valid values of N: 1 to 21. Valid values:</p>
         * <ul>
         * <li><code>&gt;</code></li>
         * <li><code>&gt;=</code></li>
         * <li><code>&lt;</code></li>
         * <li><code>&lt;=</code></li>
         * <li><code>=</code></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <blockquote>
         * </blockquote>
         */
        @NameInMap("Operator")
        public String operator;

        /**
         * <p>The consecutive number of times for which the metric value meets the alert condition before an alert is triggered. Valid values of N: 1 to 21.</p>
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
        @NameInMap("Times")
        public Integer times;

        /**
         * <p>The alert threshold. Valid values of N: 1 to 21.</p>
         * 
         * <strong>example:</strong>
         * <p>90</p>
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
         * <p>The Alibaba Cloud Resource Name (ARN) of the resource. Format: <code>acs:{Service name abbreviation}:{regionId}:{userId}:/{Resource type}/{Resource name}/message</code>. Example: <code>acs:mns:cn-hangzhou:120886317861****:/queues/test123/message</code>. Fields:</p>
         * <ul>
         * <li><p>{Service name abbreviation}: the abbreviation of the service name. Set the value to Simple Message Queue (formerly MNS) (SMQ).</p>
         * </li>
         * <li><p>{userId}: the ID of the Alibaba Cloud account.</p>
         * </li>
         * <li><p>{regionId}: the region ID of the SMQ queue or topic.</p>
         * </li>
         * <li><p>{Resource type}: the type of the resource for which alerts are triggered. Valid values:</p>
         * <ul>
         * <li><strong>queues</strong></li>
         * <li><strong>topics</strong></li>
         * </ul>
         * </li>
         * <li><p>{Resource name}: the resource name.</p>
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
         * <p>The ID of the resource for which alerts are triggered.</p>
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
         * <p>The alert level. Valid values:</p>
         * <ul>
         * <li>INFO</li>
         * <li>WARN</li>
         * <li>CRITICAL</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>[&quot;INFO&quot;, &quot;WARN&quot;, &quot;CRITICAL&quot;]</p>
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
