// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bssopenapi20230930.models;

import com.aliyun.tea.*;

public class GetSavingPlanDeductableCommodityShrinkRequest extends TeaModel {
    @NameInMap("EcIdAccountIds")
    public String ecIdAccountIdsShrink;

    @NameInMap("Nbid")
    public String nbid;

    public static GetSavingPlanDeductableCommodityShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        GetSavingPlanDeductableCommodityShrinkRequest self = new GetSavingPlanDeductableCommodityShrinkRequest();
        return TeaModel.build(map, self);
    }

    public GetSavingPlanDeductableCommodityShrinkRequest setEcIdAccountIdsShrink(String ecIdAccountIdsShrink) {
        this.ecIdAccountIdsShrink = ecIdAccountIdsShrink;
        return this;
    }
    public String getEcIdAccountIdsShrink() {
        return this.ecIdAccountIdsShrink;
    }

    public GetSavingPlanDeductableCommodityShrinkRequest setNbid(String nbid) {
        this.nbid = nbid;
        return this;
    }
    public String getNbid() {
        return this.nbid;
    }

}
