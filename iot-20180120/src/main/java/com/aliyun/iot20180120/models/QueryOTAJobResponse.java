// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class QueryOTAJobResponse extends TeaModel {
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

    @NameInMap("Data")
    @Validation(required = true)
    public QueryOTAJobResponseData data;

    public static QueryOTAJobResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryOTAJobResponse self = new QueryOTAJobResponse();
        return TeaModel.build(map, self);
    }

    public QueryOTAJobResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryOTAJobResponse setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public QueryOTAJobResponse setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public QueryOTAJobResponse setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public QueryOTAJobResponse setData(QueryOTAJobResponseData data) {
        this.data = data;
        return this;
    }
    public QueryOTAJobResponseData getData() {
        return this.data;
    }

    public static class QueryOTAJobResponseDataTagsOtaTagDTO extends TeaModel {
        @NameInMap("Key")
        @Validation(required = true)
        public String key;

        @NameInMap("Value")
        @Validation(required = true)
        public String value;

        public static QueryOTAJobResponseDataTagsOtaTagDTO build(java.util.Map<String, ?> map) throws Exception {
            QueryOTAJobResponseDataTagsOtaTagDTO self = new QueryOTAJobResponseDataTagsOtaTagDTO();
            return TeaModel.build(map, self);
        }

        public QueryOTAJobResponseDataTagsOtaTagDTO setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public QueryOTAJobResponseDataTagsOtaTagDTO setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class QueryOTAJobResponseDataTags extends TeaModel {
        @NameInMap("OtaTagDTO")
        @Validation(required = true)
        public java.util.List<QueryOTAJobResponseDataTagsOtaTagDTO> otaTagDTO;

        public static QueryOTAJobResponseDataTags build(java.util.Map<String, ?> map) throws Exception {
            QueryOTAJobResponseDataTags self = new QueryOTAJobResponseDataTags();
            return TeaModel.build(map, self);
        }

        public QueryOTAJobResponseDataTags setOtaTagDTO(java.util.List<QueryOTAJobResponseDataTagsOtaTagDTO> otaTagDTO) {
            this.otaTagDTO = otaTagDTO;
            return this;
        }
        public java.util.List<QueryOTAJobResponseDataTagsOtaTagDTO> getOtaTagDTO() {
            return this.otaTagDTO;
        }

    }

    public static class QueryOTAJobResponseDataSrcVersions extends TeaModel {
        // SrcVersion
        @NameInMap("SrcVersion")
        @Validation(required = true)
        public java.util.List<String> srcVersion;

        public static QueryOTAJobResponseDataSrcVersions build(java.util.Map<String, ?> map) throws Exception {
            QueryOTAJobResponseDataSrcVersions self = new QueryOTAJobResponseDataSrcVersions();
            return TeaModel.build(map, self);
        }

        public QueryOTAJobResponseDataSrcVersions setSrcVersion(java.util.List<String> srcVersion) {
            this.srcVersion = srcVersion;
            return this;
        }
        public java.util.List<String> getSrcVersion() {
            return this.srcVersion;
        }

    }

    public static class QueryOTAJobResponseData extends TeaModel {
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

        @NameInMap("JobDesc")
        @Validation(required = true)
        public String jobDesc;

        @NameInMap("Name")
        @Validation(required = true)
        public String name;

        @NameInMap("UtcScheduleTime")
        @Validation(required = true)
        public String utcScheduleTime;

        @NameInMap("RetryInterval")
        @Validation(required = true)
        public Integer retryInterval;

        @NameInMap("RetryCount")
        @Validation(required = true)
        public Integer retryCount;

        @NameInMap("TimeoutInMinutes")
        @Validation(required = true)
        public Integer timeoutInMinutes;

        @NameInMap("TargetSelection")
        @Validation(required = true)
        public String targetSelection;

        @NameInMap("SelectionType")
        @Validation(required = true)
        public String selectionType;

        @NameInMap("GrayPercent")
        @Validation(required = true)
        public String grayPercent;

        @NameInMap("MaximumPerMinute")
        @Validation(required = true)
        public Integer maximumPerMinute;

        @NameInMap("DestVersion")
        @Validation(required = true)
        public String destVersion;

        @NameInMap("UtcScheduleFinishTime")
        @Validation(required = true)
        public String utcScheduleFinishTime;

        @NameInMap("OverwriteMode")
        @Validation(required = true)
        public Integer overwriteMode;

        @NameInMap("DynamicMode")
        @Validation(required = true)
        public Integer dynamicMode;

        @NameInMap("NeedPush")
        @Validation(required = true)
        public Boolean needPush;

        @NameInMap("NeedConfirm")
        @Validation(required = true)
        public Boolean needConfirm;

        @NameInMap("Tags")
        @Validation(required = true)
        public QueryOTAJobResponseDataTags tags;

        @NameInMap("SrcVersions")
        @Validation(required = true)
        public QueryOTAJobResponseDataSrcVersions srcVersions;

        public static QueryOTAJobResponseData build(java.util.Map<String, ?> map) throws Exception {
            QueryOTAJobResponseData self = new QueryOTAJobResponseData();
            return TeaModel.build(map, self);
        }

        public QueryOTAJobResponseData setJobId(String jobId) {
            this.jobId = jobId;
            return this;
        }
        public String getJobId() {
            return this.jobId;
        }

        public QueryOTAJobResponseData setUtcCreate(String utcCreate) {
            this.utcCreate = utcCreate;
            return this;
        }
        public String getUtcCreate() {
            return this.utcCreate;
        }

        public QueryOTAJobResponseData setUtcModified(String utcModified) {
            this.utcModified = utcModified;
            return this;
        }
        public String getUtcModified() {
            return this.utcModified;
        }

        public QueryOTAJobResponseData setProductKey(String productKey) {
            this.productKey = productKey;
            return this;
        }
        public String getProductKey() {
            return this.productKey;
        }

        public QueryOTAJobResponseData setFirmwareId(String firmwareId) {
            this.firmwareId = firmwareId;
            return this;
        }
        public String getFirmwareId() {
            return this.firmwareId;
        }

        public QueryOTAJobResponseData setUtcStartTime(String utcStartTime) {
            this.utcStartTime = utcStartTime;
            return this;
        }
        public String getUtcStartTime() {
            return this.utcStartTime;
        }

        public QueryOTAJobResponseData setUtcEndTime(String utcEndTime) {
            this.utcEndTime = utcEndTime;
            return this;
        }
        public String getUtcEndTime() {
            return this.utcEndTime;
        }

        public QueryOTAJobResponseData setJobStatus(String jobStatus) {
            this.jobStatus = jobStatus;
            return this;
        }
        public String getJobStatus() {
            return this.jobStatus;
        }

        public QueryOTAJobResponseData setJobType(String jobType) {
            this.jobType = jobType;
            return this;
        }
        public String getJobType() {
            return this.jobType;
        }

        public QueryOTAJobResponseData setJobDesc(String jobDesc) {
            this.jobDesc = jobDesc;
            return this;
        }
        public String getJobDesc() {
            return this.jobDesc;
        }

        public QueryOTAJobResponseData setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public QueryOTAJobResponseData setUtcScheduleTime(String utcScheduleTime) {
            this.utcScheduleTime = utcScheduleTime;
            return this;
        }
        public String getUtcScheduleTime() {
            return this.utcScheduleTime;
        }

        public QueryOTAJobResponseData setRetryInterval(Integer retryInterval) {
            this.retryInterval = retryInterval;
            return this;
        }
        public Integer getRetryInterval() {
            return this.retryInterval;
        }

        public QueryOTAJobResponseData setRetryCount(Integer retryCount) {
            this.retryCount = retryCount;
            return this;
        }
        public Integer getRetryCount() {
            return this.retryCount;
        }

        public QueryOTAJobResponseData setTimeoutInMinutes(Integer timeoutInMinutes) {
            this.timeoutInMinutes = timeoutInMinutes;
            return this;
        }
        public Integer getTimeoutInMinutes() {
            return this.timeoutInMinutes;
        }

        public QueryOTAJobResponseData setTargetSelection(String targetSelection) {
            this.targetSelection = targetSelection;
            return this;
        }
        public String getTargetSelection() {
            return this.targetSelection;
        }

        public QueryOTAJobResponseData setSelectionType(String selectionType) {
            this.selectionType = selectionType;
            return this;
        }
        public String getSelectionType() {
            return this.selectionType;
        }

        public QueryOTAJobResponseData setGrayPercent(String grayPercent) {
            this.grayPercent = grayPercent;
            return this;
        }
        public String getGrayPercent() {
            return this.grayPercent;
        }

        public QueryOTAJobResponseData setMaximumPerMinute(Integer maximumPerMinute) {
            this.maximumPerMinute = maximumPerMinute;
            return this;
        }
        public Integer getMaximumPerMinute() {
            return this.maximumPerMinute;
        }

        public QueryOTAJobResponseData setDestVersion(String destVersion) {
            this.destVersion = destVersion;
            return this;
        }
        public String getDestVersion() {
            return this.destVersion;
        }

        public QueryOTAJobResponseData setUtcScheduleFinishTime(String utcScheduleFinishTime) {
            this.utcScheduleFinishTime = utcScheduleFinishTime;
            return this;
        }
        public String getUtcScheduleFinishTime() {
            return this.utcScheduleFinishTime;
        }

        public QueryOTAJobResponseData setOverwriteMode(Integer overwriteMode) {
            this.overwriteMode = overwriteMode;
            return this;
        }
        public Integer getOverwriteMode() {
            return this.overwriteMode;
        }

        public QueryOTAJobResponseData setDynamicMode(Integer dynamicMode) {
            this.dynamicMode = dynamicMode;
            return this;
        }
        public Integer getDynamicMode() {
            return this.dynamicMode;
        }

        public QueryOTAJobResponseData setNeedPush(Boolean needPush) {
            this.needPush = needPush;
            return this;
        }
        public Boolean getNeedPush() {
            return this.needPush;
        }

        public QueryOTAJobResponseData setNeedConfirm(Boolean needConfirm) {
            this.needConfirm = needConfirm;
            return this;
        }
        public Boolean getNeedConfirm() {
            return this.needConfirm;
        }

        public QueryOTAJobResponseData setTags(QueryOTAJobResponseDataTags tags) {
            this.tags = tags;
            return this;
        }
        public QueryOTAJobResponseDataTags getTags() {
            return this.tags;
        }

        public QueryOTAJobResponseData setSrcVersions(QueryOTAJobResponseDataSrcVersions srcVersions) {
            this.srcVersions = srcVersions;
            return this;
        }
        public QueryOTAJobResponseDataSrcVersions getSrcVersions() {
            return this.srcVersions;
        }

    }

}
