// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20190101.models;

import com.aliyun.tea.*;

public class DescribeHostAvailabilityListResponseBody extends TeaModel {
    /**
     * <p>The HTTP status code.</p>
     * <br>
     * <p>>  The value 200 indicates that the call was successful.</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The error message.</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the call was successful. Valid values:</p>
     * <br>
     * <p>*   true: The call was successful.</p>
     * <p>*   false: The call failed.</p>
     */
    @NameInMap("Success")
    public Boolean success;

    /**
     * <p>The details of the availability monitoring tasks.</p>
     */
    @NameInMap("TaskList")
    public DescribeHostAvailabilityListResponseBodyTaskList taskList;

    /**
     * <p>The total number of returned entries.</p>
     */
    @NameInMap("Total")
    public Integer total;

    public static DescribeHostAvailabilityListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeHostAvailabilityListResponseBody self = new DescribeHostAvailabilityListResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeHostAvailabilityListResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public DescribeHostAvailabilityListResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DescribeHostAvailabilityListResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeHostAvailabilityListResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public DescribeHostAvailabilityListResponseBody setTaskList(DescribeHostAvailabilityListResponseBodyTaskList taskList) {
        this.taskList = taskList;
        return this;
    }
    public DescribeHostAvailabilityListResponseBodyTaskList getTaskList() {
        return this.taskList;
    }

    public DescribeHostAvailabilityListResponseBody setTotal(Integer total) {
        this.total = total;
        return this;
    }
    public Integer getTotal() {
        return this.total;
    }

    public static class DescribeHostAvailabilityListResponseBodyTaskListNodeTaskConfigAlertConfigEscalationListEscalationList extends TeaModel {
        /**
         * <p>The method used to calculate metric values that trigger alerts. Valid values:</p>
         * <br>
         * <p>*   Value: the value of the HTTP status code</p>
         * <p>*   Average: the average HTTP response time</p>
         * <p>*   Value: the value of the Telnet status code</p>
         * <p>*   TelnetLatency: the average Telnet response time</p>
         * <p>*   Average: the average Ping packet loss rate</p>
         */
        @NameInMap("Aggregate")
        public String aggregate;

        /**
         * <p>The name of the metric. Valid values:</p>
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
         * <p>The comparison operator that is used in the alert rule. Valid values:</p>
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
         * <p>The consecutive number of times for which the metric value is measured before an alert is triggered.</p>
         */
        @NameInMap("Times")
        public String times;

        /**
         * <p>The alert threshold.</p>
         */
        @NameInMap("Value")
        public String value;

        public static DescribeHostAvailabilityListResponseBodyTaskListNodeTaskConfigAlertConfigEscalationListEscalationList build(java.util.Map<String, ?> map) throws Exception {
            DescribeHostAvailabilityListResponseBodyTaskListNodeTaskConfigAlertConfigEscalationListEscalationList self = new DescribeHostAvailabilityListResponseBodyTaskListNodeTaskConfigAlertConfigEscalationListEscalationList();
            return TeaModel.build(map, self);
        }

        public DescribeHostAvailabilityListResponseBodyTaskListNodeTaskConfigAlertConfigEscalationListEscalationList setAggregate(String aggregate) {
            this.aggregate = aggregate;
            return this;
        }
        public String getAggregate() {
            return this.aggregate;
        }

        public DescribeHostAvailabilityListResponseBodyTaskListNodeTaskConfigAlertConfigEscalationListEscalationList setMetricName(String metricName) {
            this.metricName = metricName;
            return this;
        }
        public String getMetricName() {
            return this.metricName;
        }

        public DescribeHostAvailabilityListResponseBodyTaskListNodeTaskConfigAlertConfigEscalationListEscalationList setOperator(String operator) {
            this.operator = operator;
            return this;
        }
        public String getOperator() {
            return this.operator;
        }

        public DescribeHostAvailabilityListResponseBodyTaskListNodeTaskConfigAlertConfigEscalationListEscalationList setTimes(String times) {
            this.times = times;
            return this;
        }
        public String getTimes() {
            return this.times;
        }

