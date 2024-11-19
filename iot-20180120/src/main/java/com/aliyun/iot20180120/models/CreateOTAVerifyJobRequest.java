// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class CreateOTAVerifyJobRequest extends TeaModel {
    /**
     * <p>The download protocol of the update package. Valid values: <strong>HTTPS</strong> and <strong>MQTT</strong>. Default value: HTTPS. After the device receives the update package information pushed by IoT Platform, this protocol is used to download the update package.</p>
     * <blockquote>
     * <p>If you want to download the update package over MQTT, take note of the following items:</p>
     * <ul>
     * <li>The following regions are supported: China (Shanghai), China (Beijing), and China (Shenzhen).</li>
     * <li>The OTA update package can contain only one file and the size of the file cannot exceed 16 MB.</li>
     * <li>You must use the latest version of Link SDK for C to develop the device features to perform OTA updates and download files over MQTT. For more information, see <a href="https://help.aliyun.com/document_detail/330985.html">Sample code</a>.</li>
     * </ul>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>HTTPS</p>
     */
    @NameInMap("DownloadProtocol")
    public String downloadProtocol;

    /**
     * <p>The ID of the update package.</p>
     * <p>The <strong>FirmwareId</strong> parameter is returned when you call the <a href="https://help.aliyun.com/document_detail/147311.html">CreateOTAFirmware</a> operation to create an OTA update package.</p>
     * <p>You can also call the <a href="https://help.aliyun.com/document_detail/147450.html">ListOTAFirmware</a> operation to obtain the ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>nx3xxVvFdwvn6dim50PY03****</p>
     */
    @NameInMap("FirmwareId")
    public String firmwareId;

    /**
     * <p>The ID of the instance. You can view the ID of an instance on the <strong>Overview</strong> page in the IoT Platform console.</p>
     * <blockquote>
     * <ul>
     * <li>If your instance has an ID, you must specify the ID for this parameter. Otherwise, the call fails.****</li>
     * <li>If no <strong>Overview</strong> page or <strong>ID</strong> is generated for your instance, you do not need to configure this parameter.</li>
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
     * <p>Specifies whether to control the update by using a mobile app. You must develop the mobile app as needed.</p>
     * <ul>
     * <li><strong>false</strong> (default): no. A device obtains the information about the OTA update task based on the <strong>NeedPush</strong> parameter.</li>
     * <li><strong>true</strong>: yes To perform an OTA update on a device, you must confirm the update by using your mobile app. Then, the device can obtain the information about the OTA update task based on the <strong>NeedPush</strong> parameter.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("NeedConfirm")
    public Boolean needConfirm;

    /**
     * <p>Specifies whether to automatically push update tasks from IoT Platform to devices.</p>
     * <ul>
     * <li><p><strong>true</strong> (default): yes. After an update batch is created, IoT Platform automatically pushes update tasks to the specified online devices.</p>
     * <p>In this case, a device can still initiate a request to obtain the information about the over-the-air (OTA) update task from IoT Platform.</p>
     * </li>
     * <li><p><strong>false</strong>: no. A device must initiate a request to obtain the information about the OTA update task from IoT Platform.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("NeedPush")
    public Boolean needPush;

    /**
     * <p>The ProductKey of the product to which the OTA update package belongs.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>a1VJwBw****</p>
     */
    @NameInMap("ProductKey")
    public String productKey;

    @NameInMap("Tag")
    public java.util.List<CreateOTAVerifyJobRequestTag> tag;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>testdevice</p>
     */
    @NameInMap("TargetDeviceName")
    public java.util.List<String> targetDeviceName;

    /**
     * <p>The timeout period for a device to update the firmware. Unit: minutes. Valid values: 1 to 1440.</p>
     * 
     * <strong>example:</strong>
     * <p>1440</p>
     */
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
        /**
         * <p>The key of the update batch tag. The key must be 1 to 30 characters in length and can contain letters, digits, and periods (.). You can add up to 10 tags for each update batch.</p>
         * <p>The tags of an update batch are sent to devices when IoT Platform pushes update notifications to the devices.</p>
         * <blockquote>
         * <p> Update batch tags are optional. If you want to specify a tag, you must specify the Tag.N.Value and Tag.N.Key parameters in pair.</p>
         * </blockquote>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>key1</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The value of the update batch tag. The value must be 1 to 1,024 characters in length. You can add up to 10 tags for each update batch. The total length of the tag keys and tag values of all update batches cannot exceed 4,096 characters.</p>
         * <blockquote>
         * <p> Update batch tags are optional. If you want to specify a tag, you must specify the Tag.N.Value and Tag.N.Key parameters in pair.</p>
         * </blockquote>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>value1</p>
         */
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
