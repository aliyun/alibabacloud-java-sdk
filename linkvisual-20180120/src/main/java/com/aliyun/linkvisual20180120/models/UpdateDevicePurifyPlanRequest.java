// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkvisual20180120.models;

import com.aliyun.tea.*;

public class UpdateDevicePurifyPlanRequest extends TeaModel {
    @NameInMap("PlanId")
    @Validation(required = true)
    public String planId;

    @NameInMap("StartTime")
    @Validation(required = true)
    public Integer startTime;

    @NameInMap("EndTime")
    @Validation(required = true)
    public Integer endTime;

    public static UpdateDevicePurifyPlanRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateDevicePurifyPlanRequest self = new UpdateDevicePurifyPlanRequest();
        return TeaModel.build(map, self);
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
