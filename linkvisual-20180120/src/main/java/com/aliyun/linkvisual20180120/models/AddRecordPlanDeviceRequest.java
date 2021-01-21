// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkvisual20180120.models;

import com.aliyun.tea.*;

public class AddRecordPlanDeviceRequest extends TeaModel {
    @NameInMap("IotId")
    @Validation(required = true)
    public String iotId;

    @NameInMap("PlanId")
    @Validation(required = true)
    public String planId;

    @NameInMap("StreamType")
    @Validation(required = true)
    public Integer streamType;

    public static AddRecordPlanDeviceRequest build(java.util.Map<String, ?> map) throws Exception {
        AddRecordPlanDeviceRequest self = new AddRecordPlanDeviceRequest();
        return TeaModel.build(map, self);
    }

    public AddRecordPlanDeviceRequest setIotId(String iotId) {
        this.iotId = iotId;
        return this;
    }
    public String getIotId() {
        return this.iotId;
    }

    public AddRecordPlanDeviceRequest setPlanId(String planId) {
        this.planId = planId;
        return this;
    }
    public String getPlanId() {
        return this.planId;
    }

    public AddRecordPlanDeviceRequest setStreamType(Integer streamType) {
        this.streamType = streamType;
        return this;
    }
    public Integer getStreamType() {
        return this.streamType;
    }

}
