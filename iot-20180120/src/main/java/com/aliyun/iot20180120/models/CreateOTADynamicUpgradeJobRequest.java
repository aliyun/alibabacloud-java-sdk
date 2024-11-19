// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class CreateOTADynamicUpgradeJobRequest extends TeaModel {
    /**
     * <p>Specifies whether the device supports simultaneous updates of multiple modules. Default value: false. Valid values:</p>
     * <ul>
     * <li><p><strong>false</strong></p>
     * </li>
     * <li><p><strong>true</strong>: In this case, do not set <strong>OverwriteMode</strong> to <strong>2</strong>.********</p>
     * <p>The update tasks for the same module are overwritten. The update tasks that are in progress are not overwritten. The update tasks of the modules do not affect each other.</p>
     * </li>
     * </ul>
     * <blockquote>
     * <ul>
     * <li>Only Enterprise Edition instances and new public instances are supported.</li>
     * <li>You must use Link SDK for C 4.x to develop the device.</li>
     * <li>If you initiate a group-based dynamic update batch, the settings of <strong>MultiModuleMode</strong> and <strong>OverwriteMode</strong> must be the same as those in the existing dynamic update batch of the group.</li>
     * </ul>
     * </blockquote>
     * <p>For more information, see <a href="https://help.aliyun.com/document_detail/58328.html">Overview</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>HTTPS</p>
     */
    @NameInMap("DownloadProtocol")
    public String downloadProtocol;

    /**
     * <p>Specifies whether to automatically push update tasks from IoT Platform to devices. Default value: true. Valid values:</p>
     * <ul>
     * <li><p><strong>true</strong>: After an update batch is created, IoT Platform automatically pushes update tasks to the specified online devices.</p>
     * <p>In this case, a device can still initiate a request to obtain the information about the over-the-air (OTA) update task from IoT Platform.</p>
     * </li>
     * <li><p><strong>false</strong>: A device must initiate a request to obtain the information about the OTA update task from IoT Platform.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("DynamicMode")
    public Integer dynamicMode;

    /**
     * <p>The <strong>ProductKey</strong> of the product to which the update package belongs.</p>
     * <p>A <strong>ProductKey</strong> is the unique identifier of a product in IoT Platform. You can view the information about all products within the current Alibaba Cloud account in the IoT Platform console or by calling the <a href="https://help.aliyun.com/document_detail/69271.html">QueryProductList</a> operation.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>nx3xxVvFdwvn6dim50PY03****</p>
     */
    @NameInMap("FirmwareId")
    public String firmwareId;

    /**
     * <p>The type of the group. Valid value: <strong>LINK_PLATFORM_DYNAMIC</strong>.</p>
     * <ul>
     * <li>If you specify this parameter, you must also specify the <strong>GroupId</strong> parameter. In this case, do not specify the <strong>SrcVersion.N</strong> parameter.</li>
     * <li>If you do not specify this parameter, you do not need to specify the <strong>GroupId</strong> parameter. In this case, you must specify the <strong>SrcVersion.N</strong> parameter.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>IwOwQj7DJ***</p>
     */
    @NameInMap("GroupId")
    public String groupId;

    /**
     * <p>The download protocol of the update package. Valid values: <strong>HTTPS</strong> and <strong>MQTT</strong>. Default value: HTTPS. After the device receives the update package information pushed by IoT Platform, this protocol is used to download the update package.</p>
     * <blockquote>
     * <p>If you need to download the update package over MQTT, take note of the following items:</p>
     * <ul>
     * <li>Your service must be deployed in the China (Shanghai) region.</li>
     * <li>The OTA update package can contain only one file, and the size of the file cannot exceed 16 MB.</li>
     * <li>You must use the latest version of Link SDK for C to develop the device features to perform OTA updates and download files over MQTT. For more information, see <a href="https://help.aliyun.com/document_detail/330985.html">Sample code</a>.</li>
     * </ul>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>LINK_PLATFORM_DYNAMIC</p>
     */
    @NameInMap("GroupType")
    public String groupType;

    /**
     * <p>The ID of the update package.</p>
     * <p>An update package ID is returned when you call the <a href="https://help.aliyun.com/document_detail/147311.html">CreateOTAFirmware</a> operation to create the update package.</p>
     * <p>You can also call the <a href="https://help.aliyun.com/document_detail/147450.html">ListOTAFirmware</a> operation to obtain the ID.</p>
     * 
     * <strong>example:</strong>
     * <p>iot-cn-0pp1n8t****</p>
     */
    @NameInMap("IotInstanceId")
    public String iotInstanceId;

    /**
     * <p>Specifies whether to overwrite the previous update task. Default value: 1. Valid values:</p>
     * <ul>
     * <li><strong>1</strong>: The previous update task is not overwritten. If a device already has an update task, the previous update task is implemented.</li>
     * <li><strong>2</strong>: The previous update task is overwritten. Only the current update task is implemented. In this case, you cannot set <strong>MultiModuleMode</strong> to <strong>true</strong>.</li>
     * </ul>
     * <blockquote>
     * <p> The update task that is in progress is not overwritten.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>1000</p>
     */
    @NameInMap("MaximumPerMinute")
    public Integer maximumPerMinute;

    /**
     * <p>The list of firmware versions to be updated.</p>
     * <ul>
     * <li>If you specify this parameter, do not specify the <strong>GroupId</strong> and <strong>GroupType</strong> parameters.</li>
     * <li>If you do not specify this parameter, you must specify the <strong>GroupId</strong> and <strong>GroupType</strong> parameters.</li>
     * </ul>
     * <blockquote>
     * <p>If you use differential update packages to perform dynamic update tasks on dynamic groups, you do not need to specify this parameter.</p>
     * <ul>
     * <li>If you use differential update packages to perform dynamic update tasks based on versions, the value of this parameter must be the same as the value of <strong>SrcVersion</strong>.</li>
     * <li>You can call the <a href="https://help.aliyun.com/document_detail/69594.html">QueryDeviceDetail</a> operation and view the <strong>FirmwareVersion</strong> parameter in the response.</li>
     * <li>The version numbers must be unique in the list.</li>
     * <li>You can specify a maximum of 10 version numbers.</li>
     * </ul>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("MultiModuleMode")
    public Boolean multiModuleMode;

    /**
     * <p>The ID of the group.</p>
     * <ul>
     * <li>If you specify this parameter, you must also specify the <strong>GroupType</strong> parameter. In this case, do not specify the <strong>SrcVersion.N</strong> parameter.</li>
     * <li>If you do not specify this parameter, you do not need to specify the <strong>GroupType</strong> parameter. In this case, you must specify the <strong>SrcVersion.N</strong> parameter.</li>
     * </ul>
     * <p>You can call the <a href="https://help.aliyun.com/document_detail/93356.html">QueryDeviceGroupList</a> operation to query the <strong>GroupId</strong> parameter.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("NeedConfirm")
    public Boolean needConfirm;

    /**
     * <p>Specifies whether to control the update by using a mobile app. You must develop the mobile app as needed. Default value: false. Valid values:</p>
     * <ul>
     * <li><strong>false</strong>: A device obtains the information about the OTA update task based on the <strong>NeedPush</strong> parameter.</li>
     * <li><strong>true</strong>: To perform an OTA update on a device, you must confirm the update by using your mobile app. Then, the device can obtain the information about the OTA update task based on the <strong>NeedPush</strong> parameter.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("NeedPush")
    public Boolean needPush;

    /**
     * <p>The mode of dynamic update. Default value: 1. Valid values:</p>
     * <ul>
     * <li><strong>1</strong>: constantly updates the devices that meet the conditions.</li>
     * <li><strong>2</strong>: updates only the devices that subsequently submit the latest firmware versions.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("OverwriteMode")
    public Integer overwriteMode;

    /**
     * <p>The automatic retry interval if a device fails to be updated. Unit: minutes. Valid values:</p>
     * <ul>
     * <li><strong>0</strong>: An automatic retry is immediately performed.</li>
     * <li><strong>10</strong>: An automatic retry is performed after 10 minutes.</li>
     * <li><strong>30</strong>: An automatic retry is performed after 30 minutes.</li>
     * <li><strong>60</strong>: An automatic retry is performed after 60 minutes (1 hour).</li>
     * <li><strong>1440</strong>: An automatic retry is performed after 1,440 minutes (24 hours).</li>
     * </ul>
     * <blockquote>
     * <p>The value of the <strong>RetryInterval</strong> parameter must be less than the value of the <strong>TimeoutInMinutes</strong> parameter. Examples:</p>
     * <ul>
     * <li>If the value of the <strong>TimeoutInMinutes</strong> parameter is set to 60, the maximum value of the <strong>RetryInterval</strong> parameter is 30.</li>
     * <li>If the value of the <strong>TimeoutInMinutes</strong> parameter is set to 1440, the maximum value of the <strong>RetryInterval</strong> parameter is 60.</li>
     * </ul>
     * </blockquote>
     * <p>If the value of the <strong>RetryInterval</strong> parameter is set to 1440, we recommend that you do not specify the <strong>TimeoutInMinutes</strong> parameter. If an update times out, no retry is performed.</p>
     * <p>If you do not specify this parameter, no retry is performed.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>a1Le6d0****</p>
     */
    @NameInMap("ProductKey")
    public String productKey;

    /**
     * <p>The timeout period of the update. If the device is not updated within the specified period, a timeout error occurs. Unit: minutes. Valid values: 1 to 1440.</p>
     * <blockquote>
     * <ul>
     * <li>The timeout period starts from the time when the specified device submits the update progress for the first time. During the update, the update package may be repeatedly pushed to the specified device because the device goes online and offline multiple times. The start time of the update period remains unchanged.</li>
     * <li>If an update fails due to timeout, no retry is triggered.</li>
     * </ul>
     * </blockquote>
     * <p>If you do not specify this parameter, timeout errors do not occur.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("RetryCount")
    public Integer retryCount;

    /**
     * <p>The number of automatic retries.</p>
     * <p>If you specify the <strong>RetryInterval</strong> parameter, you must specify this parameter.</p>
     * <p>Valid values:</p>
     * <ul>
     * <li><strong>1</strong>: retries once.</li>
     * <li><strong>2</strong>: retries twice.</li>
     * <li><strong>5</strong>: retries five times.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>60</p>
     */
    @NameInMap("RetryInterval")
    public Integer retryInterval;

    /**
     * <strong>example:</strong>
     * <p>V1.0.1</p>
     */
    @NameInMap("SrcVersion")
    public java.util.List<String> srcVersion;

    @NameInMap("Tag")
    public java.util.List<CreateOTADynamicUpgradeJobRequestTag> tag;

    /**
     * <p>The maximum number of devices to which the download URL of the update package is pushed per minute. Valid values: 10 to 10000.</p>
     * <p>Default value: 10000.</p>
     * 
     * <strong>example:</strong>
     * <p>1440</p>
     */
    @NameInMap("TimeoutInMinutes")
    public Integer timeoutInMinutes;

    public static CreateOTADynamicUpgradeJobRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateOTADynamicUpgradeJobRequest self = new CreateOTADynamicUpgradeJobRequest();
        return TeaModel.build(map, self);
    }

    public CreateOTADynamicUpgradeJobRequest setDownloadProtocol(String downloadProtocol) {
        this.downloadProtocol = downloadProtocol;
        return this;
    }
    public String getDownloadProtocol() {
        return this.downloadProtocol;
    }

    public CreateOTADynamicUpgradeJobRequest setDynamicMode(Integer dynamicMode) {
        this.dynamicMode = dynamicMode;
        return this;
    }
    public Integer getDynamicMode() {
        return this.dynamicMode;
    }

    public CreateOTADynamicUpgradeJobRequest setFirmwareId(String firmwareId) {
        this.firmwareId = firmwareId;
        return this;
    }
    public String getFirmwareId() {
        return this.firmwareId;
    }

    public CreateOTADynamicUpgradeJobRequest setGroupId(String groupId) {
        this.groupId = groupId;
        return this;
    }
    public String getGroupId() {
        return this.groupId;
    }

    public CreateOTADynamicUpgradeJobRequest setGroupType(String groupType) {
        this.groupType = groupType;
        return this;
    }
    public String getGroupType() {
        return this.groupType;
    }

    public CreateOTADynamicUpgradeJobRequest setIotInstanceId(String iotInstanceId) {
        this.iotInstanceId = iotInstanceId;
        return this;
    }
    public String getIotInstanceId() {
        return this.iotInstanceId;
    }

    public CreateOTADynamicUpgradeJobRequest setMaximumPerMinute(Integer maximumPerMinute) {
        this.maximumPerMinute = maximumPerMinute;
        return this;
    }
    public Integer getMaximumPerMinute() {
        return this.maximumPerMinute;
    }

    public CreateOTADynamicUpgradeJobRequest setMultiModuleMode(Boolean multiModuleMode) {
        this.multiModuleMode = multiModuleMode;
        return this;
    }
    public Boolean getMultiModuleMode() {
        return this.multiModuleMode;
    }

    public CreateOTADynamicUpgradeJobRequest setNeedConfirm(Boolean needConfirm) {
        this.needConfirm = needConfirm;
        return this;
    }
    public Boolean getNeedConfirm() {
        return this.needConfirm;
    }

    public CreateOTADynamicUpgradeJobRequest setNeedPush(Boolean needPush) {
        this.needPush = needPush;
        return this;
    }
    public Boolean getNeedPush() {
        return this.needPush;
    }

    public CreateOTADynamicUpgradeJobRequest setOverwriteMode(Integer overwriteMode) {
        this.overwriteMode = overwriteMode;
        return this;
    }
    public Integer getOverwriteMode() {
        return this.overwriteMode;
    }

    public CreateOTADynamicUpgradeJobRequest setProductKey(String productKey) {
        this.productKey = productKey;
        return this;
    }
    public String getProductKey() {
        return this.productKey;
    }

    public CreateOTADynamicUpgradeJobRequest setRetryCount(Integer retryCount) {
        this.retryCount = retryCount;
        return this;
    }
    public Integer getRetryCount() {
        return this.retryCount;
    }

    public CreateOTADynamicUpgradeJobRequest setRetryInterval(Integer retryInterval) {
        this.retryInterval = retryInterval;
        return this;
    }
    public Integer getRetryInterval() {
        return this.retryInterval;
    }

    public CreateOTADynamicUpgradeJobRequest setSrcVersion(java.util.List<String> srcVersion) {
        this.srcVersion = srcVersion;
        return this;
    }
    public java.util.List<String> getSrcVersion() {
        return this.srcVersion;
    }

    public CreateOTADynamicUpgradeJobRequest setTag(java.util.List<CreateOTADynamicUpgradeJobRequestTag> tag) {
        this.tag = tag;
        return this;
    }
    public java.util.List<CreateOTADynamicUpgradeJobRequestTag> getTag() {
        return this.tag;
    }

    public CreateOTADynamicUpgradeJobRequest setTimeoutInMinutes(Integer timeoutInMinutes) {
        this.timeoutInMinutes = timeoutInMinutes;
        return this;
    }
    public Integer getTimeoutInMinutes() {
        return this.timeoutInMinutes;
    }

    public static class CreateOTADynamicUpgradeJobRequestTag extends TeaModel {
        /**
         * <p>The value of the update batch tag. The value must be 1 to 1,024 characters in length. You can add up to 10 tags for each update batch. The total length of the tag keys and tag values of all update batches cannot exceed 4,096 characters in length.</p>
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
         * <p>The error code returned if the call fails. For more information, see <a href="https://help.aliyun.com/document_detail/87387.html">Error codes</a>.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>value1</p>
         */
        @NameInMap("Value")
        public String value;

        public static CreateOTADynamicUpgradeJobRequestTag build(java.util.Map<String, ?> map) throws Exception {
            CreateOTADynamicUpgradeJobRequestTag self = new CreateOTADynamicUpgradeJobRequestTag();
            return TeaModel.build(map, self);
        }

        public CreateOTADynamicUpgradeJobRequestTag setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public CreateOTADynamicUpgradeJobRequestTag setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}
