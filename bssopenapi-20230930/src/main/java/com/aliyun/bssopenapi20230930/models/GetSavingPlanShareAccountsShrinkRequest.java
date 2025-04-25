// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bssopenapi20230930.models;

import com.aliyun.tea.*;

public class GetSavingPlanShareAccountsShrinkRequest extends TeaModel {
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

    public static GetSavingPlanShareAccountsShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        GetSavingPlanShareAccountsShrinkRequest self = new GetSavingPlanShareAccountsShrinkRequest();
        return TeaModel.build(map, self);
    }

    public GetSavingPlanShareAccountsShrinkRequest setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    public GetSavingPlanShareAccountsShrinkRequest setEcIdAccountIdsShrink(String ecIdAccountIdsShrink) {
        this.ecIdAccountIdsShrink = ecIdAccountIdsShrink;
        return this;
    }
    public String getEcIdAccountIdsShrink() {
        return this.ecIdAccountIdsShrink;
    }

    public GetSavingPlanShareAccountsShrinkRequest setNbid(String nbid) {
        this.nbid = nbid;
        return this;
    }
    public String getNbid() {
        return this.nbid;
    }

    public GetSavingPlanShareAccountsShrinkRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public GetSavingPlanShareAccountsShrinkRequest setSpnInstanceCode(String spnInstanceCode) {
        this.spnInstanceCode = spnInstanceCode;
        return this;
    }
    public String getSpnInstanceCode() {
        return this.spnInstanceCode;
    }

}
