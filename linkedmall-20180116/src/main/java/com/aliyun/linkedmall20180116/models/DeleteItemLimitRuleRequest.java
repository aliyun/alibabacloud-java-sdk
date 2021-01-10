// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkedmall20180116.models;

import com.aliyun.tea.*;

public class DeleteItemLimitRuleRequest extends TeaModel {
    @NameInMap("BizId")
    public String bizId;

    @NameInMap("SubBizCode")
    public String subBizCode;

    @NameInMap("LmActivityId")
    public Long lmActivityId;

    @NameInMap("LmItemId")
    public String lmItemId;

    @NameInMap("ItemId")
    public Long itemId;

    @NameInMap("RuleId")
    public Long ruleId;

    public static DeleteItemLimitRuleRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteItemLimitRuleRequest self = new DeleteItemLimitRuleRequest();
        return TeaModel.build(map, self);
    }

    public DeleteItemLimitRuleRequest setBizId(String bizId) {
        this.bizId = bizId;
        return this;
    }
    public String getBizId() {
        return this.bizId;
    }

    public DeleteItemLimitRuleRequest setSubBizCode(String subBizCode) {
        this.subBizCode = subBizCode;
        return this;
    }
    public String getSubBizCode() {
        return this.subBizCode;
    }

    public DeleteItemLimitRuleRequest setLmActivityId(Long lmActivityId) {
        this.lmActivityId = lmActivityId;
        return this;
    }
    public Long getLmActivityId() {
        return this.lmActivityId;
    }

    public DeleteItemLimitRuleRequest setLmItemId(String lmItemId) {
        this.lmItemId = lmItemId;
        return this;
    }
    public String getLmItemId() {
        return this.lmItemId;
    }

    public DeleteItemLimitRuleRequest setItemId(Long itemId) {
        this.itemId = itemId;
        return this;
    }
    public Long getItemId() {
        return this.itemId;
    }

    public DeleteItemLimitRuleRequest setRuleId(Long ruleId) {
        this.ruleId = ruleId;
        return this;
    }
    public Long getRuleId() {
        return this.ruleId;
    }

}
