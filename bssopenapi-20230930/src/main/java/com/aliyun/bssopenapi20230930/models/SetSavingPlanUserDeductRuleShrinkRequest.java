// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bssopenapi20230930.models;

import com.aliyun.tea.*;

public class SetSavingPlanUserDeductRuleShrinkRequest extends TeaModel {
    @NameInMap("EcIdAccountIds")
    public String ecIdAccountIdsShrink;

    @NameInMap("Nbid")
    public String nbid;

    @NameInMap("SpnInstanceCode")
    public String spnInstanceCode;

    @NameInMap("UserDeductRules")
    public String userDeductRulesShrink;

    public static SetSavingPlanUserDeductRuleShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        SetSavingPlanUserDeductRuleShrinkRequest self = new SetSavingPlanUserDeductRuleShrinkRequest();
        return TeaModel.build(map, self);
    }

    public SetSavingPlanUserDeductRuleShrinkRequest setEcIdAccountIdsShrink(String ecIdAccountIdsShrink) {
        this.ecIdAccountIdsShrink = ecIdAccountIdsShrink;
        return this;
    }
    public String getEcIdAccountIdsShrink() {
        return this.ecIdAccountIdsShrink;
    }

    public SetSavingPlanUserDeductRuleShrinkRequest setNbid(String nbid) {
        this.nbid = nbid;
        return this;
    }
    public String getNbid() {
        return this.nbid;
    }

    public SetSavingPlanUserDeductRuleShrinkRequest setSpnInstanceCode(String spnInstanceCode) {
        this.spnInstanceCode = spnInstanceCode;
        return this;
    }
    public String getSpnInstanceCode() {
        return this.spnInstanceCode;
    }

    public SetSavingPlanUserDeductRuleShrinkRequest setUserDeductRulesShrink(String userDeductRulesShrink) {
        this.userDeductRulesShrink = userDeductRulesShrink;
        return this;
    }
    public String getUserDeductRulesShrink() {
        return this.userDeductRulesShrink;
    }

}