        public DescribeHostAvailabilityListResponseBodyTaskListNodeTaskConfigAlertConfigEscalationListEscalationList setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class DescribeHostAvailabilityListResponseBodyTaskListNodeTaskConfigAlertConfigEscalationList extends TeaModel {
        @NameInMap("escalationList")
        public java.util.List<DescribeHostAvailabilityListResponseBodyTaskListNodeTaskConfigAlertConfigEscalationListEscalationList> escalationList;

        public static DescribeHostAvailabilityListResponseBodyTaskListNodeTaskConfigAlertConfigEscalationList build(java.util.Map<String, ?> map) throws Exception {
            DescribeHostAvailabilityListResponseBodyTaskListNodeTaskConfigAlertConfigEscalationList self = new DescribeHostAvailabilityListResponseBodyTaskListNodeTaskConfigAlertConfigEscalationList();
            return TeaModel.build(map, self);
        }

        public DescribeHostAvailabilityListResponseBodyTaskListNodeTaskConfigAlertConfigEscalationList setEscalationList(java.util.List<DescribeHostAvailabilityListResponseBodyTaskListNodeTaskConfigAlertConfigEscalationListEscalationList> escalationList) {
            this.escalationList = escalationList;
            return this;
        }
        public java.util.List<DescribeHostAvailabilityListResponseBodyTaskListNodeTaskConfigAlertConfigEscalationListEscalationList> getEscalationList() {
            return this.escalationList;
        }

    }

    public static class DescribeHostAvailabilityListResponseBodyTaskListNodeTaskConfigAlertConfigTargetListTarget extends TeaModel {
        @NameInMap("Arn")
        public String arn;

        @NameInMap("Id")
        public String id;

        @NameInMap("JsonParams")
        public String jsonParams;

        @NameInMap("Level")
        public String level;

        public static DescribeHostAvailabilityListResponseBodyTaskListNodeTaskConfigAlertConfigTargetListTarget build(java.util.Map<String, ?> map) throws Exception {
            DescribeHostAvailabilityListResponseBodyTaskListNodeTaskConfigAlertConfigTargetListTarget self = new DescribeHostAvailabilityListResponseBodyTaskListNodeTaskConfigAlertConfigTargetListTarget();
            return TeaModel.build(map, self);
        }

        public DescribeHostAvailabilityListResponseBodyTaskListNodeTaskConfigAlertConfigTargetListTarget setArn(String arn) {
            this.arn = arn;
            return this;
        }
        public String getArn() {
            return this.arn;
        }

        public DescribeHostAvailabilityListResponseBodyTaskListNodeTaskConfigAlertConfigTargetListTarget setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public DescribeHostAvailabilityListResponseBodyTaskListNodeTaskConfigAlertConfigTargetListTarget setJsonParams(String jsonParams) {
            this.jsonParams = jsonParams;
            return this;
        }
        public String getJsonParams() {
            return this.jsonParams;
        }

        public DescribeHostAvailabilityListResponseBodyTaskListNodeTaskConfigAlertConfigTargetListTarget setLevel(String level) {
            this.level = level;
            return this;
        }
        public String getLevel() {
            return this.level;
        }

    }

    public static class DescribeHostAvailabilityListResponseBodyTaskListNodeTaskConfigAlertConfigTargetList extends TeaModel {
        @NameInMap("Target")
        public java.util.List<DescribeHostAvailabilityListResponseBodyTaskListNodeTaskConfigAlertConfigTargetListTarget> target;

        public static DescribeHostAvailabilityListResponseBodyTaskListNodeTaskConfigAlertConfigTargetList build(java.util.Map<String, ?> map) throws Exception {
            DescribeHostAvailabilityListResponseBodyTaskListNodeTaskConfigAlertConfigTargetList self = new DescribeHostAvailabilityListResponseBodyTaskListNodeTaskConfigAlertConfigTargetList();
            return TeaModel.build(map, self);
        }

        public DescribeHostAvailabilityListResponseBodyTaskListNodeTaskConfigAlertConfigTargetList setTarget(java.util.List<DescribeHostAvailabilityListResponseBodyTaskListNodeTaskConfigAlertConfigTargetListTarget> target) {
            this.target = target;
            return this;
        }
        public java.util.List<DescribeHostAvailabilityListResponseBodyTaskListNodeTaskConfigAlertConfigTargetListTarget> getTarget() {
            return this.target;
        }

    }

