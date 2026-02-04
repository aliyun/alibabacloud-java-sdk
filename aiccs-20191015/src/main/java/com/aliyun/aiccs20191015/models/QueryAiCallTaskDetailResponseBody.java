// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiccs20191015.models;

import com.aliyun.tea.*;

public class QueryAiCallTaskDetailResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>Access Denied</p>
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
    public QueryAiCallTaskDetailResponseBodyData data;

    /**
     * <strong>example:</strong>
     * <p>示例值示例值</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <strong>example:</strong>
     * <p>23822ECB-8CAA-5C52-9C9E-807FD82A5A7F</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static QueryAiCallTaskDetailResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryAiCallTaskDetailResponseBody self = new QueryAiCallTaskDetailResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryAiCallTaskDetailResponseBody setAccessDeniedDetail(String accessDeniedDetail) {
        this.accessDeniedDetail = accessDeniedDetail;
        return this;
    }
    public String getAccessDeniedDetail() {
        return this.accessDeniedDetail;
    }

    public QueryAiCallTaskDetailResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public QueryAiCallTaskDetailResponseBody setData(QueryAiCallTaskDetailResponseBodyData data) {
        this.data = data;
        return this;
    }
    public QueryAiCallTaskDetailResponseBodyData getData() {
        return this.data;
    }

    public QueryAiCallTaskDetailResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public QueryAiCallTaskDetailResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryAiCallTaskDetailResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class QueryAiCallTaskDetailResponseBodyDataCallTimes extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>09:00:00</p>
         */
        @NameInMap("EndTime")
        public String endTime;

        /**
         * <strong>example:</strong>
         * <p>12:00:00</p>
         */
        @NameInMap("StartTime")
        public String startTime;

        public static QueryAiCallTaskDetailResponseBodyDataCallTimes build(java.util.Map<String, ?> map) throws Exception {
            QueryAiCallTaskDetailResponseBodyDataCallTimes self = new QueryAiCallTaskDetailResponseBodyDataCallTimes();
            return TeaModel.build(map, self);
        }

        public QueryAiCallTaskDetailResponseBodyDataCallTimes setEndTime(String endTime) {
            this.endTime = endTime;
            return this;
        }
        public String getEndTime() {
            return this.endTime;
        }

        public QueryAiCallTaskDetailResponseBodyDataCallTimes setStartTime(String startTime) {
            this.startTime = startTime;
            return this;
        }
        public String getStartTime() {
            return this.startTime;
        }

    }

    public static class QueryAiCallTaskDetailResponseBodyData extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>示例值示例值</p>
         */
        @NameInMap("AgentId")
        public String agentId;

        /**
         * <strong>example:</strong>
         * <p>示例值示例值</p>
         */
        @NameInMap("AgentName")
        public String agentName;

        /**
         * <strong>example:</strong>
         * <p>示例值</p>
         */
        @NameInMap("ApplicationCode")
        public String applicationCode;

        /**
         * <strong>example:</strong>
         * <p>示例值</p>
         */
        @NameInMap("ApplicationName")
        public String applicationName;

        @NameInMap("CallDays")
        public java.util.List<String> callDays;

        @NameInMap("CallTimes")
        public java.util.List<QueryAiCallTaskDetailResponseBodyDataCallTimes> callTimes;

        /**
         * <strong>example:</strong>
         * <p>05370124****</p>
         */
        @NameInMap("CallerNumber")
        public String callerNumber;

        /**
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("ConcurrentCount")
        public Long concurrentCount;

        /**
         * <strong>example:</strong>
         * <p>示例值示例值</p>
         */
        @NameInMap("LineEncoding")
        public String lineEncoding;

        /**
         * <strong>example:</strong>
         * <p>示例值示例值示例值</p>
         */
        @NameInMap("LinePhoneNum")
        public String linePhoneNum;

        /**
         * <strong>example:</strong>
         * <p>17</p>
         */
        @NameInMap("PhoneType")
        public Long phoneType;

        /**
         * <strong>example:</strong>
         * <p>1748932499000</p>
         */
        @NameInMap("RealStartTime")
        public Long realStartTime;

        /**
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("RetryCount")
        public Long retryCount;

        /**
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("RetryEnable")
        public Boolean retryEnable;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("RetryInterval")
        public Long retryInterval;

        @NameInMap("RetryReasons")
        public java.util.List<String> retryReasons;

        /**
         * <strong>example:</strong>
         * <p>1748932499000</p>
         */
        @NameInMap("StartTime")
        public Long startTime;

        /**
         * <strong>example:</strong>
         * <p>IMMEDIATE</p>
         */
        @NameInMap("StartType")
        public String startType;

        /**
         * <strong>example:</strong>
         * <p>11121232222****</p>
         */
        @NameInMap("TaskId")
        public String taskId;

        /**
         * <strong>example:</strong>
         * <p>示例值示例值</p>
         */
        @NameInMap("TaskName")
        public String taskName;

        public static QueryAiCallTaskDetailResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            QueryAiCallTaskDetailResponseBodyData self = new QueryAiCallTaskDetailResponseBodyData();
            return TeaModel.build(map, self);
        }

        public QueryAiCallTaskDetailResponseBodyData setAgentId(String agentId) {
            this.agentId = agentId;
            return this;
        }
        public String getAgentId() {
            return this.agentId;
        }

        public QueryAiCallTaskDetailResponseBodyData setAgentName(String agentName) {
            this.agentName = agentName;
            return this;
        }
        public String getAgentName() {
            return this.agentName;
        }

        public QueryAiCallTaskDetailResponseBodyData setApplicationCode(String applicationCode) {
            this.applicationCode = applicationCode;
            return this;
        }
        public String getApplicationCode() {
            return this.applicationCode;
        }

        public QueryAiCallTaskDetailResponseBodyData setApplicationName(String applicationName) {
            this.applicationName = applicationName;
            return this;
        }
        public String getApplicationName() {
            return this.applicationName;
        }

        public QueryAiCallTaskDetailResponseBodyData setCallDays(java.util.List<String> callDays) {
            this.callDays = callDays;
            return this;
        }
        public java.util.List<String> getCallDays() {
            return this.callDays;
        }

        public QueryAiCallTaskDetailResponseBodyData setCallTimes(java.util.List<QueryAiCallTaskDetailResponseBodyDataCallTimes> callTimes) {
            this.callTimes = callTimes;
            return this;
        }
        public java.util.List<QueryAiCallTaskDetailResponseBodyDataCallTimes> getCallTimes() {
            return this.callTimes;
        }

        public QueryAiCallTaskDetailResponseBodyData setCallerNumber(String callerNumber) {
            this.callerNumber = callerNumber;
            return this;
        }
        public String getCallerNumber() {
            return this.callerNumber;
        }

        public QueryAiCallTaskDetailResponseBodyData setConcurrentCount(Long concurrentCount) {
            this.concurrentCount = concurrentCount;
            return this;
        }
        public Long getConcurrentCount() {
            return this.concurrentCount;
        }

        public QueryAiCallTaskDetailResponseBodyData setLineEncoding(String lineEncoding) {
            this.lineEncoding = lineEncoding;
            return this;
        }
        public String getLineEncoding() {
            return this.lineEncoding;
        }

        public QueryAiCallTaskDetailResponseBodyData setLinePhoneNum(String linePhoneNum) {
            this.linePhoneNum = linePhoneNum;
            return this;
        }
        public String getLinePhoneNum() {
            return this.linePhoneNum;
        }

        public QueryAiCallTaskDetailResponseBodyData setPhoneType(Long phoneType) {
            this.phoneType = phoneType;
            return this;
        }
        public Long getPhoneType() {
            return this.phoneType;
        }

        public QueryAiCallTaskDetailResponseBodyData setRealStartTime(Long realStartTime) {
            this.realStartTime = realStartTime;
            return this;
        }
        public Long getRealStartTime() {
            return this.realStartTime;
        }

        public QueryAiCallTaskDetailResponseBodyData setRetryCount(Long retryCount) {
            this.retryCount = retryCount;
            return this;
        }
        public Long getRetryCount() {
            return this.retryCount;
        }

        public QueryAiCallTaskDetailResponseBodyData setRetryEnable(Boolean retryEnable) {
            this.retryEnable = retryEnable;
            return this;
        }
        public Boolean getRetryEnable() {
            return this.retryEnable;
        }

        public QueryAiCallTaskDetailResponseBodyData setRetryInterval(Long retryInterval) {
            this.retryInterval = retryInterval;
            return this;
        }
        public Long getRetryInterval() {
            return this.retryInterval;
        }

        public QueryAiCallTaskDetailResponseBodyData setRetryReasons(java.util.List<String> retryReasons) {
            this.retryReasons = retryReasons;
            return this;
        }
        public java.util.List<String> getRetryReasons() {
            return this.retryReasons;
        }

        public QueryAiCallTaskDetailResponseBodyData setStartTime(Long startTime) {
            this.startTime = startTime;
            return this;
        }
        public Long getStartTime() {
            return this.startTime;
        }

        public QueryAiCallTaskDetailResponseBodyData setStartType(String startType) {
            this.startType = startType;
            return this;
        }
        public String getStartType() {
            return this.startType;
        }

        public QueryAiCallTaskDetailResponseBodyData setTaskId(String taskId) {
            this.taskId = taskId;
            return this;
        }
        public String getTaskId() {
            return this.taskId;
        }

        public QueryAiCallTaskDetailResponseBodyData setTaskName(String taskName) {
            this.taskName = taskName;
            return this;
        }
        public String getTaskName() {
            return this.taskName;
        }

    }

}
