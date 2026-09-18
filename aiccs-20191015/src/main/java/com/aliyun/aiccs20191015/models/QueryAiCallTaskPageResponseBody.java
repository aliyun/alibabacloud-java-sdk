// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiccs20191015.models;

import com.aliyun.tea.*;

public class QueryAiCallTaskPageResponseBody extends TeaModel {
    /**
     * <p>The detailed reason for access denial.</p>
     * 
     * <strong>example:</strong>
     * <p>None</p>
     */
    @NameInMap("AccessDeniedDetail")
    public String accessDeniedDetail;

    /**
     * <p>The status code.</p>
     * 
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The task details.</p>
     */
    @NameInMap("Data")
    public QueryAiCallTaskPageResponseBodyData data;

    /**
     * <p>The error message. This parameter is not returned if the call is successful.</p>
     * 
     * <strong>example:</strong>
     * <p>Invalid parameter.</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>B99C5955-5664-573D-97BE-A7CC1AFD8401</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the call was successful. Valid values:</p>
     * <ul>
     * <li><strong>true</strong>: successful.</li>
     * <li><strong>false</strong>: failed.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static QueryAiCallTaskPageResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryAiCallTaskPageResponseBody self = new QueryAiCallTaskPageResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryAiCallTaskPageResponseBody setAccessDeniedDetail(String accessDeniedDetail) {
        this.accessDeniedDetail = accessDeniedDetail;
        return this;
    }
    public String getAccessDeniedDetail() {
        return this.accessDeniedDetail;
    }

    public QueryAiCallTaskPageResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public QueryAiCallTaskPageResponseBody setData(QueryAiCallTaskPageResponseBodyData data) {
        this.data = data;
        return this;
    }
    public QueryAiCallTaskPageResponseBodyData getData() {
        return this.data;
    }

    public QueryAiCallTaskPageResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public QueryAiCallTaskPageResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryAiCallTaskPageResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class QueryAiCallTaskPageResponseBodyDataList extends TeaModel {
        /**
         * <p>The agent ID.</p>
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
         * <p>TestAgent.</p>
         */
        @NameInMap("AgentName")
        public String agentName;

        /**
         * <strong>example:</strong>
         * <p>Sample value.</p>
         */
        @NameInMap("ApplicationCode")
        public String applicationCode;

        /**
         * <strong>example:</strong>
         * <p>Sample value.</p>
         */
        @NameInMap("ApplicationName")
        public String applicationName;

        /**
         * <strong>example:</strong>
         * <p>Sample value.</p>
         */
        @NameInMap("CallExpireDate")
        public String callExpireDate;

        /**
         * <strong>example:</strong>
         * <p>39</p>
         */
        @NameInMap("CallExpireMinutes")
        public Long callExpireMinutes;

        /**
         * <strong>example:</strong>
         * <p>72</p>
         */
        @NameInMap("CallExpireType")
        public Long callExpireType;

        /**
         * <p>The number of ongoing calls.</p>
         * 
         * <strong>example:</strong>
         * <p>72</p>
         */
        @NameInMap("CallingCount")
        public Long callingCount;

        /**
         * <p>The task completion rate.</p>
         * 
         * <strong>example:</strong>
         * <p>70%</p>
         */
        @NameInMap("CompleteRate")
        public String completeRate;

        /**
         * <p>The task concurrency.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("ConcurrentCount")
        public Long concurrentCount;

        /**
         * <p>The creation time. This value is a UNIX timestamp in milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1748932499000</p>
         */
        @NameInMap("CreateTime")
        public Long createTime;

        /**
         * <p>The number of calls made on the current day.</p>
         * 
         * <strong>example:</strong>
         * <p>22</p>
         */
        @NameInMap("DayCallCount")
        public Long dayCallCount;

        /**
         * <p>The daily connection rate. Daily connection rate = number of connections on the current day ÷ number of calls on the current day (DayCallCount).</p>
         * 
         * <strong>example:</strong>
         * <p>74.14%</p>
         */
        @NameInMap("DayConnectRate")
        public String dayConnectRate;

        /**
         * <p>The amount of data imported on the current day.</p>
         * 
         * <strong>example:</strong>
         * <p>400</p>
         */
        @NameInMap("DayImportCount")
        public Long dayImportCount;

        /**
         * <p>The total number of failed task executions.</p>
         * 
         * <strong>example:</strong>
         * <p>61</p>
         */
        @NameInMap("FailedCount")
        public Long failedCount;

