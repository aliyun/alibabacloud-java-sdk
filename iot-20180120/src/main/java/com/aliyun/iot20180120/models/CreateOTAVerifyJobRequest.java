// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class CreateOTAVerifyJobRequest extends TeaModel {
    @NameInMap("IotInstanceId")
    public String iotInstanceId;

    @NameInMap("FirmwareId")
    @Validation(required = true)
    public String firmwareId;

    @NameInMap("TimeoutInMinutes")
    public Integer timeoutInMinutes;

    @NameInMap("ProductKey")
    @Validation(required = true)
    public String productKey;

    @NameInMap("TargetDeviceName")
    @Validation(required = true)
    public java.util.List<String> targetDeviceName;

    public static CreateOTAVerifyJobRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateOTAVerifyJobRequest self = new CreateOTAVerifyJobRequest();
        return TeaModel.build(map, self);
    }

    public CreateOTAVerifyJobRequest setIotInstanceId(String iotInstanceId) {
        this.iotInstanceId = iotInstanceId;
        return this;
    }
    public String getIotInstanceId() {
        return this.iotInstanceId;
    }

    public CreateOTAVerifyJobRequest setFirmwareId(String firmwareId) {
        this.firmwareId = firmwareId;
        return this;
    }
    public String getFirmwareId() {
        return this.firmwareId;
    }

    public CreateOTAVerifyJobRequest setTimeoutInMinutes(Integer timeoutInMinutes) {
        this.timeoutInMinutes = timeoutInMinutes;
        return this;
    }
    public Integer getTimeoutInMinutes() {
        return this.timeoutInMinutes;
    }

    public CreateOTAVerifyJobRequest setProductKey(String productKey) {
        this.productKey = productKey;
        return this;
    }
    public String getProductKey() {
        return this.productKey;
    }

    public CreateOTAVerifyJobRequest setTargetDeviceName(java.util.List<String> targetDeviceName) {
        this.targetDeviceName = targetDeviceName;
        return this;
    }
    public java.util.List<String> getTargetDeviceName() {
        return this.targetDeviceName;
    }

}