    public static class DescribeHostAvailabilityListResponseBodyTaskListNodeTaskConfigAlertConfig extends TeaModel {
        /**
         * <p>The end of the time period during which the alert rule is effective. Valid values: 0 to 23.</p>
         * <br>
         * <p>For example, if the `AlertConfig.StartTime` parameter is set to 0 and the `AlertConfig.EndTime` parameter is set to 22, the alert rule is effective from 00:00:00 to 22:00:00.</p>
         * <br>
         * <p>>  Alert notifications are sent based on the specified threshold only if the alert rule is effective.</p>
         */
        @NameInMap("EndTime")
        public Integer endTime;

        /**
         * <p>The trigger conditions of the alert rule.</p>
         */
        @NameInMap("EscalationList")
        public DescribeHostAvailabilityListResponseBodyTaskListNodeTaskConfigAlertConfigEscalationList escalationList;

        /**
         * <p>The alert notification methods. Valid values:</p>
         * <br>
         * <p>0: Alert notifications are sent by using emails and DingTalk chatbots.</p>
         */
        @NameInMap("NotifyType")
        public Integer notifyType;

        /**
         * <p>The mute period during which new alerts are not sent even if the trigger conditions are met. Unit: seconds. Default value: 86400.</p>
         */
        @NameInMap("SilenceTime")
        public Integer silenceTime;

        /**
         * <p>The beginning of the time period during which the alert rule is effective. Valid values: 0 to 23.</p>
         * <br>
         * <p>For example, if the `AlertConfig.StartTime` parameter is set to 0 and the `AlertConfig.EndTime` parameter is set to 22, the alert rule is effective from 00:00:00 to 22:00:00.</p>
         * <br>
         * <p>>  Alert notifications are sent based on the specified threshold only if the alert rule is effective.</p>
         */
        @NameInMap("StartTime")
        public Integer startTime;

        @NameInMap("TargetList")
        public DescribeHostAvailabilityListResponseBodyTaskListNodeTaskConfigAlertConfigTargetList targetList;

        /**
         * <p>The callback URL.</p>
         * <br>
         * <p>CloudMonitor pushes an alert notification to the specified callback URL by sending an HTTP POST request. Only the HTTP protocol is supported.</p>
         */
        @NameInMap("WebHook")
        public String webHook;

        public static DescribeHostAvailabilityListResponseBodyTaskListNodeTaskConfigAlertConfig build(java.util.Map<String, ?> map) throws Exception {
            DescribeHostAvailabilityListResponseBodyTaskListNodeTaskConfigAlertConfig self = new DescribeHostAvailabilityListResponseBodyTaskListNodeTaskConfigAlertConfig();
            return TeaModel.build(map, self);
        }

        public DescribeHostAvailabilityListResponseBodyTaskListNodeTaskConfigAlertConfig setEndTime(Integer endTime) {
            this.endTime = endTime;
            return this;
        }
        public Integer getEndTime() {
            return this.endTime;
        }

        public DescribeHostAvailabilityListResponseBodyTaskListNodeTaskConfigAlertConfig setEscalationList(DescribeHostAvailabilityListResponseBodyTaskListNodeTaskConfigAlertConfigEscalationList escalationList) {
            this.escalationList = escalationList;
            return this;
        }
        public DescribeHostAvailabilityListResponseBodyTaskListNodeTaskConfigAlertConfigEscalationList getEscalationList() {
            return this.escalationList;
        }

        public DescribeHostAvailabilityListResponseBodyTaskListNodeTaskConfigAlertConfig setNotifyType(Integer notifyType) {
            this.notifyType = notifyType;
            return this;
        }
        public Integer getNotifyType() {
            return this.notifyType;
        }

        public DescribeHostAvailabilityListResponseBodyTaskListNodeTaskConfigAlertConfig setSilenceTime(Integer silenceTime) {
            this.silenceTime = silenceTime;
            return this;
        }
        public Integer getSilenceTime() {
            return this.silenceTime;
        }

