// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20190101.models;

import com.aliyun.tea.*;

public class CreateGroupMonitoringAgentProcessRequest extends TeaModel {
    @NameInMap("GroupId")
    public String groupId;

    @NameInMap("ProcessName")
    public String processName;

    @NameInMap("MatchExpressFilterRelation")
    public String matchExpressFilterRelation;

    @NameInMap("MatchExpress")
    public java.util.List<CreateGroupMonitoringAgentProcessRequestMatchExpress> matchExpress;

    @NameInMap("AlertConfig")
    public java.util.List<CreateGroupMonitoringAgentProcessRequestAlertConfig> alertConfig;

    public static CreateGroupMonitoringAgentProcessRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateGroupMonitoringAgentProcessRequest self = new CreateGroupMonitoringAgentProcessRequest();
        return TeaModel.build(map, self);
    }

    public CreateGroupMonitoringAgentProcessRequest setGroupId(String groupId) {
        this.groupId = groupId;
        return this;
    }
    public String getGroupId() {
        return this.groupId;
    }

    public CreateGroupMonitoringAgentProcessRequest setProcessName(String processName) {
        this.processName = processName;
        return this;
    }
    public String getProcessName() {
        return this.processName;
    }

    public CreateGroupMonitoringAgentProcessRequest setMatchExpressFilterRelation(String matchExpressFilterRelation) {
        this.matchExpressFilterRelation = matchExpressFilterRelation;
        return this;
    }
    public String getMatchExpressFilterRelation() {
        return this.matchExpressFilterRelation;
    }

    public CreateGroupMonitoringAgentProcessRequest setMatchExpress(java.util.List<CreateGroupMonitoringAgentProcessRequestMatchExpress> matchExpress) {
        this.matchExpress = matchExpress;
        return this;
    }
    public java.util.List<CreateGroupMonitoringAgentProcessRequestMatchExpress> getMatchExpress() {
        return this.matchExpress;
    }

    public CreateGroupMonitoringAgentProcessRequest setAlertConfig(java.util.List<CreateGroupMonitoringAgentProcessRequestAlertConfig> alertConfig) {
        this.alertConfig = alertConfig;
        return this;
    }
    public java.util.List<CreateGroupMonitoringAgentProcessRequestAlertConfig> getAlertConfig() {
        return this.alertConfig;
    }

    public static class CreateGroupMonitoringAgentProcessRequestMatchExpress extends TeaModel {
        @NameInMap("Value")
        public String value;

        @NameInMap("Function")
        public String function;

        @NameInMap("Name")
        public String name;

        public static CreateGroupMonitoringAgentProcessRequestMatchExpress build(java.util.Map<String, ?> map) throws Exception {
            CreateGroupMonitoringAgentProcessRequestMatchExpress self = new CreateGroupMonitoringAgentProcessRequestMatchExpress();
            return TeaModel.build(map, self);
        }

        public CreateGroupMonitoringAgentProcessRequestMatchExpress setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

        public CreateGroupMonitoringAgentProcessRequestMatchExpress setFunction(String function) {
            this.function = function;
            return this;
        }
        public String getFunction() {
            return this.function;
        }

        public CreateGroupMonitoringAgentProcessRequestMatchExpress setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

    public static class CreateGroupMonitoringAgentProcessRequestAlertConfig extends TeaModel {
        @NameInMap("SilenceTime")
        public String silenceTime;

        @NameInMap("ComparisonOperator")
        public String comparisonOperator;

        @NameInMap("Webhook")
        public String webhook;

        @NameInMap("Times")
        public String times;

        @NameInMap("EscalationsLevel")
        public String escalationsLevel;

        @NameInMap("NoEffectiveInterval")
        public String noEffectiveInterval;

        @NameInMap("EffectiveInterval")
        public String effectiveInterval;

        @NameInMap("Threshold")
        public String threshold;

        @NameInMap("Statistics")
        public String statistics;

        public static CreateGroupMonitoringAgentProcessRequestAlertConfig build(java.util.Map<String, ?> map) throws Exception {
            CreateGroupMonitoringAgentProcessRequestAlertConfig self = new CreateGroupMonitoringAgentProcessRequestAlertConfig();
            return TeaModel.build(map, self);
        }

        public CreateGroupMonitoringAgentProcessRequestAlertConfig setSilenceTime(String silenceTime) {
            this.silenceTime = silenceTime;
            return this;
        }
        public String getSilenceTime() {
            return this.silenceTime;
        }

        public CreateGroupMonitoringAgentProcessRequestAlertConfig setComparisonOperator(String comparisonOperator) {
            this.comparisonOperator = comparisonOperator;
            return this;
        }
        public String getComparisonOperator() {
            return this.comparisonOperator;
        }

        public CreateGroupMonitoringAgentProcessRequestAlertConfig setWebhook(String webhook) {
            this.webhook = webhook;
            return this;
        }
        public String getWebhook() {
            return this.webhook;
        }

        public CreateGroupMonitoringAgentProcessRequestAlertConfig setTimes(String times) {
            this.times = times;
            return this;
        }
        public String getTimes() {
            return this.times;
        }

        public CreateGroupMonitoringAgentProcessRequestAlertConfig setEscalationsLevel(String escalationsLevel) {
            this.escalationsLevel = escalationsLevel;
            return this;
        }
        public String getEscalationsLevel() {
            return this.escalationsLevel;
        }

        public CreateGroupMonitoringAgentProcessRequestAlertConfig setNoEffectiveInterval(String noEffectiveInterval) {
            this.noEffectiveInterval = noEffectiveInterval;
            return this;
        }
        public String getNoEffectiveInterval() {
            return this.noEffectiveInterval;
        }

        public CreateGroupMonitoringAgentProcessRequestAlertConfig setEffectiveInterval(String effectiveInterval) {
            this.effectiveInterval = effectiveInterval;
            return this;
        }
        public String getEffectiveInterval() {
            return this.effectiveInterval;
        }

        public CreateGroupMonitoringAgentProcessRequestAlertConfig setThreshold(String threshold) {
            this.threshold = threshold;
            return this;
        }
        public String getThreshold() {
            return this.threshold;
        }

        public CreateGroupMonitoringAgentProcessRequestAlertConfig setStatistics(String statistics) {
            this.statistics = statistics;
            return this;
        }
        public String getStatistics() {
            return this.statistics;
        }

    }

}
