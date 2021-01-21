// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkvisual20180120.models;

import com.aliyun.tea.*;

public class AddEventRecordPlanDeviceRequest extends TeaModel {
    @NameInMap("IotId")
    @Validation(required = true)
    public String iotId;

    @NameInMap("PlanId")
    @Validation(required = true)
    public String planId;

    @NameInMap("StreamType")
    public Integer streamType;

    public static AddEventRecordPlanDeviceRequest build(java.util.Map<String, ?> map) throws Exception {
        AddEventRecordPlanDeviceRequest self = new AddEventRecordPlanDeviceRequest();
        return TeaModel.build(map, self);
    }

    public AddEventRecordPlanDeviceRequest setIotId(String iotId) {
        this.iotId = iotId;
        return this;
    }
    public String getIotId() {
        return this.iotId;
    }

    public AddEventRecordPlanDeviceRequest setPlanId(String planId) {
        this.planId = planId;
        return this;
    }
    public String getPlanId() {
        return this.planId;
    }

    public AddEventRecordPlanDeviceRequest setStreamType(Integer streamType) {
        this.streamType = streamType;
        return this;
    }
    public Integer getStreamType() {
        return this.streamType;
    }

}