        public DescribeHostAvailabilityListResponseBodyTaskListNodeTaskConfigAlertConfig setStartTime(Integer startTime) {
            this.startTime = startTime;
            return this;
        }
        public Integer getStartTime() {
            return this.startTime;
        }

        public DescribeHostAvailabilityListResponseBodyTaskListNodeTaskConfigAlertConfig setTargetList(DescribeHostAvailabilityListResponseBodyTaskListNodeTaskConfigAlertConfigTargetList targetList) {
            this.targetList = targetList;
            return this;
        }
        public DescribeHostAvailabilityListResponseBodyTaskListNodeTaskConfigAlertConfigTargetList getTargetList() {
            return this.targetList;
        }

        public DescribeHostAvailabilityListResponseBodyTaskListNodeTaskConfigAlertConfig setWebHook(String webHook) {
            this.webHook = webHook;
            return this;
        }
        public String getWebHook() {
            return this.webHook;
        }

    }

    public static class DescribeHostAvailabilityListResponseBodyTaskListNodeTaskConfigInstances extends TeaModel {
        @NameInMap("Instance")
        public java.util.List<String> instance;

        public static DescribeHostAvailabilityListResponseBodyTaskListNodeTaskConfigInstances build(java.util.Map<String, ?> map) throws Exception {
            DescribeHostAvailabilityListResponseBodyTaskListNodeTaskConfigInstances self = new DescribeHostAvailabilityListResponseBodyTaskListNodeTaskConfigInstances();
            return TeaModel.build(map, self);
        }

        public DescribeHostAvailabilityListResponseBodyTaskListNodeTaskConfigInstances setInstance(java.util.List<String> instance) {
            this.instance = instance;
            return this;
        }
        public java.util.List<String> getInstance() {
            return this.instance;
        }

    }

    public static class DescribeHostAvailabilityListResponseBodyTaskListNodeTaskConfigTaskOption extends TeaModel {
        /**
         * <p>The response to the HTTP request.</p>
         */
        @NameInMap("HttpKeyword")
        public String httpKeyword;

        /**
         * <p>The HTTP request method. Valid values:</p>
         * <br>
         * <p>*   GET</p>
         * <p>*   POST</p>
         * <p>*   HEAD</p>
         */
        @NameInMap("HttpMethod")
        public String httpMethod;

        /**
         * <p>The method to trigger an alert. The alert can be triggered based on whether the specified alert rule is included in the response body. Valid values:</p>
         * <br>
         * <p>*   true: If the HTTP response body includes the alert rule, an alert is triggered.</p>
         * <p>*   false: If the HTTP response does not include the alert rule, an alert is triggered.</p>
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
         */
        @NameInMap("HttpResponseCharset")
        public String httpResponseCharset;

        /**
         * <p>The URI that you want to monitor. If the TaskType parameter is set to HTTP, this parameter is required.</p>
         */
        @NameInMap("HttpURI")
        public String httpURI;

        /**
         * <p>The interval at which detection requests are sent. Unit: seconds.</p>
         */
        @NameInMap("Interval")
        public Integer interval;

        /**
         * <p>The domain name or IP address that you want to monitor.</p>
         */
        @NameInMap("TelnetOrPingHost")
        public String telnetOrPingHost;

        public static DescribeHostAvailabilityListResponseBodyTaskListNodeTaskConfigTaskOption build(java.util.Map<String, ?> map) throws Exception {
            DescribeHostAvailabilityListResponseBodyTaskListNodeTaskConfigTaskOption self = new DescribeHostAvailabilityListResponseBodyTaskListNodeTaskConfigTaskOption();
            return TeaModel.build(map, self);
        }

        public DescribeHostAvailabilityListResponseBodyTaskListNodeTaskConfigTaskOption setHttpKeyword(String httpKeyword) {
            this.httpKeyword = httpKeyword;
            return this;
        }
        public String getHttpKeyword() {
            return this.httpKeyword;
        }

