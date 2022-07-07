// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mm_multiply20210901.models;

import com.aliyun.tea.*;

public class UpdatePointCommonRuleRequest extends TeaModel {
    @NameInMap("BizId")
    public String bizId;

    @NameInMap("EffectiveInterval")
    public Integer effectiveInterval;

    @NameInMap("EffectiveTime")
    public String effectiveTime;

    @NameInMap("EffectiveTimeUnit")
    public String effectiveTimeUnit;

    @NameInMap("EffectiveType")
    public Integer effectiveType;

    @NameInMap("LimitInterval")
    public Long limitInterval;

    @NameInMap("LimitStatus")
    public Integer limitStatus;

    public static UpdatePointCommonRuleRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdatePointCommonRuleRequest self = new UpdatePointCommonRuleRequest();
        return TeaModel.build(map, self);
    }

    public UpdatePointCommonRuleRequest setBizId(String bizId) {
        this.bizId = bizId;
        return this;
    }
    public String getBizId() {
        return this.bizId;
    }

    public UpdatePointCommonRuleRequest setEffectiveInterval(Integer effectiveInterval) {
        this.effectiveInterval = effectiveInterval;
        return this;
    }
    public Integer getEffectiveInterval() {
        return this.effectiveInterval;
    }

    public UpdatePointCommonRuleRequest setEffectiveTime(String effectiveTime) {
        this.effectiveTime = effectiveTime;
        return this;
    }
    public String getEffectiveTime() {
        return this.effectiveTime;
    }

    public UpdatePointCommonRuleRequest setEffectiveTimeUnit(String effectiveTimeUnit) {
        this.effectiveTimeUnit = effectiveTimeUnit;
        return this;
    }
    public String getEffectiveTimeUnit() {
        return this.effectiveTimeUnit;
    }

    public UpdatePointCommonRuleRequest setEffectiveType(Integer effectiveType) {
        this.effectiveType = effectiveType;
        return this;
    }
    public Integer getEffectiveType() {
        return this.effectiveType;
    }

    public UpdatePointCommonRuleRequest setLimitInterval(Long limitInterval) {
        this.limitInterval = limitInterval;
        return this;
    }
    public Long getLimitInterval() {
        return this.limitInterval;
    }

    public UpdatePointCommonRuleRequest setLimitStatus(Integer limitStatus) {
        this.limitStatus = limitStatus;
        return this;
    }
    public Integer getLimitStatus() {
        return this.limitStatus;
    }

}
