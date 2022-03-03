// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class CreateOTAVerifyJobRequest extends TeaModel {
    @NameInMap("DownloadProtocol")
    public String downloadProtocol;

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

    @NameInMap("Tag")
    public java.util.List<CreateOTAVerifyJobRequestTag> tag;

    @NameInMap("TargetDeviceName")
    public java.util.List<String> targetDeviceName;

    @NameInMap("TimeoutInMinutes")
    public Integer timeoutInMinutes;

    public static CreateOTAVerifyJobRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateOTAVerifyJobRequest self = new CreateOTAVerifyJobRequest();
        return TeaModel.build(map, self);
    }

    public CreateOTAVerifyJobRequest setDownloadProtocol(String downloadProtocol) {
        this.downloadProtocol = downloadProtocol;
        return this;
    }
    public String getDownloadProtocol() {
        return this.downloadProtocol;
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

    public CreateOTAVerifyJobRequest setTag(java.util.List<CreateOTAVerifyJobRequestTag> tag) {
        this.tag = tag;
        return this;
    }
    public java.util.List<CreateOTAVerifyJobRequestTag> getTag() {
        return this.tag;
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

    public static class CreateOTAVerifyJobRequestTag extends TeaModel {
        @NameInMap("Key")
        public String key;

        @NameInMap("Value")
        public String value;

        public static CreateOTAVerifyJobRequestTag build(java.util.Map<String, ?> map) throws Exception {
            CreateOTAVerifyJobRequestTag self = new CreateOTAVerifyJobRequestTag();
            return TeaModel.build(map, self);
        }

        public CreateOTAVerifyJobRequestTag setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public CreateOTAVerifyJobRequestTag setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}
