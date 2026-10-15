// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.milvus20231012.models;

import com.aliyun.tea.*;

public class ScalingRule extends TeaModel {
    /**
     * <p>The list of target resource configurations for each component.</p>
     */
    @NameInMap("adjustInfos")
    public java.util.List<ScalingRuleAdjustInfos> adjustInfos;

    /**
     * <p>The scheduled execution expression of the rule.</p>
     */
    @NameInMap("cronStr")
    public String cronStr;

    /**
     * <p>Indicates whether the rule is disabled.</p>
     */
    @NameInMap("disabled")
    public Boolean disabled;

    /**
     * <p>The end time of the effective period for the rule.</p>
     */
    @NameInMap("endTime")
    public Long endTime;

    /**
     * <p>The ID of the elastic scaling rule.</p>
     */
    @NameInMap("ruleId")
    public String ruleId;

    /**
     * <p>The name of the elastic scaling rule.</p>
     */
    @NameInMap("scalingRuleName")
    public String scalingRuleName;

    /**
     * <p>The start time of the effective period for the rule.</p>
     */
    @NameInMap("startTime")
    public Long startTime;

    /**
     * <p>The time zone used for the execution time of the rule.</p>
     * 
     * <strong>example:</strong>
     * <p>Asia/Shanghai</p>
     */
    @NameInMap("timeZone")
    public String timeZone;

    public static ScalingRule build(java.util.Map<String, ?> map) throws Exception {
        ScalingRule self = new ScalingRule();
        return TeaModel.build(map, self);
    }

    public ScalingRule setAdjustInfos(java.util.List<ScalingRuleAdjustInfos> adjustInfos) {
        this.adjustInfos = adjustInfos;
        return this;
    }
    public java.util.List<ScalingRuleAdjustInfos> getAdjustInfos() {
        return this.adjustInfos;
    }

    public ScalingRule setCronStr(String cronStr) {
        this.cronStr = cronStr;
        return this;
    }
    public String getCronStr() {
        return this.cronStr;
    }

    public ScalingRule setDisabled(Boolean disabled) {
        this.disabled = disabled;
        return this;
    }
    public Boolean getDisabled() {
        return this.disabled;
    }

    public ScalingRule setEndTime(Long endTime) {
        this.endTime = endTime;
        return this;
    }
    public Long getEndTime() {
        return this.endTime;
    }

    public ScalingRule setRuleId(String ruleId) {
        this.ruleId = ruleId;
        return this;
    }
    public String getRuleId() {
        return this.ruleId;
    }

    public ScalingRule setScalingRuleName(String scalingRuleName) {
        this.scalingRuleName = scalingRuleName;
        return this;
    }
    public String getScalingRuleName() {
        return this.scalingRuleName;
    }

    public ScalingRule setStartTime(Long startTime) {
        this.startTime = startTime;
        return this;
    }
    public Long getStartTime() {
        return this.startTime;
    }

    public ScalingRule setTimeZone(String timeZone) {
        this.timeZone = timeZone;
        return this;
    }
    public String getTimeZone() {
        return this.timeZone;
    }

    public static class ScalingRuleAdjustInfos extends TeaModel {
        /**
         * <p>index  query data proxy streaming mix_coordinator</p>
         */
        @NameInMap("componentType")
        public String componentType;

        /**
         * <p>The target number of nodes for the component after the rule is executed.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("targetValue")
        public String targetValue;

        public static ScalingRuleAdjustInfos build(java.util.Map<String, ?> map) throws Exception {
            ScalingRuleAdjustInfos self = new ScalingRuleAdjustInfos();
            return TeaModel.build(map, self);
        }

        public ScalingRuleAdjustInfos setComponentType(String componentType) {
            this.componentType = componentType;
            return this;
        }
        public String getComponentType() {
            return this.componentType;
        }

        public ScalingRuleAdjustInfos setTargetValue(String targetValue) {
            this.targetValue = targetValue;
            return this;
        }
        public String getTargetValue() {
            return this.targetValue;
        }

    }

}
