// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkvisual20180120.models;

import com.aliyun.tea.*;

public class TriggerRecordRequest extends TeaModel {
    @NameInMap("IotId")
    @Validation(required = true)
    public String iotId;

    @NameInMap("StreamType")
    public Integer streamType;

    @NameInMap("PreRecordDuration")
    public Integer preRecordDuration;

    @NameInMap("RecordDuration")
    @Validation(required = true)
    public Integer recordDuration;

    @NameInMap("IotInstanceId")
    public String iotInstanceId;

    public static TriggerRecordRequest build(java.util.Map<String, ?> map) throws Exception {
        TriggerRecordRequest self = new TriggerRecordRequest();
        return TeaModel.build(map, self);
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
