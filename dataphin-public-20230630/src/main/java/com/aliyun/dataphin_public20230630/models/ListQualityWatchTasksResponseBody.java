// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataphin_public20230630.models;

import com.aliyun.tea.*;

public class ListQualityWatchTasksResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    /**
     * <strong>example:</strong>
     * <p>internal error</p>
     */
    @NameInMap("Message")
    public String message;

    @NameInMap("PageResult")
    public ListQualityWatchTasksResponseBodyPageResult pageResult;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>82E78D6B-AA8F-1FEF-8AA3-5C9DA2A79140</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static ListQualityWatchTasksResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListQualityWatchTasksResponseBody self = new ListQualityWatchTasksResponseBody();
        return TeaModel.build(map, self);
    }

    public ListQualityWatchTasksResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListQualityWatchTasksResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public ListQualityWatchTasksResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListQualityWatchTasksResponseBody setPageResult(ListQualityWatchTasksResponseBodyPageResult pageResult) {
        this.pageResult = pageResult;
        return this;
    }
    public ListQualityWatchTasksResponseBodyPageResult getPageResult() {
        return this.pageResult;
    }

    public ListQualityWatchTasksResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListQualityWatchTasksResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class ListQualityWatchTasksResponseBodyPageResultQualityWatchTaskListRuleCountInfoStrongRuleCount extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("ErrorRuleCount")
        public Long errorRuleCount;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("FinishedRuleCount")
        public Long finishedRuleCount;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("SuccessRuleCount")
        public Long successRuleCount;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("TotalRuleCount")
        public Long totalRuleCount;

        public static ListQualityWatchTasksResponseBodyPageResultQualityWatchTaskListRuleCountInfoStrongRuleCount build(java.util.Map<String, ?> map) throws Exception {
            ListQualityWatchTasksResponseBodyPageResultQualityWatchTaskListRuleCountInfoStrongRuleCount self = new ListQualityWatchTasksResponseBodyPageResultQualityWatchTaskListRuleCountInfoStrongRuleCount();
            return TeaModel.build(map, self);
        }

        public ListQualityWatchTasksResponseBodyPageResultQualityWatchTaskListRuleCountInfoStrongRuleCount setErrorRuleCount(Long errorRuleCount) {
            this.errorRuleCount = errorRuleCount;
            return this;
        }
        public Long getErrorRuleCount() {
            return this.errorRuleCount;
        }

        public ListQualityWatchTasksResponseBodyPageResultQualityWatchTaskListRuleCountInfoStrongRuleCount setFinishedRuleCount(Long finishedRuleCount) {
            this.finishedRuleCount = finishedRuleCount;
            return this;
        }
        public Long getFinishedRuleCount() {
            return this.finishedRuleCount;
        }

        public ListQualityWatchTasksResponseBodyPageResultQualityWatchTaskListRuleCountInfoStrongRuleCount setSuccessRuleCount(Long successRuleCount) {
            this.successRuleCount = successRuleCount;
            return this;
        }
        public Long getSuccessRuleCount() {
            return this.successRuleCount;
        }

        public ListQualityWatchTasksResponseBodyPageResultQualityWatchTaskListRuleCountInfoStrongRuleCount setTotalRuleCount(Long totalRuleCount) {
            this.totalRuleCount = totalRuleCount;
            return this;
        }
        public Long getTotalRuleCount() {
            return this.totalRuleCount;
        }

    }

    public static class ListQualityWatchTasksResponseBodyPageResultQualityWatchTaskListRuleCountInfoValidateRuleCount extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("ErrorRuleCount")
        public Long errorRuleCount;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("FinishedRuleCount")
        public Long finishedRuleCount;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("SuccessRuleCount")
        public Long successRuleCount;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("TotalRuleCount")
        public Long totalRuleCount;

        public static ListQualityWatchTasksResponseBodyPageResultQualityWatchTaskListRuleCountInfoValidateRuleCount build(java.util.Map<String, ?> map) throws Exception {
            ListQualityWatchTasksResponseBodyPageResultQualityWatchTaskListRuleCountInfoValidateRuleCount self = new ListQualityWatchTasksResponseBodyPageResultQualityWatchTaskListRuleCountInfoValidateRuleCount();
            return TeaModel.build(map, self);
        }

        public ListQualityWatchTasksResponseBodyPageResultQualityWatchTaskListRuleCountInfoValidateRuleCount setErrorRuleCount(Long errorRuleCount) {
            this.errorRuleCount = errorRuleCount;
            return this;
        }
        public Long getErrorRuleCount() {
            return this.errorRuleCount;
        }

        public ListQualityWatchTasksResponseBodyPageResultQualityWatchTaskListRuleCountInfoValidateRuleCount setFinishedRuleCount(Long finishedRuleCount) {
            this.finishedRuleCount = finishedRuleCount;
            return this;
        }
        public Long getFinishedRuleCount() {
            return this.finishedRuleCount;
        }

        public ListQualityWatchTasksResponseBodyPageResultQualityWatchTaskListRuleCountInfoValidateRuleCount setSuccessRuleCount(Long successRuleCount) {
            this.successRuleCount = successRuleCount;
            return this;
        }
        public Long getSuccessRuleCount() {
            return this.successRuleCount;
        }

        public ListQualityWatchTasksResponseBodyPageResultQualityWatchTaskListRuleCountInfoValidateRuleCount setTotalRuleCount(Long totalRuleCount) {
            this.totalRuleCount = totalRuleCount;
            return this;
        }
        public Long getTotalRuleCount() {
            return this.totalRuleCount;
        }

    }

    public static class ListQualityWatchTasksResponseBodyPageResultQualityWatchTaskListRuleCountInfoWeakRuleCount extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("ErrorRuleCount")
        public Long errorRuleCount;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("FinishedRuleCount")
        public Long finishedRuleCount;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("SuccessRuleCount")
        public Long successRuleCount;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("TotalRuleCount")
        public Long totalRuleCount;

        public static ListQualityWatchTasksResponseBodyPageResultQualityWatchTaskListRuleCountInfoWeakRuleCount build(java.util.Map<String, ?> map) throws Exception {
            ListQualityWatchTasksResponseBodyPageResultQualityWatchTaskListRuleCountInfoWeakRuleCount self = new ListQualityWatchTasksResponseBodyPageResultQualityWatchTaskListRuleCountInfoWeakRuleCount();
            return TeaModel.build(map, self);
        }

        public ListQualityWatchTasksResponseBodyPageResultQualityWatchTaskListRuleCountInfoWeakRuleCount setErrorRuleCount(Long errorRuleCount) {
            this.errorRuleCount = errorRuleCount;
            return this;
        }
        public Long getErrorRuleCount() {
            return this.errorRuleCount;
        }

        public ListQualityWatchTasksResponseBodyPageResultQualityWatchTaskListRuleCountInfoWeakRuleCount setFinishedRuleCount(Long finishedRuleCount) {
            this.finishedRuleCount = finishedRuleCount;
            return this;
        }
        public Long getFinishedRuleCount() {
            return this.finishedRuleCount;
        }

        public ListQualityWatchTasksResponseBodyPageResultQualityWatchTaskListRuleCountInfoWeakRuleCount setSuccessRuleCount(Long successRuleCount) {
            this.successRuleCount = successRuleCount;
            return this;
        }
        public Long getSuccessRuleCount() {
            return this.successRuleCount;
        }

        public ListQualityWatchTasksResponseBodyPageResultQualityWatchTaskListRuleCountInfoWeakRuleCount setTotalRuleCount(Long totalRuleCount) {
            this.totalRuleCount = totalRuleCount;
            return this;
        }
        public Long getTotalRuleCount() {
            return this.totalRuleCount;
        }

    }

    public static class ListQualityWatchTasksResponseBodyPageResultQualityWatchTaskListRuleCountInfo extends TeaModel {
        @NameInMap("StrongRuleCount")
        public ListQualityWatchTasksResponseBodyPageResultQualityWatchTaskListRuleCountInfoStrongRuleCount strongRuleCount;

        @NameInMap("ValidateRuleCount")
        public ListQualityWatchTasksResponseBodyPageResultQualityWatchTaskListRuleCountInfoValidateRuleCount validateRuleCount;

        @NameInMap("WeakRuleCount")
        public ListQualityWatchTasksResponseBodyPageResultQualityWatchTaskListRuleCountInfoWeakRuleCount weakRuleCount;

        public static ListQualityWatchTasksResponseBodyPageResultQualityWatchTaskListRuleCountInfo build(java.util.Map<String, ?> map) throws Exception {
            ListQualityWatchTasksResponseBodyPageResultQualityWatchTaskListRuleCountInfo self = new ListQualityWatchTasksResponseBodyPageResultQualityWatchTaskListRuleCountInfo();
            return TeaModel.build(map, self);
        }

        public ListQualityWatchTasksResponseBodyPageResultQualityWatchTaskListRuleCountInfo setStrongRuleCount(ListQualityWatchTasksResponseBodyPageResultQualityWatchTaskListRuleCountInfoStrongRuleCount strongRuleCount) {
            this.strongRuleCount = strongRuleCount;
            return this;
        }
        public ListQualityWatchTasksResponseBodyPageResultQualityWatchTaskListRuleCountInfoStrongRuleCount getStrongRuleCount() {
            return this.strongRuleCount;
        }

        public ListQualityWatchTasksResponseBodyPageResultQualityWatchTaskListRuleCountInfo setValidateRuleCount(ListQualityWatchTasksResponseBodyPageResultQualityWatchTaskListRuleCountInfoValidateRuleCount validateRuleCount) {
            this.validateRuleCount = validateRuleCount;
            return this;
        }
        public ListQualityWatchTasksResponseBodyPageResultQualityWatchTaskListRuleCountInfoValidateRuleCount getValidateRuleCount() {
            return this.validateRuleCount;
        }

        public ListQualityWatchTasksResponseBodyPageResultQualityWatchTaskListRuleCountInfo setWeakRuleCount(ListQualityWatchTasksResponseBodyPageResultQualityWatchTaskListRuleCountInfoWeakRuleCount weakRuleCount) {
            this.weakRuleCount = weakRuleCount;
            return this;
        }
        public ListQualityWatchTasksResponseBodyPageResultQualityWatchTaskListRuleCountInfoWeakRuleCount getWeakRuleCount() {
            return this.weakRuleCount;
        }

    }

    public static class ListQualityWatchTasksResponseBodyPageResultQualityWatchTaskList extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>2025-06-30</p>
         */
        @NameInMap("BizDate")
        public String bizDate;

        /**
         * <strong>example:</strong>
         * <p>yyyy-MM-dd</p>
         */
        @NameInMap("BizDateFormat")
        public String bizDateFormat;

        /**
         * <strong>example:</strong>
         * <p>2025-06-30 00:00:00</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        /**
         * <strong>example:</strong>
         * <p>30012011</p>
         */
        @NameInMap("Creator")
        public String creator;

        /**
         * <strong>example:</strong>
         * <p>2025-06-30 20:00:00</p>
         */
        @NameInMap("EndTime")
        public String endTime;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Id")
        public Long id;

        /**
         * <strong>example:</strong>
         * <p>30012011</p>
         */
        @NameInMap("Modifier")
        public String modifier;

        /**
         * <strong>example:</strong>
         * <p>2025-06-30 00:00:00</p>
         */
        @NameInMap("ModifyTime")
        public String modifyTime;

        /**
         * <strong>example:</strong>
         * <p>30012011</p>
         */
        @NameInMap("QualityOwner")
        public String qualityOwner;

        /**
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("QualityOwnerName")
        public String qualityOwnerName;

        @NameInMap("RuleCountInfo")
        public ListQualityWatchTasksResponseBodyPageResultQualityWatchTaskListRuleCountInfo ruleCountInfo;

        @NameInMap("RuleIdList")
        public java.util.List<Long> ruleIdList;

        /**
         * <strong>example:</strong>
         * <p>2025-06-30 08:00:00</p>
         */
        @NameInMap("StartTime")
        public String startTime;

        /**
         * <strong>example:</strong>
         * <p>RUNNING</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("WatchId")
        public Long watchId;

        public static ListQualityWatchTasksResponseBodyPageResultQualityWatchTaskList build(java.util.Map<String, ?> map) throws Exception {
            ListQualityWatchTasksResponseBodyPageResultQualityWatchTaskList self = new ListQualityWatchTasksResponseBodyPageResultQualityWatchTaskList();
            return TeaModel.build(map, self);
        }

        public ListQualityWatchTasksResponseBodyPageResultQualityWatchTaskList setBizDate(String bizDate) {
            this.bizDate = bizDate;
            return this;
        }
        public String getBizDate() {
            return this.bizDate;
        }

        public ListQualityWatchTasksResponseBodyPageResultQualityWatchTaskList setBizDateFormat(String bizDateFormat) {
            this.bizDateFormat = bizDateFormat;
            return this;
        }
        public String getBizDateFormat() {
            return this.bizDateFormat;
        }

        public ListQualityWatchTasksResponseBodyPageResultQualityWatchTaskList setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public ListQualityWatchTasksResponseBodyPageResultQualityWatchTaskList setCreator(String creator) {
            this.creator = creator;
            return this;
        }
        public String getCreator() {
            return this.creator;
        }

        public ListQualityWatchTasksResponseBodyPageResultQualityWatchTaskList setEndTime(String endTime) {
            this.endTime = endTime;
            return this;
        }
        public String getEndTime() {
            return this.endTime;
        }

        public ListQualityWatchTasksResponseBodyPageResultQualityWatchTaskList setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public ListQualityWatchTasksResponseBodyPageResultQualityWatchTaskList setModifier(String modifier) {
            this.modifier = modifier;
            return this;
        }
        public String getModifier() {
            return this.modifier;
        }

        public ListQualityWatchTasksResponseBodyPageResultQualityWatchTaskList setModifyTime(String modifyTime) {
            this.modifyTime = modifyTime;
            return this;
        }
        public String getModifyTime() {
            return this.modifyTime;
        }

        public ListQualityWatchTasksResponseBodyPageResultQualityWatchTaskList setQualityOwner(String qualityOwner) {
            this.qualityOwner = qualityOwner;
            return this;
        }
        public String getQualityOwner() {
            return this.qualityOwner;
        }

        public ListQualityWatchTasksResponseBodyPageResultQualityWatchTaskList setQualityOwnerName(String qualityOwnerName) {
            this.qualityOwnerName = qualityOwnerName;
            return this;
        }
        public String getQualityOwnerName() {
            return this.qualityOwnerName;
        }

        public ListQualityWatchTasksResponseBodyPageResultQualityWatchTaskList setRuleCountInfo(ListQualityWatchTasksResponseBodyPageResultQualityWatchTaskListRuleCountInfo ruleCountInfo) {
            this.ruleCountInfo = ruleCountInfo;
            return this;
        }
        public ListQualityWatchTasksResponseBodyPageResultQualityWatchTaskListRuleCountInfo getRuleCountInfo() {
            return this.ruleCountInfo;
        }

        public ListQualityWatchTasksResponseBodyPageResultQualityWatchTaskList setRuleIdList(java.util.List<Long> ruleIdList) {
            this.ruleIdList = ruleIdList;
            return this;
        }
        public java.util.List<Long> getRuleIdList() {
            return this.ruleIdList;
        }

        public ListQualityWatchTasksResponseBodyPageResultQualityWatchTaskList setStartTime(String startTime) {
            this.startTime = startTime;
            return this;
        }
        public String getStartTime() {
            return this.startTime;
        }

        public ListQualityWatchTasksResponseBodyPageResultQualityWatchTaskList setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public ListQualityWatchTasksResponseBodyPageResultQualityWatchTaskList setWatchId(Long watchId) {
            this.watchId = watchId;
            return this;
        }
        public Long getWatchId() {
            return this.watchId;
        }

    }

    public static class ListQualityWatchTasksResponseBodyPageResult extends TeaModel {
        @NameInMap("QualityWatchTaskList")
        public java.util.List<ListQualityWatchTasksResponseBodyPageResultQualityWatchTaskList> qualityWatchTaskList;

        /**
         * <strong>example:</strong>
         * <p>68</p>
         */
        @NameInMap("TotalCount")
        public Long totalCount;

        public static ListQualityWatchTasksResponseBodyPageResult build(java.util.Map<String, ?> map) throws Exception {
            ListQualityWatchTasksResponseBodyPageResult self = new ListQualityWatchTasksResponseBodyPageResult();
            return TeaModel.build(map, self);
        }

        public ListQualityWatchTasksResponseBodyPageResult setQualityWatchTaskList(java.util.List<ListQualityWatchTasksResponseBodyPageResultQualityWatchTaskList> qualityWatchTaskList) {
            this.qualityWatchTaskList = qualityWatchTaskList;
            return this;
        }
        public java.util.List<ListQualityWatchTasksResponseBodyPageResultQualityWatchTaskList> getQualityWatchTaskList() {
            return this.qualityWatchTaskList;
        }

        public ListQualityWatchTasksResponseBodyPageResult setTotalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Long getTotalCount() {
            return this.totalCount;
        }

    }

}
