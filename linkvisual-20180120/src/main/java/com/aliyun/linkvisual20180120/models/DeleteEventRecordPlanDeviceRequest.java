// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkvisual20180120.models;

import com.aliyun.tea.*;

public class DeleteEventRecordPlanDeviceRequest extends TeaModel {
    @NameInMap("IotId")
    @Validation(required = true)
    public String iotId;

    @NameInMap("StreamType")
    public Integer streamType;

    public static DeleteEventRecordPlanDeviceRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteEventRecordPlanDeviceRequest self = new DeleteEventRecordPlanDeviceRequest();
        return TeaModel.build(map, self);
    }

    public DeleteEventRecordPlanDeviceRequest setIotId(String iotId) {
        this.iotId = iotId;
        return this;
    }
    public String getIotId() {
        return this.iotId;
    }

    public DeleteEventRecordPlanDeviceRequest setStreamType(Integer streamType) {
        this.streamType = streamType;
        return this;
    }
    public Integer getStreamType() {
        return this.streamType;
    }

}
