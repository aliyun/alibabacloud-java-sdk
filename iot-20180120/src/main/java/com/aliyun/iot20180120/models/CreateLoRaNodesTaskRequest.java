// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class CreateLoRaNodesTaskRequest extends TeaModel {
    @NameInMap("IotInstanceId")
    public String iotInstanceId;

    @NameInMap("ProductKey")
    @Validation(required = true)
    public String productKey;

    @NameInMap("DeviceInfo")
    @Validation(required = true)
    public java.util.List<CreateLoRaNodesTaskRequestDeviceInfo> deviceInfo;

    public static CreateLoRaNodesTaskRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateLoRaNodesTaskRequest self = new CreateLoRaNodesTaskRequest();
        return TeaModel.build(map, self);
    }

    public CreateLoRaNodesTaskRequest setIotInstanceId(String iotInstanceId) {
        this.iotInstanceId = iotInstanceId;
        return this;
    }
    public String getIotInstanceId() {
        return this.iotInstanceId;
    }

    public CreateLoRaNodesTaskRequest setProductKey(String productKey) {
        this.productKey = productKey;
        return this;
    }
    public String getProductKey() {
        return this.productKey;
    }

    public CreateLoRaNodesTaskRequest setDeviceInfo(java.util.List<CreateLoRaNodesTaskRequestDeviceInfo> deviceInfo) {
        this.deviceInfo = deviceInfo;
        return this;
    }
    public java.util.List<CreateLoRaNodesTaskRequestDeviceInfo> getDeviceInfo() {
        return this.deviceInfo;
    }

    public static class CreateLoRaNodesTaskRequestDeviceInfo extends TeaModel {
        @NameInMap("DevEui")
        public String devEui;

        @NameInMap("PinCode")
        public String pinCode;

        public static CreateLoRaNodesTaskRequestDeviceInfo build(java.util.Map<String, ?> map) throws Exception {
            CreateLoRaNodesTaskRequestDeviceInfo self = new CreateLoRaNodesTaskRequestDeviceInfo();
            return TeaModel.build(map, self);
        }

        public CreateLoRaNodesTaskRequestDeviceInfo setDevEui(String devEui) {
            this.devEui = devEui;
            return this;
        }
        public String getDevEui() {
            return this.devEui;
        }

        public CreateLoRaNodesTaskRequestDeviceInfo setPinCode(String pinCode) {
            this.pinCode = pinCode;
            return this;
        }
        public String getPinCode() {
            return this.pinCode;
        }

    }

}
