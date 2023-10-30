// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkvisual20180120.models;

import com.aliyun.tea.*;

public class CreateRecordDownloadByTimeJobRequest extends TeaModel {
    @NameInMap("BeginTime")
    public Integer beginTime;

    @NameInMap("DeviceName")
    public String deviceName;

    @NameInMap("EndTime")
    public Integer endTime;

    @NameInMap("IotId")
    public String iotId;

    @NameInMap("IotInstanceId")
    public String iotInstanceId;

    @NameInMap("ProductKey")
    public String productKey;

    @NameInMap("RecordType")
    public Integer recordType;

    @NameInMap("StreamType")
    public Integer streamType;

    public static CreateRecordDownloadByTimeJobRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateRecordDownloadByTimeJobRequest self = new CreateRecordDownloadByTimeJobRequest();
        return TeaModel.build(map, self);
    }

    public CreateRecordDownloadByTimeJobRequest setBeginTime(Integer beginTime) {
        this.beginTime = beginTime;
        return this;
    }
    public Integer getBeginTime() {
        return this.beginTime;
    }

    public CreateRecordDownloadByTimeJobRequest setDeviceName(String deviceName) {
        this.deviceName = deviceName;
        return this;
    }
    public String getDeviceName() {
        return this.deviceName;
    }

    public CreateRecordDownloadByTimeJobRequest setEndTime(Integer endTime) {
        this.endTime = endTime;
        return this;
    }
    public Integer getEndTime() {
        return this.endTime;
    }

    public CreateRecordDownloadByTimeJobRequest setIotId(String iotId) {
        this.iotId = iotId;
        return this;
    }
    public String getIotId() {
        return this.iotId;
    }

    public CreateRecordDownloadByTimeJobRequest setIotInstanceId(String iotInstanceId) {
        this.iotInstanceId = iotInstanceId;
        return this;
    }
    public String getIotInstanceId() {
        return this.iotInstanceId;
    }

    public CreateRecordDownloadByTimeJobRequest setProductKey(String productKey) {
        this.productKey = productKey;
        return this;
    }
    public String getProductKey() {
        return this.productKey;
    }

    public CreateRecordDownloadByTimeJobRequest setRecordType(Integer recordType) {
        this.recordType = recordType;
        return this;
    }
    public Integer getRecordType() {
        return this.recordType;
    }

    public CreateRecordDownloadByTimeJobRequest setStreamType(Integer streamType) {
        this.streamType = streamType;
        return this;
    }
    public Integer getStreamType() {
        return this.streamType;
    }

}
