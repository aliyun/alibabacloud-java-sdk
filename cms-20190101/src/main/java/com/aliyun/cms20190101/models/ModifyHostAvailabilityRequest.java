// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20190101.models;

import com.aliyun.tea.*;

public class ModifyHostAvailabilityRequest extends TeaModel {
    @NameInMap("AlertConfig")
    public ModifyHostAvailabilityRequestAlertConfig alertConfig;

    @NameInMap("TaskOption")
    public ModifyHostAvailabilityRequestTaskOption taskOption;

    /**
     * <p>The alert configuration list.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("AlertConfigEscalationList")
    public java.util.List<ModifyHostAvailabilityRequestAlertConfigEscalationList> alertConfigEscalationList;

    /**
     * <p>The alert trigger targets.</p>
     */
    @NameInMap("AlertConfigTargetList")
    public java.util.List<ModifyHostAvailabilityRequestAlertConfigTargetList> alertConfigTargetList;

    /**
     * <p>The application group ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>123456</p>
     */
    @NameInMap("GroupId")
    public Long groupId;

    /**
     * <p>The availability monitoring task ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>12345</p>
     */
    @NameInMap("Id")
    public Long id;

    /**
     * <p>The list of ECS instances that initiate detection. Valid values of N: 1 to 21.</p>
     * <blockquote>
     * <p>If <code>TaskScope</code> is set to <code>GROUP_SPEC_INSTANCE</code>, you must set this parameter.</p>
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
     * <p>The name of the availability monitoring task.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>task2</p>
     */
    @NameInMap("TaskName")
    public String taskName;

    /**
     * <p>The detection scope of the availability monitoring task. Valid values:</p>
     * <ul>
     * <li>GROUP: uses all ECS instances in the current application group as detection probes.</li>
     * <li>GROUP_SPEC_INSTANCE: uses specified ECS instances in the current application group as detection probes. If you set this parameter to GROUP_SPEC_INSTANCE, you must also set InstanceList to specify the ECS instances that initiate detection.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>GROUP</p>
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
         * <p>The end time when the alert takes effect.</p>
         * <p>Unit: hours (h). Valid values: 0 to 23. For example, a value of 22 indicates 22:00:00.</p>
         * <blockquote>
         * <p>If the alert is not within the effective period, alert notifications are not sent even if the threshold is exceeded.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>22</p>
         */
        @NameInMap("EndTime")
        public Integer endTime;

        /**
         * <p>The alert notification type. Valid values:</p>
         * <p>&lt;props=&quot;china&quot;&gt;- 2: phone call + text message + email + DingTalk chatbot.</p>
         * <p>&lt;props=&quot;china&quot;&gt;- 1: text message + email + DingTalk chatbot.</p>
         * <p>&lt;props=&quot;china&quot;&gt;- 0: email + DingTalk chatbot.</p>
         * <p>&lt;props=&quot;intl&quot;&gt;0: email + DingTalk chatbot.</p>
         * <p>&lt;props=&quot;partner&quot;&gt;0: email + DingTalk chatbot.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("NotifyType")
        public Integer notifyType;

        /**
         * <p>The mute period. Unit: seconds. Default value: 86400 (1 day).</p>
         * 
         * <strong>example:</strong>
         * <p>86400</p>
         */
        @NameInMap("SilenceTime")
        public Integer silenceTime;

        /**
         * <p>The start time when the alert takes effect.</p>
         * <p>Unit: hours (h). Valid values: 0 to 23. For example, a value of 0 indicates 00:00:00.</p>
         * <blockquote>
         * <p>If the alert is not within the effective period, alert notifications are not sent even if the threshold is exceeded.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("StartTime")
        public Integer startTime;

        /**
         * <p>The webhook address.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://www.aliyun.com/webhook.json">https://www.aliyun.com/webhook.json</a></p>
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
         * <p>The header of the HTTP request. Format: <code>Parameter:Value</code>. Separate multiple parameters with carriage returns. Example:</p>
         * <pre><code>params1:value1
         * params2:value2
         * </code></pre>
         * 
         * <strong>example:</strong>
         * <p>params1:value1</p>
         */
        @NameInMap("HttpHeader")
        public String httpHeader;

        /**
         * <p>The method of the detection type. Valid values:</p>
         * <ul>
         * <li>GET</li>
         * <li>POST</li>
         * <li>HEAD</li>
         * </ul>
         * <blockquote>
         * <p>If the detection task type is HTTP, you must set this parameter. For information about how to set the detection task type, see <a href="https://help.aliyun.com/document_detail/115317.html">CreateHostAvailability</a>.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>GET</p>
         */
        @NameInMap("HttpMethod")
        public String httpMethod;