        public DescribeHostAvailabilityListResponseBodyTaskListNodeTaskConfigTaskOption setHttpMethod(String httpMethod) {
            this.httpMethod = httpMethod;
            return this;
        }
        public String getHttpMethod() {
            return this.httpMethod;
        }

        public DescribeHostAvailabilityListResponseBodyTaskListNodeTaskConfigTaskOption setHttpNegative(Boolean httpNegative) {
            this.httpNegative = httpNegative;
            return this;
        }
        public Boolean getHttpNegative() {
            return this.httpNegative;
        }

        public DescribeHostAvailabilityListResponseBodyTaskListNodeTaskConfigTaskOption setHttpPostContent(String httpPostContent) {
            this.httpPostContent = httpPostContent;
            return this;
        }
        public String getHttpPostContent() {
            return this.httpPostContent;
        }

        public DescribeHostAvailabilityListResponseBodyTaskListNodeTaskConfigTaskOption setHttpResponseCharset(String httpResponseCharset) {
            this.httpResponseCharset = httpResponseCharset;
            return this;
        }
        public String getHttpResponseCharset() {
            return this.httpResponseCharset;
        }

        public DescribeHostAvailabilityListResponseBodyTaskListNodeTaskConfigTaskOption setHttpURI(String httpURI) {
            this.httpURI = httpURI;
            return this;
        }
        public String getHttpURI() {
            return this.httpURI;
        }

        public DescribeHostAvailabilityListResponseBodyTaskListNodeTaskConfigTaskOption setInterval(Integer interval) {
            this.interval = interval;
            return this;
        }
        public Integer getInterval() {
            return this.interval;
        }

        public DescribeHostAvailabilityListResponseBodyTaskListNodeTaskConfigTaskOption setTelnetOrPingHost(String telnetOrPingHost) {
            this.telnetOrPingHost = telnetOrPingHost;
            return this;
        }
        public String getTelnetOrPingHost() {
            return this.telnetOrPingHost;
        }

    }

    public static class DescribeHostAvailabilityListResponseBodyTaskListNodeTaskConfig extends TeaModel {
        /**
         * <p>The configurations of the alert rule.</p>
         */
        @NameInMap("AlertConfig")
        public DescribeHostAvailabilityListResponseBodyTaskListNodeTaskConfigAlertConfig alertConfig;

        /**
         * <p>Indicates whether the availability monitoring task is disabled. Valid values:</p>
         * <br>
         * <p>*   true: The availability monitoring task is disabled.</p>
         * <p>*   false: The availability monitoring task is enabled.</p>
         */
        @NameInMap("Disabled")
        public Boolean disabled;

        /**
         * <p>The ID of the application group.</p>
         */
        @NameInMap("GroupId")
        public Long groupId;

        /**
         * <p>The name of the application group.</p>
         */
        @NameInMap("GroupName")
        public String groupName;

        /**
         * <p>The ID of the availability monitoring task.</p>
         */
        @NameInMap("Id")
        public Long id;

        /**
         * <p>The ECS instances that are monitored.</p>
         */
        @NameInMap("Instances")
        public DescribeHostAvailabilityListResponseBodyTaskListNodeTaskConfigInstances instances;

        /**
         * <p>The name of the availability monitoring task.</p>
         */
        @NameInMap("TaskName")
        public String taskName;

        /**
         * <p>The optional parameters of the availability monitoring task.</p>
         */
        @NameInMap("TaskOption")
        public DescribeHostAvailabilityListResponseBodyTaskListNodeTaskConfigTaskOption taskOption;

        /**
         * <p>The range of instances that are monitored by the availability monitoring task. Valid values:</p>
         * <br>
         * <p>*   GROUP: All ECS instances in the application group are monitored.</p>
         * <p>*   GROUP_SPEC_INSTANCE: Specified ECS instances in the application group are monitored.</p>
         */
        @NameInMap("TaskScope")
        public String taskScope;

        /**
         * <p>The type of the availability monitoring task. Valid values:</p>
         * <br>
         * <p>*   PING</p>
         * <p>*   TELNET</p>
         * <p>*   HTTP</p>
         */
        @NameInMap("TaskType")
        public String taskType;