        /**
         * <p>The historical connection rate. Historical connection rate = historical number of connections ÷ total number of calls (TotalCallCount).</p>
         * 
         * <strong>example:</strong>
         * <p>95.89%</p>
         */
        @NameInMap("HistoryConnectRate")
        public String historyConnectRate;

        /**
         * <p>The actual start time of the task. This value is a UNIX timestamp in milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1748932499000</p>
         */
        @NameInMap("RealStartTime")
        public Long realStartTime;

        /**
         * <p>The reason for startup failure.</p>
         * 
         * <strong>example:</strong>
         * <p>Agent is offline.</p>
         */
        @NameInMap("StartFailedReason")
        public String startFailedReason;

        /**
         * <p>The scheduled start time of the task. This value is a UNIX timestamp in milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1748932499000</p>
         */
        @NameInMap("StartTime")
        public Long startTime;

        /**
         * <p>The task status.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Status")
        public Long status;

        /**
         * <p>The total number of successful task executions.</p>
         * 
         * <strong>example:</strong>
         * <p>36</p>
         */
        @NameInMap("SucceedCount")
        public Long succeedCount;

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
         * <p>TestTask.</p>
         */
        @NameInMap("TaskName")
        public String taskName;

        /**
         * <p>The total number of calls made by the task.</p>
         * 
         * <strong>example:</strong>
         * <p>58</p>
         */
        @NameInMap("TotalCallCount")
        public Long totalCallCount;

        /**
         * <p>The total number of task items.</p>
         * 
         * <strong>example:</strong>
         * <p>71</p>
         */
        @NameInMap("TotalCount")
        public Long totalCount;

        public static QueryAiCallTaskPageResponseBodyDataList build(java.util.Map<String, ?> map) throws Exception {
            QueryAiCallTaskPageResponseBodyDataList self = new QueryAiCallTaskPageResponseBodyDataList();
            return TeaModel.build(map, self);
        }

        public QueryAiCallTaskPageResponseBodyDataList setAgentId(String agentId) {
            this.agentId = agentId;
            return this;
        }
        public String getAgentId() {
            return this.agentId;
        }

        public QueryAiCallTaskPageResponseBodyDataList setAgentName(String agentName) {
            this.agentName = agentName;
            return this;
        }
        public String getAgentName() {
            return this.agentName;
        }

        public QueryAiCallTaskPageResponseBodyDataList setApplicationCode(String applicationCode) {
            this.applicationCode = applicationCode;
            return this;
        }
        public String getApplicationCode() {
            return this.applicationCode;
        }

        public QueryAiCallTaskPageResponseBodyDataList setApplicationName(String applicationName) {
            this.applicationName = applicationName;
            return this;
        }
        public String getApplicationName() {
            return this.applicationName;
        }

        public QueryAiCallTaskPageResponseBodyDataList setCallExpireDate(String callExpireDate) {
            this.callExpireDate = callExpireDate;
            return this;
        }
        public String getCallExpireDate() {
            return this.callExpireDate;
        }

        public QueryAiCallTaskPageResponseBodyDataList setCallExpireMinutes(Long callExpireMinutes) {
            this.callExpireMinutes = callExpireMinutes;
            return this;
        }
        public Long getCallExpireMinutes() {
            return this.callExpireMinutes;
        }

        public QueryAiCallTaskPageResponseBodyDataList setCallExpireType(Long callExpireType) {
            this.callExpireType = callExpireType;
            return this;
        }
        public Long getCallExpireType() {
            return this.callExpireType;
        }

        public QueryAiCallTaskPageResponseBodyDataList setCallingCount(Long callingCount) {
            this.callingCount = callingCount;
            return this;
        }
        public Long getCallingCount() {
            return this.callingCount;
        }

        public QueryAiCallTaskPageResponseBodyDataList setCompleteRate(String completeRate) {
            this.completeRate = completeRate;
            return this;
        }
        public String getCompleteRate() {
            return this.completeRate;
        }

        public QueryAiCallTaskPageResponseBodyDataList setConcurrentCount(Long concurrentCount) {
            this.concurrentCount = concurrentCount;
            return this;
        }
        public Long getConcurrentCount() {
            return this.concurrentCount;
        }

        public QueryAiCallTaskPageResponseBodyDataList setCreateTime(Long createTime) {
            this.createTime = createTime;
            return this;
        }
        public Long getCreateTime() {
            return this.createTime;
        }

        public QueryAiCallTaskPageResponseBodyDataList setDayCallCount(Long dayCallCount) {
            this.dayCallCount = dayCallCount;
            return this;
        }
        public Long getDayCallCount() {
            return this.dayCallCount;
        }

