// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class ListOTAJobByFirmwareResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Success")
    @Validation(required = true)
    public Boolean success;

    @NameInMap("Code")
    @Validation(required = true)
    public String code;

    @NameInMap("ErrorMessage")
    @Validation(required = true)
    public String errorMessage;

    @NameInMap("Total")
    @Validation(required = true)
    public Integer total;

    @NameInMap("PageSize")
    @Validation(required = true)
    public Integer pageSize;

    @NameInMap("PageCount")
    @Validation(required = true)
    public Integer pageCount;

    @NameInMap("CurrentPage")
    @Validation(required = true)
    public Integer currentPage;

    @NameInMap("Data")
    @Validation(required = true)
    public ListOTAJobByFirmwareResponseData data;

    public static ListOTAJobByFirmwareResponse build(java.util.Map<String, ?> map) throws Exception {
        ListOTAJobByFirmwareResponse self = new ListOTAJobByFirmwareResponse();
        return TeaModel.build(map, self);
    }

    public ListOTAJobByFirmwareResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListOTAJobByFirmwareResponse setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public ListOTAJobByFirmwareResponse setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListOTAJobByFirmwareResponse setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public ListOTAJobByFirmwareResponse setTotal(Integer total) {
        this.total = total;
        return this;
    }
    public Integer getTotal() {
        return this.total;
    }

    public ListOTAJobByFirmwareResponse setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListOTAJobByFirmwareResponse setPageCount(Integer pageCount) {
        this.pageCount = pageCount;
        return this;
    }
    public Integer getPageCount() {
        return this.pageCount;
    }

    public ListOTAJobByFirmwareResponse setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    public ListOTAJobByFirmwareResponse setData(ListOTAJobByFirmwareResponseData data) {
        this.data = data;
        return this;
    }
    public ListOTAJobByFirmwareResponseData getData() {
        return this.data;
    }

    public static class ListOTAJobByFirmwareResponseDataSimpleOTAJobInfoTagsOtaTagDTO extends TeaModel {
        @NameInMap("Key")
        @Validation(required = true)
        public String key;

        @NameInMap("Value")
        @Validation(required = true)
        public String value;

        public static ListOTAJobByFirmwareResponseDataSimpleOTAJobInfoTagsOtaTagDTO build(java.util.Map<String, ?> map) throws Exception {
            ListOTAJobByFirmwareResponseDataSimpleOTAJobInfoTagsOtaTagDTO self = new ListOTAJobByFirmwareResponseDataSimpleOTAJobInfoTagsOtaTagDTO();
            return TeaModel.build(map, self);
        }

        public ListOTAJobByFirmwareResponseDataSimpleOTAJobInfoTagsOtaTagDTO setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public ListOTAJobByFirmwareResponseDataSimpleOTAJobInfoTagsOtaTagDTO setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class ListOTAJobByFirmwareResponseDataSimpleOTAJobInfoTags extends TeaModel {
        @NameInMap("OtaTagDTO")
        @Validation(required = true)
        public java.util.List<ListOTAJobByFirmwareResponseDataSimpleOTAJobInfoTagsOtaTagDTO> otaTagDTO;

        public static ListOTAJobByFirmwareResponseDataSimpleOTAJobInfoTags build(java.util.Map<String, ?> map) throws Exception {
            ListOTAJobByFirmwareResponseDataSimpleOTAJobInfoTags self = new ListOTAJobByFirmwareResponseDataSimpleOTAJobInfoTags();
            return TeaModel.build(map, self);
        }

        public ListOTAJobByFirmwareResponseDataSimpleOTAJobInfoTags setOtaTagDTO(java.util.List<ListOTAJobByFirmwareResponseDataSimpleOTAJobInfoTagsOtaTagDTO> otaTagDTO) {
            this.otaTagDTO = otaTagDTO;
            return this;
        }
        public java.util.List<ListOTAJobByFirmwareResponseDataSimpleOTAJobInfoTagsOtaTagDTO> getOtaTagDTO() {
            return this.otaTagDTO;
        }

    }

    public static class ListOTAJobByFirmwareResponseDataSimpleOTAJobInfo extends TeaModel {
        @NameInMap("JobId")
        @Validation(required = true)
        public String jobId;

        @NameInMap("UtcCreate")
        @Validation(required = true)
        public String utcCreate;

        @NameInMap("UtcModified")
        @Validation(required = true)
        public String utcModified;

        @NameInMap("ProductKey")
        @Validation(required = true)
        public String productKey;

        @NameInMap("FirmwareId")
        @Validation(required = true)
        public String firmwareId;

        @NameInMap("UtcStartTime")
        @Validation(required = true)
        public String utcStartTime;

        @NameInMap("UtcEndTime")
        @Validation(required = true)
        public String utcEndTime;

        @NameInMap("JobStatus")
        @Validation(required = true)
        public String jobStatus;

        @NameInMap("JobType")
        @Validation(required = true)
        public String jobType;

        @NameInMap("TargetSelection")
        @Validation(required = true)
        public String targetSelection;

        @NameInMap("SelectionType")
        @Validation(required = true)
        public String selectionType;

        @NameInMap("Tags")
        @Validation(required = true)
        public ListOTAJobByFirmwareResponseDataSimpleOTAJobInfoTags tags;

        public static ListOTAJobByFirmwareResponseDataSimpleOTAJobInfo build(java.util.Map<String, ?> map) throws Exception {
            ListOTAJobByFirmwareResponseDataSimpleOTAJobInfo self = new ListOTAJobByFirmwareResponseDataSimpleOTAJobInfo();
            return TeaModel.build(map, self);
        }

        public ListOTAJobByFirmwareResponseDataSimpleOTAJobInfo setJobId(String jobId) {
            this.jobId = jobId;
            return this;
        }
        public String getJobId() {
            return this.jobId;
        }

        public ListOTAJobByFirmwareResponseDataSimpleOTAJobInfo setUtcCreate(String utcCreate) {
            this.utcCreate = utcCreate;
            return this;
        }
        public String getUtcCreate() {
            return this.utcCreate;
        }

        public ListOTAJobByFirmwareResponseDataSimpleOTAJobInfo setUtcModified(String utcModified) {
            this.utcModified = utcModified;
            return this;
        }
        public String getUtcModified() {
            return this.utcModified;
        }

        public ListOTAJobByFirmwareResponseDataSimpleOTAJobInfo setProductKey(String productKey) {
            this.productKey = productKey;
            return this;
        }
        public String getProductKey() {
            return this.productKey;
        }

        public ListOTAJobByFirmwareResponseDataSimpleOTAJobInfo setFirmwareId(String firmwareId) {
            this.firmwareId = firmwareId;
            return this;
        }
        public String getFirmwareId() {
            return this.firmwareId;
        }

        public ListOTAJobByFirmwareResponseDataSimpleOTAJobInfo setUtcStartTime(String utcStartTime) {
            this.utcStartTime = utcStartTime;
            return this;
        }
        public String getUtcStartTime() {
            return this.utcStartTime;
        }

        public ListOTAJobByFirmwareResponseDataSimpleOTAJobInfo setUtcEndTime(String utcEndTime) {
            this.utcEndTime = utcEndTime;
            return this;
        }
        public String getUtcEndTime() {
            return this.utcEndTime;
        }

        public ListOTAJobByFirmwareResponseDataSimpleOTAJobInfo setJobStatus(String jobStatus) {
            this.jobStatus = jobStatus;
            return this;
        }
        public String getJobStatus() {
            return this.jobStatus;
        }

        public ListOTAJobByFirmwareResponseDataSimpleOTAJobInfo setJobType(String jobType) {
            this.jobType = jobType;
            return this;
        }
        public String getJobType() {
            return this.jobType;
        }

        public ListOTAJobByFirmwareResponseDataSimpleOTAJobInfo setTargetSelection(String targetSelection) {
            this.targetSelection = targetSelection;
            return this;
        }
        public String getTargetSelection() {
            return this.targetSelection;
        }

        public ListOTAJobByFirmwareResponseDataSimpleOTAJobInfo setSelectionType(String selectionType) {
            this.selectionType = selectionType;
            return this;
        }
        public String getSelectionType() {
            return this.selectionType;
        }

        public ListOTAJobByFirmwareResponseDataSimpleOTAJobInfo setTags(ListOTAJobByFirmwareResponseDataSimpleOTAJobInfoTags tags) {
            this.tags = tags;
            return this;
        }
        public ListOTAJobByFirmwareResponseDataSimpleOTAJobInfoTags getTags() {
            return this.tags;
        }

    }

    public static class ListOTAJobByFirmwareResponseData extends TeaModel {
        @NameInMap("SimpleOTAJobInfo")
        @Validation(required = true)
        public java.util.List<ListOTAJobByFirmwareResponseDataSimpleOTAJobInfo> simpleOTAJobInfo;

        public static ListOTAJobByFirmwareResponseData build(java.util.Map<String, ?> map) throws Exception {
            ListOTAJobByFirmwareResponseData self = new ListOTAJobByFirmwareResponseData();
            return TeaModel.build(map, self);
        }

        public ListOTAJobByFirmwareResponseData setSimpleOTAJobInfo(java.util.List<ListOTAJobByFirmwareResponseDataSimpleOTAJobInfo> simpleOTAJobInfo) {
            this.simpleOTAJobInfo = simpleOTAJobInfo;
            return this;
        }
        public java.util.List<ListOTAJobByFirmwareResponseDataSimpleOTAJobInfo> getSimpleOTAJobInfo() {
            return this.simpleOTAJobInfo;
        }

    }

}
