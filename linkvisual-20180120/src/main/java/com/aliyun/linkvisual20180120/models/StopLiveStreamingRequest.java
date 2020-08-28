// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkvisual20180120.models;

import com.aliyun.tea.*;

public class StopLiveStreamingRequest extends TeaModel {
    @NameInMap("IotId")
    @Validation(required = true)
    public String iotId;

    @NameInMap("StreamType")
    public Integer streamType;

    public static StopLiveStreamingRequest build(java.util.Map<String, ?> map) throws Exception {
        StopLiveStreamingRequest self = new StopLiveStreamingRequest();
        return TeaModel.build(map, self);
    }

    public StopLiveStreamingRequest setIotId(String iotId) {
        this.iotId = iotId;
        return this;
    }
    public String getIotId() {
        return this.iotId;
    }

    public StopLiveStreamingRequest setStreamType(Integer streamType) {
        this.streamType = streamType;
        return this;
    }
    public Integer getStreamType() {
        return this.streamType;
    }

}
