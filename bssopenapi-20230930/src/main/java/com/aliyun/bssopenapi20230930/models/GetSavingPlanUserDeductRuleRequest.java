// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bssopenapi20230930.models;

import com.aliyun.tea.*;

public class GetSavingPlanUserDeductRuleRequest extends TeaModel {
    @NameInMap("CurrentPage")
    public Integer currentPage;

    @NameInMap("EcIdAccountIds")
    public java.util.List<GetSavingPlanUserDeductRuleRequestEcIdAccountIds> ecIdAccountIds;

    @NameInMap("Nbid")
    public String nbid;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("SpnInstanceCode")
    public String spnInstanceCode;

    public static GetSavingPlanUserDeductRuleRequest build(java.util.Map<String, ?> map) throws Exception {
        GetSavingPlanUserDeductRuleRequest self = new GetSavingPlanUserDeductRuleRequest();
        return TeaModel.build(map, self);
    }

    public GetSavingPlanUserDeductRuleRequest setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    public GetSavingPlanUserDeductRuleRequest setEcIdAccountIds(java.util.List<GetSavingPlanUserDeductRuleRequestEcIdAccountIds> ecIdAccountIds) {
        this.ecIdAccountIds = ecIdAccountIds;
        return this;
    }
    public java.util.List<GetSavingPlanUserDeductRuleRequestEcIdAccountIds> getEcIdAccountIds() {
        return this.ecIdAccountIds;
    }

    public GetSavingPlanUserDeductRuleRequest setNbid(String nbid) {
        this.nbid = nbid;
        return this;
    }
    public String getNbid() {
        return this.nbid;
    }

    public GetSavingPlanUserDeductRuleRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public GetSavingPlanUserDeductRuleRequest setSpnInstanceCode(String spnInstanceCode) {
        this.spnInstanceCode = spnInstanceCode;
        return this;
    }
    public String getSpnInstanceCode() {
        return this.spnInstanceCode;
    }

    public static class GetSavingPlanUserDeductRuleRequestEcIdAccountIds extends TeaModel {
        @NameInMap("AccountIds")
        public java.util.List<Long> accountIds;

        /**
         * <p>This parameter is required.</p>
         */
        @NameInMap("EcId")
        public String ecId;

        public static GetSavingPlanUserDeductRuleRequestEcIdAccountIds build(java.util.Map<String, ?> map) throws Exception {
            GetSavingPlanUserDeductRuleRequestEcIdAccountIds self = new GetSavingPlanUserDeductRuleRequestEcIdAccountIds();
            return TeaModel.build(map, self);
        }

        public GetSavingPlanUserDeductRuleRequestEcIdAccountIds setAccountIds(java.util.List<Long> accountIds) {
            this.accountIds = accountIds;
            return this;
        }
        public java.util.List<Long> getAccountIds() {
            return this.accountIds;
        }

        public GetSavingPlanUserDeductRuleRequestEcIdAccountIds setEcId(String ecId) {
            this.ecId = ecId;
            return this;
        }
        public String getEcId() {
            return this.ecId;
        }

    }

}
