// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkvisual20180120.models;

import com.aliyun.tea.*;

public class QueryRecordPlanDeviceByDeviceRequest extends TeaModel {
    @NameInMap("IotId")
    @Validation(required = true)
    public String iotId;

    @NameInMap("StreamType")
    @Validation(required = true)
    public Integer streamType;

    public static QueryRecordPlanDeviceByDeviceRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryRecordPlanDeviceByDeviceRequest self = new QueryRecordPlanDeviceByDeviceRequest();
        return TeaModel.build(map, self);
    }

    public QueryRecordPlanDeviceByDeviceRequest setIotId(String iotId) {
        this.iotId = iotId;
        return this;
    }
    public String getIotId() {
        return this.iotId;
    }

    public QueryRecordPlanDeviceByDeviceRequest setStreamType(Integer streamType) {
        this.streamType = streamType;
        return this;
    }
    public Integer getStreamType() {
        return this.streamType;
    }

}
