// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiccs20191015.models;

import com.aliyun.tea.*;

public class QueryConversationDetailInfoNewResponseBody extends TeaModel {
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
    public QueryConversationDetailInfoNewResponseBodyData data;

    /**
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <strong>example:</strong>
     * <p>D9CB3933-9FE3-4870-BA8E-2BEE91B69D23</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static QueryConversationDetailInfoNewResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryConversationDetailInfoNewResponseBody self = new QueryConversationDetailInfoNewResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryConversationDetailInfoNewResponseBody setAccessDeniedDetail(String accessDeniedDetail) {
        this.accessDeniedDetail = accessDeniedDetail;
        return this;
    }
    public String getAccessDeniedDetail() {
        return this.accessDeniedDetail;
    }

    public QueryConversationDetailInfoNewResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public QueryConversationDetailInfoNewResponseBody setData(QueryConversationDetailInfoNewResponseBodyData data) {
        this.data = data;
        return this;
    }
    public QueryConversationDetailInfoNewResponseBodyData getData() {
        return this.data;
    }

    public QueryConversationDetailInfoNewResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public QueryConversationDetailInfoNewResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryConversationDetailInfoNewResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class QueryConversationDetailInfoNewResponseBodyDataOutputTags extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>12</p>
         */
        @NameInMap("Id")
        public String id;

        /**
         * <strong>example:</strong>
         * <p>示例值示例值示例值</p>
         */
        @NameInMap("OutputTagDescription")
        public String outputTagDescription;

        /**
         * <strong>example:</strong>
         * <p>示例值示例值示例值</p>
         */
        @NameInMap("OutputTagName")
        public String outputTagName;

        /**
         * <strong>example:</strong>
         * <p>示例值示例值示例值</p>
         */
        @NameInMap("OutputTagValue")
        public String outputTagValue;

        public static QueryConversationDetailInfoNewResponseBodyDataOutputTags build(java.util.Map<String, ?> map) throws Exception {
            QueryConversationDetailInfoNewResponseBodyDataOutputTags self = new QueryConversationDetailInfoNewResponseBodyDataOutputTags();
            return TeaModel.build(map, self);
        }

        public QueryConversationDetailInfoNewResponseBodyDataOutputTags setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public QueryConversationDetailInfoNewResponseBodyDataOutputTags setOutputTagDescription(String outputTagDescription) {
            this.outputTagDescription = outputTagDescription;
            return this;
        }
        public String getOutputTagDescription() {
            return this.outputTagDescription;
        }

        public QueryConversationDetailInfoNewResponseBodyDataOutputTags setOutputTagName(String outputTagName) {
            this.outputTagName = outputTagName;
            return this;
        }
        public String getOutputTagName() {
            return this.outputTagName;
        }

