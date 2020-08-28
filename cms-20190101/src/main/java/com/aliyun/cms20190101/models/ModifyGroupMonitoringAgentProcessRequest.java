// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20190101.models;

import com.aliyun.tea.*;

public class ModifyGroupMonitoringAgentProcessRequest extends TeaModel {
    @NameInMap("Id")
    @Validation(required = true)
    public String id;

    @NameInMap("GroupId")
    @Validation(required = true)
    public String groupId;

    @NameInMap("MatchExpressFilterRelation")
    public String matchExpressFilterRelation;

    @NameInMap("AlertConfig")
    @Validation(required = true)
    public java.util.List<ModifyGroupMonitoringAgentProcessRequestAlertConfig> alertConfig;

    public static ModifyGroupMonitoringAgentProcessRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyGroupMonitoringAgentProcessRequest self = new ModifyGroupMonitoringAgentProcessRequest();
        return TeaModel.build(map, self);
    }

    public static class ModifyGroupMonitoringAgentProcessRequestAlertConfig extends TeaModel {
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

        public static ModifyGroupMonitoringAgentProcessRequestAlertConfig build(java.util.Map<String, ?> map) throws Exception {
            ModifyGroupMonitoringAgentProcessRequestAlertConfig self = new ModifyGroupMonitoringAgentProcessRequestAlertConfig();
            return TeaModel.build(map, self);
        }

    }

}
