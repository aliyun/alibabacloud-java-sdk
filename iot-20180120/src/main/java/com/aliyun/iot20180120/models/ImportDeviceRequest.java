// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class ImportDeviceRequest extends TeaModel {
    /**
     * <p>The DeviceName of the device.</p>
     * <p>The DeviceName must be 4 to 32 characters in length, and can contain letters, digits, hyphens (-), underscores (_), at signs (@), periods (.), and colons (:).</p>
     * <p>The DeviceName must be unique in the product.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>light</p>
     */
    @NameInMap("DeviceName")
    public String deviceName;

    /**
     * <p>The DeviceSecret of the device.</p>
     * <p>The DeviceSecret must be 1 to 32 characters in length, and can contain letters, digits, hyphens (-), underscores (_), at signs (@), periods (.), and colons (:).</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>b4d43f7******10ba5e5</p>
     */
    @NameInMap("DeviceSecret")
    public String deviceSecret;

    /**
     * <p>The instance ID. You can view the <strong>ID</strong> of the instance on the <strong>Overview</strong> page in the IoT Platform console.</p>
     * <blockquote>
     * <p> If your instance has an ID, you must specify this parameter. Otherwise, the request fails. If no Overview page exists or no instance ID is displayed, you do not need to specify this parameter.</p>
     * </blockquote>
     * <p>For more information, see <a href="https://help.aliyun.com/document_detail/356505.html">Overview</a> of IoT instances.</p>
     * 
     * <strong>example:</strong>
     * <p>iot-1n8t****</p>
     */
    @NameInMap("IotInstanceId")
    public String iotInstanceId;

    /**
     * <p>The alias of the device.</p>
     * <p>The alias must be 1 to 64 characters in length, and can contain letters, digits, and underscores (_).</p>
     * <blockquote>
     * <p>If you do not specify this parameter, IoT Platform does not generate an alias for the device.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>Campus light</p>
     */
    @NameInMap("Nickname")
    public String nickname;

    /**
     * <p>The <strong>ProductKey</strong> of the gateway product to which the device belongs.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>a1BwAGV****</p>
     */
    @NameInMap("ProductKey")
    public String productKey;

    /**
     * <p>The serial number (SN) of the device.</p>
     * <p>The SN must be 1 to 64 characters in length, and can contain letters, digits, and underscores (_).</p>
     * <blockquote>
     * <p>If you do not specify this parameter, IoT Platform does not generate an SN for the device.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>QC4******001</p>
     */
    @NameInMap("Sn")
    public String sn;

    public static ImportDeviceRequest build(java.util.Map<String, ?> map) throws Exception {
        ImportDeviceRequest self = new ImportDeviceRequest();
        return TeaModel.build(map, self);
    }

    public ImportDeviceRequest setDeviceName(String deviceName) {
        this.deviceName = deviceName;
        return this;
    }
    public String getDeviceName() {
        return this.deviceName;
    }

    public ImportDeviceRequest setDeviceSecret(String deviceSecret) {
        this.deviceSecret = deviceSecret;
        return this;
    }
    public String getDeviceSecret() {
        return this.deviceSecret;
    }

    public ImportDeviceRequest setIotInstanceId(String iotInstanceId) {
        this.iotInstanceId = iotInstanceId;
        return this;
    }
    public String getIotInstanceId() {
        return this.iotInstanceId;
    }

    public ImportDeviceRequest setNickname(String nickname) {
        this.nickname = nickname;
        return this;
    }
    public String getNickname() {
        return this.nickname;
    }

    public ImportDeviceRequest setProductKey(String productKey) {
        this.productKey = productKey;
        return this;
    }
    public String getProductKey() {
        return this.productKey;
    }

    public ImportDeviceRequest setSn(String sn) {
        this.sn = sn;
        return this;
    }
    public String getSn() {
        return this.sn;
    }

}