        /**
         * <p>The alert rule for matching HTTP response content. Valid values:</p>
         * <ul>
         * <li>true: An alert is triggered if the HTTP response content contains the specified alert rule.</li>
         * <li>false: An alert is triggered if the HTTP response content does not contain the specified alert rule.</li>
         * </ul>
         * <blockquote>
         * <p>If the detection task type is HTTP, you must set this parameter. For information about how to set the detection task type, see <a href="https://help.aliyun.com/document_detail/115317.html">CreateHostAvailability</a>.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("HttpNegative")
        public Boolean httpNegative;

        /**
         * <p>The POST content of the HTTP detection request.</p>
         * 
         * <strong>example:</strong>
         * <p>params1=value1</p>
         */
        @NameInMap("HttpPostContent")
        public String httpPostContent;

        /**
         * <p>The response character set for the HTTP detection type.</p>
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
         * <p>The POST content of the HTTP detection response.</p>
         * 
         * <strong>example:</strong>
         * <p>ok</p>
         */
        @NameInMap("HttpResponseMatchContent")
        public String httpResponseMatchContent;

        /**
         * <p>The URI for HTTP or Telnet detection types.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://www.aliyun.com">https://www.aliyun.com</a>
         * telnet://127.0.0.1:80</p>
         */
        @NameInMap("HttpURI")
        public String httpURI;

        /**
         * <p>The detection frequency. Unit: seconds. Valid values: 15, 30, 60, 120, 300, 900, 1800, and 3600.</p>
         * <blockquote>
         * <p>Only CloudMonitor agent 3.5.1 or later supports this parameter.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>60</p>
         */
        @NameInMap("Interval")
        public Integer interval;

        /**
         * <p>The domain name or address to detect.</p>
         * <blockquote>
         * <p>If the detection task type is PING, you must set this parameter. For information about how to set the detection task type, see <a href="https://help.aliyun.com/document_detail/115317.html">CreateHostAvailability</a>.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p><a href="http://www.aliyun.com">www.aliyun.com</a></p>
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
         * <p>The statistical method for the alert. Valid values of N: 1 to 21. The statistical method varies by metric:</p>
         * <ul>
         * <li>HttpStatus: Value.</li>
         * <li>HttpLatency: Average.</li>
         * <li>TelnetStatus: Value.</li>
         * <li>TelnetLatency: Average.</li>
         * <li>PingLostRate: Average.</li>
         * </ul>
         * <blockquote>
         * <p>The statistical method for status codes is the original value (Value). The statistical method for latency or packet loss rate is the average value (Average).</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>Value</p>
         */
        @NameInMap("Aggregate")
        public String aggregate;

        /**
         * <p>The metric for the alert. Valid values of N: 1 to 21. Valid values:</p>
         * <ul>
         * <li>HttpStatus: HTTP status code.</li>
         * <li>HttpLatency: HTTP latency.</li>
         * <li>TelnetStatus: TELNET status code.</li>
         * <li>TelnetLatency: TELNET latency.</li>
         * <li>PingLostRate: PING packet loss rate.</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>HttpStatus</p>
         */
        @NameInMap("MetricName")
        public String metricName;

        /**
         * <p>The comparison operator for the alert rule. Valid values of N: 1 to 21. Valid values:</p>
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
         * <p>The number of alert retries. Valid values of N: 1 to 21.</p>
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
         * <p>3</p>
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
         * <p>The resource ARN.</p>
         * <p>Format: <code>acs:{AbbreviatedCloudServiceName}:{regionId}:{userId}:/{ResourceType}/{ResourceName}/message</code>. Example: <code>acs:mns:cn-hangzhou:120886317861****:/queues/test123/message</code>. The parameters are described as follows:</p>
         * <ul>
         * <li><p>{AbbreviatedCloudServiceName}: Only Simple Message Queue (formerly MNS) is supported.</p>
         * </li>
         * <li><p>{userId}: The Alibaba Cloud account ID.</p>
         * </li>
         * <li><p>{regionId}: The region where Simple Message Queue (formerly MNS) or the topic resides.</p>
         * </li>
         * <li><p>{ResourceType}: The type of the resource that accepts alerts. Valid values:</p>
         * <ul>
         * <li><strong>queues</strong>: queue.</li>
         * <li><strong>topics</strong>: topic.</li>
         * </ul>
         * </li>
         * <li><p>{ResourceName}: The resource name.</p>
         * <ul>
         * <li>If the resource type is <strong>queues</strong>, the resource name is the queue name.</li>
         * <li>If the resource type is <strong>topics</strong>, the resource name is the topic name.</li>
         * </ul>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>acs:mns:cn-hangzhou:111:/queues/test/message</p>
         */
        @NameInMap("Arn")
        public String arn;

        /**
         * <p>The ID of the alert trigger target.</p>
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
         * <li>INFO: information.</li>
         * <li>WARN: warning.</li>
         * <li>CRITICAL: critical.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>[&quot;INFO&quot;, &quot;WARN&quot;, &quot;CRITICAL&quot;]</p>
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
