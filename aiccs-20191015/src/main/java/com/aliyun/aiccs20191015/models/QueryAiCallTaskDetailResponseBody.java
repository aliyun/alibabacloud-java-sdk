// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiccs20191015.models;

import com.aliyun.tea.*;

public class QueryAiCallTaskDetailResponseBody extends TeaModel {
    /**
     * <p>The details about the access denial. This parameter is returned only when the RAM permission verification fails.</p>
     * 
     * <strong>example:</strong>
     * <p>None</p>
     */
    @NameInMap("AccessDeniedDetail")
    public String accessDeniedDetail;

    /**
     * <p>The error code.</p>
     * 
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The returned data.</p>
     */
    @NameInMap("Data")
    public QueryAiCallTaskDetailResponseBodyData data;

    /**
     * <p>The error message. This parameter is not returned if the call is successful.</p>
     * 
     * <strong>example:</strong>
     * <p>Invalid parameter</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>23822ECB-8CAA-5C52-9C9E-807FD82A5A7F</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the call was successful. Valid values:</p>
     * <ul>
     * <li><strong>true</strong>: Successful.</li>
     * <li><strong>false</strong>: Failed.</li>
     * </ul>
     * 
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
         * <p>The end time in the format of HH:mm:ss.</p>
         * 
         * <strong>example:</strong>
         * <p>09:00:00</p>
         */
        @NameInMap("EndTime")
        public String endTime;

        /**
         * <p>The start time in the format of HH:mm:ss.</p>
         * 
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

    public static class QueryAiCallTaskDetailResponseBodyDataCallableTimes extends TeaModel {
        /**
         * <p>The end time in the format of HH:mm:ss.</p>
         * 
         * <strong>example:</strong>
         * <p>18:00:00</p>
         */
        @NameInMap("EndTime")
        public String endTime;

        /**
         * <p>The start time in the format of HH:mm:ss.</p>
         * 
         * <strong>example:</strong>
         * <p>10:00:00</p>
         */
        @NameInMap("StartTime")
        public String startTime;

        public static QueryAiCallTaskDetailResponseBodyDataCallableTimes build(java.util.Map<String, ?> map) throws Exception {
            QueryAiCallTaskDetailResponseBodyDataCallableTimes self = new QueryAiCallTaskDetailResponseBodyDataCallableTimes();
            return TeaModel.build(map, self);
        }

        public QueryAiCallTaskDetailResponseBodyDataCallableTimes setEndTime(String endTime) {
            this.endTime = endTime;
            return this;
        }
        public String getEndTime() {
            return this.endTime;
        }

