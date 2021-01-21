// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkvisual20180120.models;

import com.aliyun.tea.*;

public class DeleteRecordPlanDeviceRequest extends TeaModel {
    @NameInMap("IotId")
    @Validation(required = true)
    public String iotId;

    @NameInMap("StreamType")
    @Validation(required = true)
    public Integer streamType;

    public static DeleteRecordPlanDeviceRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteRecordPlanDeviceRequest self = new DeleteRecordPlanDeviceRequest();
        return TeaModel.build(map, self);
    }

    public DeleteRecordPlanDeviceRequest setIotId(String iotId) {
        this.iotId = iotId;
        return this;
    }
    public String getIotId() {
        return this.iotId;
    }

    public DeleteRecordPlanDeviceRequest setStreamType(Integer streamType) {
        this.streamType = streamType;
        return this;
    }
    public Integer getStreamType() {
        return this.streamType;
    }

}
