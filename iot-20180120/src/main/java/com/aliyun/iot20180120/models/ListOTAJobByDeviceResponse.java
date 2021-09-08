// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class ListOTAJobByDeviceResponse extends TeaModel {
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
    public ListOTAJobByDeviceResponseData data;

    public static ListOTAJobByDeviceResponse build(java.util.Map<String, ?> map) throws Exception {
        ListOTAJobByDeviceResponse self = new ListOTAJobByDeviceResponse();
        return TeaModel.build(map, self);
    }

    public ListOTAJobByDeviceResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListOTAJobByDeviceResponse setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public ListOTAJobByDeviceResponse setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListOTAJobByDeviceResponse setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public ListOTAJobByDeviceResponse setTotal(Integer total) {
        this.total = total;
        return this;
    }
    public Integer getTotal() {
        return this.total;
    }

    public ListOTAJobByDeviceResponse setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListOTAJobByDeviceResponse setPageCount(Integer pageCount) {
        this.pageCount = pageCount;
        return this;
    }
    public Integer getPageCount() {
        return this.pageCount;
    }

    public ListOTAJobByDeviceResponse setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    public ListOTAJobByDeviceResponse setData(ListOTAJobByDeviceResponseData data) {
        this.data = data;
        return this;
    }
    public ListOTAJobByDeviceResponseData getData() {
        return this.data;
    }

    public static class ListOTAJobByDeviceResponseDataSimpleOTAJobInfoTagsOtaTagDTO extends TeaModel {
        @NameInMap("Key")
        @Validation(required = true)
        public String key;

        @NameInMap("Value")
        @Validation(required = true)
        public String value;

        public static ListOTAJobByDeviceResponseDataSimpleOTAJobInfoTagsOtaTagDTO build(java.util.Map<String, ?> map) throws Exception {
            ListOTAJobByDeviceResponseDataSimpleOTAJobInfoTagsOtaTagDTO self = new ListOTAJobByDeviceResponseDataSimpleOTAJobInfoTagsOtaTagDTO();
            return TeaModel.build(map, self);
        }

        public ListOTAJobByDeviceResponseDataSimpleOTAJobInfoTagsOtaTagDTO setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public ListOTAJobByDeviceResponseDataSimpleOTAJobInfoTagsOtaTagDTO setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class ListOTAJobByDeviceResponseDataSimpleOTAJobInfoTags extends TeaModel {
        @NameInMap("OtaTagDTO")
        @Validation(required = true)
        public java.util.List<ListOTAJobByDeviceResponseDataSimpleOTAJobInfoTagsOtaTagDTO> otaTagDTO;

        public static ListOTAJobByDeviceResponseDataSimpleOTAJobInfoTags build(java.util.Map<String, ?> map) throws Exception {
            ListOTAJobByDeviceResponseDataSimpleOTAJobInfoTags self = new ListOTAJobByDeviceResponseDataSimpleOTAJobInfoTags();
            return TeaModel.build(map, self);
        }

        public ListOTAJobByDeviceResponseDataSimpleOTAJobInfoTags setOtaTagDTO(java.util.List<ListOTAJobByDeviceResponseDataSimpleOTAJobInfoTagsOtaTagDTO> otaTagDTO) {
            this.otaTagDTO = otaTagDTO;
            return this;
        }
        public java.util.List<ListOTAJobByDeviceResponseDataSimpleOTAJobInfoTagsOtaTagDTO> getOtaTagDTO() {
            return this.otaTagDTO;
        }

    }

    public static class ListOTAJobByDeviceResponseDataSimpleOTAJobInfo extends TeaModel {
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
        public ListOTAJobByDeviceResponseDataSimpleOTAJobInfoTags tags;

        public static ListOTAJobByDeviceResponseDataSimpleOTAJobInfo build(java.util.Map<String, ?> map) throws Exception {
            ListOTAJobByDeviceResponseDataSimpleOTAJobInfo self = new ListOTAJobByDeviceResponseDataSimpleOTAJobInfo();
            return TeaModel.build(map, self);
        }

        public ListOTAJobByDeviceResponseDataSimpleOTAJobInfo setJobId(String jobId) {
            this.jobId = jobId;
            return this;
        }
        public String getJobId() {
            return this.jobId;
        }

        public ListOTAJobByDeviceResponseDataSimpleOTAJobInfo setUtcCreate(String utcCreate) {
            this.utcCreate = utcCreate;
            return this;
        }
        public String getUtcCreate() {
            return this.utcCreate;
        }

        public ListOTAJobByDeviceResponseDataSimpleOTAJobInfo setUtcModified(String utcModified) {
            this.utcModified = utcModified;
            return this;
        }
        public String getUtcModified() {
            return this.utcModified;
        }

        public ListOTAJobByDeviceResponseDataSimpleOTAJobInfo setProductKey(String productKey) {
            this.productKey = productKey;
            return this;
        }
        public String getProductKey() {
            return this.productKey;
        }

        public ListOTAJobByDeviceResponseDataSimpleOTAJobInfo setFirmwareId(String firmwareId) {
            this.firmwareId = firmwareId;
            return this;
        }
        public String getFirmwareId() {
            return this.firmwareId;
        }

        public ListOTAJobByDeviceResponseDataSimpleOTAJobInfo setUtcStartTime(String utcStartTime) {
            this.utcStartTime = utcStartTime;
            return this;
        }
        public String getUtcStartTime() {
            return this.utcStartTime;
        }

        public ListOTAJobByDeviceResponseDataSimpleOTAJobInfo setUtcEndTime(String utcEndTime) {
            this.utcEndTime = utcEndTime;
            return this;
        }
        public String getUtcEndTime() {
            return this.utcEndTime;
        }

        public ListOTAJobByDeviceResponseDataSimpleOTAJobInfo setJobStatus(String jobStatus) {
            this.jobStatus = jobStatus;
            return this;
        }
        public String getJobStatus() {
            return this.jobStatus;
        }

        public ListOTAJobByDeviceResponseDataSimpleOTAJobInfo setJobType(String jobType) {
            this.jobType = jobType;
            return this;
        }
        public String getJobType() {
            return this.jobType;
        }

        public ListOTAJobByDeviceResponseDataSimpleOTAJobInfo setTargetSelection(String targetSelection) {
            this.targetSelection = targetSelection;
            return this;
        }
        public String getTargetSelection() {
            return this.targetSelection;
        }

        public ListOTAJobByDeviceResponseDataSimpleOTAJobInfo setSelectionType(String selectionType) {
            this.selectionType = selectionType;
            return this;
        }
        public String getSelectionType() {
            return this.selectionType;
        }

        public ListOTAJobByDeviceResponseDataSimpleOTAJobInfo setTags(ListOTAJobByDeviceResponseDataSimpleOTAJobInfoTags tags) {
            this.tags = tags;
            return this;
        }
        public ListOTAJobByDeviceResponseDataSimpleOTAJobInfoTags getTags() {
            return this.tags;
        }

    }

    public static class ListOTAJobByDeviceResponseData extends TeaModel {
        @NameInMap("SimpleOTAJobInfo")
        @Validation(required = true)
        public java.util.List<ListOTAJobByDeviceResponseDataSimpleOTAJobInfo> simpleOTAJobInfo;

        public static ListOTAJobByDeviceResponseData build(java.util.Map<String, ?> map) throws Exception {
            ListOTAJobByDeviceResponseData self = new ListOTAJobByDeviceResponseData();
            return TeaModel.build(map, self);
        }

        public ListOTAJobByDeviceResponseData setSimpleOTAJobInfo(java.util.List<ListOTAJobByDeviceResponseDataSimpleOTAJobInfo> simpleOTAJobInfo) {
            this.simpleOTAJobInfo = simpleOTAJobInfo;
            return this;
        }
        public java.util.List<ListOTAJobByDeviceResponseDataSimpleOTAJobInfo> getSimpleOTAJobInfo() {
            return this.simpleOTAJobInfo;
        }

    }

}
