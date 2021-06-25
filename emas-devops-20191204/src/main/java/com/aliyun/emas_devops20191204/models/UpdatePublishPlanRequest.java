// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emas_devops20191204.models;

import com.aliyun.tea.*;

public class UpdatePublishPlanRequest extends TeaModel {
    @NameInMap("AppKey")
    @Validation(required = true)
    public String appKey;

    @NameInMap("PlanBid")
    @Validation(required = true)
    public String planBid;

    @NameInMap("PlanName")
    public String planName;

    public static UpdatePublishPlanRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdatePublishPlanRequest self = new UpdatePublishPlanRequest();
        return TeaModel.build(map, self);
    }

    public UpdatePublishPlanRequest setAppKey(String appKey) {
        this.appKey = appKey;
        return this;
    }
    public String getAppKey() {
        return this.appKey;
    }

    public UpdatePublishPlanRequest setPlanBid(String planBid) {
        this.planBid = planBid;
        return this;
    }
    public String getPlanBid() {
        return this.planBid;
    }

    public UpdatePublishPlanRequest setPlanName(String planName) {
        this.planName = planName;
        return this;
    }
    public String getPlanName() {
        return this.planName;
    }

}
