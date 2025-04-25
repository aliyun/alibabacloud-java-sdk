// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bssopenapi20230930.models;

import com.aliyun.tea.*;

public class GetSavingPlanUserDeductRuleShrinkRequest extends TeaModel {
    @NameInMap("CurrentPage")
    public Integer currentPage;

    @NameInMap("EcIdAccountIds")
    public String ecIdAccountIdsShrink;

    @NameInMap("Nbid")
    public String nbid;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("SpnInstanceCode")
    public String spnInstanceCode;

    public static GetSavingPlanUserDeductRuleShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        GetSavingPlanUserDeductRuleShrinkRequest self = new GetSavingPlanUserDeductRuleShrinkRequest();
        return TeaModel.build(map, self);
    }

    public GetSavingPlanUserDeductRuleShrinkRequest setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    public GetSavingPlanUserDeductRuleShrinkRequest setEcIdAccountIdsShrink(String ecIdAccountIdsShrink) {
        this.ecIdAccountIdsShrink = ecIdAccountIdsShrink;
        return this;
    }
    public String getEcIdAccountIdsShrink() {
        return this.ecIdAccountIdsShrink;
    }

    public GetSavingPlanUserDeductRuleShrinkRequest setNbid(String nbid) {
        this.nbid = nbid;
        return this;
    }
    public String getNbid() {
        return this.nbid;
    }

    public GetSavingPlanUserDeductRuleShrinkRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public GetSavingPlanUserDeductRuleShrinkRequest setSpnInstanceCode(String spnInstanceCode) {
        this.spnInstanceCode = spnInstanceCode;
        return this;
    }
    public String getSpnInstanceCode() {
        return this.spnInstanceCode;
    }

}
