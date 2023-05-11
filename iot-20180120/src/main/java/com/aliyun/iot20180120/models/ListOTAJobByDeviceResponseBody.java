// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class ListOTAJobByDeviceResponseBody extends TeaModel {
    /**
     * <p>The error code returned if the call fails. For more information, see [Error codes](~~87387~~).</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The number of the returned page.</p>
     */
    @NameInMap("CurrentPage")
    public Integer currentPage;

    /**
     * <p>The update batch information returned if the call is successful. For more information, see the following **SimpleOTAJobInfo** parameter.</p>
     */
    @NameInMap("Data")
    public ListOTAJobByDeviceResponseBodyData data;

    /**
     * <p>The error message returned if the call fails.</p>
     */
    @NameInMap("ErrorMessage")
    public String errorMessage;

    /**
     * <p>The total number of pages.</p>
     */
    @NameInMap("PageCount")
    public Integer pageCount;

    /**
     * <p>The number of entries returned per page.</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

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

    /**
     * <p>The total number of update packages returned.</p>
     */
    @NameInMap("Total")
    public Integer total;

    public static ListOTAJobByDeviceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListOTAJobByDeviceResponseBody self = new ListOTAJobByDeviceResponseBody();
        return TeaModel.build(map, self);
    }

    public ListOTAJobByDeviceResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListOTAJobByDeviceResponseBody setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    public ListOTAJobByDeviceResponseBody setData(ListOTAJobByDeviceResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ListOTAJobByDeviceResponseBodyData getData() {
        return this.data;
    }

    public ListOTAJobByDeviceResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public ListOTAJobByDeviceResponseBody setPageCount(Integer pageCount) {
        this.pageCount = pageCount;
        return this;
    }
    public Integer getPageCount() {
        return this.pageCount;
    }

    public ListOTAJobByDeviceResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListOTAJobByDeviceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListOTAJobByDeviceResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public ListOTAJobByDeviceResponseBody setTotal(Integer total) {
        this.total = total;
        return this;
    }
    public Integer getTotal() {
        return this.total;
    }

    public static class ListOTAJobByDeviceResponseBodyDataSimpleOTAJobInfoTagsOtaTagDTO extends TeaModel {
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

        public static ListOTAJobByDeviceResponseBodyDataSimpleOTAJobInfoTagsOtaTagDTO build(java.util.Map<String, ?> map) throws Exception {
            ListOTAJobByDeviceResponseBodyDataSimpleOTAJobInfoTagsOtaTagDTO self = new ListOTAJobByDeviceResponseBodyDataSimpleOTAJobInfoTagsOtaTagDTO();
            return TeaModel.build(map, self);
        }

        public ListOTAJobByDeviceResponseBodyDataSimpleOTAJobInfoTagsOtaTagDTO setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public ListOTAJobByDeviceResponseBodyDataSimpleOTAJobInfoTagsOtaTagDTO setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class ListOTAJobByDeviceResponseBodyDataSimpleOTAJobInfoTags extends TeaModel {
        @NameInMap("OtaTagDTO")
        public java.util.List<ListOTAJobByDeviceResponseBodyDataSimpleOTAJobInfoTagsOtaTagDTO> otaTagDTO;

        public static ListOTAJobByDeviceResponseBodyDataSimpleOTAJobInfoTags build(java.util.Map<String, ?> map) throws Exception {
            ListOTAJobByDeviceResponseBodyDataSimpleOTAJobInfoTags self = new ListOTAJobByDeviceResponseBodyDataSimpleOTAJobInfoTags();
            return TeaModel.build(map, self);
        }

        public ListOTAJobByDeviceResponseBodyDataSimpleOTAJobInfoTags setOtaTagDTO(java.util.List<ListOTAJobByDeviceResponseBodyDataSimpleOTAJobInfoTagsOtaTagDTO> otaTagDTO) {
            this.otaTagDTO = otaTagDTO;
            return this;
        }
        public java.util.List<ListOTAJobByDeviceResponseBodyDataSimpleOTAJobInfoTagsOtaTagDTO> getOtaTagDTO() {
            return this.otaTagDTO;
        }

    }

    public static class ListOTAJobByDeviceResponseBodyDataSimpleOTAJobInfo extends TeaModel {
        /**
         * <p>The ID of the update package.</p>
         */
        @NameInMap("FirmwareId")
        public String firmwareId;

        /**
         * <p>The ID of the update batch.</p>
         */
        @NameInMap("JobId")
        public String jobId;

        /**
         * <p>The status of the update batch. Valid values:</p>
         * <br>
         * <p>*   **IN_PROGRESS**: The update batch is running.</p>
         * <p>*   **COMPLETE**: The update batch is completed.</p>
         * <p>*   **CANCELED**: The update batch is canceled.</p>
         */
        @NameInMap("JobStatus")
        public String jobStatus;

        /**
         * <p>The type of the task. Valid values:</p>
         * <br>
         * <p>*   **VERFIY_FIRMWARE**: update package verification.</p>
         * <p>*   **UPGRADE_FIRMWARE**: batch update.</p>
         */
        @NameInMap("JobType")
        public String jobType;

        /**
         * <p>The ProductKey of the product to which the update package belongs.</p>
         */
        @NameInMap("ProductKey")
        public String productKey;

        /**
         * <p>The update policy of the update batch. Valid values:</p>
         * <br>
         * <p>*   DYNAMIC: dynamic update. This value is returned if you call the [CreateOTADynamicUpgradeJob](~~147887~~) API operation to create an update batch.</p>
         * <p>*   STATIC: static update. This value is returned if you call the [CreateOTAStaticUpgradeJob](~~147496~~) API operation to create an update batch.</p>
         */
        @NameInMap("SelectionType")
        public String selectionType;

        /**
         * <p>The tags of the update batch.</p>
         */
        @NameInMap("Tags")
        public ListOTAJobByDeviceResponseBodyDataSimpleOTAJobInfoTags tags;

        /**
         * <p>The scope of the update. Valid values: </p>
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
         * <p>The time when the update batch was created. The time is displayed in UTC.</p>
         */
        @NameInMap("UtcCreate")
        public String utcCreate;

        /**
         * <p>The end time of the update batch. The time is displayed in UTC.</p>
         * <br>
         * <p>>  This parameter is returned only after the update batch is completed.</p>
         */
        @NameInMap("UtcEndTime")
        public String utcEndTime;

        /**
         * <p>The time when the task was last modified. The time is in UTC.</p>
         */
        @NameInMap("UtcModified")
        public String utcModified;

        /**
         * <p>The start time of the update batch. The time is in the UTC format.</p>
         */
        @NameInMap("UtcStartTime")
        public String utcStartTime;

        public static ListOTAJobByDeviceResponseBodyDataSimpleOTAJobInfo build(java.util.Map<String, ?> map) throws Exception {
            ListOTAJobByDeviceResponseBodyDataSimpleOTAJobInfo self = new ListOTAJobByDeviceResponseBodyDataSimpleOTAJobInfo();
            return TeaModel.build(map, self);
        }

        public ListOTAJobByDeviceResponseBodyDataSimpleOTAJobInfo setFirmwareId(String firmwareId) {
            this.firmwareId = firmwareId;
            return this;
        }
        public String getFirmwareId() {
            return this.firmwareId;
        }

        public ListOTAJobByDeviceResponseBodyDataSimpleOTAJobInfo setJobId(String jobId) {
            this.jobId = jobId;
            return this;
        }
        public String getJobId() {
            return this.jobId;
        }

        public ListOTAJobByDeviceResponseBodyDataSimpleOTAJobInfo setJobStatus(String jobStatus) {
            this.jobStatus = jobStatus;
            return this;
        }
        public String getJobStatus() {
            return this.jobStatus;
        }

        public ListOTAJobByDeviceResponseBodyDataSimpleOTAJobInfo setJobType(String jobType) {
            this.jobType = jobType;
            return this;
        }
        public String getJobType() {
            return this.jobType;
        }

        public ListOTAJobByDeviceResponseBodyDataSimpleOTAJobInfo setProductKey(String productKey) {
            this.productKey = productKey;
            return this;
        }
        public String getProductKey() {
            return this.productKey;
        }

        public ListOTAJobByDeviceResponseBodyDataSimpleOTAJobInfo setSelectionType(String selectionType) {
            this.selectionType = selectionType;
            return this;
        }
        public String getSelectionType() {
            return this.selectionType;
        }

        public ListOTAJobByDeviceResponseBodyDataSimpleOTAJobInfo setTags(ListOTAJobByDeviceResponseBodyDataSimpleOTAJobInfoTags tags) {
            this.tags = tags;
            return this;
        }
        public ListOTAJobByDeviceResponseBodyDataSimpleOTAJobInfoTags getTags() {
            return this.tags;
        }

        public ListOTAJobByDeviceResponseBodyDataSimpleOTAJobInfo setTargetSelection(String targetSelection) {
            this.targetSelection = targetSelection;
            return this;
        }
        public String getTargetSelection() {
            return this.targetSelection;
        }

        public ListOTAJobByDeviceResponseBodyDataSimpleOTAJobInfo setUtcCreate(String utcCreate) {
            this.utcCreate = utcCreate;
            return this;
        }
        public String getUtcCreate() {
            return this.utcCreate;
        }

        public ListOTAJobByDeviceResponseBodyDataSimpleOTAJobInfo setUtcEndTime(String utcEndTime) {
            this.utcEndTime = utcEndTime;
            return this;
        }
        public String getUtcEndTime() {
            return this.utcEndTime;
        }

        public ListOTAJobByDeviceResponseBodyDataSimpleOTAJobInfo setUtcModified(String utcModified) {
            this.utcModified = utcModified;
            return this;
        }
        public String getUtcModified() {
            return this.utcModified;
        }

        public ListOTAJobByDeviceResponseBodyDataSimpleOTAJobInfo setUtcStartTime(String utcStartTime) {
            this.utcStartTime = utcStartTime;
            return this;
        }
        public String getUtcStartTime() {
            return this.utcStartTime;
        }

    }

    public static class ListOTAJobByDeviceResponseBodyData extends TeaModel {
        @NameInMap("SimpleOTAJobInfo")
        public java.util.List<ListOTAJobByDeviceResponseBodyDataSimpleOTAJobInfo> simpleOTAJobInfo;

        public static ListOTAJobByDeviceResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListOTAJobByDeviceResponseBodyData self = new ListOTAJobByDeviceResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListOTAJobByDeviceResponseBodyData setSimpleOTAJobInfo(java.util.List<ListOTAJobByDeviceResponseBodyDataSimpleOTAJobInfo> simpleOTAJobInfo) {
            this.simpleOTAJobInfo = simpleOTAJobInfo;
            return this;
        }
        public java.util.List<ListOTAJobByDeviceResponseBodyDataSimpleOTAJobInfo> getSimpleOTAJobInfo() {
            return this.simpleOTAJobInfo;
        }

    }

}
