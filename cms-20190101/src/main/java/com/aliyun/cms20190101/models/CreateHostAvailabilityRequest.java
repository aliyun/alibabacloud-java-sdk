// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20190101.models;

import com.aliyun.tea.*;

public class CreateHostAvailabilityRequest extends TeaModel {
    @NameInMap("AlertConfig")
    public CreateHostAvailabilityRequestAlertConfig alertConfig;

    @NameInMap("TaskOption")
    public CreateHostAvailabilityRequestTaskOption taskOption;

    @NameInMap("AlertConfigEscalationList")
    public java.util.List<CreateHostAvailabilityRequestAlertConfigEscalationList> alertConfigEscalationList;

    @NameInMap("GroupId")
    public Long groupId;

    @NameInMap("InstanceList")
    public java.util.List<String> instanceList;

    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("TaskName")
    public String taskName;

    @NameInMap("TaskScope")
    public String taskScope;

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
        @NameInMap("EndTime")
        public Integer endTime;

        @NameInMap("NotifyType")
        public Integer notifyType;

        @NameInMap("SilenceTime")
        public Integer silenceTime;

        @NameInMap("StartTime")
        public Integer startTime;

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
        @NameInMap("HttpHeader")
        public String httpHeader;

        @NameInMap("HttpMethod")
        public String httpMethod;

        @NameInMap("HttpNegative")
        public Boolean httpNegative;

        @NameInMap("HttpPostContent")
        public String httpPostContent;

        @NameInMap("HttpResponseCharset")
        public String httpResponseCharset;

        @NameInMap("HttpResponseMatchContent")
        public String httpResponseMatchContent;

        @NameInMap("HttpURI")
        public String httpURI;

        @NameInMap("Interval")
        public Integer interval;

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
        @NameInMap("Aggregate")
        public String aggregate;

        @NameInMap("MetricName")
        public String metricName;

        @NameInMap("Operator")
        public String operator;

        @NameInMap("Times")
        public Integer times;

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

}
