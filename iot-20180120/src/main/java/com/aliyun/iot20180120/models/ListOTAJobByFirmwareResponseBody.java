// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class ListOTAJobByFirmwareResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    @NameInMap("Code")
    public String code;

    @NameInMap("ErrorMessage")
    public String errorMessage;

    @NameInMap("Total")
    public Integer total;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("PageCount")
    public Integer pageCount;

    @NameInMap("CurrentPage")
    public Integer currentPage;

    @NameInMap("Data")
    public ListOTAJobByFirmwareResponseBodyData data;

    public static ListOTAJobByFirmwareResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListOTAJobByFirmwareResponseBody self = new ListOTAJobByFirmwareResponseBody();
        return TeaModel.build(map, self);
    }

    public ListOTAJobByFirmwareResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListOTAJobByFirmwareResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public ListOTAJobByFirmwareResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListOTAJobByFirmwareResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public ListOTAJobByFirmwareResponseBody setTotal(Integer total) {
        this.total = total;
        return this;
    }
    public Integer getTotal() {
        return this.total;
    }

    public ListOTAJobByFirmwareResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListOTAJobByFirmwareResponseBody setPageCount(Integer pageCount) {
        this.pageCount = pageCount;
        return this;
    }
    public Integer getPageCount() {
        return this.pageCount;
    }

    public ListOTAJobByFirmwareResponseBody setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    public ListOTAJobByFirmwareResponseBody setData(ListOTAJobByFirmwareResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ListOTAJobByFirmwareResponseBodyData getData() {
        return this.data;
    }

    public static class ListOTAJobByFirmwareResponseBodyDataSimpleOTAJobInfoTagsOtaTagDTO extends TeaModel {
        @NameInMap("Key")
        public String key;

        @NameInMap("Value")
        public String value;

        public static ListOTAJobByFirmwareResponseBodyDataSimpleOTAJobInfoTagsOtaTagDTO build(java.util.Map<String, ?> map) throws Exception {
            ListOTAJobByFirmwareResponseBodyDataSimpleOTAJobInfoTagsOtaTagDTO self = new ListOTAJobByFirmwareResponseBodyDataSimpleOTAJobInfoTagsOtaTagDTO();
            return TeaModel.build(map, self);
        }

        public ListOTAJobByFirmwareResponseBodyDataSimpleOTAJobInfoTagsOtaTagDTO setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public ListOTAJobByFirmwareResponseBodyDataSimpleOTAJobInfoTagsOtaTagDTO setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class ListOTAJobByFirmwareResponseBodyDataSimpleOTAJobInfoTags extends TeaModel {
        @NameInMap("OtaTagDTO")
        public java.util.List<ListOTAJobByFirmwareResponseBodyDataSimpleOTAJobInfoTagsOtaTagDTO> otaTagDTO;

        public static ListOTAJobByFirmwareResponseBodyDataSimpleOTAJobInfoTags build(java.util.Map<String, ?> map) throws Exception {
            ListOTAJobByFirmwareResponseBodyDataSimpleOTAJobInfoTags self = new ListOTAJobByFirmwareResponseBodyDataSimpleOTAJobInfoTags();
            return TeaModel.build(map, self);
        }

        public ListOTAJobByFirmwareResponseBodyDataSimpleOTAJobInfoTags setOtaTagDTO(java.util.List<ListOTAJobByFirmwareResponseBodyDataSimpleOTAJobInfoTagsOtaTagDTO> otaTagDTO) {
            this.otaTagDTO = otaTagDTO;
            return this;
        }
        public java.util.List<ListOTAJobByFirmwareResponseBodyDataSimpleOTAJobInfoTagsOtaTagDTO> getOtaTagDTO() {
            return this.otaTagDTO;
        }

    }

    public static class ListOTAJobByFirmwareResponseBodyDataSimpleOTAJobInfo extends TeaModel {
        @NameInMap("JobId")
        public String jobId;

        @NameInMap("UtcCreate")
        public String utcCreate;

        @NameInMap("UtcModified")
        public String utcModified;

        @NameInMap("ProductKey")
        public String productKey;

        @NameInMap("FirmwareId")
        public String firmwareId;

        @NameInMap("UtcStartTime")
        public String utcStartTime;

        @NameInMap("UtcEndTime")
        public String utcEndTime;

        @NameInMap("JobStatus")
        public String jobStatus;

        @NameInMap("JobType")
        public String jobType;

        @NameInMap("TargetSelection")
        public String targetSelection;

        @NameInMap("SelectionType")
        public String selectionType;

        @NameInMap("Tags")
        public ListOTAJobByFirmwareResponseBodyDataSimpleOTAJobInfoTags tags;

        public static ListOTAJobByFirmwareResponseBodyDataSimpleOTAJobInfo build(java.util.Map<String, ?> map) throws Exception {
            ListOTAJobByFirmwareResponseBodyDataSimpleOTAJobInfo self = new ListOTAJobByFirmwareResponseBodyDataSimpleOTAJobInfo();
            return TeaModel.build(map, self);
        }

        public ListOTAJobByFirmwareResponseBodyDataSimpleOTAJobInfo setJobId(String jobId) {
            this.jobId = jobId;
            return this;
        }
        public String getJobId() {
            return this.jobId;
        }

        public ListOTAJobByFirmwareResponseBodyDataSimpleOTAJobInfo setUtcCreate(String utcCreate) {
            this.utcCreate = utcCreate;
            return this;
        }
        public String getUtcCreate() {
            return this.utcCreate;
        }

        public ListOTAJobByFirmwareResponseBodyDataSimpleOTAJobInfo setUtcModified(String utcModified) {
            this.utcModified = utcModified;
            return this;
        }
        public String getUtcModified() {
            return this.utcModified;
        }

        public ListOTAJobByFirmwareResponseBodyDataSimpleOTAJobInfo setProductKey(String productKey) {
            this.productKey = productKey;
            return this;
        }
        public String getProductKey() {
            return this.productKey;
        }

        public ListOTAJobByFirmwareResponseBodyDataSimpleOTAJobInfo setFirmwareId(String firmwareId) {
            this.firmwareId = firmwareId;
            return this;
        }
        public String getFirmwareId() {
            return this.firmwareId;
        }

        public ListOTAJobByFirmwareResponseBodyDataSimpleOTAJobInfo setUtcStartTime(String utcStartTime) {
            this.utcStartTime = utcStartTime;
            return this;
        }
        public String getUtcStartTime() {
            return this.utcStartTime;
        }

        public ListOTAJobByFirmwareResponseBodyDataSimpleOTAJobInfo setUtcEndTime(String utcEndTime) {
            this.utcEndTime = utcEndTime;
            return this;
        }
        public String getUtcEndTime() {
            return this.utcEndTime;
        }

        public ListOTAJobByFirmwareResponseBodyDataSimpleOTAJobInfo setJobStatus(String jobStatus) {
            this.jobStatus = jobStatus;
            return this;
        }
        public String getJobStatus() {
            return this.jobStatus;
        }

        public ListOTAJobByFirmwareResponseBodyDataSimpleOTAJobInfo setJobType(String jobType) {
            this.jobType = jobType;
            return this;
        }
        public String getJobType() {
            return this.jobType;
        }

        public ListOTAJobByFirmwareResponseBodyDataSimpleOTAJobInfo setTargetSelection(String targetSelection) {
            this.targetSelection = targetSelection;
            return this;
        }
        public String getTargetSelection() {
            return this.targetSelection;
        }

        public ListOTAJobByFirmwareResponseBodyDataSimpleOTAJobInfo setSelectionType(String selectionType) {
            this.selectionType = selectionType;
            return this;
        }
        public String getSelectionType() {
            return this.selectionType;
        }

        public ListOTAJobByFirmwareResponseBodyDataSimpleOTAJobInfo setTags(ListOTAJobByFirmwareResponseBodyDataSimpleOTAJobInfoTags tags) {
            this.tags = tags;
            return this;
        }
        public ListOTAJobByFirmwareResponseBodyDataSimpleOTAJobInfoTags getTags() {
            return this.tags;
        }

    }

    public static class ListOTAJobByFirmwareResponseBodyData extends TeaModel {
        @NameInMap("SimpleOTAJobInfo")
        public java.util.List<ListOTAJobByFirmwareResponseBodyDataSimpleOTAJobInfo> simpleOTAJobInfo;

        public static ListOTAJobByFirmwareResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListOTAJobByFirmwareResponseBodyData self = new ListOTAJobByFirmwareResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListOTAJobByFirmwareResponseBodyData setSimpleOTAJobInfo(java.util.List<ListOTAJobByFirmwareResponseBodyDataSimpleOTAJobInfo> simpleOTAJobInfo) {
            this.simpleOTAJobInfo = simpleOTAJobInfo;
            return this;
        }
        public java.util.List<ListOTAJobByFirmwareResponseBodyDataSimpleOTAJobInfo> getSimpleOTAJobInfo() {
            return this.simpleOTAJobInfo;
        }

    }

}
