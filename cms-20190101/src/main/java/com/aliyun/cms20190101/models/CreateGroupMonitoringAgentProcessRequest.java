// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20190101.models;

import com.aliyun.tea.*;

public class CreateGroupMonitoringAgentProcessRequest extends TeaModel {
    @NameInMap("GroupId")
    @Validation(required = true)
    public String groupId;

    @NameInMap("ProcessName")
    public String processName;

    @NameInMap("MatchExpressFilterRelation")
    public String matchExpressFilterRelation;

    @NameInMap("MatchExpress")
    public java.util.List<CreateGroupMonitoringAgentProcessRequestMatchExpress> matchExpress;

    @NameInMap("AlertConfig")
    @Validation(required = true)
    public java.util.List<CreateGroupMonitoringAgentProcessRequestAlertConfig> alertConfig;

    public static CreateGroupMonitoringAgentProcessRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateGroupMonitoringAgentProcessRequest self = new CreateGroupMonitoringAgentProcessRequest();
        return TeaModel.build(map, self);
    }

    public static class CreateGroupMonitoringAgentProcessRequestMatchExpress extends TeaModel {
        @NameInMap("Name")
        public String name;

        @NameInMap("Function")
        public String function;

        @NameInMap("Value")
        public String value;

        public static CreateGroupMonitoringAgentProcessRequestMatchExpress build(java.util.Map<String, ?> map) throws Exception {
            CreateGroupMonitoringAgentProcessRequestMatchExpress self = new CreateGroupMonitoringAgentProcessRequestMatchExpress();
            return TeaModel.build(map, self);
        }

    }

    public static class CreateGroupMonitoringAgentProcessRequestAlertConfig extends TeaModel {
        @NameInMap("EffectiveInterval")
        @Validation(required = true)
        public String effectiveInterval;

        @NameInMap("NoEffectiveInterval")
        @Validation(required = true)
        public String noEffectiveInterval;

        @NameInMap("SilenceTime")
        @Validation(required = true)
        public String silenceTime;

        @NameInMap("Webhook")
        @Validation(required = true)
        public String webhook;

        @NameInMap("EscalationsLevel")
        @Validation(required = true)
        public String escalationsLevel;

        @NameInMap("ComparisonOperator")
        @Validation(required = true)
        public String comparisonOperator;

        @NameInMap("Statistics")
        @Validation(required = true)
        public String statistics;

        @NameInMap("Threshold")
        @Validation(required = true)
        public String threshold;

        @NameInMap("Times")
        @Validation(required = true)
        public String times;

        public static CreateGroupMonitoringAgentProcessRequestAlertConfig build(java.util.Map<String, ?> map) throws Exception {
            CreateGroupMonitoringAgentProcessRequestAlertConfig self = new CreateGroupMonitoringAgentProcessRequestAlertConfig();
            return TeaModel.build(map, self);
        }

    }

}
