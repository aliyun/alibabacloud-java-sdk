// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class QueryOTAJobResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    @NameInMap("Code")
    public String code;

    @NameInMap("ErrorMessage")
    public String errorMessage;

    @NameInMap("Data")
    public QueryOTAJobResponseBodyData data;

    public static QueryOTAJobResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryOTAJobResponseBody self = new QueryOTAJobResponseBody();
        return TeaModel.build(map, self);
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

    public QueryOTAJobResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public QueryOTAJobResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public QueryOTAJobResponseBody setData(QueryOTAJobResponseBodyData data) {
        this.data = data;
        return this;
    }
    public QueryOTAJobResponseBodyData getData() {
        return this.data;
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
        @NameInMap("Key")
        public String key;

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

        @NameInMap("JobDesc")
        public String jobDesc;

        @NameInMap("Name")
        public String name;

        @NameInMap("UtcScheduleTime")
        public String utcScheduleTime;

        @NameInMap("RetryInterval")
        public Integer retryInterval;

        @NameInMap("RetryCount")
        public Integer retryCount;

        @NameInMap("TimeoutInMinutes")
        public Integer timeoutInMinutes;

        @NameInMap("TargetSelection")
        public String targetSelection;

        @NameInMap("SelectionType")
        public String selectionType;

        @NameInMap("GrayPercent")
        public String grayPercent;

        @NameInMap("MaximumPerMinute")
        public Integer maximumPerMinute;

        @NameInMap("DestVersion")
        public String destVersion;

        @NameInMap("UtcScheduleFinishTime")
        public String utcScheduleFinishTime;

        @NameInMap("OverwriteMode")
        public Integer overwriteMode;

        @NameInMap("DynamicMode")
        public Integer dynamicMode;

        @NameInMap("SrcVersions")
        public QueryOTAJobResponseBodyDataSrcVersions srcVersions;

        @NameInMap("Tags")
        public QueryOTAJobResponseBodyDataTags tags;

        public static QueryOTAJobResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            QueryOTAJobResponseBodyData self = new QueryOTAJobResponseBodyData();
            return TeaModel.build(map, self);
        }

        public QueryOTAJobResponseBodyData setJobId(String jobId) {
            this.jobId = jobId;
            return this;
        }
        public String getJobId() {
            return this.jobId;
        }

        public QueryOTAJobResponseBodyData setUtcCreate(String utcCreate) {
            this.utcCreate = utcCreate;
            return this;
        }
        public String getUtcCreate() {
            return this.utcCreate;
        }

        public QueryOTAJobResponseBodyData setUtcModified(String utcModified) {
            this.utcModified = utcModified;
            return this;
        }
        public String getUtcModified() {
            return this.utcModified;
        }

        public QueryOTAJobResponseBodyData setProductKey(String productKey) {
            this.productKey = productKey;
            return this;
        }
        public String getProductKey() {
            return this.productKey;
        }

        public QueryOTAJobResponseBodyData setFirmwareId(String firmwareId) {
            this.firmwareId = firmwareId;
            return this;
        }
        public String getFirmwareId() {
            return this.firmwareId;
        }

        public QueryOTAJobResponseBodyData setUtcStartTime(String utcStartTime) {
            this.utcStartTime = utcStartTime;
            return this;
        }
        public String getUtcStartTime() {
            return this.utcStartTime;
        }

        public QueryOTAJobResponseBodyData setUtcEndTime(String utcEndTime) {
            this.utcEndTime = utcEndTime;
            return this;
        }
        public String getUtcEndTime() {
            return this.utcEndTime;
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

        public QueryOTAJobResponseBodyData setJobDesc(String jobDesc) {
            this.jobDesc = jobDesc;
            return this;
        }
        public String getJobDesc() {
            return this.jobDesc;
        }

        public QueryOTAJobResponseBodyData setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public QueryOTAJobResponseBodyData setUtcScheduleTime(String utcScheduleTime) {
            this.utcScheduleTime = utcScheduleTime;
            return this;
        }
        public String getUtcScheduleTime() {
            return this.utcScheduleTime;
        }

        public QueryOTAJobResponseBodyData setRetryInterval(Integer retryInterval) {
            this.retryInterval = retryInterval;
            return this;
        }
        public Integer getRetryInterval() {
            return this.retryInterval;
        }

        public QueryOTAJobResponseBodyData setRetryCount(Integer retryCount) {
            this.retryCount = retryCount;
            return this;
        }
        public Integer getRetryCount() {
            return this.retryCount;
        }

        public QueryOTAJobResponseBodyData setTimeoutInMinutes(Integer timeoutInMinutes) {
            this.timeoutInMinutes = timeoutInMinutes;
            return this;
        }
        public Integer getTimeoutInMinutes() {
            return this.timeoutInMinutes;
        }

        public QueryOTAJobResponseBodyData setTargetSelection(String targetSelection) {
            this.targetSelection = targetSelection;
            return this;
        }
        public String getTargetSelection() {
            return this.targetSelection;
        }

        public QueryOTAJobResponseBodyData setSelectionType(String selectionType) {
            this.selectionType = selectionType;
            return this;
        }
        public String getSelectionType() {
            return this.selectionType;
        }

        public QueryOTAJobResponseBodyData setGrayPercent(String grayPercent) {
            this.grayPercent = grayPercent;
            return this;
        }
        public String getGrayPercent() {
            return this.grayPercent;
        }

        public QueryOTAJobResponseBodyData setMaximumPerMinute(Integer maximumPerMinute) {
            this.maximumPerMinute = maximumPerMinute;
            return this;
        }
        public Integer getMaximumPerMinute() {
            return this.maximumPerMinute;
        }

        public QueryOTAJobResponseBodyData setDestVersion(String destVersion) {
            this.destVersion = destVersion;
            return this;
        }
        public String getDestVersion() {
            return this.destVersion;
        }

        public QueryOTAJobResponseBodyData setUtcScheduleFinishTime(String utcScheduleFinishTime) {
            this.utcScheduleFinishTime = utcScheduleFinishTime;
            return this;
        }
        public String getUtcScheduleFinishTime() {
            return this.utcScheduleFinishTime;
        }

        public QueryOTAJobResponseBodyData setOverwriteMode(Integer overwriteMode) {
            this.overwriteMode = overwriteMode;
            return this;
        }
        public Integer getOverwriteMode() {
            return this.overwriteMode;
        }

        public QueryOTAJobResponseBodyData setDynamicMode(Integer dynamicMode) {
            this.dynamicMode = dynamicMode;
            return this;
        }
        public Integer getDynamicMode() {
            return this.dynamicMode;
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

    }

}
