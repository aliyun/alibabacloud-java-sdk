// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkedmall20180116.models;

import com.aliyun.tea.*;

public class ModifyItemLimitRuleRequest extends TeaModel {
    @NameInMap("BeginTime")
    public Long beginTime;

    @NameInMap("BizId")
    public String bizId;

    @NameInMap("EndTime")
    public Long endTime;

    @NameInMap("ItemId")
    public Long itemId;

    @NameInMap("LmActivityId")
    public Long lmActivityId;

    @NameInMap("LmItemId")
    public String lmItemId;

    @NameInMap("RuleId")
    public Long ruleId;

    @NameInMap("RuleType")
    public Integer ruleType;

    @NameInMap("SubBizCode")
    public String subBizCode;

    @NameInMap("UpperNum")
    public Integer upperNum;

    public static ModifyItemLimitRuleRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyItemLimitRuleRequest self = new ModifyItemLimitRuleRequest();
        return TeaModel.build(map, self);
    }

    public ModifyItemLimitRuleRequest setBeginTime(Long beginTime) {
        this.beginTime = beginTime;
        return this;
    }
    public Long getBeginTime() {
        return this.beginTime;
    }

    public ModifyItemLimitRuleRequest setBizId(String bizId) {
        this.bizId = bizId;
        return this;
    }
    public String getBizId() {
        return this.bizId;
    }

    public ModifyItemLimitRuleRequest setEndTime(Long endTime) {
        this.endTime = endTime;
        return this;
    }
    public Long getEndTime() {
        return this.endTime;
    }

    public ModifyItemLimitRuleRequest setItemId(Long itemId) {
        this.itemId = itemId;
        return this;
    }
    public Long getItemId() {
        return this.itemId;
    }

    public ModifyItemLimitRuleRequest setLmActivityId(Long lmActivityId) {
        this.lmActivityId = lmActivityId;
        return this;
    }
    public Long getLmActivityId() {
        return this.lmActivityId;
    }

    public ModifyItemLimitRuleRequest setLmItemId(String lmItemId) {
        this.lmItemId = lmItemId;
        return this;
    }
    public String getLmItemId() {
        return this.lmItemId;
    }

    public ModifyItemLimitRuleRequest setRuleId(Long ruleId) {
        this.ruleId = ruleId;
        return this;
    }
    public Long getRuleId() {
        return this.ruleId;
    }

    public ModifyItemLimitRuleRequest setRuleType(Integer ruleType) {
        this.ruleType = ruleType;
        return this;
    }
    public Integer getRuleType() {
        return this.ruleType;
    }

    public ModifyItemLimitRuleRequest setSubBizCode(String subBizCode) {
        this.subBizCode = subBizCode;
        return this;
    }
    public String getSubBizCode() {
        return this.subBizCode;
    }

    public ModifyItemLimitRuleRequest setUpperNum(Integer upperNum) {
        this.upperNum = upperNum;
        return this;
    }
    public Integer getUpperNum() {
        return this.upperNum;
    }

}
