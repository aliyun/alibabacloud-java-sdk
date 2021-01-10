// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkvisual20180120.models;

import com.aliyun.tea.*;

public class StopLiveStreamingRequest extends TeaModel {
    @NameInMap("ApiProduct")
    public String apiProduct;

    @NameInMap("ApiRevision")
    public String apiRevision;

    @NameInMap("IotId")
    public String iotId;

    @NameInMap("StreamType")
    public Integer streamType;

    @NameInMap("IotInstanceId")
    public String iotInstanceId;

    public static StopLiveStreamingRequest build(java.util.Map<String, ?> map) throws Exception {
        StopLiveStreamingRequest self = new StopLiveStreamingRequest();
        return TeaModel.build(map, self);
    }

    public StopLiveStreamingRequest setApiProduct(String apiProduct) {
        this.apiProduct = apiProduct;
        return this;
    }
    public String getApiProduct() {
        return this.apiProduct;
    }

    public StopLiveStreamingRequest setApiRevision(String apiRevision) {
        this.apiRevision = apiRevision;
        return this;
    }
    public String getApiRevision() {
        return this.apiRevision;
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

    public StopLiveStreamingRequest setIotInstanceId(String iotInstanceId) {
        this.iotInstanceId = iotInstanceId;
        return this;
    }
    public String getIotInstanceId() {
        return this.iotInstanceId;
    }

}
