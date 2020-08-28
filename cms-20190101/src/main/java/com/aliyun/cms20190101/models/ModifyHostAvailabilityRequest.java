// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20190101.models;

import com.aliyun.tea.*;

public class ModifyHostAvailabilityRequest extends TeaModel {
    @NameInMap("GroupId")
    @Validation(required = true)
    public Long groupId;

    @NameInMap("Id")
    @Validation(required = true)
    public Long id;

    @NameInMap("TaskName")
    @Validation(required = true)
    public String taskName;

    @NameInMap("TaskScope")
    public String taskScope;

    @NameInMap("TaskOption")
    @Validation(required = true)
    public ModifyHostAvailabilityRequestTaskOption taskOption;

    @NameInMap("AlertConfig")
    @Validation(required = true)
    public ModifyHostAvailabilityRequestAlertConfig alertConfig;

    @NameInMap("AlertConfigEscalationList")
    @Validation(required = true)
    public java.util.List<ModifyHostAvailabilityRequestAlertConfigEscalationList> alertConfigEscalationList;

    @NameInMap("InstanceList")
    public java.util.List<String> instanceList;

    public static ModifyHostAvailabilityRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyHostAvailabilityRequest self = new ModifyHostAvailabilityRequest();
        return TeaModel.build(map, self);
    }

    public static class ModifyHostAvailabilityRequestTaskOption extends TeaModel {
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

        public static ModifyHostAvailabilityRequestTaskOption build(java.util.Map<String, ?> map) throws Exception {
            ModifyHostAvailabilityRequestTaskOption self = new ModifyHostAvailabilityRequestTaskOption();
            return TeaModel.build(map, self);
        }

    }

    public static class ModifyHostAvailabilityRequestAlertConfig extends TeaModel {
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

        public static ModifyHostAvailabilityRequestAlertConfig build(java.util.Map<String, ?> map) throws Exception {
            ModifyHostAvailabilityRequestAlertConfig self = new ModifyHostAvailabilityRequestAlertConfig();
            return TeaModel.build(map, self);
        }

    }

    public static class ModifyHostAvailabilityRequestAlertConfigEscalationList extends TeaModel {
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

        public static ModifyHostAvailabilityRequestAlertConfigEscalationList build(java.util.Map<String, ?> map) throws Exception {
            ModifyHostAvailabilityRequestAlertConfigEscalationList self = new ModifyHostAvailabilityRequestAlertConfigEscalationList();
            return TeaModel.build(map, self);
        }

    }

}
