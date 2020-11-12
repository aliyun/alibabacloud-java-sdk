// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkedmall20180116.models;

import com.aliyun.tea.*;

public class AddItemLimitRuleRequest extends TeaModel {
    @NameInMap("BizId")
    @Validation(required = true)
    public String bizId;

    @NameInMap("SubBizCode")
    public String subBizCode;

    @NameInMap("LmActivityId")
    public Long lmActivityId;

    @NameInMap("LmItemId")
    public String lmItemId;

    @NameInMap("ItemId")
    public Long itemId;

    @NameInMap("UpperNum")
    @Validation(required = true)
    public Integer upperNum;

    @NameInMap("RuleType")
    @Validation(required = true)
    public Integer ruleType;

    @NameInMap("BeginTime")
    @Validation(required = true)
    public Long beginTime;

    @NameInMap("EndTime")
    @Validation(required = true)
    public Long endTime;

    public static AddItemLimitRuleRequest build(java.util.Map<String, ?> map) throws Exception {
        AddItemLimitRuleRequest self = new AddItemLimitRuleRequest();
        return TeaModel.build(map, self);
    }

    public AddItemLimitRuleRequest setBizId(String bizId) {
        this.bizId = bizId;
        return this;
    }
    public String getBizId() {
        return this.bizId;
    }

    public AddItemLimitRuleRequest setSubBizCode(String subBizCode) {
        this.subBizCode = subBizCode;
        return this;
    }
    public String getSubBizCode() {
        return this.subBizCode;
    }

    public AddItemLimitRuleRequest setLmActivityId(Long lmActivityId) {
        this.lmActivityId = lmActivityId;
        return this;
    }
    public Long getLmActivityId() {
        return this.lmActivityId;
    }

    public AddItemLimitRuleRequest setLmItemId(String lmItemId) {
        this.lmItemId = lmItemId;
        return this;
    }
    public String getLmItemId() {
        return this.lmItemId;
    }

    public AddItemLimitRuleRequest setItemId(Long itemId) {
        this.itemId = itemId;
        return this;
    }
    public Long getItemId() {
        return this.itemId;
    }

    public AddItemLimitRuleRequest setUpperNum(Integer upperNum) {
        this.upperNum = upperNum;
        return this;
    }
    public Integer getUpperNum() {
        return this.upperNum;
    }

    public AddItemLimitRuleRequest setRuleType(Integer ruleType) {
        this.ruleType = ruleType;
        return this;
    }
    public Integer getRuleType() {
        return this.ruleType;
    }

    public AddItemLimitRuleRequest setBeginTime(Long beginTime) {
        this.beginTime = beginTime;
        return this;
    }
    public Long getBeginTime() {
        return this.beginTime;
    }

    public AddItemLimitRuleRequest setEndTime(Long endTime) {
        this.endTime = endTime;
        return this;
    }
    public Long getEndTime() {
        return this.endTime;
    }

}
