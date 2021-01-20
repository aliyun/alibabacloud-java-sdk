// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20190101.models;

import com.aliyun.tea.*;

public class ModifyHostAvailabilityRequest extends TeaModel {
    @NameInMap("TaskOption")
    public ModifyHostAvailabilityRequestTaskOption taskOption;

    @NameInMap("AlertConfig")
    public ModifyHostAvailabilityRequestAlertConfig alertConfig;

    @NameInMap("GroupId")
    public Long groupId;

    @NameInMap("Id")
    public Long id;

    @NameInMap("TaskName")
    public String taskName;

    @NameInMap("TaskScope")
    public String taskScope;

    @NameInMap("AlertConfigEscalationList")
    public java.util.List<ModifyHostAvailabilityRequestAlertConfigEscalationList> alertConfigEscalationList;

    @NameInMap("InstanceList")
    public java.util.List<String> instanceList;

    public static ModifyHostAvailabilityRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyHostAvailabilityRequest self = new ModifyHostAvailabilityRequest();
        return TeaModel.build(map, self);
    }

    public ModifyHostAvailabilityRequest setTaskOption(ModifyHostAvailabilityRequestTaskOption taskOption) {
        this.taskOption = taskOption;
        return this;
    }
    public ModifyHostAvailabilityRequestTaskOption getTaskOption() {
        return this.taskOption;
    }

    public ModifyHostAvailabilityRequest setAlertConfig(ModifyHostAvailabilityRequestAlertConfig alertConfig) {
        this.alertConfig = alertConfig;
        return this;
    }
    public ModifyHostAvailabilityRequestAlertConfig getAlertConfig() {
        return this.alertConfig;
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

    public ModifyHostAvailabilityRequest setAlertConfigEscalationList(java.util.List<ModifyHostAvailabilityRequestAlertConfigEscalationList> alertConfigEscalationList) {
        this.alertConfigEscalationList = alertConfigEscalationList;
        return this;
    }
    public java.util.List<ModifyHostAvailabilityRequestAlertConfigEscalationList> getAlertConfigEscalationList() {
        return this.alertConfigEscalationList;
    }

    public ModifyHostAvailabilityRequest setInstanceList(java.util.List<String> instanceList) {
        this.instanceList = instanceList;
        return this;
    }
    public java.util.List<String> getInstanceList() {
        return this.instanceList;
    }

    public static class ModifyHostAvailabilityRequestTaskOption extends TeaModel {
        @NameInMap("HttpURI")
        public String httpURI;

        @NameInMap("TelnetOrPingHost")
        public String telnetOrPingHost;

        @NameInMap("HttpResponseCharset")
        public String httpResponseCharset;

        @NameInMap("HttpPostContent")
        public String httpPostContent;

        @NameInMap("HttpResponseMatchContent")
        public String httpResponseMatchContent;

        @NameInMap("HttpMethod")
        public String httpMethod;

        @NameInMap("HttpNegative")
        public Boolean httpNegative;

        public static ModifyHostAvailabilityRequestTaskOption build(java.util.Map<String, ?> map) throws Exception {
            ModifyHostAvailabilityRequestTaskOption self = new ModifyHostAvailabilityRequestTaskOption();
            return TeaModel.build(map, self);
        }

        public ModifyHostAvailabilityRequestTaskOption setHttpURI(String httpURI) {
            this.httpURI = httpURI;
            return this;
        }
        public String getHttpURI() {
            return this.httpURI;
        }

        public ModifyHostAvailabilityRequestTaskOption setTelnetOrPingHost(String telnetOrPingHost) {
            this.telnetOrPingHost = telnetOrPingHost;
            return this;
        }
        public String getTelnetOrPingHost() {
            return this.telnetOrPingHost;
        }

        public ModifyHostAvailabilityRequestTaskOption setHttpResponseCharset(String httpResponseCharset) {
            this.httpResponseCharset = httpResponseCharset;
            return this;
        }
        public String getHttpResponseCharset() {
            return this.httpResponseCharset;
        }

        public ModifyHostAvailabilityRequestTaskOption setHttpPostContent(String httpPostContent) {
            this.httpPostContent = httpPostContent;
            return this;
        }
        public String getHttpPostContent() {
            return this.httpPostContent;
        }

        public ModifyHostAvailabilityRequestTaskOption setHttpResponseMatchContent(String httpResponseMatchContent) {
            this.httpResponseMatchContent = httpResponseMatchContent;
            return this;
        }
        public String getHttpResponseMatchContent() {
            return this.httpResponseMatchContent;
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

    }

    public static class ModifyHostAvailabilityRequestAlertConfig extends TeaModel {
        @NameInMap("NotifyType")
        public Integer notifyType;

        @NameInMap("StartTime")
        public Integer startTime;

        @NameInMap("EndTime")
        public Integer endTime;

        @NameInMap("SilenceTime")
        public Integer silenceTime;

        @NameInMap("WebHook")
        public String webHook;

        public static ModifyHostAvailabilityRequestAlertConfig build(java.util.Map<String, ?> map) throws Exception {
            ModifyHostAvailabilityRequestAlertConfig self = new ModifyHostAvailabilityRequestAlertConfig();
            return TeaModel.build(map, self);
        }

        public ModifyHostAvailabilityRequestAlertConfig setNotifyType(Integer notifyType) {
            this.notifyType = notifyType;
            return this;
        }
        public Integer getNotifyType() {
            return this.notifyType;
        }

        public ModifyHostAvailabilityRequestAlertConfig setStartTime(Integer startTime) {
            this.startTime = startTime;
            return this;
        }
        public Integer getStartTime() {
            return this.startTime;
        }

        public ModifyHostAvailabilityRequestAlertConfig setEndTime(Integer endTime) {
            this.endTime = endTime;
            return this;
        }
        public Integer getEndTime() {
            return this.endTime;
        }

        public ModifyHostAvailabilityRequestAlertConfig setSilenceTime(Integer silenceTime) {
            this.silenceTime = silenceTime;
            return this;
        }
        public Integer getSilenceTime() {
            return this.silenceTime;
        }

        public ModifyHostAvailabilityRequestAlertConfig setWebHook(String webHook) {
            this.webHook = webHook;
            return this;
        }
        public String getWebHook() {
            return this.webHook;
        }

    }

    public static class ModifyHostAvailabilityRequestAlertConfigEscalationList extends TeaModel {
        @NameInMap("Value")
        public String value;

        @NameInMap("MetricName")
        public String metricName;

        @NameInMap("Times")
        public Integer times;

        @NameInMap("Operator")
        public String operator;

        @NameInMap("Aggregate")
        public String aggregate;

        public static ModifyHostAvailabilityRequestAlertConfigEscalationList build(java.util.Map<String, ?> map) throws Exception {
            ModifyHostAvailabilityRequestAlertConfigEscalationList self = new ModifyHostAvailabilityRequestAlertConfigEscalationList();
            return TeaModel.build(map, self);
        }

        public ModifyHostAvailabilityRequestAlertConfigEscalationList setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

        public ModifyHostAvailabilityRequestAlertConfigEscalationList setMetricName(String metricName) {
            this.metricName = metricName;
            return this;
        }
        public String getMetricName() {
            return this.metricName;
        }

        public ModifyHostAvailabilityRequestAlertConfigEscalationList setTimes(Integer times) {
            this.times = times;
            return this;
        }
        public Integer getTimes() {
            return this.times;
        }

        public ModifyHostAvailabilityRequestAlertConfigEscalationList setOperator(String operator) {
            this.operator = operator;
            return this;
        }
        public String getOperator() {
            return this.operator;
        }

        public ModifyHostAvailabilityRequestAlertConfigEscalationList setAggregate(String aggregate) {
            this.aggregate = aggregate;
            return this;
        }
        public String getAggregate() {
            return this.aggregate;
        }

    }

}
