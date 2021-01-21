// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkvisual20180120.models;

import com.aliyun.tea.*;

public class CreateDevicePurifyPlanRequest extends TeaModel {
    @NameInMap("IotId")
    @Validation(required = true)
    public String iotId;

    @NameInMap("StartTime")
    @Validation(required = true)
    public Integer startTime;

    @NameInMap("EndTime")
    @Validation(required = true)
    public Integer endTime;

    public static CreateDevicePurifyPlanRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateDevicePurifyPlanRequest self = new CreateDevicePurifyPlanRequest();
        return TeaModel.build(map, self);
    }

    public CreateDevicePurifyPlanRequest setIotId(String iotId) {
        this.iotId = iotId;
        return this;
    }
    public String getIotId() {
        return this.iotId;
    }

    public CreateDevicePurifyPlanRequest setStartTime(Integer startTime) {
        this.startTime = startTime;
        return this;
    }
    public Integer getStartTime() {
        return this.startTime;
    }

    public CreateDevicePurifyPlanRequest setEndTime(Integer endTime) {
        this.endTime = endTime;
        return this;
    }
    public Integer getEndTime() {
        return this.endTime;
    }

}
