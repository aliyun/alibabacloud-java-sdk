// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20190101.models;

import com.aliyun.tea.*;

public class CreateHostAvailabilityRequest extends TeaModel {
    @NameInMap("GroupId")
    @Validation(required = true)
    public Long groupId;

    @NameInMap("TaskName")
    @Validation(required = true)
    public String taskName;

    @NameInMap("TaskScope")
    public String taskScope;

    @NameInMap("TaskType")
    @Validation(required = true)
    public String taskType;

    @NameInMap("TaskOption")
    @Validation(required = true)
    public CreateHostAvailabilityRequestTaskOption taskOption;

    @NameInMap("AlertConfig")
    @Validation(required = true)
    public CreateHostAvailabilityRequestAlertConfig alertConfig;

    @NameInMap("AlertConfigEscalationList")
    @Validation(required = true)
    public java.util.List<CreateHostAvailabilityRequestAlertConfigEscalationList> alertConfigEscalationList;

    @NameInMap("InstanceList")
    public java.util.List<String> instanceList;

    public static CreateHostAvailabilityRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateHostAvailabilityRequest self = new CreateHostAvailabilityRequest();
        return TeaModel.build(map, self);
    }

    public static class CreateHostAvailabilityRequestTaskOption extends TeaModel {
        @NameInMap("HttpURI")
        public String httpURI;

        @NameInMap("TelnetOrPingHost")
        public String telnetOrPingHost;

        @NameInMap("HttpResponseCharset")
        public String httpResponseCharset;

        @NameInMap("HttpResponseMatchContent")
        public String httpResponseMatchContent;

        @NameInMap("HttpMethod")
        public String httpMethod;

        @NameInMap("HttpNegative")
        public Boolean httpNegative;

        public static CreateHostAvailabilityRequestTaskOption build(java.util.Map<String, ?> map) throws Exception {
            CreateHostAvailabilityRequestTaskOption self = new CreateHostAvailabilityRequestTaskOption();
            return TeaModel.build(map, self);
        }

    }

    public static class CreateHostAvailabilityRequestAlertConfig extends TeaModel {
        @NameInMap("NotifyType")
        @Validation(required = true)
        public Integer notifyType;

        @NameInMap("StartTime")
        public Integer startTime;

        @NameInMap("EndTime")
        public Integer endTime;

        @NameInMap("SilenceTime")
        public Integer silenceTime;

        @NameInMap("WebHook")
        public String webHook;

        public static CreateHostAvailabilityRequestAlertConfig build(java.util.Map<String, ?> map) throws Exception {
            CreateHostAvailabilityRequestAlertConfig self = new CreateHostAvailabilityRequestAlertConfig();
            return TeaModel.build(map, self);
        }

    }

    public static class CreateHostAvailabilityRequestAlertConfigEscalationList extends TeaModel {
        @NameInMap("MetricName")
        @Validation(required = true)
        public String metricName;

        @NameInMap("Aggregate")
        @Validation(required = true)
        public String aggregate;

        @NameInMap("Times")
        @Validation(required = true)
        public Integer times;

        @NameInMap("Operator")
        @Validation(required = true)
        public String operator;

        @NameInMap("Value")
        @Validation(required = true)
        public String value;

        public static CreateHostAvailabilityRequestAlertConfigEscalationList build(java.util.Map<String, ?> map) throws Exception {
            CreateHostAvailabilityRequestAlertConfigEscalationList self = new CreateHostAvailabilityRequestAlertConfigEscalationList();
            return TeaModel.build(map, self);
        }

    }

}
