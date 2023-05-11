// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class CreateOTADynamicUpgradeJobRequest extends TeaModel {
    /**
     * <p>Specifies whether the device supports simultaneous updates of multiple modules. Default value: false. Valid values:</p>
     * <br>
     * <p>*   **false**</p>
     * <br>
     * <p>*   **true**: In this case, do not set **OverwriteMode** to **2**.********</p>
     * <br>
     * <p>    The update tasks for the same module are overwritten. The update tasks that are in progress are not overwritten. The update tasks of the modules do not affect each other.</p>
     * <br>
     * <p>>*   Only Enterprise Edition instances and new public instances are supported.</p>
     * <p>>*   You must use Link SDK for C 4.x to develop the device.</p>
     * <p>>*   If you initiate a group-based dynamic update batch, the settings of **MultiModuleMode** and **OverwriteMode** must be the same as those in the existing dynamic update batch of the group.</p>
     * <br>
     * <p>For more information, see [Overview](~~58328~~).</p>
     */
    @NameInMap("DownloadProtocol")
    public String downloadProtocol;

    /**
     * <p>Specifies whether to automatically push update tasks from IoT Platform to devices. Default value: true. Valid values:</p>
     * <br>
     * <p>*   **true**: After an update batch is created, IoT Platform automatically pushes update tasks to the specified online devices.</p>
     * <br>
     * <p>    In this case, a device can still initiate a request to obtain the information about the over-the-air (OTA) update task from IoT Platform.</p>
     * <br>
     * <p>*   **false**: A device must initiate a request to obtain the information about the OTA update task from IoT Platform.</p>
     */
    @NameInMap("DynamicMode")
    public Integer dynamicMode;

    /**
     * <p>The **ProductKey** of the product to which the update package belongs.</p>
     * <br>
     * <p>A **ProductKey** is the unique identifier of a product in IoT Platform. You can view the information about all products within the current Alibaba Cloud account in the IoT Platform console or by calling the [QueryProductList](~~69271~~) operation.</p>
     */
    @NameInMap("FirmwareId")
    public String firmwareId;

    /**
     * <p>The type of the group. Valid value: **LINK_PLATFORM_DYNAMIC**.</p>
     * <br>
     * <p>*   If you specify this parameter, you must also specify the **GroupId** parameter. In this case, do not specify the **SrcVersion.N** parameter.</p>
     * <p>*   If you do not specify this parameter, you do not need to specify the **GroupId** parameter. In this case, you must specify the **SrcVersion.N** parameter.</p>
     */
    @NameInMap("GroupId")
    public String groupId;

    /**
     * <p>The download protocol of the update package. Valid values: **HTTPS** and **MQTT**. Default value: HTTPS. After the device receives the update package information pushed by IoT Platform, this protocol is used to download the update package.</p>
     * <br>
     * <p>> If you need to download the update package over MQTT, take note of the following items:</p>
     * <p>>*   Your service must be deployed in the China (Shanghai) region.</p>
     * <p>>*   The OTA update package can contain only one file, and the size of the file cannot exceed 16 MB.</p>
     * <p>>*   You must use the latest version of Link SDK for C to develop the device features to perform OTA updates and download files over MQTT. For more information, see [Sample code](~~330985~~).</p>
     */
    @NameInMap("GroupType")
    public String groupType;

    /**
     * <p>The ID of the update package.</p>
     * <br>
     * <p>An update package ID is returned when you call the [CreateOTAFirmware](~~147311~~) operation to create the update package.</p>
     * <br>
     * <p>You can also call the [ListOTAFirmware](~~147450~~) operation to obtain the ID.</p>
     */
    @NameInMap("IotInstanceId")
    public String iotInstanceId;

    /**
     * <p>Specifies whether to overwrite the previous update task. Default value: 1. Valid values:</p>
     * <br>
     * <p>*   **1**: The previous update task is not overwritten. If a device already has an update task, the previous update task is implemented.</p>
     * <p>*   **2**: The previous update task is overwritten. Only the current update task is implemented. In this case, you cannot set **MultiModuleMode** to **true**.</p>
     * <br>
     * <p>>  The update task that is in progress is not overwritten.</p>
     */
    @NameInMap("MaximumPerMinute")
    public Integer maximumPerMinute;

    /**
     * <p>The list of firmware versions to be updated.</p>
     * <br>
     * <p>*   If you specify this parameter, do not specify the **GroupId** and **GroupType** parameters.</p>
     * <p>*   If you do not specify this parameter, you must specify the **GroupId** and **GroupType** parameters.</p>
     * <br>
     * <p>> If you use differential update packages to perform dynamic update tasks on dynamic groups, you do not need to specify this parameter.</p>
     * <p>>*   If you use differential update packages to perform dynamic update tasks based on versions, the value of this parameter must be the same as the value of **SrcVersion**.</p>
     * <p>>*   You can call the [QueryDeviceDetail](~~69594~~) operation and view the **FirmwareVersion** parameter in the response.</p>
     * <p>>*   The version numbers must be unique in the list.</p>
     * <p>>*   You can specify a maximum of 10 version numbers.</p>
     */
    @NameInMap("MultiModuleMode")
    public Boolean multiModuleMode;

    /**
     * <p>The ID of the group.</p>
     * <br>
     * <p>*   If you specify this parameter, you must also specify the **GroupType** parameter. In this case, do not specify the **SrcVersion.N** parameter.</p>
     * <p>*   If you do not specify this parameter, you do not need to specify the **GroupType** parameter. In this case, you must specify the **SrcVersion.N** parameter.</p>
     * <br>
     * <p>You can call the [QueryDeviceGroupList](~~93356~~) operation to query the **GroupId** parameter.</p>
     */
    @NameInMap("NeedConfirm")
    public Boolean needConfirm;

    /**
     * <p>Specifies whether to control the update by using a mobile app. You must develop the mobile app as needed. Default value: false. Valid values:</p>
     * <br>
     * <p>*   **false**: A device obtains the information about the OTA update task based on the **NeedPush** parameter.</p>
     * <p>*   **true**: To perform an OTA update on a device, you must confirm the update by using your mobile app. Then, the device can obtain the information about the OTA update task based on the **NeedPush** parameter.</p>
     */
    @NameInMap("NeedPush")
    public Boolean needPush;

    /**
     * <p>The mode of dynamic update. Default value: 1. Valid values:</p>
     * <br>
     * <p>*   **1**: constantly updates the devices that meet the conditions.</p>
     * <p>*   **2**: updates only the devices that subsequently submit the latest firmware versions.</p>
     */
    @NameInMap("OverwriteMode")
    public Integer overwriteMode;

    /**
     * <p>The automatic retry interval if a device fails to be updated. Unit: minutes. Valid values:</p>
     * <br>
     * <p>*   **0**: An automatic retry is immediately performed.</p>
     * <p>*   **10**: An automatic retry is performed after 10 minutes.</p>
     * <p>*   **30**: An automatic retry is performed after 30 minutes.</p>
     * <p>*   **60**: An automatic retry is performed after 60 minutes (1 hour).</p>
     * <p>*   **1440**: An automatic retry is performed after 1,440 minutes (24 hours).</p>
     * <br>
     * <p>> The value of the **RetryInterval** parameter must be less than the value of the **TimeoutInMinutes** parameter. Examples:</p>
     * <p>>*   If the value of the **TimeoutInMinutes** parameter is set to 60, the maximum value of the **RetryInterval** parameter is 30.</p>
     * <p>>*   If the value of the **TimeoutInMinutes** parameter is set to 1440, the maximum value of the **RetryInterval** parameter is 60.</p>
     * <br>
     * <p>If the value of the **RetryInterval** parameter is set to 1440, we recommend that you do not specify the **TimeoutInMinutes** parameter. If an update times out, no retry is performed.</p>
     * <br>
     * <p>If you do not specify this parameter, no retry is performed.</p>
     */
    @NameInMap("ProductKey")
    public String productKey;

    /**
     * <p>The timeout period of the update. If the device is not updated within the specified period, a timeout error occurs. Unit: minutes. Valid values: 1 to 1440.</p>
     * <br>
     * <p>> *   The timeout period starts from the time when the specified device submits the update progress for the first time. During the update, the update package may be repeatedly pushed to the specified device because the device goes online and offline multiple times. The start time of the update period remains unchanged.</p>
     * <p>>*   If an update fails due to timeout, no retry is triggered.</p>
     * <br>
     * <p>If you do not specify this parameter, timeout errors do not occur.</p>
     */
    @NameInMap("RetryCount")
    public Integer retryCount;

    /**
     * <p>The number of automatic retries.</p>
     * <br>
     * <p>If you specify the **RetryInterval** parameter, you must specify this parameter.</p>
     * <br>
     * <p>Valid values:</p>
     * <br>
     * <p>*   **1**: retries once.</p>
     * <p>*   **2**: retries twice.</p>
     * <p>*   **5**: retries five times.</p>
     */
    @NameInMap("RetryInterval")
    public Integer retryInterval;

    @NameInMap("SrcVersion")
    public java.util.List<String> srcVersion;

    @NameInMap("Tag")
    public java.util.List<CreateOTADynamicUpgradeJobRequestTag> tag;

    /**
     * <p>The maximum number of devices to which the download URL of the update package is pushed per minute. Valid values: 10 to 10000.</p>
     * <br>
     * <p>Default value: 10000.</p>
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
         * <br>
         * <p>>  Update batch tags are optional. If you want to specify a tag, you must specify the Tag.N.Value and Tag.N.Key parameters in pair.</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The error code returned if the call fails. For more information, see [Error codes](~~87387~~).</p>
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