        public static DescribeHostAvailabilityListResponseBodyTaskListNodeTaskConfig build(java.util.Map<String, ?> map) throws Exception {
            DescribeHostAvailabilityListResponseBodyTaskListNodeTaskConfig self = new DescribeHostAvailabilityListResponseBodyTaskListNodeTaskConfig();
            return TeaModel.build(map, self);
        }

        public DescribeHostAvailabilityListResponseBodyTaskListNodeTaskConfig setAlertConfig(DescribeHostAvailabilityListResponseBodyTaskListNodeTaskConfigAlertConfig alertConfig) {
            this.alertConfig = alertConfig;
            return this;
        }
        public DescribeHostAvailabilityListResponseBodyTaskListNodeTaskConfigAlertConfig getAlertConfig() {
            return this.alertConfig;
        }

        public DescribeHostAvailabilityListResponseBodyTaskListNodeTaskConfig setDisabled(Boolean disabled) {
            this.disabled = disabled;
            return this;
        }
        public Boolean getDisabled() {
            return this.disabled;
        }

        public DescribeHostAvailabilityListResponseBodyTaskListNodeTaskConfig setGroupId(Long groupId) {
            this.groupId = groupId;
            return this;
        }
        public Long getGroupId() {
            return this.groupId;
        }

        public DescribeHostAvailabilityListResponseBodyTaskListNodeTaskConfig setGroupName(String groupName) {
            this.groupName = groupName;
            return this;
        }
        public String getGroupName() {
            return this.groupName;
        }

        public DescribeHostAvailabilityListResponseBodyTaskListNodeTaskConfig setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public DescribeHostAvailabilityListResponseBodyTaskListNodeTaskConfig setInstances(DescribeHostAvailabilityListResponseBodyTaskListNodeTaskConfigInstances instances) {
            this.instances = instances;
            return this;
        }
        public DescribeHostAvailabilityListResponseBodyTaskListNodeTaskConfigInstances getInstances() {
            return this.instances;
        }

        public DescribeHostAvailabilityListResponseBodyTaskListNodeTaskConfig setTaskName(String taskName) {
            this.taskName = taskName;
            return this;
        }
        public String getTaskName() {
            return this.taskName;
        }

        public DescribeHostAvailabilityListResponseBodyTaskListNodeTaskConfig setTaskOption(DescribeHostAvailabilityListResponseBodyTaskListNodeTaskConfigTaskOption taskOption) {
            this.taskOption = taskOption;
            return this;
        }
        public DescribeHostAvailabilityListResponseBodyTaskListNodeTaskConfigTaskOption getTaskOption() {
            return this.taskOption;
        }

        public DescribeHostAvailabilityListResponseBodyTaskListNodeTaskConfig setTaskScope(String taskScope) {
            this.taskScope = taskScope;
            return this;
        }
        public String getTaskScope() {
            return this.taskScope;
        }

        public DescribeHostAvailabilityListResponseBodyTaskListNodeTaskConfig setTaskType(String taskType) {
            this.taskType = taskType;
            return this;
        }
        public String getTaskType() {
            return this.taskType;
        }

    }

    public static class DescribeHostAvailabilityListResponseBodyTaskList extends TeaModel {
        @NameInMap("NodeTaskConfig")
        public java.util.List<DescribeHostAvailabilityListResponseBodyTaskListNodeTaskConfig> nodeTaskConfig;

        public static DescribeHostAvailabilityListResponseBodyTaskList build(java.util.Map<String, ?> map) throws Exception {
            DescribeHostAvailabilityListResponseBodyTaskList self = new DescribeHostAvailabilityListResponseBodyTaskList();
            return TeaModel.build(map, self);
        }

        public DescribeHostAvailabilityListResponseBodyTaskList setNodeTaskConfig(java.util.List<DescribeHostAvailabilityListResponseBodyTaskListNodeTaskConfig> nodeTaskConfig) {
            this.nodeTaskConfig = nodeTaskConfig;
            return this;
        }
        public java.util.List<DescribeHostAvailabilityListResponseBodyTaskListNodeTaskConfig> getNodeTaskConfig() {
            return this.nodeTaskConfig;
        }

    }

}
