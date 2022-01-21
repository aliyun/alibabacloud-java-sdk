// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20190101.models;

import com.aliyun.tea.*;

public class ModifyGroupMonitoringAgentProcessRequest extends TeaModel {
    @NameInMap("AlertConfig")
    public java.util.List<ModifyGroupMonitoringAgentProcessRequestAlertConfig> alertConfig;

    @NameInMap("GroupId")
    public String groupId;

    @NameInMap("Id")
    public String id;

    @NameInMap("MatchExpressFilterRelation")
    public String matchExpressFilterRelation;

    @NameInMap("RegionId")
    public String regionId;

    public static ModifyGroupMonitoringAgentProcessRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyGroupMonitoringAgentProcessRequest self = new ModifyGroupMonitoringAgentProcessRequest();
        return TeaModel.build(map, self);
    }

    public ModifyGroupMonitoringAgentProcessRequest setAlertConfig(java.util.List<ModifyGroupMonitoringAgentProcessRequestAlertConfig> alertConfig) {
        this.alertConfig = alertConfig;
        return this;
    }
    public java.util.List<ModifyGroupMonitoringAgentProcessRequestAlertConfig> getAlertConfig() {
        return this.alertConfig;
    }

    public ModifyGroupMonitoringAgentProcessRequest setGroupId(String groupId) {
        this.groupId = groupId;
        return this;
    }
    public String getGroupId() {
        return this.groupId;
    }

    public ModifyGroupMonitoringAgentProcessRequest setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public ModifyGroupMonitoringAgentProcessRequest setMatchExpressFilterRelation(String matchExpressFilterRelation) {
        this.matchExpressFilterRelation = matchExpressFilterRelation;
        return this;
    }
    public String getMatchExpressFilterRelation() {
        return this.matchExpressFilterRelation;
    }

    public ModifyGroupMonitoringAgentProcessRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public static class ModifyGroupMonitoringAgentProcessRequestAlertConfig extends TeaModel {
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

        public static ModifyGroupMonitoringAgentProcessRequestAlertConfig build(java.util.Map<String, ?> map) throws Exception {
            ModifyGroupMonitoringAgentProcessRequestAlertConfig self = new ModifyGroupMonitoringAgentProcessRequestAlertConfig();
            return TeaModel.build(map, self);
        }

        public ModifyGroupMonitoringAgentProcessRequestAlertConfig setComparisonOperator(String comparisonOperator) {
            this.comparisonOperator = comparisonOperator;
            return this;
        }
        public String getComparisonOperator() {
            return this.comparisonOperator;
        }

        public ModifyGroupMonitoringAgentProcessRequestAlertConfig setEffectiveInterval(String effectiveInterval) {
            this.effectiveInterval = effectiveInterval;
            return this;
        }
        public String getEffectiveInterval() {
            return this.effectiveInterval;
        }

        public ModifyGroupMonitoringAgentProcessRequestAlertConfig setEscalationsLevel(String escalationsLevel) {
            this.escalationsLevel = escalationsLevel;
            return this;
        }
        public String getEscalationsLevel() {
            return this.escalationsLevel;
        }

        public ModifyGroupMonitoringAgentProcessRequestAlertConfig setNoEffectiveInterval(String noEffectiveInterval) {
            this.noEffectiveInterval = noEffectiveInterval;
            return this;
        }
        public String getNoEffectiveInterval() {
            return this.noEffectiveInterval;
        }

        public ModifyGroupMonitoringAgentProcessRequestAlertConfig setSilenceTime(String silenceTime) {
            this.silenceTime = silenceTime;
            return this;
        }
        public String getSilenceTime() {
            return this.silenceTime;
        }

        public ModifyGroupMonitoringAgentProcessRequestAlertConfig setStatistics(String statistics) {
            this.statistics = statistics;
            return this;
        }
        public String getStatistics() {
            return this.statistics;
        }

        public ModifyGroupMonitoringAgentProcessRequestAlertConfig setThreshold(String threshold) {
            this.threshold = threshold;
            return this;
        }
        public String getThreshold() {
            return this.threshold;
        }

        public ModifyGroupMonitoringAgentProcessRequestAlertConfig setTimes(String times) {
            this.times = times;
            return this;
        }
        public String getTimes() {
            return this.times;
        }

        public ModifyGroupMonitoringAgentProcessRequestAlertConfig setWebhook(String webhook) {
            this.webhook = webhook;
            return this;
        }
        public String getWebhook() {
            return this.webhook;
        }

    }

}