        public QueryAiCallTaskDetailResponseBodyDataCallableTimes setStartTime(String startTime) {
            this.startTime = startTime;
            return this;
        }
        public String getStartTime() {
            return this.startTime;
        }

    }

    public static class QueryAiCallTaskDetailResponseBodyData extends TeaModel {
        /**
         * <p>The code of the published agent.</p>
         * 
         * <strong>example:</strong>
         * <p>1180**************</p>
         */
        @NameInMap("AgentId")
        public String agentId;

        /**
         * <p>The agent name.</p>
         * 
         * <strong>example:</strong>
         * <p>Test agent</p>
         */
        @NameInMap("AgentName")
        public String agentName;

        /**
         * <p>The application code.</p>
         * 
         * <strong>example:</strong>
         * <p>Sample value</p>
         */
        @NameInMap("ApplicationCode")
        public String applicationCode;

        /**
         * <p>The application name.</p>
         * 
         * <strong>example:</strong>
         * <p>Sample value</p>
         */
        @NameInMap("ApplicationName")
        public String applicationName;

        /**
         * <p>The list of callable days.</p>
         */
        @NameInMap("CallDays")
        public java.util.List<String> callDays;

        /**
         * <p>The expiration date of outbound call details (specific deadline) in the format of YYYY-MM-DD HH:mm:ss.</p>
         * 
         * <strong>example:</strong>
         * <p>2026-07-30 20:00:20</p>
         */
        @NameInMap("CallExpireDate")
        public String callExpireDate;

        /**
         * <p>The expiration duration of outbound call details. Unit: minutes.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        @NameInMap("CallExpireMinutes")
        public Long callExpireMinutes;

        /**
         * <p>The expiration type of outbound calls. Valid values:</p>
         * <p>0: permanently valid.
         * 1: valid for a period of time after import.
         * 2: valid until a specified time.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("CallExpireType")
        public Long callExpireType;

        /**
         * <p>The allowed call time periods.</p>
         */
        @NameInMap("CallTimes")
        public java.util.List<QueryAiCallTaskDetailResponseBodyDataCallTimes> callTimes;

        /**
         * <p>The callable time periods of the current outbound call instance.</p>
         */
        @NameInMap("CallableTimes")
        public java.util.List<QueryAiCallTaskDetailResponseBodyDataCallableTimes> callableTimes;

        /**
         * <p>The caller number.</p>
         * 
         * <strong>example:</strong>
         * <p>05370124****</p>
         */
        @NameInMap("CallerNumber")
        public String callerNumber;

        /**
         * <p>The task concurrency.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("ConcurrentCount")
        public Long concurrentCount;

        /**
         * <p>The line encoding.</p>
         * 
         * <strong>example:</strong>
         * <p>Sample value</p>
         */
        @NameInMap("LineEncoding")
        public String lineEncoding;

        /**
         * <p>The phone number of the custom line.</p>
         * 
         * <strong>example:</strong>
         * <p>Sample value</p>
         */
        @NameInMap("LinePhoneNum")
        public String linePhoneNum;

        /**
         * <p>The phone number type. Valid values: 0 indicates an Alibaba Cloud number. 1 indicates a custom line provided by the customer.</p>
         * 
         * <strong>example:</strong>
         * <p>17</p>
         */
        @NameInMap("PhoneType")
        public Long phoneType;

        /**
         * <p>The actual start time of the task. This value is a timestamp in milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1748932499000</p>
         */
        @NameInMap("RealStartTime")
        public Long realStartTime;

        /**
         * <p>The number of retry attempts.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("RetryCount")
        public Long retryCount;

        /**
         * <p>Indicates whether call retry is enabled. Valid values:</p>
         * <ul>
         * <li>true: Enabled.</li>
         * <li>false: Not enabled.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("RetryEnable")
        public Boolean retryEnable;

        /**
         * <p>The retry interval. Unit: minutes.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("RetryInterval")
        public Long retryInterval;

        /**
         * <p>The list of failure reasons that allow retry.</p>
         */
        @NameInMap("RetryReasons")
        public java.util.List<String> retryReasons;

        /**
         * <p>The scheduled start time of the task. This value is a timestamp in milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1748932499000</p>
         */
        @NameInMap("StartTime")
        public Long startTime;

        /**
         * <p>The start mode. Valid values:</p>
         * <ul>
         * <li><p>IMMEDIATE: Start immediately.</p>
         * </li>
         * <li><p>SCHEDULE: Start at a scheduled time.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>IMMEDIATE</p>
         */
        @NameInMap("StartType")
        public String startType;

        /**
         * <p>The task ID.</p>
         * 
         * <strong>example:</strong>
         * <p>1187**************</p>
         */
        @NameInMap("TaskId")
        public String taskId;

        /**
         * <p>The task name.</p>
         * 
         * <strong>example:</strong>
         * <p>Test task</p>
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

        public QueryAiCallTaskDetailResponseBodyData setCallExpireDate(String callExpireDate) {
            this.callExpireDate = callExpireDate;
            return this;
        }
        public String getCallExpireDate() {
            return this.callExpireDate;
        }

        public QueryAiCallTaskDetailResponseBodyData setCallExpireMinutes(Long callExpireMinutes) {
            this.callExpireMinutes = callExpireMinutes;
            return this;
        }
        public Long getCallExpireMinutes() {
            return this.callExpireMinutes;
        }

        public QueryAiCallTaskDetailResponseBodyData setCallExpireType(Long callExpireType) {
            this.callExpireType = callExpireType;
            return this;
        }
        public Long getCallExpireType() {
            return this.callExpireType;
        }

        public QueryAiCallTaskDetailResponseBodyData setCallTimes(java.util.List<QueryAiCallTaskDetailResponseBodyDataCallTimes> callTimes) {
            this.callTimes = callTimes;
            return this;
        }
        public java.util.List<QueryAiCallTaskDetailResponseBodyDataCallTimes> getCallTimes() {
            return this.callTimes;
        }

        public QueryAiCallTaskDetailResponseBodyData setCallableTimes(java.util.List<QueryAiCallTaskDetailResponseBodyDataCallableTimes> callableTimes) {
            this.callableTimes = callableTimes;
            return this;
        }
        public java.util.List<QueryAiCallTaskDetailResponseBodyDataCallableTimes> getCallableTimes() {
            return this.callableTimes;
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