        public QueryConversationDetailInfoNewResponseBodyDataOutputTags setOutputTagValue(String outputTagValue) {
            this.outputTagValue = outputTagValue;
            return this;
        }
        public String getOutputTagValue() {
            return this.outputTagValue;
        }

    }

    public static class QueryConversationDetailInfoNewResponseBodyDataVariables extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>123</p>
         */
        @NameInMap("Id")
        public String id;

        /**
         * <strong>example:</strong>
         * <p>name</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <strong>example:</strong>
         * <p>user name</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("Required")
        public Boolean required;

        /**
         * <strong>example:</strong>
         * <p>source</p>
         */
        @NameInMap("Source")
        public String source;

        /**
         * <strong>example:</strong>
         * <p>mike</p>
         */
        @NameInMap("Value")
        public String value;

        public static QueryConversationDetailInfoNewResponseBodyDataVariables build(java.util.Map<String, ?> map) throws Exception {
            QueryConversationDetailInfoNewResponseBodyDataVariables self = new QueryConversationDetailInfoNewResponseBodyDataVariables();
            return TeaModel.build(map, self);
        }

        public QueryConversationDetailInfoNewResponseBodyDataVariables setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public QueryConversationDetailInfoNewResponseBodyDataVariables setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public QueryConversationDetailInfoNewResponseBodyDataVariables setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public QueryConversationDetailInfoNewResponseBodyDataVariables setRequired(Boolean required) {
            this.required = required;
            return this;
        }
        public Boolean getRequired() {
            return this.required;
        }

        public QueryConversationDetailInfoNewResponseBodyDataVariables setSource(String source) {
            this.source = source;
            return this;
        }
        public String getSource() {
            return this.source;
        }

        public QueryConversationDetailInfoNewResponseBodyDataVariables setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class QueryConversationDetailInfoNewResponseBodyData extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>1234******</p>
         */
        @NameInMap("BatchId")
        public String batchId;

        /**
         * <strong>example:</strong>
         * <p>123*<strong><strong><strong>^213</strong></strong></strong></p>
         */
        @NameInMap("CallId")
        public String callId;

        /**
         * <strong>example:</strong>
         * <p>ANSWERED</p>
         */
        @NameInMap("CallResult")
        public String callResult;

        /**
         * <strong>example:</strong>
         * <p>130********</p>
         */
        @NameInMap("CalledPhone")
        public String calledPhone;

        /**
         * <strong>example:</strong>
         * <p>0571*******</p>
         */
        @NameInMap("CallerPhone")
        public String callerPhone;

        /**
         * <strong>example:</strong>
         * <p>示例值</p>
         */
        @NameInMap("ConversationRecord")
        public String conversationRecord;

        /**
         * <strong>example:</strong>
         * <p>23</p>
         */
        @NameInMap("ConversationTurnCount")
        public Long conversationTurnCount;

        /**
         * <strong>example:</strong>
         * <p>1234*******</p>
         */
        @NameInMap("DetailId")
        public String detailId;

        /**
         * <strong>example:</strong>
         * <p>30</p>
         */
        @NameInMap("Duration")
        public Long duration;

        /**
         * <strong>example:</strong>
         * <p>示例值示例值</p>
         */
        @NameInMap("FailedReason")
        public String failedReason;

        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("HangupDirection")
        public String hangupDirection;

        /**
         * <strong>example:</strong>
         * <p>43</p>
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
         * <p>示例值示例值</p>
         */
        @NameInMap("Options")
        public String options;

        /**
         * <strong>example:</strong>
         * <p>123***</p>
         */
        @NameInMap("OutId")
        public String outId;

        @NameInMap("OutputTags")
        public java.util.List<QueryConversationDetailInfoNewResponseBodyDataOutputTags> outputTags;

        /**
         * <strong>example:</strong>
         * <p>12349732441</p>
         */
        @NameInMap("PickUpTime")
        public Long pickUpTime;

        /**
         * <strong>example:</strong>
         * <p>recording.oss.file</p>
         */
        @NameInMap("RecordingFileDownloadUrl")
        public String recordingFileDownloadUrl;

        /**
         * <strong>example:</strong>
         * <p>7</p>
         */
        @NameInMap("ReleaseTime")
        public Long releaseTime;

        /**
         * <strong>example:</strong>
         * <p>1286987391</p>
         */
        @NameInMap("StartCallTime")
        public Long startCallTime;

        /**
         * <strong>example:</strong>
         * <p>72</p>
         */
        @NameInMap("Status")
        public Long status;

        /**
         * <strong>example:</strong>
         * <p>200005</p>
         */
        @NameInMap("StatusCode")
        public String statusCode;

        /**
         * <strong>example:</strong>
         * <p>示例值示例值</p>
         */
        @NameInMap("StatusMsg")
        public String statusMsg;

        /**
         * <strong>example:</strong>
         * <p>138************</p>
         */
        @NameInMap("TaskId")
        public String taskId;

        @NameInMap("Variables")
        public java.util.List<QueryConversationDetailInfoNewResponseBodyDataVariables> variables;

        public static QueryConversationDetailInfoNewResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            QueryConversationDetailInfoNewResponseBodyData self = new QueryConversationDetailInfoNewResponseBodyData();
            return TeaModel.build(map, self);
        }

        public QueryConversationDetailInfoNewResponseBodyData setBatchId(String batchId) {
            this.batchId = batchId;
            return this;
        }
        public String getBatchId() {
            return this.batchId;
        }

        public QueryConversationDetailInfoNewResponseBodyData setCallId(String callId) {
            this.callId = callId;
            return this;
        }
        public String getCallId() {
            return this.callId;
        }

        public QueryConversationDetailInfoNewResponseBodyData setCallResult(String callResult) {
            this.callResult = callResult;
            return this;
        }
        public String getCallResult() {
            return this.callResult;
        }

        public QueryConversationDetailInfoNewResponseBodyData setCalledPhone(String calledPhone) {
            this.calledPhone = calledPhone;
            return this;
        }
        public String getCalledPhone() {
            return this.calledPhone;
        }

        public QueryConversationDetailInfoNewResponseBodyData setCallerPhone(String callerPhone) {
            this.callerPhone = callerPhone;
            return this;
        }
        public String getCallerPhone() {
            return this.callerPhone;
        }

        public QueryConversationDetailInfoNewResponseBodyData setConversationRecord(String conversationRecord) {
            this.conversationRecord = conversationRecord;
            return this;
        }
        public String getConversationRecord() {
            return this.conversationRecord;
        }

        public QueryConversationDetailInfoNewResponseBodyData setConversationTurnCount(Long conversationTurnCount) {
            this.conversationTurnCount = conversationTurnCount;
            return this;
        }
        public Long getConversationTurnCount() {
            return this.conversationTurnCount;
        }

        public QueryConversationDetailInfoNewResponseBodyData setDetailId(String detailId) {
            this.detailId = detailId;
            return this;
        }
        public String getDetailId() {
            return this.detailId;
        }

        public QueryConversationDetailInfoNewResponseBodyData setDuration(Long duration) {
            this.duration = duration;
            return this;
        }
        public Long getDuration() {
            return this.duration;
        }

        public QueryConversationDetailInfoNewResponseBodyData setFailedReason(String failedReason) {
            this.failedReason = failedReason;
            return this;
        }
        public String getFailedReason() {
            return this.failedReason;
        }

        public QueryConversationDetailInfoNewResponseBodyData setHangupDirection(String hangupDirection) {
            this.hangupDirection = hangupDirection;
            return this;
        }
        public String getHangupDirection() {
            return this.hangupDirection;
        }

        public QueryConversationDetailInfoNewResponseBodyData setImportedTime(Long importedTime) {
            this.importedTime = importedTime;
            return this;
        }
        public Long getImportedTime() {
            return this.importedTime;
        }

        public QueryConversationDetailInfoNewResponseBodyData setMajorIntent(String majorIntent) {
            this.majorIntent = majorIntent;
            return this;
        }
        public String getMajorIntent() {
            return this.majorIntent;
        }

        public QueryConversationDetailInfoNewResponseBodyData setOptions(String options) {
            this.options = options;
            return this;
        }
        public String getOptions() {
            return this.options;
        }

        public QueryConversationDetailInfoNewResponseBodyData setOutId(String outId) {
            this.outId = outId;
            return this;
        }
        public String getOutId() {
            return this.outId;
        }

        public QueryConversationDetailInfoNewResponseBodyData setOutputTags(java.util.List<QueryConversationDetailInfoNewResponseBodyDataOutputTags> outputTags) {
            this.outputTags = outputTags;
            return this;
        }
        public java.util.List<QueryConversationDetailInfoNewResponseBodyDataOutputTags> getOutputTags() {
            return this.outputTags;
        }

        public QueryConversationDetailInfoNewResponseBodyData setPickUpTime(Long pickUpTime) {
            this.pickUpTime = pickUpTime;
            return this;
        }
        public Long getPickUpTime() {
            return this.pickUpTime;
        }

        public QueryConversationDetailInfoNewResponseBodyData setRecordingFileDownloadUrl(String recordingFileDownloadUrl) {
            this.recordingFileDownloadUrl = recordingFileDownloadUrl;
            return this;
        }
        public String getRecordingFileDownloadUrl() {
            return this.recordingFileDownloadUrl;
        }

        public QueryConversationDetailInfoNewResponseBodyData setReleaseTime(Long releaseTime) {
            this.releaseTime = releaseTime;
            return this;
        }
        public Long getReleaseTime() {
            return this.releaseTime;
        }

        public QueryConversationDetailInfoNewResponseBodyData setStartCallTime(Long startCallTime) {
            this.startCallTime = startCallTime;
            return this;
        }
        public Long getStartCallTime() {
            return this.startCallTime;
        }

        public QueryConversationDetailInfoNewResponseBodyData setStatus(Long status) {
            this.status = status;
            return this;
        }
        public Long getStatus() {
            return this.status;
        }

        public QueryConversationDetailInfoNewResponseBodyData setStatusCode(String statusCode) {
            this.statusCode = statusCode;
            return this;
        }
        public String getStatusCode() {
            return this.statusCode;
        }

        public QueryConversationDetailInfoNewResponseBodyData setStatusMsg(String statusMsg) {
            this.statusMsg = statusMsg;
            return this;
        }
        public String getStatusMsg() {
            return this.statusMsg;
        }

        public QueryConversationDetailInfoNewResponseBodyData setTaskId(String taskId) {
            this.taskId = taskId;
            return this;
        }
        public String getTaskId() {
            return this.taskId;
        }

        public QueryConversationDetailInfoNewResponseBodyData setVariables(java.util.List<QueryConversationDetailInfoNewResponseBodyDataVariables> variables) {
            this.variables = variables;
            return this;
        }
        public java.util.List<QueryConversationDetailInfoNewResponseBodyDataVariables> getVariables() {
            return this.variables;
        }

    }

}
