// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20190101.models;

import com.aliyun.tea.*;

public class CreateGroupMonitoringAgentProcessRequest extends TeaModel {
    @NameInMap("AlertConfig")
    public java.util.List<CreateGroupMonitoringAgentProcessRequestAlertConfig> alertConfig;

    @NameInMap("GroupId")
    public String groupId;

    @NameInMap("MatchExpress")
    public java.util.List<CreateGroupMonitoringAgentProcessRequestMatchExpress> matchExpress;

    @NameInMap("MatchExpressFilterRelation")
    public String matchExpressFilterRelation;

    @NameInMap("ProcessName")
    public String processName;

    @NameInMap("RegionId")
    public String regionId;

    public static CreateGroupMonitoringAgentProcessRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateGroupMonitoringAgentProcessRequest self = new CreateGroupMonitoringAgentProcessRequest();
        return TeaModel.build(map, self);
    }

    public CreateGroupMonitoringAgentProcessRequest setAlertConfig(java.util.List<CreateGroupMonitoringAgentProcessRequestAlertConfig> alertConfig) {
        this.alertConfig = alertConfig;
        return this;
    }
    public java.util.List<CreateGroupMonitoringAgentProcessRequestAlertConfig> getAlertConfig() {
        return this.alertConfig;
    }

    public CreateGroupMonitoringAgentProcessRequest setGroupId(String groupId) {
        this.groupId = groupId;
        return this;
    }
    public String getGroupId() {
        return this.groupId;
    }

    public CreateGroupMonitoringAgentProcessRequest setMatchExpress(java.util.List<CreateGroupMonitoringAgentProcessRequestMatchExpress> matchExpress) {
        this.matchExpress = matchExpress;
        return this;
    }
    public java.util.List<CreateGroupMonitoringAgentProcessRequestMatchExpress> getMatchExpress() {
        return this.matchExpress;
    }

    public CreateGroupMonitoringAgentProcessRequest setMatchExpressFilterRelation(String matchExpressFilterRelation) {
        this.matchExpressFilterRelation = matchExpressFilterRelation;
        return this;
    }
    public String getMatchExpressFilterRelation() {
        return this.matchExpressFilterRelation;
    }

    public CreateGroupMonitoringAgentProcessRequest setProcessName(String processName) {
        this.processName = processName;
        return this;
    }
    public String getProcessName() {
        return this.processName;
    }

    public CreateGroupMonitoringAgentProcessRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public static class CreateGroupMonitoringAgentProcessRequestAlertConfig extends TeaModel {
        @NameInMap("ComparisonOperator")
        public String comparisonOperator;

        @NameInMap("EffectiveInterval")
        public String effectiveInterval;

        @NameInMap("EscalationsLevel")
        public String escalationsLevel;

        @NameInMap("NoEffectiveInterval")
        public String noEffectiveInterval;

        @NameInMap("SilenceTime")
        public String silenceTime;

        @NameInMap("Statistics")
        public String statistics;

        @NameInMap("Threshold")
        public String threshold;

        @NameInMap("Times")
        public String times;

        @NameInMap("Webhook")
        public String webhook;

        public static CreateGroupMonitoringAgentProcessRequestAlertConfig build(java.util.Map<String, ?> map) throws Exception {
            CreateGroupMonitoringAgentProcessRequestAlertConfig self = new CreateGroupMonitoringAgentProcessRequestAlertConfig();
            return TeaModel.build(map, self);
        }

        public CreateGroupMonitoringAgentProcessRequestAlertConfig setComparisonOperator(String comparisonOperator) {
            this.comparisonOperator = comparisonOperator;
            return this;
        }
        public String getComparisonOperator() {
            return this.comparisonOperator;
        }

        public CreateGroupMonitoringAgentProcessRequestAlertConfig setEffectiveInterval(String effectiveInterval) {
            this.effectiveInterval = effectiveInterval;
            return this;
        }
        public String getEffectiveInterval() {
            return this.effectiveInterval;
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

        public CreateGroupMonitoringAgentProcessRequestAlertConfig setSilenceTime(String silenceTime) {
            this.silenceTime = silenceTime;
            return this;
        }
        public String getSilenceTime() {
            return this.silenceTime;
        }

        public CreateGroupMonitoringAgentProcessRequestAlertConfig setStatistics(String statistics) {
            this.statistics = statistics;
            return this;
        }
        public String getStatistics() {
            return this.statistics;
        }

        public CreateGroupMonitoringAgentProcessRequestAlertConfig setThreshold(String threshold) {
            this.threshold = threshold;
            return this;
        }
        public String getThreshold() {
            return this.threshold;
        }

        public CreateGroupMonitoringAgentProcessRequestAlertConfig setTimes(String times) {
            this.times = times;
            return this;
        }
        public String getTimes() {
            return this.times;
        }

        public CreateGroupMonitoringAgentProcessRequestAlertConfig setWebhook(String webhook) {
            this.webhook = webhook;
            return this;
        }
        public String getWebhook() {
            return this.webhook;
        }

    }

    public static class CreateGroupMonitoringAgentProcessRequestMatchExpress extends TeaModel {
        @NameInMap("Function")
        public String function;

        @NameInMap("Name")
        public String name;

        @NameInMap("Value")
        public String value;

        public static CreateGroupMonitoringAgentProcessRequestMatchExpress build(java.util.Map<String, ?> map) throws Exception {
            CreateGroupMonitoringAgentProcessRequestMatchExpress self = new CreateGroupMonitoringAgentProcessRequestMatchExpress();
            return TeaModel.build(map, self);
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

        public CreateGroupMonitoringAgentProcessRequestMatchExpress setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}
