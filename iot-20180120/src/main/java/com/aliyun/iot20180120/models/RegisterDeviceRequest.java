// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class RegisterDeviceRequest extends TeaModel {
    /**
     * <p>The AppKey of the LoRaWAN device.</p>
     * <br>
     * <p>When you create a LoRaWAN device, set **LoraNodeType** to **USERDEFINED**. This parameter is required.</p>
     */
    @NameInMap("AppKey")
    public String appKey;

    /**
     * <p>The DevEUI of the LoRaWAN device.</p>
     * <br>
     * <p>This parameter is required when you create a LoRaWAN device.</p>
     */
    @NameInMap("DevEui")
    public String devEui;

    /**
     * <p>The DeviceName of the device. The name must be 4 to 32 characters in length, and can contain letters, digits, hyphens (-), underscores (\_), at signs (@), periods (.), and colons (:).</p>
     * <br>
     * <p>You can use a combination of the DeviceName and ProductKey parameters to identify a device.</p>
     * <br>
     * <p>>  If you do not specify this parameter, IoT Platform randomly generates a DeviceName.</p>
     */
    @NameInMap("DeviceName")
    public String deviceName;

    /**
     * <p>The ID of the instance. You can view the instance **ID** on the **Overview** page in the IoT Platform console.</p>
     * <br>
     * <p>>*   If your instance has an ID, you must configure this parameter. If you do not set this parameter, the call fails.</p>
     * <p>>*   If your instance has no **Overview** page or ID, you do not need to set this parameter.</p>
     * <br>
     * <p>For more information, see [Overview](~~356505~~).</p>
     */
    @NameInMap("IotInstanceId")
    public String iotInstanceId;

    /**
     * <p>The JoinEUI of the LoRaWAN device.</p>
     * <br>
     * <p>When you create a LoRaWAN device, set **LoraNodeType** to **USERDEFINED**. This parameter is required.</p>
     */
    @NameInMap("JoinEui")
    public String joinEui;

    /**
     * <p>The type of the LoRaWAN device. Valid values:</p>
     * <br>
     * <p>*   **ALIYUNDEFINED**: The device is issued by Alibaba Cloud. You must specify **DevEui** and **PinCode**.</p>
     * <p>*   **USERDEFINED**: The device is user-defined. You must specify **DevEui**, **JoinEui**, and **AppKey**.</p>
     */
    @NameInMap("LoraNodeType")
    public String loraNodeType;

    /**
     * <p>The alias of the device. The alias must be 4 to 64 characters in length, and can contain letters, digits, and underscores (\_).</p>
     * <br>
     * <p>>  If you do not specify this parameter, IoT Platform does not generate an alias for the device.</p>
     */
    @NameInMap("Nickname")
    public String nickname;

    /**
     * <p>The PIN code of the LoRaWAN device. This parameter is used to verify the DevEUI.</p>
     * <br>
     * <p>When you create a LoRaWAN device, set **LoraNodeType** to **ALIYUNDEFINED**. This parameter is required.</p>
     */
    @NameInMap("PinCode")
    public String pinCode;

    /**
     * <p>The ProductKey of the product to which the device belongs. A ProductKey is a GUID that is issued by IoT Platform to a product.</p>
     * <br>
     * <p>You can use the IoT Platform console or call the [QueryProductList](~~69271~~) operation to view the information about all products within the current account.</p>
     */
    @NameInMap("ProductKey")
    public String productKey;

    public static RegisterDeviceRequest build(java.util.Map<String, ?> map) throws Exception {
        RegisterDeviceRequest self = new RegisterDeviceRequest();
        return TeaModel.build(map, self);
    }

    public RegisterDeviceRequest setAppKey(String appKey) {
        this.appKey = appKey;
        return this;
    }
    public String getAppKey() {
        return this.appKey;
    }

    public RegisterDeviceRequest setDevEui(String devEui) {
        this.devEui = devEui;
        return this;
    }
    public String getDevEui() {
        return this.devEui;
    }

    public RegisterDeviceRequest setDeviceName(String deviceName) {
        this.deviceName = deviceName;
        return this;
    }
    public String getDeviceName() {
        return this.deviceName;
    }

    public RegisterDeviceRequest setIotInstanceId(String iotInstanceId) {
        this.iotInstanceId = iotInstanceId;
        return this;
    }
    public String getIotInstanceId() {
        return this.iotInstanceId;
    }

    public RegisterDeviceRequest setJoinEui(String joinEui) {
        this.joinEui = joinEui;
        return this;
    }
    public String getJoinEui() {
        return this.joinEui;
    }

    public RegisterDeviceRequest setLoraNodeType(String loraNodeType) {
        this.loraNodeType = loraNodeType;
        return this;
    }
    public String getLoraNodeType() {
        return this.loraNodeType;
    }

    public RegisterDeviceRequest setNickname(String nickname) {
        this.nickname = nickname;
        return this;
    }
    public String getNickname() {
        return this.nickname;
    }

    public RegisterDeviceRequest setPinCode(String pinCode) {
        this.pinCode = pinCode;
        return this;
    }
    public String getPinCode() {
        return this.pinCode;
    }

    public RegisterDeviceRequest setProductKey(String productKey) {
        this.productKey = productKey;
        return this;
    }
    public String getProductKey() {
        return this.productKey;
    }

}
