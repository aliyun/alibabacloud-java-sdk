// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class QueryOTAJobResponseBody extends TeaModel {
    /**
     * <p>The error code returned if the call fails. For more information, see [Error codes](~~87387~~).</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The update batch information returned if the call is successful. For more information, see the following parameters.</p>
     */
    @NameInMap("Data")
    public QueryOTAJobResponseBodyData data;

    /**
     * <p>The error message returned if the call fails.</p>
     */
    @NameInMap("ErrorMessage")
    public String errorMessage;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the call was successful.</p>
     * <br>
     * <p>*   **true**: The call was successful.</p>
     * <p>*   **false**: The call failed.</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static QueryOTAJobResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryOTAJobResponseBody self = new QueryOTAJobResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryOTAJobResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public QueryOTAJobResponseBody setData(QueryOTAJobResponseBodyData data) {
        this.data = data;
        return this;
    }
    public QueryOTAJobResponseBodyData getData() {
        return this.data;
    }

    public QueryOTAJobResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public QueryOTAJobResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryOTAJobResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class QueryOTAJobResponseBodyDataSrcVersions extends TeaModel {
        @NameInMap("SrcVersion")
        public java.util.List<String> srcVersion;

        public static QueryOTAJobResponseBodyDataSrcVersions build(java.util.Map<String, ?> map) throws Exception {
            QueryOTAJobResponseBodyDataSrcVersions self = new QueryOTAJobResponseBodyDataSrcVersions();
            return TeaModel.build(map, self);
        }

        public QueryOTAJobResponseBodyDataSrcVersions setSrcVersion(java.util.List<String> srcVersion) {
            this.srcVersion = srcVersion;
            return this;
        }
        public java.util.List<String> getSrcVersion() {
            return this.srcVersion;
        }

    }

    public static class QueryOTAJobResponseBodyDataTagsOtaTagDTO extends TeaModel {
        /**
         * <p>The key of each tag.</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The value of the tag.</p>
         */
        @NameInMap("Value")
        public String value;

        public static QueryOTAJobResponseBodyDataTagsOtaTagDTO build(java.util.Map<String, ?> map) throws Exception {
            QueryOTAJobResponseBodyDataTagsOtaTagDTO self = new QueryOTAJobResponseBodyDataTagsOtaTagDTO();
            return TeaModel.build(map, self);
        }

        public QueryOTAJobResponseBodyDataTagsOtaTagDTO setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public QueryOTAJobResponseBodyDataTagsOtaTagDTO setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class QueryOTAJobResponseBodyDataTags extends TeaModel {
        @NameInMap("OtaTagDTO")
        public java.util.List<QueryOTAJobResponseBodyDataTagsOtaTagDTO> otaTagDTO;

        public static QueryOTAJobResponseBodyDataTags build(java.util.Map<String, ?> map) throws Exception {
            QueryOTAJobResponseBodyDataTags self = new QueryOTAJobResponseBodyDataTags();
            return TeaModel.build(map, self);
        }

        public QueryOTAJobResponseBodyDataTags setOtaTagDTO(java.util.List<QueryOTAJobResponseBodyDataTagsOtaTagDTO> otaTagDTO) {
            this.otaTagDTO = otaTagDTO;
            return this;
        }
        public java.util.List<QueryOTAJobResponseBodyDataTagsOtaTagDTO> getOtaTagDTO() {
            return this.otaTagDTO;
        }

    }

    public static class QueryOTAJobResponseBodyData extends TeaModel {
        /**
         * <p>The destination firmware version of the update.</p>
         */
        @NameInMap("DestVersion")
        public String destVersion;

        /**
         * <p>The download protocol of the update package.</p>
         */
        @NameInMap("DownloadProtocol")
        public String downloadProtocol;

        /**
         * <p>The mode of dynamic update. Valid values:</p>
         * <br>
         * <p>*   **1**: constantly updates the devices that meet the conditions.</p>
         * <p>*   **2**: updates only the devices that subsequently submit the latest firmware versions.</p>
         * <br>
         * <p>This parameter is returned only if you perform a dynamic update.</p>
         */
        @NameInMap("DynamicMode")
        public Integer dynamicMode;

        /**
         * <p>The ID of the update package.</p>
         */
        @NameInMap("FirmwareId")
        public String firmwareId;

        /**
         * <p>The phase ratio of the phased update.</p>
         * <br>
         * <p>This parameter is returned only if you perform a phased update.</p>
         */
        @NameInMap("GrayPercent")
        public String grayPercent;

        /**
         * <p>The ID of the device group to be updated.</p>
         */
        @NameInMap("GroupId")
        public String groupId;

        /**
         * <p>The name of the device group to be updated.</p>
         */
        @NameInMap("GroupName")
        public String groupName;

        /**
         * <p>The description of the update batch.</p>
         */
        @NameInMap("JobDesc")
        public String jobDesc;

        /**
         * <p>The ID of the update batch.</p>
         */
        @NameInMap("JobId")
        public String jobId;

        /**
         * <p>The status of the update batch.</p>
         * <br>
         * <p>*   **PLANNED**: The update batch is being planned. The batch is created, but the scheduled time has not arrived. This parameter is returned only if you perform a static update.</p>
         * <p>*   **IN_PROGRESS**: The update batch is running.</p>
         * <p>*   **COMPLETED**: The update batch is completed.</p>
         * <p>*   **CANCELED**: The update batch is canceled.</p>
         */
        @NameInMap("JobStatus")
        public String jobStatus;

        /**
         * <p>The type of the batch. Valid values:</p>
         * <br>
         * <p>*   **VERFIY_FIRMWARE**: update package verification.</p>
         * <p>*   **UPGRADE_FIRMWARE**: batch update.</p>
         */
        @NameInMap("JobType")
        public String jobType;

        /**
         * <p>The maximum number of devices to which the download URL of the update package is pushed per minute.</p>
         */
        @NameInMap("MaximumPerMinute")
        public Integer maximumPerMinute;

        /**
         * <p>Specifies whether the device supports simultaneous updates of multiple modules.</p>
         * <br>
         * <p>*   **false** (default): no.</p>
         * <p>*   **true**: yes.</p>
         * <br>
         * <p>For more information, see [Overview](~~58328~~).</p>
         */
        @NameInMap("MultiModuleMode")
        public Boolean multiModuleMode;

        /**
         * <p>The name of the update package.</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>Specifies whether to confirm the update by using your mobile app.</p>
         */
        @NameInMap("NeedConfirm")
        public Boolean needConfirm;

        /**
         * <p>Specifies whether to automatically push update tasks from IoT Platform to devices.</p>
         */
        @NameInMap("NeedPush")
        public Boolean needPush;

        /**
         * <p>Specifies whether to overwrite the previous update task. Valid values:</p>
         * <br>
         * <p>*   **1**: The previous update task is not overwritten. If a device already has an update task, the previous update task is implemented.</p>
         * <p>*   **2**: The previous update task is overwritten. Only the current update task is implemented.</p>
         * <br>
         * <p>The update task that is in progress is not overwritten.</p>
         */
        @NameInMap("OverwriteMode")
        public Integer overwriteMode;

        /**
         * <p>The ProductKey of the product to which the update package belongs.</p>
         */
        @NameInMap("ProductKey")
        public String productKey;

        /**
         * <p>The number of automatic retries after a device fails to be updated.</p>
         * <br>
         * <p>This parameter is returned if a retry policy is set when you create the update batch.</p>
         */
        @NameInMap("RetryCount")
        public Integer retryCount;

        /**
         * <p>The automatic retry interval after a device fails to be updated. Unit: minutes.</p>
         * <br>
         * <p>This parameter is returned if a retry policy is set when you create the update batch.</p>
         */
        @NameInMap("RetryInterval")
        public Integer retryInterval;

        /**
         * <p>The update policy of the update batch. Valid values:</p>
         * <br>
         * <p>*   **DYNAMIC**: dynamic update. This value is returned if you call the [CreateOTADynamicUpgradeJob](~~147887~~) API operation to create an update batch.</p>
         * <p>*   **STATIC**: static update. This value is returned if you call the [CreateOTAStaticUpgradeJob](~~147496~~) API operation to create an update batch.</p>
         */
        @NameInMap("SelectionType")
        public String selectionType;

        /**
         * <p>The list of firmware versions to be updated.</p>
         */
        @NameInMap("SrcVersions")
        public QueryOTAJobResponseBodyDataSrcVersions srcVersions;

        /**
         * <p>The tags of the update batch.</p>
         */
        @NameInMap("Tags")
        public QueryOTAJobResponseBodyDataTags tags;

        /**
         * <p>The scope of the update batch. Valid values: </p>
         * <br>
         * <p>- **ALL**: updates all devices.</p>
         * <p>- **SPECIFIC**: updates specified devices.</p>
         * <p>- **GRAY**: performs a phased update.</p>
         * <br>
         * <p>>  The value ALL is returned if you call the [CreateOTADynamicUpgradeJob](/help/en/iot-platform/latest/av6dui) API operation to create an update batch.</p>
         */
        @NameInMap("TargetSelection")
        public String targetSelection;

        /**
         * <p>The timeout period of the device update. Unit: minutes.</p>
         * <br>
         * <p>This parameter is returned if the timeout period is set when you create the update batch.</p>
         */
        @NameInMap("TimeoutInMinutes")
        public Integer timeoutInMinutes;

        /**
         * <p>The time when the update batch was created. The time is displayed in UTC.</p>
         */
        @NameInMap("UtcCreate")
        public String utcCreate;

        /**
         * <p>The end time of the update batch. The time is displayed in UTC.</p>
         * <br>
         * <p>This parameter is returned only after the update batch is completed.</p>
         */
        @NameInMap("UtcEndTime")
        public String utcEndTime;

        /**
         * <p>The time when the update batch was last modified. The time is displayed in UTC.</p>
         */
        @NameInMap("UtcModified")
        public String utcModified;

        /**
         * <p>The end time of the scheduled update batch. This parameter is returned only if the update batch is scheduled and the end time of the scheduled update batch is specified.</p>
         */
        @NameInMap("UtcScheduleFinishTime")
        public String utcScheduleFinishTime;

        /**
         * <p>The start time of the scheduled update batch. This parameter is returned only for scheduled update batches.</p>
         */
        @NameInMap("UtcScheduleTime")
        public String utcScheduleTime;

        /**
         * <p>The start time of the update batch. The time is displayed in UTC.</p>
         */
        @NameInMap("UtcStartTime")
        public String utcStartTime;

        public static QueryOTAJobResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            QueryOTAJobResponseBodyData self = new QueryOTAJobResponseBodyData();
            return TeaModel.build(map, self);
        }

        public QueryOTAJobResponseBodyData setDestVersion(String destVersion) {
            this.destVersion = destVersion;
            return this;
        }
        public String getDestVersion() {
            return this.destVersion;
        }

        public QueryOTAJobResponseBodyData setDownloadProtocol(String downloadProtocol) {
            this.downloadProtocol = downloadProtocol;
            return this;
        }
        public String getDownloadProtocol() {
            return this.downloadProtocol;
        }

        public QueryOTAJobResponseBodyData setDynamicMode(Integer dynamicMode) {
            this.dynamicMode = dynamicMode;
            return this;
        }
        public Integer getDynamicMode() {
            return this.dynamicMode;
        }

        public QueryOTAJobResponseBodyData setFirmwareId(String firmwareId) {
            this.firmwareId = firmwareId;
            return this;
        }
        public String getFirmwareId() {
            return this.firmwareId;
        }

        public QueryOTAJobResponseBodyData setGrayPercent(String grayPercent) {
            this.grayPercent = grayPercent;
            return this;
        }
        public String getGrayPercent() {
            return this.grayPercent;
        }

        public QueryOTAJobResponseBodyData setGroupId(String groupId) {
            this.groupId = groupId;
            return this;
        }
        public String getGroupId() {
            return this.groupId;
        }

        public QueryOTAJobResponseBodyData setGroupName(String groupName) {
            this.groupName = groupName;
            return this;
        }
        public String getGroupName() {
            return this.groupName;
        }

        public QueryOTAJobResponseBodyData setJobDesc(String jobDesc) {
            this.jobDesc = jobDesc;
            return this;
        }
        public String getJobDesc() {
            return this.jobDesc;
        }

        public QueryOTAJobResponseBodyData setJobId(String jobId) {
            this.jobId = jobId;
            return this;
        }
        public String getJobId() {
            return this.jobId;
        }

        public QueryOTAJobResponseBodyData setJobStatus(String jobStatus) {
            this.jobStatus = jobStatus;
            return this;
        }
        public String getJobStatus() {
            return this.jobStatus;
        }

        public QueryOTAJobResponseBodyData setJobType(String jobType) {
            this.jobType = jobType;
            return this;
        }
        public String getJobType() {
            return this.jobType;
        }

        public QueryOTAJobResponseBodyData setMaximumPerMinute(Integer maximumPerMinute) {
            this.maximumPerMinute = maximumPerMinute;
            return this;
        }
        public Integer getMaximumPerMinute() {
            return this.maximumPerMinute;
        }

        public QueryOTAJobResponseBodyData setMultiModuleMode(Boolean multiModuleMode) {
            this.multiModuleMode = multiModuleMode;
            return this;
        }
        public Boolean getMultiModuleMode() {
            return this.multiModuleMode;
        }

        public QueryOTAJobResponseBodyData setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public QueryOTAJobResponseBodyData setNeedConfirm(Boolean needConfirm) {
            this.needConfirm = needConfirm;
            return this;
        }
        public Boolean getNeedConfirm() {
            return this.needConfirm;
        }

        public QueryOTAJobResponseBodyData setNeedPush(Boolean needPush) {
            this.needPush = needPush;
            return this;
        }
        public Boolean getNeedPush() {
            return this.needPush;
        }

        public QueryOTAJobResponseBodyData setOverwriteMode(Integer overwriteMode) {
            this.overwriteMode = overwriteMode;
            return this;
        }
        public Integer getOverwriteMode() {
            return this.overwriteMode;
        }

        public QueryOTAJobResponseBodyData setProductKey(String productKey) {
            this.productKey = productKey;
            return this;
        }
        public String getProductKey() {
            return this.productKey;
        }

        public QueryOTAJobResponseBodyData setRetryCount(Integer retryCount) {
            this.retryCount = retryCount;
            return this;
        }
        public Integer getRetryCount() {
            return this.retryCount;
        }

        public QueryOTAJobResponseBodyData setRetryInterval(Integer retryInterval) {
            this.retryInterval = retryInterval;
            return this;
        }
        public Integer getRetryInterval() {
            return this.retryInterval;
        }

        public QueryOTAJobResponseBodyData setSelectionType(String selectionType) {
            this.selectionType = selectionType;
            return this;
        }
        public String getSelectionType() {
            return this.selectionType;
        }

        public QueryOTAJobResponseBodyData setSrcVersions(QueryOTAJobResponseBodyDataSrcVersions srcVersions) {
            this.srcVersions = srcVersions;
            return this;
        }
        public QueryOTAJobResponseBodyDataSrcVersions getSrcVersions() {
            return this.srcVersions;
        }

        public QueryOTAJobResponseBodyData setTags(QueryOTAJobResponseBodyDataTags tags) {
            this.tags = tags;
            return this;
        }
        public QueryOTAJobResponseBodyDataTags getTags() {
            return this.tags;
        }

        public QueryOTAJobResponseBodyData setTargetSelection(String targetSelection) {
            this.targetSelection = targetSelection;
            return this;
        }
        public String getTargetSelection() {
            return this.targetSelection;
        }

        public QueryOTAJobResponseBodyData setTimeoutInMinutes(Integer timeoutInMinutes) {
            this.timeoutInMinutes = timeoutInMinutes;
            return this;
        }
        public Integer getTimeoutInMinutes() {
            return this.timeoutInMinutes;
        }

        public QueryOTAJobResponseBodyData setUtcCreate(String utcCreate) {
            this.utcCreate = utcCreate;
            return this;
        }
        public String getUtcCreate() {
            return this.utcCreate;
        }

        public QueryOTAJobResponseBodyData setUtcEndTime(String utcEndTime) {
            this.utcEndTime = utcEndTime;
            return this;
        }
        public String getUtcEndTime() {
            return this.utcEndTime;
        }

        public QueryOTAJobResponseBodyData setUtcModified(String utcModified) {
            this.utcModified = utcModified;
            return this;
        }
        public String getUtcModified() {
            return this.utcModified;
        }

        public QueryOTAJobResponseBodyData setUtcScheduleFinishTime(String utcScheduleFinishTime) {
            this.utcScheduleFinishTime = utcScheduleFinishTime;
            return this;
        }
        public String getUtcScheduleFinishTime() {
            return this.utcScheduleFinishTime;
        }

        public QueryOTAJobResponseBodyData setUtcScheduleTime(String utcScheduleTime) {
            this.utcScheduleTime = utcScheduleTime;
            return this;
        }
        public String getUtcScheduleTime() {
            return this.utcScheduleTime;
        }

        public QueryOTAJobResponseBodyData setUtcStartTime(String utcStartTime) {
            this.utcStartTime = utcStartTime;
            return this;
        }
        public String getUtcStartTime() {
            return this.utcStartTime;
        }

    }

}
