// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkvisual20180120.models;

import com.aliyun.tea.*;

public class UpdateAIPlanRequest extends TeaModel {
    @NameInMap("PlanId")
    @Validation(required = true)
    public String planId;

    @NameInMap("Description")
    public String description;

    public static UpdateAIPlanRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateAIPlanRequest self = new UpdateAIPlanRequest();
        return TeaModel.build(map, self);
    }

    public UpdateAIPlanRequest setPlanId(String planId) {
        this.planId = planId;
        return this;
    }
    public String getPlanId() {
        return this.planId;
    }

    public UpdateAIPlanRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

}
