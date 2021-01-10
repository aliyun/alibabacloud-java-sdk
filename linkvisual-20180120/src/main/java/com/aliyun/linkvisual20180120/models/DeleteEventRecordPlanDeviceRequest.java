// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkvisual20180120.models;

import com.aliyun.tea.*;

public class DeleteEventRecordPlanDeviceRequest extends TeaModel {
    @NameInMap("ApiProduct")
    public String apiProduct;

    @NameInMap("ApiRevision")
    public String apiRevision;

    @NameInMap("IotId")
    public String iotId;

    @NameInMap("StreamType")
    public Integer streamType;

    public static DeleteEventRecordPlanDeviceRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteEventRecordPlanDeviceRequest self = new DeleteEventRecordPlanDeviceRequest();
        return TeaModel.build(map, self);
    }

    public DeleteEventRecordPlanDeviceRequest setApiProduct(String apiProduct) {
        this.apiProduct = apiProduct;
        return this;
    }
    public String getApiProduct() {
        return this.apiProduct;
    }

    public DeleteEventRecordPlanDeviceRequest setApiRevision(String apiRevision) {
        this.apiRevision = apiRevision;
        return this;
    }
    public String getApiRevision() {
        return this.apiRevision;
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
