// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkvisual20180120.models;

import com.aliyun.tea.*;

public class CreateLocalRecordDownloadByTimeJobRequest extends TeaModel {
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

    @NameInMap("Speed")
    public Float speed;

    public static CreateLocalRecordDownloadByTimeJobRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateLocalRecordDownloadByTimeJobRequest self = new CreateLocalRecordDownloadByTimeJobRequest();
        return TeaModel.build(map, self);
    }

    public CreateLocalRecordDownloadByTimeJobRequest setBeginTime(Integer beginTime) {
        this.beginTime = beginTime;
        return this;
    }
    public Integer getBeginTime() {
        return this.beginTime;
    }

    public CreateLocalRecordDownloadByTimeJobRequest setDeviceName(String deviceName) {
        this.deviceName = deviceName;
        return this;
    }
    public String getDeviceName() {
        return this.deviceName;
    }

    public CreateLocalRecordDownloadByTimeJobRequest setEndTime(Integer endTime) {
        this.endTime = endTime;
        return this;
    }
    public Integer getEndTime() {
        return this.endTime;
    }

    public CreateLocalRecordDownloadByTimeJobRequest setIotId(String iotId) {
        this.iotId = iotId;
        return this;
    }
    public String getIotId() {
        return this.iotId;
    }

    public CreateLocalRecordDownloadByTimeJobRequest setIotInstanceId(String iotInstanceId) {
        this.iotInstanceId = iotInstanceId;
        return this;
    }
    public String getIotInstanceId() {
        return this.iotInstanceId;
    }

    public CreateLocalRecordDownloadByTimeJobRequest setProductKey(String productKey) {
        this.productKey = productKey;
        return this;
    }
    public String getProductKey() {
        return this.productKey;
    }

    public CreateLocalRecordDownloadByTimeJobRequest setSpeed(Float speed) {
        this.speed = speed;
        return this;
    }
    public Float getSpeed() {
        return this.speed;
    }

}
