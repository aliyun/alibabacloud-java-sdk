// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20190101.models;

import com.aliyun.tea.*;

public class DescribeHostAvailabilityListResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Total")
    public Integer total;

    @NameInMap("Success")
    public Boolean success;

    @NameInMap("TaskList")
    public DescribeHostAvailabilityListResponseBodyTaskList taskList;

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

    public DescribeHostAvailabilityListResponseBody setTotal(Integer total) {
        this.total = total;
        return this;
    }
    public Integer getTotal() {
        return this.total;
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
        @NameInMap("HttpMethod")
        public String httpMethod;

        @NameInMap("Interval")
        public Integer interval;

        @NameInMap("HttpURI")
        public String httpURI;

        @NameInMap("TelnetOrPingHost")
        public String telnetOrPingHost;

        @NameInMap("HttpResponseCharset")
        public String httpResponseCharset;

        @NameInMap("HttpPostContent")
        public String httpPostContent;

        @NameInMap("HttpNegative")
        public Boolean httpNegative;

        @NameInMap("HttpKeyword")
        public String httpKeyword;

        public static DescribeHostAvailabilityListResponseBodyTaskListNodeTaskConfigTaskOption build(java.util.Map<String, ?> map) throws Exception {
            DescribeHostAvailabilityListResponseBodyTaskListNodeTaskConfigTaskOption self = new DescribeHostAvailabilityListResponseBodyTaskListNodeTaskConfigTaskOption();
            return TeaModel.build(map, self);
        }

        public DescribeHostAvailabilityListResponseBodyTaskListNodeTaskConfigTaskOption setHttpMethod(String httpMethod) {
            this.httpMethod = httpMethod;
            return this;
        }
        public String getHttpMethod() {
            return this.httpMethod;
        }

        public DescribeHostAvailabilityListResponseBodyTaskListNodeTaskConfigTaskOption setInterval(Integer interval) {
            this.interval = interval;
            return this;
        }
        public Integer getInterval() {
            return this.interval;
        }

        public DescribeHostAvailabilityListResponseBodyTaskListNodeTaskConfigTaskOption setHttpURI(String httpURI) {
            this.httpURI = httpURI;
            return this;
        }
        public String getHttpURI() {
            return this.httpURI;
        }

        public DescribeHostAvailabilityListResponseBodyTaskListNodeTaskConfigTaskOption setTelnetOrPingHost(String telnetOrPingHost) {
            this.telnetOrPingHost = telnetOrPingHost;
            return this;
        }
        public String getTelnetOrPingHost() {
            return this.telnetOrPingHost;
        }

        public DescribeHostAvailabilityListResponseBodyTaskListNodeTaskConfigTaskOption setHttpResponseCharset(String httpResponseCharset) {
            this.httpResponseCharset = httpResponseCharset;
            return this;
        }
        public String getHttpResponseCharset() {
            return this.httpResponseCharset;
        }

        public DescribeHostAvailabilityListResponseBodyTaskListNodeTaskConfigTaskOption setHttpPostContent(String httpPostContent) {
            this.httpPostContent = httpPostContent;
            return this;
        }
        public String getHttpPostContent() {
            return this.httpPostContent;
        }

        public DescribeHostAvailabilityListResponseBodyTaskListNodeTaskConfigTaskOption setHttpNegative(Boolean httpNegative) {
            this.httpNegative = httpNegative;
            return this;
        }
        public Boolean getHttpNegative() {
            return this.httpNegative;
        }

        public DescribeHostAvailabilityListResponseBodyTaskListNodeTaskConfigTaskOption setHttpKeyword(String httpKeyword) {
            this.httpKeyword = httpKeyword;
            return this;
        }
        public String getHttpKeyword() {
            return this.httpKeyword;
        }

    }

    public static class DescribeHostAvailabilityListResponseBodyTaskListNodeTaskConfigAlertConfigEscalationListEscalationList extends TeaModel {
        @NameInMap("Value")
        public String value;

        @NameInMap("MetricName")
        public String metricName;

        @NameInMap("Operator")
        public String operator;

        @NameInMap("Times")
        public String times;

        @NameInMap("Aggregate")
        public String aggregate;

        public static DescribeHostAvailabilityListResponseBodyTaskListNodeTaskConfigAlertConfigEscalationListEscalationList build(java.util.Map<String, ?> map) throws Exception {
            DescribeHostAvailabilityListResponseBodyTaskListNodeTaskConfigAlertConfigEscalationListEscalationList self = new DescribeHostAvailabilityListResponseBodyTaskListNodeTaskConfigAlertConfigEscalationListEscalationList();
            return TeaModel.build(map, self);
        }

        public DescribeHostAvailabilityListResponseBodyTaskListNodeTaskConfigAlertConfigEscalationListEscalationList setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
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

        public DescribeHostAvailabilityListResponseBodyTaskListNodeTaskConfigAlertConfigEscalationListEscalationList setAggregate(String aggregate) {
            this.aggregate = aggregate;
            return this;
        }
        public String getAggregate() {
            return this.aggregate;
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

    public static class DescribeHostAvailabilityListResponseBodyTaskListNodeTaskConfigAlertConfig extends TeaModel {
        @NameInMap("SilenceTime")
        public Integer silenceTime;

        @NameInMap("EndTime")
        public Integer endTime;

        @NameInMap("StartTime")
        public Integer startTime;

        @NameInMap("WebHook")
        public String webHook;

        @NameInMap("NotifyType")
        public Integer notifyType;

        @NameInMap("EscalationList")
        public DescribeHostAvailabilityListResponseBodyTaskListNodeTaskConfigAlertConfigEscalationList escalationList;

        public static DescribeHostAvailabilityListResponseBodyTaskListNodeTaskConfigAlertConfig build(java.util.Map<String, ?> map) throws Exception {
            DescribeHostAvailabilityListResponseBodyTaskListNodeTaskConfigAlertConfig self = new DescribeHostAvailabilityListResponseBodyTaskListNodeTaskConfigAlertConfig();
            return TeaModel.build(map, self);
        }

        public DescribeHostAvailabilityListResponseBodyTaskListNodeTaskConfigAlertConfig setSilenceTime(Integer silenceTime) {
            this.silenceTime = silenceTime;
            return this;
        }
        public Integer getSilenceTime() {
            return this.silenceTime;
        }

        public DescribeHostAvailabilityListResponseBodyTaskListNodeTaskConfigAlertConfig setEndTime(Integer endTime) {
            this.endTime = endTime;
            return this;
        }
        public Integer getEndTime() {
            return this.endTime;
        }

        public DescribeHostAvailabilityListResponseBodyTaskListNodeTaskConfigAlertConfig setStartTime(Integer startTime) {
            this.startTime = startTime;
            return this;
        }
        public Integer getStartTime() {
            return this.startTime;
        }

        public DescribeHostAvailabilityListResponseBodyTaskListNodeTaskConfigAlertConfig setWebHook(String webHook) {
            this.webHook = webHook;
            return this;
        }
        public String getWebHook() {
            return this.webHook;
        }

        public DescribeHostAvailabilityListResponseBodyTaskListNodeTaskConfigAlertConfig setNotifyType(Integer notifyType) {
            this.notifyType = notifyType;
            return this;
        }
        public Integer getNotifyType() {
            return this.notifyType;
        }

        public DescribeHostAvailabilityListResponseBodyTaskListNodeTaskConfigAlertConfig setEscalationList(DescribeHostAvailabilityListResponseBodyTaskListNodeTaskConfigAlertConfigEscalationList escalationList) {
            this.escalationList = escalationList;
            return this;
        }
        public DescribeHostAvailabilityListResponseBodyTaskListNodeTaskConfigAlertConfigEscalationList getEscalationList() {
            return this.escalationList;
        }

    }

    public static class DescribeHostAvailabilityListResponseBodyTaskListNodeTaskConfig extends TeaModel {
        @NameInMap("TaskType")
        public String taskType;

        @NameInMap("GroupName")
        public String groupName;

        @NameInMap("GroupId")
        public Long groupId;

        @NameInMap("TaskName")
        public String taskName;

        @NameInMap("Disabled")
        public Boolean disabled;

        @NameInMap("TaskScope")
        public String taskScope;

        @NameInMap("Id")
        public Long id;

        @NameInMap("Instances")
        public DescribeHostAvailabilityListResponseBodyTaskListNodeTaskConfigInstances instances;

        @NameInMap("TaskOption")
        public DescribeHostAvailabilityListResponseBodyTaskListNodeTaskConfigTaskOption taskOption;

        @NameInMap("AlertConfig")
        public DescribeHostAvailabilityListResponseBodyTaskListNodeTaskConfigAlertConfig alertConfig;

        public static DescribeHostAvailabilityListResponseBodyTaskListNodeTaskConfig build(java.util.Map<String, ?> map) throws Exception {
            DescribeHostAvailabilityListResponseBodyTaskListNodeTaskConfig self = new DescribeHostAvailabilityListResponseBodyTaskListNodeTaskConfig();
            return TeaModel.build(map, self);
        }

        public DescribeHostAvailabilityListResponseBodyTaskListNodeTaskConfig setTaskType(String taskType) {
            this.taskType = taskType;
            return this;
        }
        public String getTaskType() {
            return this.taskType;
        }

        public DescribeHostAvailabilityListResponseBodyTaskListNodeTaskConfig setGroupName(String groupName) {
            this.groupName = groupName;
            return this;
        }
        public String getGroupName() {
            return this.groupName;
        }

        public DescribeHostAvailabilityListResponseBodyTaskListNodeTaskConfig setGroupId(Long groupId) {
            this.groupId = groupId;
            return this;
        }
        public Long getGroupId() {
            return this.groupId;
        }

        public DescribeHostAvailabilityListResponseBodyTaskListNodeTaskConfig setTaskName(String taskName) {
            this.taskName = taskName;
            return this;
        }
        public String getTaskName() {
            return this.taskName;
        }

        public DescribeHostAvailabilityListResponseBodyTaskListNodeTaskConfig setDisabled(Boolean disabled) {
            this.disabled = disabled;
            return this;
        }
        public Boolean getDisabled() {
            return this.disabled;
        }

        public DescribeHostAvailabilityListResponseBodyTaskListNodeTaskConfig setTaskScope(String taskScope) {
            this.taskScope = taskScope;
            return this;
        }
        public String getTaskScope() {
            return this.taskScope;
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

        public DescribeHostAvailabilityListResponseBodyTaskListNodeTaskConfig setTaskOption(DescribeHostAvailabilityListResponseBodyTaskListNodeTaskConfigTaskOption taskOption) {
            this.taskOption = taskOption;
            return this;
        }
        public DescribeHostAvailabilityListResponseBodyTaskListNodeTaskConfigTaskOption getTaskOption() {
            return this.taskOption;
        }

        public DescribeHostAvailabilityListResponseBodyTaskListNodeTaskConfig setAlertConfig(DescribeHostAvailabilityListResponseBodyTaskListNodeTaskConfigAlertConfig alertConfig) {
            this.alertConfig = alertConfig;
            return this;
        }
        public DescribeHostAvailabilityListResponseBodyTaskListNodeTaskConfigAlertConfig getAlertConfig() {
            return this.alertConfig;
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
