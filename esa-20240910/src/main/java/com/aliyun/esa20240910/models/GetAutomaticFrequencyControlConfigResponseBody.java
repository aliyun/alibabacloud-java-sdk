// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class GetAutomaticFrequencyControlConfigResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>js</p>
     */
    @NameInMap("ActionType")
    public String actionType;

    /**
     * <strong>example:</strong>
     * <p>on</p>
     */
    @NameInMap("Enable")
    public String enable;

    /**
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("Interval")
    public Integer interval;

    /**
     * <strong>example:</strong>
     * <p>normal</p>
     */
    @NameInMap("Level")
    public String level;

    /**
     * <strong>example:</strong>
     * <p>20000000</p>
     */
    @NameInMap("PunishTime")
    public Integer punishTime;

    /**
     * <strong>example:</strong>
     * <p>04F0F334-1335-436C-A1D7-6C044FE73368</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>11957665</p>
     */
    @NameInMap("RuleId")
    public Long ruleId;

    /**
     * <strong>example:</strong>
     * <p>100</p>
     */
    @NameInMap("Threshold")
    public Integer threshold;

    public static GetAutomaticFrequencyControlConfigResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetAutomaticFrequencyControlConfigResponseBody self = new GetAutomaticFrequencyControlConfigResponseBody();
        return TeaModel.build(map, self);
    }

    public GetAutomaticFrequencyControlConfigResponseBody setActionType(String actionType) {
        this.actionType = actionType;
        return this;
    }
    public String getActionType() {
        return this.actionType;
    }

    public GetAutomaticFrequencyControlConfigResponseBody setEnable(String enable) {
        this.enable = enable;
        return this;
    }
    public String getEnable() {
        return this.enable;
    }

    public GetAutomaticFrequencyControlConfigResponseBody setInterval(Integer interval) {
        this.interval = interval;
        return this;
    }
    public Integer getInterval() {
        return this.interval;
    }

    public GetAutomaticFrequencyControlConfigResponseBody setLevel(String level) {
        this.level = level;
        return this;
    }
    public String getLevel() {
        return this.level;
    }

    public GetAutomaticFrequencyControlConfigResponseBody setPunishTime(Integer punishTime) {
        this.punishTime = punishTime;
        return this;
    }
    public Integer getPunishTime() {
        return this.punishTime;
    }

    public GetAutomaticFrequencyControlConfigResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetAutomaticFrequencyControlConfigResponseBody setRuleId(Long ruleId) {
        this.ruleId = ruleId;
        return this;
    }
    public Long getRuleId() {
        return this.ruleId;
    }

    public GetAutomaticFrequencyControlConfigResponseBody setThreshold(Integer threshold) {
        this.threshold = threshold;
        return this;
    }
    public Integer getThreshold() {
        return this.threshold;
    }

}
