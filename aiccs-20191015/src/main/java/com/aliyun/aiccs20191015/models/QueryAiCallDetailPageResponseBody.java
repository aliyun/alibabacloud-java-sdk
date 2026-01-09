// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiccs20191015.models;

import com.aliyun.tea.*;

public class QueryAiCallDetailPageResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>None</p>
     */
    @NameInMap("AccessDeniedDetail")
    public String accessDeniedDetail;

    /**
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public QueryAiCallDetailPageResponseBodyData data;

    /**
     * <strong>example:</strong>
     * <p>示例值</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <strong>example:</strong>
     * <p>A57441B2-8EB6-5B93-9F37-0A51B8E2C9F5</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static QueryAiCallDetailPageResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryAiCallDetailPageResponseBody self = new QueryAiCallDetailPageResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryAiCallDetailPageResponseBody setAccessDeniedDetail(String accessDeniedDetail) {
        this.accessDeniedDetail = accessDeniedDetail;
        return this;
    }
    public String getAccessDeniedDetail() {
        return this.accessDeniedDetail;
    }

    public QueryAiCallDetailPageResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public QueryAiCallDetailPageResponseBody setData(QueryAiCallDetailPageResponseBodyData data) {
        this.data = data;
        return this;
    }
    public QueryAiCallDetailPageResponseBodyData getData() {
        return this.data;
    }

    public QueryAiCallDetailPageResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public QueryAiCallDetailPageResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryAiCallDetailPageResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class QueryAiCallDetailPageResponseBodyDataList extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>12121211111*****</p>
         */
        @NameInMap("BatchId")
        public String batchId;

        /**
         * <strong>example:</strong>
         * <p>示例值</p>
         */
        @NameInMap("CallResult")
        public String callResult;

        /**
         * <strong>example:</strong>
         * <p>0537101****</p>
         */
        @NameInMap("CalledNumber")
        public String calledNumber;

        /**
         * <strong>example:</strong>
         * <p>1748948749000</p>
         */
        @NameInMap("CallingTime")
        public Long callingTime;

        /**
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("ConversationDuration")
        public Long conversationDuration;

        /**
         * <strong>example:</strong>
         * <p>示例值示例值</p>
         */
        @NameInMap("ConversationRecord")
        public String conversationRecord;

        /**
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("ConversationTurnCount")
        public Long conversationTurnCount;

        /**
         * <strong>example:</strong>
         * <p>12121211111*****</p>
         */
        @NameInMap("DetailId")
        public String detailId;

        /**
         * <strong>example:</strong>
         * <p>示例值示例值示例值</p>
         */
        @NameInMap("FailedReason")
        public String failedReason;

        /**
         * <strong>example:</strong>
         * <p>1748948749000</p>
         */
        @NameInMap("ImportedTime")
        public Long importedTime;

        /**
         * <strong>example:</strong>
         * <p>A</p>
         */
        @NameInMap("MajorIntent")
        public String majorIntent;

        /**
         * <strong>example:</strong>
         * <p>示例值</p>
         */
        @NameInMap("Options")
        public String options;

        /**
         * <strong>example:</strong>
         * <p>outId</p>
         */
        @NameInMap("OutId")
        public String outId;

        /**
         * <strong>example:</strong>
         * <p>https://*******</p>
         */
        @NameInMap("RecordingFilePath")
        public String recordingFilePath;

        /**
         * <strong>example:</strong>
         * <p>51</p>
         */
        @NameInMap("Status")
        public Long status;

        /**
         * <strong>example:</strong>
         * <p>12121211111*****</p>
         */
        @NameInMap("TaskId")
        public String taskId;

        public static QueryAiCallDetailPageResponseBodyDataList build(java.util.Map<String, ?> map) throws Exception {
            QueryAiCallDetailPageResponseBodyDataList self = new QueryAiCallDetailPageResponseBodyDataList();
            return TeaModel.build(map, self);
        }

        public QueryAiCallDetailPageResponseBodyDataList setBatchId(String batchId) {
            this.batchId = batchId;
            return this;
        }
        public String getBatchId() {
            return this.batchId;
        }

        public QueryAiCallDetailPageResponseBodyDataList setCallResult(String callResult) {
            this.callResult = callResult;
            return this;
        }
        public String getCallResult() {
            return this.callResult;
        }

        public QueryAiCallDetailPageResponseBodyDataList setCalledNumber(String calledNumber) {
            this.calledNumber = calledNumber;
            return this;
        }
        public String getCalledNumber() {
            return this.calledNumber;
        }

        public QueryAiCallDetailPageResponseBodyDataList setCallingTime(Long callingTime) {
            this.callingTime = callingTime;
            return this;
        }
        public Long getCallingTime() {
            return this.callingTime;
        }

        public QueryAiCallDetailPageResponseBodyDataList setConversationDuration(Long conversationDuration) {
            this.conversationDuration = conversationDuration;
            return this;
        }
        public Long getConversationDuration() {
            return this.conversationDuration;
        }

        public QueryAiCallDetailPageResponseBodyDataList setConversationRecord(String conversationRecord) {
            this.conversationRecord = conversationRecord;
            return this;
        }
        public String getConversationRecord() {
            return this.conversationRecord;
        }

        public QueryAiCallDetailPageResponseBodyDataList setConversationTurnCount(Long conversationTurnCount) {
            this.conversationTurnCount = conversationTurnCount;
            return this;
        }
        public Long getConversationTurnCount() {
            return this.conversationTurnCount;
        }

        public QueryAiCallDetailPageResponseBodyDataList setDetailId(String detailId) {
            this.detailId = detailId;
            return this;
        }
        public String getDetailId() {
            return this.detailId;
        }

        public QueryAiCallDetailPageResponseBodyDataList setFailedReason(String failedReason) {
            this.failedReason = failedReason;
            return this;
        }
        public String getFailedReason() {
            return this.failedReason;
        }

        public QueryAiCallDetailPageResponseBodyDataList setImportedTime(Long importedTime) {
            this.importedTime = importedTime;
            return this;
        }
        public Long getImportedTime() {
            return this.importedTime;
        }

        public QueryAiCallDetailPageResponseBodyDataList setMajorIntent(String majorIntent) {
            this.majorIntent = majorIntent;
            return this;
        }
        public String getMajorIntent() {
            return this.majorIntent;
        }

        public QueryAiCallDetailPageResponseBodyDataList setOptions(String options) {
            this.options = options;
            return this;
        }
        public String getOptions() {
            return this.options;
        }

        public QueryAiCallDetailPageResponseBodyDataList setOutId(String outId) {
            this.outId = outId;
            return this;
        }
        public String getOutId() {
            return this.outId;
        }

        public QueryAiCallDetailPageResponseBodyDataList setRecordingFilePath(String recordingFilePath) {
            this.recordingFilePath = recordingFilePath;
            return this;
        }
        public String getRecordingFilePath() {
            return this.recordingFilePath;
        }

        public QueryAiCallDetailPageResponseBodyDataList setStatus(Long status) {
            this.status = status;
            return this;
        }
        public Long getStatus() {
            return this.status;
        }

        public QueryAiCallDetailPageResponseBodyDataList setTaskId(String taskId) {
            this.taskId = taskId;
            return this;
        }
        public String getTaskId() {
            return this.taskId;
        }

    }

    public static class QueryAiCallDetailPageResponseBodyData extends TeaModel {
        @NameInMap("List")
        public java.util.List<QueryAiCallDetailPageResponseBodyDataList> list;

        /**
         * <strong>example:</strong>
         * <p>60</p>
         */
        @NameInMap("PageNo")
        public Long pageNo;

        /**
         * <strong>example:</strong>
         * <p>5</p>
         */
        @NameInMap("PageSize")
        public Long pageSize;

        /**
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("Total")
        public Long total;

        public static QueryAiCallDetailPageResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            QueryAiCallDetailPageResponseBodyData self = new QueryAiCallDetailPageResponseBodyData();
            return TeaModel.build(map, self);
        }

        public QueryAiCallDetailPageResponseBodyData setList(java.util.List<QueryAiCallDetailPageResponseBodyDataList> list) {
            this.list = list;
            return this;
        }
        public java.util.List<QueryAiCallDetailPageResponseBodyDataList> getList() {
            return this.list;
        }

        public QueryAiCallDetailPageResponseBodyData setPageNo(Long pageNo) {
            this.pageNo = pageNo;
            return this;
        }
        public Long getPageNo() {
            return this.pageNo;
        }

        public QueryAiCallDetailPageResponseBodyData setPageSize(Long pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Long getPageSize() {
            return this.pageSize;
        }

        public QueryAiCallDetailPageResponseBodyData setTotal(Long total) {
            this.total = total;
            return this;
        }
        public Long getTotal() {
            return this.total;
        }

    }

}
