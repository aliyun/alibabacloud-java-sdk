// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkedmall20180116.models;

import com.aliyun.tea.*;

public class AddItemLimitRuleRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1638958044395</p>
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
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1647446400000</p>
     */
    @NameInMap("EndTime")
    public Long endTime;

    /**
     * <strong>example:</strong>
     * <p>59******0266</p>
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
     * <p>10000055-******09769</p>
     */
    @NameInMap("LmItemId")
    public String lmItemId;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("RuleType")
    public Integer ruleType;

    /**
     * <strong>example:</strong>
     * <p>eaab4******59205ec608b2144ba</p>
     */
    @NameInMap("SubBizCode")
    public String subBizCode;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("UpperNum")
    public Integer upperNum;

    public static AddItemLimitRuleRequest build(java.util.Map<String, ?> map) throws Exception {
        AddItemLimitRuleRequest self = new AddItemLimitRuleRequest();
        return TeaModel.build(map, self);
    }

    public AddItemLimitRuleRequest setBeginTime(Long beginTime) {
        this.beginTime = beginTime;
        return this;
    }
    public Long getBeginTime() {
        return this.beginTime;
    }

    public AddItemLimitRuleRequest setBizId(String bizId) {
        this.bizId = bizId;
        return this;
    }
    public String getBizId() {
        return this.bizId;
    }

    public AddItemLimitRuleRequest setEndTime(Long endTime) {
        this.endTime = endTime;
        return this;
    }
    public Long getEndTime() {
        return this.endTime;
    }

    public AddItemLimitRuleRequest setItemId(Long itemId) {
        this.itemId = itemId;
        return this;
    }
    public Long getItemId() {
        return this.itemId;
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

    public AddItemLimitRuleRequest setRuleType(Integer ruleType) {
        this.ruleType = ruleType;
        return this;
    }
    public Integer getRuleType() {
        return this.ruleType;
    }

    public AddItemLimitRuleRequest setSubBizCode(String subBizCode) {
        this.subBizCode = subBizCode;
        return this;
    }
    public String getSubBizCode() {
        return this.subBizCode;
    }

    public AddItemLimitRuleRequest setUpperNum(Integer upperNum) {
        this.upperNum = upperNum;
        return this;
    }
    public Integer getUpperNum() {
        return this.upperNum;
    }

}
