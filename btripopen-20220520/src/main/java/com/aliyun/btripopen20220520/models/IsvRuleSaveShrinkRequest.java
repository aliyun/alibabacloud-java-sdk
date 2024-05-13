// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.btripopen20220520.models;

import com.aliyun.tea.*;

public class IsvRuleSaveShrinkRequest extends TeaModel {
    @NameInMap("apply_need")
    public Boolean applyNeed;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("book_type")
    public String bookType;

    @NameInMap("bookuser_list")
    public String bookuserListShrink;

    @NameInMap("rule_need")
    public Boolean ruleNeed;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("status")
    public Integer status;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("user_id")
    public String userId;

    public static IsvRuleSaveShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        IsvRuleSaveShrinkRequest self = new IsvRuleSaveShrinkRequest();
        return TeaModel.build(map, self);
    }

    public IsvRuleSaveShrinkRequest setApplyNeed(Boolean applyNeed) {
        this.applyNeed = applyNeed;
        return this;
    }
    public Boolean getApplyNeed() {
        return this.applyNeed;
    }

    public IsvRuleSaveShrinkRequest setBookType(String bookType) {
        this.bookType = bookType;
        return this;
    }
    public String getBookType() {
        return this.bookType;
    }

    public IsvRuleSaveShrinkRequest setBookuserListShrink(String bookuserListShrink) {
        this.bookuserListShrink = bookuserListShrink;
        return this;
    }
    public String getBookuserListShrink() {
        return this.bookuserListShrink;
    }

    public IsvRuleSaveShrinkRequest setRuleNeed(Boolean ruleNeed) {
        this.ruleNeed = ruleNeed;
        return this;
    }
    public Boolean getRuleNeed() {
        return this.ruleNeed;
    }

    public IsvRuleSaveShrinkRequest setStatus(Integer status) {
        this.status = status;
        return this;
    }
    public Integer getStatus() {
        return this.status;
    }

    public IsvRuleSaveShrinkRequest setUserId(String userId) {
        this.userId = userId;
        return this;
    }
    public String getUserId() {
        return this.userId;
    }

}
