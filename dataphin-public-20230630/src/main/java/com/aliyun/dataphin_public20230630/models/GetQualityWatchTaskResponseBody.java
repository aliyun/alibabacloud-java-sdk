// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataphin_public20230630.models;

import com.aliyun.tea.*;

public class GetQualityWatchTaskResponseBody extends TeaModel {
    /**
     * <p>The backend status code.</p>
     * 
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The HTTP status code.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    /**
     * <p>The backend exception details.</p>
     * 
     * <strong>example:</strong>
     * <p>internal error</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>82E78D6B-AA8F-1FEF-8AA3-5C9DA2A79140</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request is successful.</p>
     */
    @NameInMap("Success")
    public Boolean success;

    /**
     * <p>The monitoring node object details.</p>
     */
    @NameInMap("WatchTaskInfo")
    public GetQualityWatchTaskResponseBodyWatchTaskInfo watchTaskInfo;

    public static GetQualityWatchTaskResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetQualityWatchTaskResponseBody self = new GetQualityWatchTaskResponseBody();
        return TeaModel.build(map, self);
    }

    public GetQualityWatchTaskResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetQualityWatchTaskResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public GetQualityWatchTaskResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetQualityWatchTaskResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetQualityWatchTaskResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public GetQualityWatchTaskResponseBody setWatchTaskInfo(GetQualityWatchTaskResponseBodyWatchTaskInfo watchTaskInfo) {
        this.watchTaskInfo = watchTaskInfo;
        return this;
    }
    public GetQualityWatchTaskResponseBodyWatchTaskInfo getWatchTaskInfo() {
        return this.watchTaskInfo;
    }

    public static class GetQualityWatchTaskResponseBodyWatchTaskInfoRuleCountInfoStrongRuleCount extends TeaModel {
        /**
         * <p>The number of failed rules.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("ErrorRuleCount")
        public Long errorRuleCount;

        /**
         * <p>The number of completed rules.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("FinishedRuleCount")
        public Long finishedRuleCount;

        /**
         * <p>The number of successful rules.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("SuccessRuleCount")
        public Long successRuleCount;

        /**
         * <p>The total number of rules.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("TotalRuleCount")
        public Long totalRuleCount;

        public static GetQualityWatchTaskResponseBodyWatchTaskInfoRuleCountInfoStrongRuleCount build(java.util.Map<String, ?> map) throws Exception {
            GetQualityWatchTaskResponseBodyWatchTaskInfoRuleCountInfoStrongRuleCount self = new GetQualityWatchTaskResponseBodyWatchTaskInfoRuleCountInfoStrongRuleCount();
            return TeaModel.build(map, self);
        }

        public GetQualityWatchTaskResponseBodyWatchTaskInfoRuleCountInfoStrongRuleCount setErrorRuleCount(Long errorRuleCount) {
            this.errorRuleCount = errorRuleCount;
            return this;
        }
        public Long getErrorRuleCount() {
            return this.errorRuleCount;
        }

        public GetQualityWatchTaskResponseBodyWatchTaskInfoRuleCountInfoStrongRuleCount setFinishedRuleCount(Long finishedRuleCount) {
            this.finishedRuleCount = finishedRuleCount;
            return this;
        }
        public Long getFinishedRuleCount() {
            return this.finishedRuleCount;
        }

        public GetQualityWatchTaskResponseBodyWatchTaskInfoRuleCountInfoStrongRuleCount setSuccessRuleCount(Long successRuleCount) {
            this.successRuleCount = successRuleCount;
            return this;
        }
        public Long getSuccessRuleCount() {
            return this.successRuleCount;
        }

        public GetQualityWatchTaskResponseBodyWatchTaskInfoRuleCountInfoStrongRuleCount setTotalRuleCount(Long totalRuleCount) {
            this.totalRuleCount = totalRuleCount;
            return this;
        }
        public Long getTotalRuleCount() {
            return this.totalRuleCount;
        }

    }

    public static class GetQualityWatchTaskResponseBodyWatchTaskInfoRuleCountInfoValidateRuleCount extends TeaModel {
        /**
         * <p>The number of failed rules.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("ErrorRuleCount")
        public Long errorRuleCount;

        /**
         * <p>The number of completed rules.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("FinishedRuleCount")
        public Long finishedRuleCount;

        /**
         * <p>The number of successful rules.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("SuccessRuleCount")
        public Long successRuleCount;

        /**
         * <p>The total number of rules.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("TotalRuleCount")
        public Long totalRuleCount;

        public static GetQualityWatchTaskResponseBodyWatchTaskInfoRuleCountInfoValidateRuleCount build(java.util.Map<String, ?> map) throws Exception {
            GetQualityWatchTaskResponseBodyWatchTaskInfoRuleCountInfoValidateRuleCount self = new GetQualityWatchTaskResponseBodyWatchTaskInfoRuleCountInfoValidateRuleCount();
            return TeaModel.build(map, self);
        }

        public GetQualityWatchTaskResponseBodyWatchTaskInfoRuleCountInfoValidateRuleCount setErrorRuleCount(Long errorRuleCount) {
            this.errorRuleCount = errorRuleCount;
            return this;
        }
        public Long getErrorRuleCount() {
            return this.errorRuleCount;
        }

        public GetQualityWatchTaskResponseBodyWatchTaskInfoRuleCountInfoValidateRuleCount setFinishedRuleCount(Long finishedRuleCount) {
            this.finishedRuleCount = finishedRuleCount;
            return this;
        }
        public Long getFinishedRuleCount() {
            return this.finishedRuleCount;
        }

        public GetQualityWatchTaskResponseBodyWatchTaskInfoRuleCountInfoValidateRuleCount setSuccessRuleCount(Long successRuleCount) {
            this.successRuleCount = successRuleCount;
            return this;
        }
        public Long getSuccessRuleCount() {
            return this.successRuleCount;
        }

        public GetQualityWatchTaskResponseBodyWatchTaskInfoRuleCountInfoValidateRuleCount setTotalRuleCount(Long totalRuleCount) {
            this.totalRuleCount = totalRuleCount;
            return this;
        }
        public Long getTotalRuleCount() {
            return this.totalRuleCount;
        }

    }

    public static class GetQualityWatchTaskResponseBodyWatchTaskInfoRuleCountInfoWeakRuleCount extends TeaModel {
        /**
         * <p>The number of failed rules.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("ErrorRuleCount")
        public Long errorRuleCount;

        /**
         * <p>The number of completed rules.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("FinishedRuleCount")
        public Long finishedRuleCount;

        /**
         * <p>The number of successful rules.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("SuccessRuleCount")
        public Long successRuleCount;

        /**
         * <p>The total number of rules.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("TotalRuleCount")
        public Long totalRuleCount;

        public static GetQualityWatchTaskResponseBodyWatchTaskInfoRuleCountInfoWeakRuleCount build(java.util.Map<String, ?> map) throws Exception {
            GetQualityWatchTaskResponseBodyWatchTaskInfoRuleCountInfoWeakRuleCount self = new GetQualityWatchTaskResponseBodyWatchTaskInfoRuleCountInfoWeakRuleCount();
            return TeaModel.build(map, self);
        }

        public GetQualityWatchTaskResponseBodyWatchTaskInfoRuleCountInfoWeakRuleCount setErrorRuleCount(Long errorRuleCount) {
            this.errorRuleCount = errorRuleCount;
            return this;
        }
        public Long getErrorRuleCount() {
            return this.errorRuleCount;
        }

        public GetQualityWatchTaskResponseBodyWatchTaskInfoRuleCountInfoWeakRuleCount setFinishedRuleCount(Long finishedRuleCount) {
            this.finishedRuleCount = finishedRuleCount;
            return this;
        }
        public Long getFinishedRuleCount() {
            return this.finishedRuleCount;
        }

        public GetQualityWatchTaskResponseBodyWatchTaskInfoRuleCountInfoWeakRuleCount setSuccessRuleCount(Long successRuleCount) {
            this.successRuleCount = successRuleCount;
            return this;
        }
        public Long getSuccessRuleCount() {
            return this.successRuleCount;
        }

        public GetQualityWatchTaskResponseBodyWatchTaskInfoRuleCountInfoWeakRuleCount setTotalRuleCount(Long totalRuleCount) {
            this.totalRuleCount = totalRuleCount;
            return this;
        }
        public Long getTotalRuleCount() {
            return this.totalRuleCount;
        }

    }

    public static class GetQualityWatchTaskResponseBodyWatchTaskInfoRuleCountInfo extends TeaModel {
        /**
         * <p>The number of strong rules.</p>
         */
        @NameInMap("StrongRuleCount")
        public GetQualityWatchTaskResponseBodyWatchTaskInfoRuleCountInfoStrongRuleCount strongRuleCount;

        /**
         * <p>The validation rule counts.</p>
         */
        @NameInMap("ValidateRuleCount")
        public GetQualityWatchTaskResponseBodyWatchTaskInfoRuleCountInfoValidateRuleCount validateRuleCount;

        /**
         * <p>The number of weak rules.</p>
         */
        @NameInMap("WeakRuleCount")
        public GetQualityWatchTaskResponseBodyWatchTaskInfoRuleCountInfoWeakRuleCount weakRuleCount;

        public static GetQualityWatchTaskResponseBodyWatchTaskInfoRuleCountInfo build(java.util.Map<String, ?> map) throws Exception {
            GetQualityWatchTaskResponseBodyWatchTaskInfoRuleCountInfo self = new GetQualityWatchTaskResponseBodyWatchTaskInfoRuleCountInfo();
            return TeaModel.build(map, self);
        }

        public GetQualityWatchTaskResponseBodyWatchTaskInfoRuleCountInfo setStrongRuleCount(GetQualityWatchTaskResponseBodyWatchTaskInfoRuleCountInfoStrongRuleCount strongRuleCount) {
            this.strongRuleCount = strongRuleCount;
            return this;
        }
        public GetQualityWatchTaskResponseBodyWatchTaskInfoRuleCountInfoStrongRuleCount getStrongRuleCount() {
            return this.strongRuleCount;
        }

        public GetQualityWatchTaskResponseBodyWatchTaskInfoRuleCountInfo setValidateRuleCount(GetQualityWatchTaskResponseBodyWatchTaskInfoRuleCountInfoValidateRuleCount validateRuleCount) {
            this.validateRuleCount = validateRuleCount;
            return this;
        }
        public GetQualityWatchTaskResponseBodyWatchTaskInfoRuleCountInfoValidateRuleCount getValidateRuleCount() {
            return this.validateRuleCount;
        }

        public GetQualityWatchTaskResponseBodyWatchTaskInfoRuleCountInfo setWeakRuleCount(GetQualityWatchTaskResponseBodyWatchTaskInfoRuleCountInfoWeakRuleCount weakRuleCount) {
            this.weakRuleCount = weakRuleCount;
            return this;
        }
        public GetQualityWatchTaskResponseBodyWatchTaskInfoRuleCountInfoWeakRuleCount getWeakRuleCount() {
            return this.weakRuleCount;
        }

    }

    public static class GetQualityWatchTaskResponseBodyWatchTaskInfo extends TeaModel {
        /**
         * <p>The business date. Format: YYYY-MM-DD.</p>
         * 
         * <strong>example:</strong>
         * <p>2025-06-30</p>
         */
        @NameInMap("BizDate")
        public String bizDate;

        /**
         * <p>The format of the business date.</p>
         * 
         * <strong>example:</strong>
         * <p>yyyy-MM-dd</p>
         */
        @NameInMap("BizDateFormat")
        public String bizDateFormat;

        /**
         * <p>The creation time. Format: YYYY-MM-DD HH:mm:ss.</p>
         * 
         * <strong>example:</strong>
         * <p>2025-06-30 00:00:00</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        /**
         * <p>The creator.</p>
         * 
         * <strong>example:</strong>
         * <p>30012011</p>
         */
        @NameInMap("Creator")
        public String creator;

        /**
         * <p>The end time. Format: yyyy-MM-dd HH:mm:ss.</p>
         * 
         * <strong>example:</strong>
         * <p>2025-06-30 20:00:00</p>
         */
        @NameInMap("EndTime")
        public String endTime;

        /**
         * <p>The watchtask ID.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Id")
        public Long id;

        /**
         * <p>The ID of the last modifier.</p>
         * 
         * <strong>example:</strong>
         * <p>30012011</p>
         */
        @NameInMap("Modifier")
        public String modifier;

        /**
         * <p>The update time. Format: YYYY-MM-DD HH:mm:ss.</p>
         * 
         * <strong>example:</strong>
         * <p>2025-06-30 00:00:00</p>
         */
        @NameInMap("ModifyTime")
        public String modifyTime;

        /**
         * <p>The ID of the quality owner.</p>
         * 
         * <strong>example:</strong>
         * <p>30012011</p>
         */
        @NameInMap("QualityOwner")
        public String qualityOwner;

        /**
         * <p>The name of the quality owner.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("QualityOwnerName")
        public String qualityOwnerName;

        /**
         * <p>The quality rule counts.</p>
         */
        @NameInMap("RuleCountInfo")
        public GetQualityWatchTaskResponseBodyWatchTaskInfoRuleCountInfo ruleCountInfo;

        /**
         * <p>The IDs of the quality rules.</p>
         */
        @NameInMap("RuleIdList")
        public java.util.List<Long> ruleIdList;

        /**
         * <p>The start time. Format: yyyy-MM-dd HH:mm:ss.</p>
         * 
         * <strong>example:</strong>
         * <p>2025-06-30 08:00:00</p>
         */
        @NameInMap("StartTime")
        public String startTime;

        /**
         * <p>The task status. Valid values: NOT_RUN (not executed), WAITING (waiting), RUNNING (running), SUCCESS (successful), FAILED (failed), CANCEL (canceled), TIMEOUT (timed out), and OFFLINE (offline).</p>
         * 
         * <strong>example:</strong>
         * <p>RUNNING</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>The ID of the monitored object.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("WatchId")
        public Long watchId;

        public static GetQualityWatchTaskResponseBodyWatchTaskInfo build(java.util.Map<String, ?> map) throws Exception {
            GetQualityWatchTaskResponseBodyWatchTaskInfo self = new GetQualityWatchTaskResponseBodyWatchTaskInfo();
            return TeaModel.build(map, self);
        }

        public GetQualityWatchTaskResponseBodyWatchTaskInfo setBizDate(String bizDate) {
            this.bizDate = bizDate;
            return this;
        }
        public String getBizDate() {
            return this.bizDate;
        }

        public GetQualityWatchTaskResponseBodyWatchTaskInfo setBizDateFormat(String bizDateFormat) {
            this.bizDateFormat = bizDateFormat;
            return this;
        }
        public String getBizDateFormat() {
            return this.bizDateFormat;
        }

        public GetQualityWatchTaskResponseBodyWatchTaskInfo setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public GetQualityWatchTaskResponseBodyWatchTaskInfo setCreator(String creator) {
            this.creator = creator;
            return this;
        }
        public String getCreator() {
            return this.creator;
        }

        public GetQualityWatchTaskResponseBodyWatchTaskInfo setEndTime(String endTime) {
            this.endTime = endTime;
            return this;
        }
        public String getEndTime() {
            return this.endTime;
        }

        public GetQualityWatchTaskResponseBodyWatchTaskInfo setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public GetQualityWatchTaskResponseBodyWatchTaskInfo setModifier(String modifier) {
            this.modifier = modifier;
            return this;
        }
        public String getModifier() {
            return this.modifier;
        }

        public GetQualityWatchTaskResponseBodyWatchTaskInfo setModifyTime(String modifyTime) {
            this.modifyTime = modifyTime;
            return this;
        }
        public String getModifyTime() {
            return this.modifyTime;
        }

        public GetQualityWatchTaskResponseBodyWatchTaskInfo setQualityOwner(String qualityOwner) {
            this.qualityOwner = qualityOwner;
            return this;
        }
        public String getQualityOwner() {
            return this.qualityOwner;
        }

        public GetQualityWatchTaskResponseBodyWatchTaskInfo setQualityOwnerName(String qualityOwnerName) {
            this.qualityOwnerName = qualityOwnerName;
            return this;
        }
        public String getQualityOwnerName() {
            return this.qualityOwnerName;
        }

        public GetQualityWatchTaskResponseBodyWatchTaskInfo setRuleCountInfo(GetQualityWatchTaskResponseBodyWatchTaskInfoRuleCountInfo ruleCountInfo) {
            this.ruleCountInfo = ruleCountInfo;
            return this;
        }
        public GetQualityWatchTaskResponseBodyWatchTaskInfoRuleCountInfo getRuleCountInfo() {
            return this.ruleCountInfo;
        }

        public GetQualityWatchTaskResponseBodyWatchTaskInfo setRuleIdList(java.util.List<Long> ruleIdList) {
            this.ruleIdList = ruleIdList;
            return this;
        }
        public java.util.List<Long> getRuleIdList() {
            return this.ruleIdList;
        }

        public GetQualityWatchTaskResponseBodyWatchTaskInfo setStartTime(String startTime) {
            this.startTime = startTime;
            return this;
        }
        public String getStartTime() {
            return this.startTime;
        }

        public GetQualityWatchTaskResponseBodyWatchTaskInfo setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public GetQualityWatchTaskResponseBodyWatchTaskInfo setWatchId(Long watchId) {
            this.watchId = watchId;
            return this;
        }
        public Long getWatchId() {
            return this.watchId;
        }

    }

}
