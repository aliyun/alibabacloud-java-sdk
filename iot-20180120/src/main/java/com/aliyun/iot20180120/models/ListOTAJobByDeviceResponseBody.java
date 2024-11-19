// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class ListOTAJobByDeviceResponseBody extends TeaModel {
    /**
     * <p>The error code returned if the call fails. For more information, see <a href="https://help.aliyun.com/document_detail/87387.html">Error codes</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>MissingFirmwareId</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The number of the returned page.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("CurrentPage")
    public Integer currentPage;

    /**
     * <p>The update batch information returned if the call is successful. For more information, see the following <strong>SimpleOTAJobInfo</strong> parameter.</p>
     */
    @NameInMap("Data")
    public ListOTAJobByDeviceResponseBodyData data;

    /**
     * <p>The error message returned if the call fails.</p>
     * 
     * <strong>example:</strong>
     * <p>FirmwareId is mandatory for this action</p>
     */
    @NameInMap("ErrorMessage")
    public String errorMessage;

    /**
     * <p>The total number of pages.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageCount")
    public Integer pageCount;

    /**
     * <p>The number of entries returned per page.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>A01829CE-75A1-4920-B775-921146A1AB79</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the call was successful.</p>
     * <ul>
     * <li><strong>true</strong>: The call was successful.</li>
     * <li><strong>false</strong>: The call failed.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    /**
     * <p>The total number of update packages returned.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
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
         * 
         * <strong>example:</strong>
         * <p>key1</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The value of the tag.</p>
         * 
         * <strong>example:</strong>
         * <p>value1</p>
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
         * 
         * <strong>example:</strong>
         * <p>FJFx8JzpnhpIsKftRjjm03****</p>
         */
        @NameInMap("FirmwareId")
        public String firmwareId;

        /**
         * <p>The ID of the update batch.</p>
         * 
         * <strong>example:</strong>
         * <p>HvKuBpuk3rdk6E92CP****</p>
         */
        @NameInMap("JobId")
        public String jobId;

        /**
         * <p>The status of the update batch. Valid values:</p>
         * <ul>
         * <li><strong>IN_PROGRESS</strong>: The update batch is running.</li>
         * <li><strong>COMPLETE</strong>: The update batch is completed.</li>
         * <li><strong>CANCELED</strong>: The update batch is canceled.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>COMPLETED</p>
         */
        @NameInMap("JobStatus")
        public String jobStatus;

        /**
         * <p>The type of the task. Valid values:</p>
         * <ul>
         * <li><strong>VERFIY_FIRMWARE</strong>: update package verification.</li>
         * <li><strong>UPGRADE_FIRMWARE</strong>: batch update.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>UPGRADE_FIRMWARE</p>
         */
        @NameInMap("JobType")
        public String jobType;

        /**
         * <p>The ProductKey of the product to which the update package belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>a19mzPZ****</p>
         */
        @NameInMap("ProductKey")
        public String productKey;

        /**
         * <p>The update policy of the update batch. Valid values:</p>
         * <ul>
         * <li>DYNAMIC: dynamic update. This value is returned if you call the <a href="https://help.aliyun.com/document_detail/147887.html">CreateOTADynamicUpgradeJob</a> API operation to create an update batch.</li>
         * <li>STATIC: static update. This value is returned if you call the <a href="https://help.aliyun.com/document_detail/147496.html">CreateOTAStaticUpgradeJob</a> API operation to create an update batch.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>STATIC</p>
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
         * <ul>
         * <li><strong>ALL</strong>: updates all devices.</li>
         * <li><strong>SPECIFIC</strong>: updates specified devices.</li>
         * <li><strong>GRAY</strong>: performs a phased update.</li>
         * </ul>
         * <blockquote>
         * <p> The value ALL is returned if you call the <a href="/help/en/iot-platform/latest/av6dui">CreateOTADynamicUpgradeJob</a> API operation to create an update batch.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>ALL</p>
         */
        @NameInMap("TargetSelection")
        public String targetSelection;

        /**
         * <p>The time when the update batch was created. The time is displayed in UTC.</p>
         * 
         * <strong>example:</strong>
         * <p>2019-12-28T02:43:10.000Z</p>
         */
        @NameInMap("UtcCreate")
        public String utcCreate;

        /**
         * <p>The end time of the update batch. The time is displayed in UTC.</p>
         * <blockquote>
         * <p> This parameter is returned only after the update batch is completed.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>2019-12-29T02:43:10.000Z</p>
         */
        @NameInMap("UtcEndTime")
        public String utcEndTime;

        /**
         * <p>The time when the task was last modified. The time is in UTC.</p>
         * 
         * <strong>example:</strong>
         * <p>2019-12-29T02:43:10.000Z</p>
         */
        @NameInMap("UtcModified")
        public String utcModified;

        /**
         * <p>The start time of the update batch. The time is in the UTC format.</p>
         * 
         * <strong>example:</strong>
         * <p>2019-12-29T02:43:10.000Z</p>
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
