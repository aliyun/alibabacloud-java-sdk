// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class CreateOTAVerifyJobRequest extends TeaModel {
    @NameInMap("FirmwareId")
    public String firmwareId;

    @NameInMap("IotInstanceId")
    public String iotInstanceId;

    @NameInMap("NeedConfirm")
    public Boolean needConfirm;

    @NameInMap("NeedPush")
    public Boolean needPush;

    @NameInMap("ProductKey")
    public String productKey;

    @NameInMap("TargetDeviceName")
    public java.util.List<String> targetDeviceName;

    @NameInMap("TimeoutInMinutes")
    public Integer timeoutInMinutes;

    public static CreateOTAVerifyJobRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateOTAVerifyJobRequest self = new CreateOTAVerifyJobRequest();
        return TeaModel.build(map, self);
    }

    public CreateOTAVerifyJobRequest setFirmwareId(String firmwareId) {
        this.firmwareId = firmwareId;
        return this;
    }
    public String getFirmwareId() {
        return this.firmwareId;
    }

    public CreateOTAVerifyJobRequest setIotInstanceId(String iotInstanceId) {
        this.iotInstanceId = iotInstanceId;
        return this;
    }
    public String getIotInstanceId() {
        return this.iotInstanceId;
    }

    public CreateOTAVerifyJobRequest setNeedConfirm(Boolean needConfirm) {
        this.needConfirm = needConfirm;
        return this;
    }
    public Boolean getNeedConfirm() {
        return this.needConfirm;
    }

    public CreateOTAVerifyJobRequest setNeedPush(Boolean needPush) {
        this.needPush = needPush;
        return this;
    }
    public Boolean getNeedPush() {
        return this.needPush;
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

    public CreateOTAVerifyJobRequest setTimeoutInMinutes(Integer timeoutInMinutes) {
        this.timeoutInMinutes = timeoutInMinutes;
        return this;
    }
    public Integer getTimeoutInMinutes() {
        return this.timeoutInMinutes;
    }

}
