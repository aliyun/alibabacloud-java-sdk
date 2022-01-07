// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class CancelOTATaskByDeviceRequest extends TeaModel {
    @NameInMap("DeviceName")
    public java.util.List<String> deviceName;

    @NameInMap("FirmwareId")
    public String firmwareId;

    @NameInMap("IotInstanceId")
    public String iotInstanceId;

    @NameInMap("JobId")
    public String jobId;

    @NameInMap("ProductKey")
    public String productKey;

    public static CancelOTATaskByDeviceRequest build(java.util.Map<String, ?> map) throws Exception {
        CancelOTATaskByDeviceRequest self = new CancelOTATaskByDeviceRequest();
        return TeaModel.build(map, self);
    }

    public CancelOTATaskByDeviceRequest setDeviceName(java.util.List<String> deviceName) {
        this.deviceName = deviceName;
        return this;
    }
    public java.util.List<String> getDeviceName() {
        return this.deviceName;
    }

    public CancelOTATaskByDeviceRequest setFirmwareId(String firmwareId) {
        this.firmwareId = firmwareId;
        return this;
    }
    public String getFirmwareId() {
        return this.firmwareId;
    }

    public CancelOTATaskByDeviceRequest setIotInstanceId(String iotInstanceId) {
        this.iotInstanceId = iotInstanceId;
        return this;
    }
    public String getIotInstanceId() {
        return this.iotInstanceId;
    }

    public CancelOTATaskByDeviceRequest setJobId(String jobId) {
        this.jobId = jobId;
        return this;
    }
    public String getJobId() {
        return this.jobId;
    }

    public CancelOTATaskByDeviceRequest setProductKey(String productKey) {
        this.productKey = productKey;
        return this;
    }
    public String getProductKey() {
        return this.productKey;
    }

}
