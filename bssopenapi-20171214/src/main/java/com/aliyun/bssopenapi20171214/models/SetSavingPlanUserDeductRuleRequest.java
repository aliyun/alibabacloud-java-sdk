// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bssopenapi20171214.models;

import com.aliyun.tea.*;

public class SetSavingPlanUserDeductRuleRequest extends TeaModel {
    @NameInMap("EcIdAccountIds")
    public java.util.List<SetSavingPlanUserDeductRuleRequestEcIdAccountIds> ecIdAccountIds;

    @NameInMap("Nbid")
    public String nbid;

    @NameInMap("SpnInstanceCode")
    public String spnInstanceCode;

    @NameInMap("UserDeductRules")
    public java.util.List<SetSavingPlanUserDeductRuleRequestUserDeductRules> userDeductRules;

    public static SetSavingPlanUserDeductRuleRequest build(java.util.Map<String, ?> map) throws Exception {
        SetSavingPlanUserDeductRuleRequest self = new SetSavingPlanUserDeductRuleRequest();
        return TeaModel.build(map, self);
    }

    public SetSavingPlanUserDeductRuleRequest setEcIdAccountIds(java.util.List<SetSavingPlanUserDeductRuleRequestEcIdAccountIds> ecIdAccountIds) {
        this.ecIdAccountIds = ecIdAccountIds;
        return this;
    }
    public java.util.List<SetSavingPlanUserDeductRuleRequestEcIdAccountIds> getEcIdAccountIds() {
        return this.ecIdAccountIds;
    }

    public SetSavingPlanUserDeductRuleRequest setNbid(String nbid) {
        this.nbid = nbid;
        return this;
    }
    public String getNbid() {
        return this.nbid;
    }

    public SetSavingPlanUserDeductRuleRequest setSpnInstanceCode(String spnInstanceCode) {
        this.spnInstanceCode = spnInstanceCode;
        return this;
    }
    public String getSpnInstanceCode() {
        return this.spnInstanceCode;
    }

    public SetSavingPlanUserDeductRuleRequest setUserDeductRules(java.util.List<SetSavingPlanUserDeductRuleRequestUserDeductRules> userDeductRules) {
        this.userDeductRules = userDeductRules;
        return this;
    }
    public java.util.List<SetSavingPlanUserDeductRuleRequestUserDeductRules> getUserDeductRules() {
        return this.userDeductRules;
    }

    public static class SetSavingPlanUserDeductRuleRequestEcIdAccountIds extends TeaModel {
        @NameInMap("AccountIds")
        public java.util.List<Long> accountIds;

        @NameInMap("EcId")
        public String ecId;

        public static SetSavingPlanUserDeductRuleRequestEcIdAccountIds build(java.util.Map<String, ?> map) throws Exception {
            SetSavingPlanUserDeductRuleRequestEcIdAccountIds self = new SetSavingPlanUserDeductRuleRequestEcIdAccountIds();
            return TeaModel.build(map, self);
        }

        public SetSavingPlanUserDeductRuleRequestEcIdAccountIds setAccountIds(java.util.List<Long> accountIds) {
            this.accountIds = accountIds;
            return this;
        }
        public java.util.List<Long> getAccountIds() {
            return this.accountIds;
        }

        public SetSavingPlanUserDeductRuleRequestEcIdAccountIds setEcId(String ecId) {
            this.ecId = ecId;
            return this;
        }
        public String getEcId() {
            return this.ecId;
        }

    }

    public static class SetSavingPlanUserDeductRuleRequestUserDeductRules extends TeaModel {
        @NameInMap("CommodityCode")
        public String commodityCode;

        @NameInMap("ModuleCode")
        public String moduleCode;

        @NameInMap("SkipDeduct")
        public Boolean skipDeduct;

        public static SetSavingPlanUserDeductRuleRequestUserDeductRules build(java.util.Map<String, ?> map) throws Exception {
            SetSavingPlanUserDeductRuleRequestUserDeductRules self = new SetSavingPlanUserDeductRuleRequestUserDeductRules();
            return TeaModel.build(map, self);
        }

        public SetSavingPlanUserDeductRuleRequestUserDeductRules setCommodityCode(String commodityCode) {
            this.commodityCode = commodityCode;
            return this;
        }
        public String getCommodityCode() {
            return this.commodityCode;
        }

        public SetSavingPlanUserDeductRuleRequestUserDeductRules setModuleCode(String moduleCode) {
            this.moduleCode = moduleCode;
            return this;
        }
        public String getModuleCode() {
            return this.moduleCode;
        }

        public SetSavingPlanUserDeductRuleRequestUserDeductRules setSkipDeduct(Boolean skipDeduct) {
            this.skipDeduct = skipDeduct;
            return this;
        }
        public Boolean getSkipDeduct() {
            return this.skipDeduct;
        }

    }

}
