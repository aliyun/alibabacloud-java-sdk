// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class CreateOTAStaticUpgradeJobRequest extends TeaModel {
    /**
     * <p>The URL of the device list file that is used to perform a specific update.</p>
     * <br>
     * <p>> *   If you set the TargetSelection parameter to `SPECIFIC`, you must specify this parameter or the **TargetDeviceName.N** parameter. You cannot specify the two parameters at the same time.</p>
     * <p>>*   You can call the [GenerateDeviceNameListURL](~~186062~~) operation to generate a file URL. Then, you can perform the operations as prompted to upload the device list file.</p>
     * <p>>*   During a full update, the devices that have been updated are skipped.</p>
     * <p>>*   During a delta update, the devices that have been updated and the devices whose initial version numbers are different from the update package are skipped.</p>
     */
    @NameInMap("DnListFileUrl")
    public String dnListFileUrl;

    /**
     * <p>The download protocol of the update package. Valid values: **HTTPS** and **MQTT**. Default value: HTTPS. After the device receives the update package information pushed by IoT Platform, this protocol is used to download the update package.</p>
     * <br>
     * <p>>If you need to download the update package over MQTT, take note of the following items:</p>
     * <p>>*   Your service must be deployed in the China (Shanghai), China (Beijing), or China (Shenzhen) region.</p>
     * <p>>*   The OTA update package can contain only one file, and the size of the file cannot exceed 16 MB.</p>
     * <p>>*   You must use the latest version of Link SDK for C to develop the device features to perform OTA updates and download files over MQTT. For more information, see [Sample code](~~330985~~).</p>
     */
    @NameInMap("DownloadProtocol")
    public String downloadProtocol;

    /**
     * <p>The ID of the update package.</p>
     * <br>
     * <p>An update package ID is returned when you call the [CreateOTAFirmware](~~147311~~) operation to create the update package.</p>
     * <br>
     * <p>You can also call the [ListOTAFirmware](~~147450~~) operation to obtain the ID.</p>
     */
    @NameInMap("FirmwareId")
    public String firmwareId;

    /**
     * <p>The ratio of the phased update. The value is a percentage in the string format. It can be up to three decimal places. The calculated number of devices is rounded down to the nearest integer. You must specify at least one device for a phased update.</p>
     * <br>
     * <p>For example, if you set the phased update ratio to 33.33 for 100 devices, the number of devices to be updated is 33.</p>
     * <br>
     * <p>You must specify this parameter if you set the TargetSelection parameter to `GRAY`.</p>
     */
    @NameInMap("GrayPercent")
    public String grayPercent;

    /**
     * <p>The ID of the group.</p>
     * <br>
     * <p>If you set the TargetSelection parameter to `GROUP`, you must specify this parameter and the **GroupType** parameter.</p>
     * <br>
     * <p>You can call the [QueryDeviceGroupList](~~93356~~) operation to query the **GroupId** parameter.</p>
     */
    @NameInMap("GroupId")
    public String groupId;

    /**
     * <p>The type of the group. Valid value: **LINK_PLATFORM**.</p>
     * <br>
     * <p>If you set the TargetSelection parameter to `GROUP`, you must specify this parameter and the **GroupId** parameter.</p>
     */
    @NameInMap("GroupType")
    public String groupType;

    /**
     * <p>The ID of the instance. You can view the ID of an instance on the **Overview** page in the IoT Platform console.</p>
     * <br>
     * <p>>*   If your instance has an ID, you must specify the ID for this parameter. If you do not specify the instance ID, the call fails.****</p>
     * <p>>*   If no **Overview** page or **ID** is generated for your instance, you do not need to configure this parameter.</p>
     * <br>
     * <p>For more information, see [Overview](~~356505~~).</p>
     */
    @NameInMap("IotInstanceId")
    public String iotInstanceId;

    /**
     * <p>The maximum number of devices to which the download URL of the update package is pushed per minute. Valid values: 10 to 10000.</p>
     * <br>
     * <p>Default value: 10000.</p>
     */
    @NameInMap("MaximumPerMinute")
    public Integer maximumPerMinute;

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
     * <br>
     * <p>For more information, see [Overview](~~58328~~).</p>
     */
    @NameInMap("MultiModuleMode")
    public Boolean multiModuleMode;

    /**
     * <p>Specifies whether to control the update by using a mobile app. You must develop the mobile app as needed. Default false: true. Valid values:</p>
     * <br>
     * <p>*   **false**: A device obtains the information about the OTA update task based on the **NeedPush** parameter.</p>
     * <p>*   **true**: To perform an OTA update on a device, you must confirm the update by using your mobile app. Then, the device can obtain the information about the OTA update task based on the **NeedPush** parameter.</p>
     */
    @NameInMap("NeedConfirm")
    public Boolean needConfirm;

    /**
     * <p>Specifies whether to automatically push update tasks from IoT Platform to devices. Default value: true. Valid values:</p>
     * <br>
     * <p>*   **true**: After an update batch is created, IoT Platform automatically pushes update tasks to the specified online devices.</p>
     * <br>
     * <p>    In this case, a device can still initiate a request to obtain the information about the over-the-air (OTA) update task from IoT Platform.</p>
     * <br>
     * <p>*   **false**: A device must initiate a request to obtain the information about the OTA update task from IoT Platform.</p>
     */
    @NameInMap("NeedPush")
    public Boolean needPush;

    /**
     * <p>Specifies whether to overwrite the previous update task. Default value: 1. Valid values:</p>
     * <br>
     * <p>*   **1**: The previous update task is not overwritten. If a device already has an update task, the previous update task is implemented.</p>
     * <p>*   **2**: The previous update task is overwritten. Only the current update task is implemented. In this case, you cannot set **MultiModuleMode** to **true**.</p>
     * <br>
     * <p>>  The update task that is in progress is not overwritten.</p>
     */
    @NameInMap("OverwriteMode")
    public Integer overwriteMode;

    /**
     * <p>The **ProductKey** of the product to which the update package belongs.</p>
     * <br>
     * <p>A **ProductKey** is the unique identifier of a product in IoT Platform. You can view the information about all products within the current Alibaba Cloud account in the IoT Platform console or by calling the [QueryProductList](~~69271~~) operation.</p>
     */
    @NameInMap("ProductKey")
    public String productKey;

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
    @NameInMap("RetryCount")
    public Integer retryCount;

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
    @NameInMap("RetryInterval")
    public Integer retryInterval;

    /**
     * <p>The time to end the update.</p>
     * <br>
     * <p>The end time must be 1 hour to 30 days later than the start time that is specified by the **ScheduleTime** parameter. The value must be a 13-digit timestamp.</p>
     * <br>
     * <p>If you do not specify this parameter, the update is not forcibly ended.</p>
     */
    @NameInMap("ScheduleFinishTime")
    public Long scheduleFinishTime;

    /**
     * <p>The time to start the over-the-air (OTA) update.</p>
     * <br>
     * <p>The scheduled time ranges from 5 minutes to 7 days later than the current time. The value must be a 13-digit timestamp.</p>
     * <br>
     * <p>If you do not specify this parameter, the update immediately starts.</p>
     */
    @NameInMap("ScheduleTime")
    public Long scheduleTime;

    @NameInMap("SrcVersion")
    public java.util.List<String> srcVersion;

    @NameInMap("Tag")
    public java.util.List<CreateOTAStaticUpgradeJobRequestTag> tag;

    @NameInMap("TargetDeviceName")
    public java.util.List<String> targetDeviceName;

    /**
     * <p>The scope of the update batch. Valid values:</p>
     * <br>
     * <p>*   **ALL**: updates all devices.</p>
     * <p>*   **SPECIFIC**: updates specified devices.</p>
     * <p>*   **GRAY**: performs a phased update.</p>
     * <p>*   **GROUP**: updates specified groups.</p>
     */
    @NameInMap("TargetSelection")
    public String targetSelection;

    /**
     * <p>The timeout period of the update. If the device is not updated within the specified period, a timeout error occurs. Unit: minutes. Valid values: 1 to 1440.</p>
     * <br>
     * <p>> *   The timeout period starts from the time when the specified device submits the update progress for the first time. During the update, the update package may be repeatedly pushed to the specified device because the device goes online and offline multiple times. The start time of the update period remains unchanged.</p>
     * <p>>*   If an update fails due to timeout, no retry is triggered.</p>
     * <br>
     * <p>If you do not specify this parameter, timeout errors do not occur.</p>
     */
    @NameInMap("TimeoutInMinutes")
    public Integer timeoutInMinutes;

    public static CreateOTAStaticUpgradeJobRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateOTAStaticUpgradeJobRequest self = new CreateOTAStaticUpgradeJobRequest();
        return TeaModel.build(map, self);
    }

    public CreateOTAStaticUpgradeJobRequest setDnListFileUrl(String dnListFileUrl) {
        this.dnListFileUrl = dnListFileUrl;
        return this;
    }
    public String getDnListFileUrl() {
        return this.dnListFileUrl;
    }

    public CreateOTAStaticUpgradeJobRequest setDownloadProtocol(String downloadProtocol) {
        this.downloadProtocol = downloadProtocol;
        return this;
    }
    public String getDownloadProtocol() {
        return this.downloadProtocol;
    }

    public CreateOTAStaticUpgradeJobRequest setFirmwareId(String firmwareId) {
        this.firmwareId = firmwareId;
        return this;
    }
    public String getFirmwareId() {
        return this.firmwareId;
    }

    public CreateOTAStaticUpgradeJobRequest setGrayPercent(String grayPercent) {
        this.grayPercent = grayPercent;
        return this;
    }
    public String getGrayPercent() {
        return this.grayPercent;
    }

    public CreateOTAStaticUpgradeJobRequest setGroupId(String groupId) {
        this.groupId = groupId;
        return this;
    }
    public String getGroupId() {
        return this.groupId;
    }

    public CreateOTAStaticUpgradeJobRequest setGroupType(String groupType) {
        this.groupType = groupType;
        return this;
    }
    public String getGroupType() {
        return this.groupType;
    }

    public CreateOTAStaticUpgradeJobRequest setIotInstanceId(String iotInstanceId) {
        this.iotInstanceId = iotInstanceId;
        return this;
    }
    public String getIotInstanceId() {
        return this.iotInstanceId;
    }

    public CreateOTAStaticUpgradeJobRequest setMaximumPerMinute(Integer maximumPerMinute) {
        this.maximumPerMinute = maximumPerMinute;
        return this;
    }
    public Integer getMaximumPerMinute() {
        return this.maximumPerMinute;
    }

    public CreateOTAStaticUpgradeJobRequest setMultiModuleMode(Boolean multiModuleMode) {
        this.multiModuleMode = multiModuleMode;
        return this;
    }
    public Boolean getMultiModuleMode() {
        return this.multiModuleMode;
    }

    public CreateOTAStaticUpgradeJobRequest setNeedConfirm(Boolean needConfirm) {
        this.needConfirm = needConfirm;
        return this;
    }
    public Boolean getNeedConfirm() {
        return this.needConfirm;
    }

    public CreateOTAStaticUpgradeJobRequest setNeedPush(Boolean needPush) {
        this.needPush = needPush;
        return this;
    }
    public Boolean getNeedPush() {
        return this.needPush;
    }

    public CreateOTAStaticUpgradeJobRequest setOverwriteMode(Integer overwriteMode) {
        this.overwriteMode = overwriteMode;
        return this;
    }
    public Integer getOverwriteMode() {
        return this.overwriteMode;
    }

    public CreateOTAStaticUpgradeJobRequest setProductKey(String productKey) {
        this.productKey = productKey;
        return this;
    }
    public String getProductKey() {
        return this.productKey;
    }

    public CreateOTAStaticUpgradeJobRequest setRetryCount(Integer retryCount) {
        this.retryCount = retryCount;
        return this;
    }
    public Integer getRetryCount() {
        return this.retryCount;
    }

    public CreateOTAStaticUpgradeJobRequest setRetryInterval(Integer retryInterval) {
        this.retryInterval = retryInterval;
        return this;
    }
    public Integer getRetryInterval() {
        return this.retryInterval;
    }

    public CreateOTAStaticUpgradeJobRequest setScheduleFinishTime(Long scheduleFinishTime) {
        this.scheduleFinishTime = scheduleFinishTime;
        return this;
    }
    public Long getScheduleFinishTime() {
        return this.scheduleFinishTime;
    }

    public CreateOTAStaticUpgradeJobRequest setScheduleTime(Long scheduleTime) {
        this.scheduleTime = scheduleTime;
        return this;
    }
    public Long getScheduleTime() {
        return this.scheduleTime;
    }

    public CreateOTAStaticUpgradeJobRequest setSrcVersion(java.util.List<String> srcVersion) {
        this.srcVersion = srcVersion;
        return this;
    }
    public java.util.List<String> getSrcVersion() {
        return this.srcVersion;
    }

    public CreateOTAStaticUpgradeJobRequest setTag(java.util.List<CreateOTAStaticUpgradeJobRequestTag> tag) {
        this.tag = tag;
        return this;
    }
    public java.util.List<CreateOTAStaticUpgradeJobRequestTag> getTag() {
        return this.tag;
    }

    public CreateOTAStaticUpgradeJobRequest setTargetDeviceName(java.util.List<String> targetDeviceName) {
        this.targetDeviceName = targetDeviceName;
        return this;
    }
    public java.util.List<String> getTargetDeviceName() {
        return this.targetDeviceName;
    }

    public CreateOTAStaticUpgradeJobRequest setTargetSelection(String targetSelection) {
        this.targetSelection = targetSelection;
        return this;
    }
    public String getTargetSelection() {
        return this.targetSelection;
    }

    public CreateOTAStaticUpgradeJobRequest setTimeoutInMinutes(Integer timeoutInMinutes) {
        this.timeoutInMinutes = timeoutInMinutes;
        return this;
    }
    public Integer getTimeoutInMinutes() {
        return this.timeoutInMinutes;
    }

    public static class CreateOTAStaticUpgradeJobRequestTag extends TeaModel {
        /**
         * <p>The key of the update batch tag. The key must be 1 to 30 characters in length and can contain letters, digits, and periods (.). You can add up to 10 tags for each update batch.</p>
         * <br>
         * <p>The tags of an update batch are sent to devices when IoT Platform pushes update notifications to these devices.</p>
         * <br>
         * <p>>  Update batch tags are optional. If you want to specify a tag, you must specify the Tag.N.Value and Tag.N.Key parameters in pair.</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The value of the update batch tag. The value must be 1 to 1,024 characters in length. You can add up to 10 tags for each update batch. The total length of the tag keys and tag values of all update batches cannot exceed 4,096 characters in length.</p>
         * <br>
         * <p>>  Update batch tags are optional. If you want to specify a tag, you must specify the Tag.N.Value and Tag.N.Key parameters in pair.</p>
         */
        @NameInMap("Value")
        public String value;

        public static CreateOTAStaticUpgradeJobRequestTag build(java.util.Map<String, ?> map) throws Exception {
            CreateOTAStaticUpgradeJobRequestTag self = new CreateOTAStaticUpgradeJobRequestTag();
            return TeaModel.build(map, self);
        }

        public CreateOTAStaticUpgradeJobRequestTag setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public CreateOTAStaticUpgradeJobRequestTag setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}
