// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class CreateLoRaNodesTaskRequest extends TeaModel {
    /**
     * <p>The LoRaWAN devices.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("DeviceInfo")
    public java.util.List<CreateLoRaNodesTaskRequestDeviceInfo> deviceInfo;

    /**
     * <p>The instance ID. You can view the <strong>ID</strong> of the instance on the <strong>Overview</strong> page in the IoT Platform console.</p>
     * <blockquote>
     * <p> If your instance has an ID, you must specify this parameter. Otherwise, the request fails. If no Overview page exists or no instance ID is displayed, you do not need to specify this parameter.</p>
     * </blockquote>
     * <p>For more information, see the <a href="https://help.aliyun.com/document_detail/356505.html">Overview</a> topic of IoT instances.</p>
     * 
     * <strong>example:</strong>
     * <p>iot_instc_pu****_c*-v64********</p>
     */
    @NameInMap("IotInstanceId")
    public String iotInstanceId;

    /**
     * <p>The ProductKey of the product to which the devices belong.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>a1BwAGV****</p>
     */
    @NameInMap("ProductKey")
    public String productKey;

    public static CreateLoRaNodesTaskRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateLoRaNodesTaskRequest self = new CreateLoRaNodesTaskRequest();
        return TeaModel.build(map, self);
    }

    public CreateLoRaNodesTaskRequest setDeviceInfo(java.util.List<CreateLoRaNodesTaskRequestDeviceInfo> deviceInfo) {
        this.deviceInfo = deviceInfo;
        return this;
    }
    public java.util.List<CreateLoRaNodesTaskRequestDeviceInfo> getDeviceInfo() {
        return this.deviceInfo;
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

    public static class CreateLoRaNodesTaskRequestDeviceInfo extends TeaModel {
        /**
         * <p>The DevEUI of the LoRaWAN device.</p>
         * 
         * <strong>example:</strong>
         * <p>d896e0efff00****</p>
         */
        @NameInMap("DevEui")
        public String devEui;

        /**
         * <p>The PIN code of the LoRaWAN device. The value of the parameter is used to verify the DevEUI.</p>
         * 
         * <strong>example:</strong>
         * <p>123***</p>
         */
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
