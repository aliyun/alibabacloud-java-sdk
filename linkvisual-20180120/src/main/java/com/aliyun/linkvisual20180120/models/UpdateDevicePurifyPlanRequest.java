// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkvisual20180120.models;

import com.aliyun.tea.*;

public class UpdateDevicePurifyPlanRequest extends TeaModel {
    @NameInMap("ApiProduct")
    public String apiProduct;

    @NameInMap("ApiRevision")
    public String apiRevision;

    @NameInMap("PlanId")
    public String planId;

    @NameInMap("StartTime")
    public Integer startTime;

    @NameInMap("EndTime")
    public Integer endTime;

    public static UpdateDevicePurifyPlanRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateDevicePurifyPlanRequest self = new UpdateDevicePurifyPlanRequest();
        return TeaModel.build(map, self);
    }

    public UpdateDevicePurifyPlanRequest setApiProduct(String apiProduct) {
        this.apiProduct = apiProduct;
        return this;
    }
    public String getApiProduct() {
        return this.apiProduct;
    }

    public UpdateDevicePurifyPlanRequest setApiRevision(String apiRevision) {
        this.apiRevision = apiRevision;
        return this;
    }
    public String getApiRevision() {
        return this.apiRevision;
    }

    public UpdateDevicePurifyPlanRequest setPlanId(String planId) {
        this.planId = planId;
        return this;
    }
    public String getPlanId() {
        return this.planId;
    }

    public UpdateDevicePurifyPlanRequest setStartTime(Integer startTime) {
        this.startTime = startTime;
        return this;
    }
    public Integer getStartTime() {
        return this.startTime;
    }

    public UpdateDevicePurifyPlanRequest setEndTime(Integer endTime) {
        this.endTime = endTime;
        return this;
    }
    public Integer getEndTime() {
        return this.endTime;
    }

}
