// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkvisual20180120.models;

import com.aliyun.tea.*;

public class TriggerRecordRequest extends TeaModel {
    @NameInMap("ApiProduct")
    public String apiProduct;

    @NameInMap("ApiRevision")
    public String apiRevision;

    @NameInMap("IotId")
    public String iotId;

    @NameInMap("StreamType")
    public Integer streamType;

    @NameInMap("PreRecordDuration")
    public Integer preRecordDuration;

    @NameInMap("RecordDuration")
    public Integer recordDuration;

    @NameInMap("IotInstanceId")
    public String iotInstanceId;

    public static TriggerRecordRequest build(java.util.Map<String, ?> map) throws Exception {
        TriggerRecordRequest self = new TriggerRecordRequest();
        return TeaModel.build(map, self);
    }

    public TriggerRecordRequest setApiProduct(String apiProduct) {
        this.apiProduct = apiProduct;
        return this;
    }
    public String getApiProduct() {
        return this.apiProduct;
    }

    public TriggerRecordRequest setApiRevision(String apiRevision) {
        this.apiRevision = apiRevision;
        return this;
    }
    public String getApiRevision() {
        return this.apiRevision;
    }

    public TriggerRecordRequest setIotId(String iotId) {
        this.iotId = iotId;
        return this;
    }
    public String getIotId() {
        return this.iotId;
    }

    public TriggerRecordRequest setStreamType(Integer streamType) {
        this.streamType = streamType;
        return this;
    }
    public Integer getStreamType() {
        return this.streamType;
    }

    public TriggerRecordRequest setPreRecordDuration(Integer preRecordDuration) {
        this.preRecordDuration = preRecordDuration;
        return this;
    }
    public Integer getPreRecordDuration() {
        return this.preRecordDuration;
    }

    public TriggerRecordRequest setRecordDuration(Integer recordDuration) {
        this.recordDuration = recordDuration;
        return this;
    }
    public Integer getRecordDuration() {
        return this.recordDuration;
    }

    public TriggerRecordRequest setIotInstanceId(String iotInstanceId) {
        this.iotInstanceId = iotInstanceId;
        return this;
    }
    public String getIotInstanceId() {
        return this.iotInstanceId;
    }

}