        public QueryAiCallTaskPageResponseBodyDataList setDayConnectRate(String dayConnectRate) {
            this.dayConnectRate = dayConnectRate;
            return this;
        }
        public String getDayConnectRate() {
            return this.dayConnectRate;
        }

        public QueryAiCallTaskPageResponseBodyDataList setDayImportCount(Long dayImportCount) {
            this.dayImportCount = dayImportCount;
            return this;
        }
        public Long getDayImportCount() {
            return this.dayImportCount;
        }

        public QueryAiCallTaskPageResponseBodyDataList setFailedCount(Long failedCount) {
            this.failedCount = failedCount;
            return this;
        }
        public Long getFailedCount() {
            return this.failedCount;
        }

        public QueryAiCallTaskPageResponseBodyDataList setHistoryConnectRate(String historyConnectRate) {
            this.historyConnectRate = historyConnectRate;
            return this;
        }
        public String getHistoryConnectRate() {
            return this.historyConnectRate;
        }

        public QueryAiCallTaskPageResponseBodyDataList setRealStartTime(Long realStartTime) {
            this.realStartTime = realStartTime;
            return this;
        }
        public Long getRealStartTime() {
            return this.realStartTime;
        }

        public QueryAiCallTaskPageResponseBodyDataList setStartFailedReason(String startFailedReason) {
            this.startFailedReason = startFailedReason;
            return this;
        }
        public String getStartFailedReason() {
            return this.startFailedReason;
        }

        public QueryAiCallTaskPageResponseBodyDataList setStartTime(Long startTime) {
            this.startTime = startTime;
            return this;
        }
        public Long getStartTime() {
            return this.startTime;
        }

        public QueryAiCallTaskPageResponseBodyDataList setStatus(Long status) {
            this.status = status;
            return this;
        }
        public Long getStatus() {
            return this.status;
        }

        public QueryAiCallTaskPageResponseBodyDataList setSucceedCount(Long succeedCount) {
            this.succeedCount = succeedCount;
            return this;
        }
        public Long getSucceedCount() {
            return this.succeedCount;
        }

        public QueryAiCallTaskPageResponseBodyDataList setTaskId(String taskId) {
            this.taskId = taskId;
            return this;
        }
        public String getTaskId() {
            return this.taskId;
        }

        public QueryAiCallTaskPageResponseBodyDataList setTaskName(String taskName) {
            this.taskName = taskName;
            return this;
        }
        public String getTaskName() {
            return this.taskName;
        }

        public QueryAiCallTaskPageResponseBodyDataList setTotalCallCount(Long totalCallCount) {
            this.totalCallCount = totalCallCount;
            return this;
        }
        public Long getTotalCallCount() {
            return this.totalCallCount;
        }

        public QueryAiCallTaskPageResponseBodyDataList setTotalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Long getTotalCount() {
            return this.totalCount;
        }

    }

    public static class QueryAiCallTaskPageResponseBodyData extends TeaModel {
        /**
         * <p>The task data.</p>
         */
        @NameInMap("List")
        public java.util.List<QueryAiCallTaskPageResponseBodyDataList> list;

        /**
         * <p>The current page number.</p>
         * 
         * <strong>example:</strong>
         * <p>37</p>
         */
        @NameInMap("PageNo")
        public Long pageNo;

        /**
         * <p>The number of entries per page.</p>
         * 
         * <strong>example:</strong>
         * <p>74</p>
         */
        @NameInMap("PageSize")
        public Long pageSize;

        /**
         * <p>The total number of records.</p>
         * 
         * <strong>example:</strong>
         * <p>72</p>
         */
        @NameInMap("Total")
        public Long total;

        public static QueryAiCallTaskPageResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            QueryAiCallTaskPageResponseBodyData self = new QueryAiCallTaskPageResponseBodyData();
            return TeaModel.build(map, self);
        }

        public QueryAiCallTaskPageResponseBodyData setList(java.util.List<QueryAiCallTaskPageResponseBodyDataList> list) {
            this.list = list;
            return this;
        }
        public java.util.List<QueryAiCallTaskPageResponseBodyDataList> getList() {
            return this.list;
        }

        public QueryAiCallTaskPageResponseBodyData setPageNo(Long pageNo) {
            this.pageNo = pageNo;
            return this;
        }
        public Long getPageNo() {
            return this.pageNo;
        }

        public QueryAiCallTaskPageResponseBodyData setPageSize(Long pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Long getPageSize() {
            return this.pageSize;
        }

        public QueryAiCallTaskPageResponseBodyData setTotal(Long total) {
            this.total = total;
            return this;
        }
        public Long getTotal() {
            return this.total;
        }

    }

}
