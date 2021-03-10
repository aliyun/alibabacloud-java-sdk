// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class ListOTAJobByDeviceResponseBody extends TeaModel {
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
    public ListOTAJobByDeviceResponseBodyData data;

    public static ListOTAJobByDeviceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListOTAJobByDeviceResponseBody self = new ListOTAJobByDeviceResponseBody();
        return TeaModel.build(map, self);
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

    public ListOTAJobByDeviceResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListOTAJobByDeviceResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public ListOTAJobByDeviceResponseBody setTotal(Integer total) {
        this.total = total;
        return this;
    }
    public Integer getTotal() {
        return this.total;
    }

    public ListOTAJobByDeviceResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListOTAJobByDeviceResponseBody setPageCount(Integer pageCount) {
        this.pageCount = pageCount;
        return this;
    }
    public Integer getPageCount() {
        return this.pageCount;
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

    public static class ListOTAJobByDeviceResponseBodyDataSimpleOTAJobInfoTagsOtaTagDTO extends TeaModel {
        @NameInMap("Key")
        public String key;

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
        public ListOTAJobByDeviceResponseBodyDataSimpleOTAJobInfoTags tags;

        public static ListOTAJobByDeviceResponseBodyDataSimpleOTAJobInfo build(java.util.Map<String, ?> map) throws Exception {
            ListOTAJobByDeviceResponseBodyDataSimpleOTAJobInfo self = new ListOTAJobByDeviceResponseBodyDataSimpleOTAJobInfo();
            return TeaModel.build(map, self);
        }

        public ListOTAJobByDeviceResponseBodyDataSimpleOTAJobInfo setJobId(String jobId) {
            this.jobId = jobId;
            return this;
        }
        public String getJobId() {
            return this.jobId;
        }

        public ListOTAJobByDeviceResponseBodyDataSimpleOTAJobInfo setUtcCreate(String utcCreate) {
            this.utcCreate = utcCreate;
            return this;
        }
        public String getUtcCreate() {
            return this.utcCreate;
        }

        public ListOTAJobByDeviceResponseBodyDataSimpleOTAJobInfo setUtcModified(String utcModified) {
            this.utcModified = utcModified;
            return this;
        }
        public String getUtcModified() {
            return this.utcModified;
        }

        public ListOTAJobByDeviceResponseBodyDataSimpleOTAJobInfo setProductKey(String productKey) {
            this.productKey = productKey;
            return this;
        }
        public String getProductKey() {
            return this.productKey;
        }

        public ListOTAJobByDeviceResponseBodyDataSimpleOTAJobInfo setFirmwareId(String firmwareId) {
            this.firmwareId = firmwareId;
            return this;
        }
        public String getFirmwareId() {
            return this.firmwareId;
        }

        public ListOTAJobByDeviceResponseBodyDataSimpleOTAJobInfo setUtcStartTime(String utcStartTime) {
            this.utcStartTime = utcStartTime;
            return this;
        }
        public String getUtcStartTime() {
            return this.utcStartTime;
        }

        public ListOTAJobByDeviceResponseBodyDataSimpleOTAJobInfo setUtcEndTime(String utcEndTime) {
            this.utcEndTime = utcEndTime;
            return this;
        }
        public String getUtcEndTime() {
            return this.utcEndTime;
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

        public ListOTAJobByDeviceResponseBodyDataSimpleOTAJobInfo setTargetSelection(String targetSelection) {
            this.targetSelection = targetSelection;
            return this;
        }
        public String getTargetSelection() {
            return this.targetSelection;
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
