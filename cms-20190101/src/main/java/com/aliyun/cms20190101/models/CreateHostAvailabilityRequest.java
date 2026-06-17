// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20190101.models;

import com.aliyun.tea.*;

public class CreateHostAvailabilityRequest extends TeaModel {
    @NameInMap("AlertConfig")
    public CreateHostAvailabilityRequestAlertConfig alertConfig;

    @NameInMap("TaskOption")
    public CreateHostAvailabilityRequestTaskOption taskOption;

    /**
     * <p>None.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("AlertConfigEscalationList")
    public java.util.List<CreateHostAvailabilityRequestAlertConfigEscalationList> alertConfigEscalationList;

    /**
     * <p>The alert trigger targets.</p>
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
     * <p>The list of ECS instances that initiate detection. Valid values of N: 1 to 21.</p>
     * <blockquote>
     * <p>Set this parameter when <code>TaskScope</code> is set to <code>GROUP_SPEC_INSTANCE</code>.</p>
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
     * <p>The name of the availability monitoring task. The name must be 4 to 100 characters in length and can contain letters, digits, underscores (_), and Chinese characters.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>task1</p>
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

    /**
     * <p>The detection type of the availability monitoring task. Valid values:</p>
     * <ul>
     * <li>PING</li>
     * <li>TELNET</li>
     * <li>HTTP.</li>
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
         * <p>报警生效的结束时间。取值范围：0~23。</p>
         * <p>例如：<code>AlertConfig.StartTime</code>为0，<code>AlertConfig.EndTime</code>为22，表示报警生效时间为00:00:00至22:00:00。</p>
         * <blockquote>
         * <p>如果报警不在生效时间内，则超过阈值也不会发送报警通知。</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>22</p>
         */
        @NameInMap("EndTime")
        public Integer endTime;

        /**
         * <p>报警通知类型。取值：</p>
         * <p>&lt;props=&quot;china&quot;&gt;- 2：电话+短信+邮件+钉钉机器人。</p>
         * <p>&lt;props=&quot;china&quot;&gt;- 1：短信+邮件+钉钉机器人。</p>
         * <p>&lt;props=&quot;china&quot;&gt;- 0：邮件+钉钉机器人。</p>
         * <p>&lt;props=&quot;intl&quot;&gt;0：邮件+钉钉机器人。</p>
         * <p>&lt;props=&quot;partner&quot;&gt;0：邮件+钉钉机器人。</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("NotifyType")
        public Integer notifyType;

        /**
         * <p>通道沉默时间。单位：秒，默认值：86400（1天）。</p>
         * 
         * <strong>example:</strong>
         * <p>86400</p>
         */
        @NameInMap("SilenceTime")
        public Integer silenceTime;

        /**
         * <p>报警生效的开始时间。取值范围：0~23。</p>
         * <p>例如：<code>AlertConfig.StartTime</code>为0，<code>AlertConfig.EndTime</code>为22，表示报警生效时间为00:00:00至22:00:00。</p>
         * <blockquote>
         * <p>如果报警不在生效时间内，则超过阈值也不会发送报警通知。</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("StartTime")
        public Integer startTime;

        /**
         * <p>URL回调地址。</p>
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
         * <p>HTTP请求的Header。格式为<code>参数名:参数</code>，多个参数之间用回车符分隔，例如：</p>
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
         * <p>探测类型的方法。取值：</p>
         * <ul>
         * <li>GET</li>
         * <li>POST</li>
         * <li>HEAD</li>
         * </ul>
         * <blockquote>
         * <p>如果任务的探测类型为HTTP，则需要设置该参数。</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>GET</p>
         */
        @NameInMap("HttpMethod")
        public String httpMethod;

        /**
         * <p>匹配HTTP响应内容的报警规则。取值：</p>
         * <ul>
         * <li>true：如果HTTP响应内容包含设置的报警规则，则报警。</li>
         * <li>false：如果HTTP响应内容不包含设置的报警规则，则报警。</li>
         * </ul>
         * <blockquote>
         * <p>如果任务的探测类型为HTTP，则该参数生效。</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("HttpNegative")
        public Boolean httpNegative;

        /**
         * <p>HTTP探测类型探测请求的Post内容。</p>
         * 
         * <strong>example:</strong>
         * <p>params1=paramsValue1</p>
         */
        @NameInMap("HttpPostContent")
        public String httpPostContent;

        /**
         * <p>HTTP探测类型的响应字符集。</p>
         * <blockquote>
         * <p>仅支持UTF-8。</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>UTF-8</p>
         */
        @NameInMap("HttpResponseCharset")
        public String httpResponseCharset;

        /**
         * <p>匹配响应的内容。</p>
         * 
         * <strong>example:</strong>
         * <p>ok</p>
         */
        @NameInMap("HttpResponseMatchContent")
        public String httpResponseMatchContent;

        /**
         * <p>HTTP、Telnet探测类型的探测URI地址。</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://www.aliyun.com">https://www.aliyun.com</a>
         * telnet://127.0.0.1:80</p>
         */
        @NameInMap("HttpURI")
        public String httpURI;

        /**
         * <p>探测频率。单位：秒。取值：15、30、60、120、300、900、1800和3600。</p>
         * <blockquote>
         * <p>仅3.5.1及以上版本的云监控插件支持该参数。</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>60</p>
         */
        @NameInMap("Interval")
        public Integer interval;

        /**
         * <p>探测的域名或地址。</p>
         * <blockquote>
         * <p>如果探测任务类型为PING，则需要设置该参数。</p>
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
         * <p>The statistical method for the alert. Valid values of N: 1 to 21. The valid values vary based on the metric:</p>
         * <ul>
         * <li>HttpStatus: Value.</li>
         * <li>HttpLatency: Average.</li>
         * <li>TelnetStatus: Value.</li>
         * <li>TelnetLatency: Average.</li>
         * <li>PingLostRate: Average.</li>
         * </ul>
         * <blockquote>
         * <p>The statistical method for status code metrics is the raw value (Value). The statistical method for latency or packet loss rate metrics is the average value (Average).</p>
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
         * <li>TelnetStatus: Telnet status code.</li>
         * <li>TelnetLatency: Telnet latency.</li>
         * <li>PingLostRate: Ping packet loss rate.</li>
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
         * <li><code>=</code>.</li>
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
         * <p>The Alibaba Cloud Resource Name (ARN) of the resource. Format: <code>acs:{AbbreviatedServiceName}:{regionId}:{userId}:/{ResourceType}/{ResourceName}/message</code>. Example: <code>acs:mns:ap-southeast-1:120886317861****:/queues/test123/message</code>. The following list describes the parameters:</p>
         * <ul>
         * <li><p>{AbbreviatedServiceName}: Only Simple Message Queue (formerly MNS) is supported.</p>
         * </li>
         * <li><p>{userId}: The Alibaba Cloud account ID.</p>
         * </li>
         * <li><p>{regionId}: The region where the Simple Message Queue (formerly MNS) queue or topic resides.</p>
         * </li>
         * <li><p>{ResourceType}: The type of the resource that accepts alerts. Valid values:</p>
         * <ul>
         * <li><strong>queues</strong>: queue.</li>
         * <li><strong>topics</strong>: topic.</li>
         * </ul>
         * </li>
         * <li><p>{ResourceName}: The name of the resource.</p>
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
