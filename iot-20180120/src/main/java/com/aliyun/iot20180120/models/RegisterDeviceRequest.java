// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class RegisterDeviceRequest extends TeaModel {
    /**
     * <p>The AppKey of the LoRaWAN device.</p>
     * <p>When you create a LoRaWAN device, set <strong>LoraNodeType</strong> to <strong>USERDEFINED</strong>. This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>674f***</p>
     */
    @NameInMap("AppKey")
    public String appKey;

    /**
     * <p>The DevEUI of the LoRaWAN device.</p>
     * <p>This parameter is required when you create a LoRaWAN device.</p>
     * 
     * <strong>example:</strong>
     * <p>e8SDdgeIlk3nED****</p>
     */
    @NameInMap("DevEui")
    public String devEui;

    /**
     * <p>The DeviceName of the device. The name must be 4 to 32 characters in length, and can contain letters, digits, hyphens (-), underscores (_), at signs (@), periods (.), and colons (:).</p>
     * <p>You can use a combination of the DeviceName and ProductKey parameters to identify a device.</p>
     * <blockquote>
     * <p> If you do not specify this parameter, IoT Platform randomly generates a DeviceName.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>light</p>
     */
    @NameInMap("DeviceName")
    public String deviceName;

    /**
     * <p>The ID of the instance. You can view the instance <strong>ID</strong> on the <strong>Overview</strong> page in the IoT Platform console.</p>
     * <blockquote>
     * <ul>
     * <li>If your instance has an ID, you must configure this parameter. If you do not set this parameter, the call fails.</li>
     * <li>If your instance has no <strong>Overview</strong> page or ID, you do not need to set this parameter.</li>
     * </ul>
     * </blockquote>
     * <p>For more information, see <a href="https://help.aliyun.com/document_detail/356505.html">Overview</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>iot_instc_pu****_c*-v64********</p>
     */
    @NameInMap("IotInstanceId")
    public String iotInstanceId;

    /**
     * <p>The JoinEUI of the LoRaWAN device.</p>
     * <p>When you create a LoRaWAN device, set <strong>LoraNodeType</strong> to <strong>USERDEFINED</strong>. This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>Ede4tde8erth****</p>
     */
    @NameInMap("JoinEui")
    public String joinEui;

    /**
     * <p>The type of the LoRaWAN device. Valid values:</p>
     * <ul>
     * <li><strong>ALIYUNDEFINED</strong>: The device is issued by Alibaba Cloud. You must specify <strong>DevEui</strong> and <strong>PinCode</strong>.</li>
     * <li><strong>USERDEFINED</strong>: The device is user-defined. You must specify <strong>DevEui</strong>, <strong>JoinEui</strong>, and <strong>AppKey</strong>.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>ALIYUNDEFINED</p>
     */
    @NameInMap("LoraNodeType")
    public String loraNodeType;

    /**
     * <p>The alias of the device. The alias must be 4 to 64 characters in length, and can contain letters, digits, and underscores (_).</p>
     * <blockquote>
     * <p> If you do not specify this parameter, IoT Platform does not generate an alias for the device.</p>
     * </blockquote>
     */
    @NameInMap("Nickname")
    public String nickname;

    /**
     * <p>The PIN code of the LoRaWAN device. This parameter is used to verify the DevEUI.</p>
     * <p>When you create a LoRaWAN device, set <strong>LoraNodeType</strong> to <strong>ALIYUNDEFINED</strong>. This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>DIe80dfeg*****</p>
     */
    @NameInMap("PinCode")
    public String pinCode;

    /**
     * <p>The ProductKey of the product to which the device belongs. A ProductKey is a GUID that is issued by IoT Platform to a product.</p>
     * <p>You can use the IoT Platform console or call the <a href="https://help.aliyun.com/document_detail/69271.html">QueryProductList</a> operation to view the information about all products within the current account.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>a1BwAGV****</p>
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
