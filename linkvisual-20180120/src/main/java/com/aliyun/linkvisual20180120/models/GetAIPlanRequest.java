// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkvisual20180120.models;

import com.aliyun.tea.*;

public class GetAIPlanRequest extends TeaModel {
    @NameInMap("PlanId")
    @Validation(required = true)
    public String planId;

    public static GetAIPlanRequest build(java.util.Map<String, ?> map) throws Exception {
        GetAIPlanRequest self = new GetAIPlanRequest();
        return TeaModel.build(map, self);
    }

    public GetAIPlanRequest setPlanId(String planId) {
        this.planId = planId;
        return this;
    }
    public String getPlanId() {
        return this.planId;
    }

}
