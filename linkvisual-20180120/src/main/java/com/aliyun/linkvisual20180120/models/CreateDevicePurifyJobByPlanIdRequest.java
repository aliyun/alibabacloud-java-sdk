// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkvisual20180120.models;

import com.aliyun.tea.*;

public class CreateDevicePurifyJobByPlanIdRequest extends TeaModel {
    @NameInMap("PlanId")
    @Validation(required = true)
    public String planId;

    @NameInMap("Utc")
    @Validation(required = true)
    public Long utc;

    public static CreateDevicePurifyJobByPlanIdRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateDevicePurifyJobByPlanIdRequest self = new CreateDevicePurifyJobByPlanIdRequest();
        return TeaModel.build(map, self);
    }

    public CreateDevicePurifyJobByPlanIdRequest setPlanId(String planId) {
        this.planId = planId;
        return this;
    }
    public String getPlanId() {
        return this.planId;
    }

    public CreateDevicePurifyJobByPlanIdRequest setUtc(Long utc) {
        this.utc = utc;
        return this;
    }
    public Long getUtc() {
        return this.utc;
    }

}
