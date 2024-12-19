// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkedmall20180116.models;

import com.aliyun.tea.*;

public class ModifyItemLimitRuleRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>1639539460838</p>
     */
    @NameInMap("BeginTime")
    public Long beginTime;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>LMALL20******001</p>
     */
    @NameInMap("BizId")
    public String bizId;

    /**
     * <strong>example:</strong>
     * <p>1648483200000</p>
     */
    @NameInMap("EndTime")
    public Long endTime;

    /**
     * <strong>example:</strong>
     * <p>655******148</p>
     */
    @NameInMap("ItemId")
    public Long itemId;

    /**
     * <strong>example:</strong>
     * <p>679</p>
     */
    @NameInMap("LmActivityId")
    public Long lmActivityId;

    /**
     * <strong>example:</strong>
     * <p>10000055-******09839</p>
     */
    @NameInMap("LmItemId")
    public String lmItemId;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>136</p>
     */
    @NameInMap("RuleId")
    public Long ruleId;

    @NameInMap("RuleType")
    public Integer ruleType;

    /**
     * <strong>example:</strong>
     * <p>5ab43d1******41abdd23629bed001a0</p>
     */
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
