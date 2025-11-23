// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class GetPagedInstanceResponseBody extends TeaModel {
    /**
     * <p>The data returned.</p>
     */
    @NameInMap("Data")
    public GetPagedInstanceResponseBodyData data;

    /**
     * <p>The error code returned if the request failed.</p>
     * 
     * <strong>example:</strong>
     * <p>UnknownError</p>
     */
    @NameInMap("ErrorCode")
    public String errorCode;

    /**
     * <p>The error message that is returned if the request failed.</p>
     * 
     * <strong>example:</strong>
     * <p>UnknownError</p>
     */
    @NameInMap("ErrorMessage")
    public String errorMessage;

    /**
     * <p>The page number.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageIndex")
    public Long pageIndex;

    /**
     * <p>The number of entries to return on each page.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Long pageSize;

    /**
     * <p>The request ID. You can use the request ID to query logs and troubleshoot issues.</p>
     * 
     * <strong>example:</strong>
     * <p>7FAD400F-7A5C-4193-8F9A-39D86C4F0231</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request was successful. Valid values:</p>
     * <ul>
     * <li><strong>true</strong></li>
     * <li><strong>false</strong>: The request failed.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    /**
     * <p>The total number of instances.</p>
     * 
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("Total")
    public Long total;

    /**
     * <p>The trace ID, which is used to track the request.</p>
     * 
     * <strong>example:</strong>
     * <p>0a06e1e316757357507896067d3780</p>
     */
    @NameInMap("TraceId")
    public String traceId;

    public static GetPagedInstanceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetPagedInstanceResponseBody self = new GetPagedInstanceResponseBody();
        return TeaModel.build(map, self);
    }

    public GetPagedInstanceResponseBody setData(GetPagedInstanceResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetPagedInstanceResponseBodyData getData() {
        return this.data;
    }

    public GetPagedInstanceResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public GetPagedInstanceResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public GetPagedInstanceResponseBody setPageIndex(Long pageIndex) {
        this.pageIndex = pageIndex;
        return this;
    }
    public Long getPageIndex() {
        return this.pageIndex;
    }

    public GetPagedInstanceResponseBody setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public GetPagedInstanceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetPagedInstanceResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public GetPagedInstanceResponseBody setTotal(Long total) {
        this.total = total;
        return this;
    }
    public Long getTotal() {
        return this.total;
    }

    public GetPagedInstanceResponseBody setTraceId(String traceId) {
        this.traceId = traceId;
        return this;
    }
    public String getTraceId() {
        return this.traceId;
    }

    public static class GetPagedInstanceResponseBodyDataInstance extends TeaModel {
        /**
         * <p>The data timestamp of the task node.</p>
         * 
         * <strong>example:</strong>
         * <p>2023-05-14 16:00:57</p>
         */
        @NameInMap("BusinessTime")
        public String businessTime;

        /**
         * <p>The state of archived data verification. Valid values:</p>
         * <ul>
         * <li><strong>0</strong>: The verification was successful.</li>
         * <li><strong>1</strong>: Inconsistent data was detected.</li>
         * <li><strong>2</strong>: The verification was not performed.</li>
         * <li><strong>3</strong>: The verification is in progress.</li>
         * <li><strong>4</strong>: The verification was interrupted.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
        @NameInMap("CheckStatus")
        public Long checkStatus;

        /**
         * <p>The unique ID of the task flow.</p>
         * 
         * <strong>example:</strong>
         * <p>33753</p>
         */
        @NameInMap("DagId")
        public Long dagId;

        /**
         * <p>Indicates whether the source data is deleted. Valid values:</p>
         * <ul>
         * <li><strong>true</strong>: deletes the jobs in the application group.</li>
         * <li><strong>false</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("Delete")
        public String delete;

        /**
         * <p>The time when the task ended.</p>
         * 
         * <strong>example:</strong>
         * <p>2023-04-23 10:23:20</p>
         */
        @NameInMap("EndTime")
        public String endTime;

        /**
         * <p>The time when the task flow was created.</p>
         * 
         * <strong>example:</strong>
         * <p>2023-03-28 10:50:45</p>
         */
        @NameInMap("GmtCreate")
        public String gmtCreate;

        /**
         * <p>The time when the task flow was last modified.</p>
         * 
         * <strong>example:</strong>
         * <p>2023-04-18 15:28:16</p>
         */
        @NameInMap("GmtModified")
        public String gmtModified;

        /**
         * <p>The ID of the historical task flow.</p>
         * 
         * <strong>example:</strong>
         * <p>6851</p>
         */
        @NameInMap("HistoryDagId")
        public Long historyDagId;

        /**
         * <p>The task flow ID.</p>
         * 
         * <strong>example:</strong>
         * <p>24271</p>
         */
        @NameInMap("Id")
        public Long id;

        /**
         * <p>The context of the last execution of the task flow.</p>
         * 
         * <strong>example:</strong>
         * <p>{”nodes&quot;:[11694,11695]&quot;}</p>
         */
        @NameInMap("LastRunningContext")
        public String lastRunningContext;

        /**
         * <p>The details of the current task execution.</p>
         */
        @NameInMap("Msg")
        public String msg;

        /**
         * <p>The state of the archiving task.</p>
         * <ul>
         * <li><strong>0</strong>: Pending.</li>
         * <li><strong>1</strong>: Running.</li>
         * <li><strong>2</strong>: Paused.</li>
         * <li><strong>3</strong>: Failed.</li>
         * <li><strong>4</strong>: Succeeded.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Status")
        public Long status;

        /**
         * <p>The task type. Valid values:</p>
         * <ul>
         * <li><strong>1</strong>: data archiving</li>
         * <li><strong>2</strong>: archived data restoration</li>
         * <li><strong>3</strong>: archived data verification</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("TaskType")
        public Long taskType;

        /**
         * <p>The ID of the tenant.</p>
         * 
         * <strong>example:</strong>
         * <p>3406</p>
         */
        @NameInMap("TenantId")
        public String tenantId;

        /**
         * <p>The mode in which the task flow is triggered. Valid values:</p>
         * <ul>
         * <li><strong>0</strong>: The task flow was triggered based on a schedule.</li>
         * <li><strong>1</strong>: The task flow was manually triggered.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("TriggerType")
        public Long triggerType;

        /**
         * <p>The version number.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Version")
        public String version;

        public static GetPagedInstanceResponseBodyDataInstance build(java.util.Map<String, ?> map) throws Exception {
            GetPagedInstanceResponseBodyDataInstance self = new GetPagedInstanceResponseBodyDataInstance();
            return TeaModel.build(map, self);
        }

        public GetPagedInstanceResponseBodyDataInstance setBusinessTime(String businessTime) {
            this.businessTime = businessTime;
            return this;
        }
        public String getBusinessTime() {
            return this.businessTime;
        }

        public GetPagedInstanceResponseBodyDataInstance setCheckStatus(Long checkStatus) {
            this.checkStatus = checkStatus;
            return this;
        }
        public Long getCheckStatus() {
            return this.checkStatus;
        }

        public GetPagedInstanceResponseBodyDataInstance setDagId(Long dagId) {
            this.dagId = dagId;
            return this;
        }
        public Long getDagId() {
            return this.dagId;
        }

        public GetPagedInstanceResponseBodyDataInstance setDelete(String delete) {
            this.delete = delete;
            return this;
        }
        public String getDelete() {
            return this.delete;
        }

        public GetPagedInstanceResponseBodyDataInstance setEndTime(String endTime) {
            this.endTime = endTime;
            return this;
        }
        public String getEndTime() {
            return this.endTime;
        }

        public GetPagedInstanceResponseBodyDataInstance setGmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        public GetPagedInstanceResponseBodyDataInstance setGmtModified(String gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public String getGmtModified() {
            return this.gmtModified;
        }

        public GetPagedInstanceResponseBodyDataInstance setHistoryDagId(Long historyDagId) {
            this.historyDagId = historyDagId;
            return this;
        }
        public Long getHistoryDagId() {
            return this.historyDagId;
        }

        public GetPagedInstanceResponseBodyDataInstance setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public GetPagedInstanceResponseBodyDataInstance setLastRunningContext(String lastRunningContext) {
            this.lastRunningContext = lastRunningContext;
            return this;
        }
        public String getLastRunningContext() {
            return this.lastRunningContext;
        }

        public GetPagedInstanceResponseBodyDataInstance setMsg(String msg) {
            this.msg = msg;
            return this;
        }
        public String getMsg() {
            return this.msg;
        }

        public GetPagedInstanceResponseBodyDataInstance setStatus(Long status) {
            this.status = status;
            return this;
        }
        public Long getStatus() {
            return this.status;
        }

        public GetPagedInstanceResponseBodyDataInstance setTaskType(Long taskType) {
            this.taskType = taskType;
            return this;
        }
        public Long getTaskType() {
            return this.taskType;
        }

        public GetPagedInstanceResponseBodyDataInstance setTenantId(String tenantId) {
            this.tenantId = tenantId;
            return this;
        }
        public String getTenantId() {
            return this.tenantId;
        }

        public GetPagedInstanceResponseBodyDataInstance setTriggerType(Long triggerType) {
            this.triggerType = triggerType;
            return this;
        }
        public Long getTriggerType() {
            return this.triggerType;
        }

        public GetPagedInstanceResponseBodyDataInstance setVersion(String version) {
            this.version = version;
            return this;
        }
        public String getVersion() {
            return this.version;
        }

    }

    public static class GetPagedInstanceResponseBodyData extends TeaModel {
        /**
         * <p>The information about the task.</p>
         */
        @NameInMap("Instance")
        public java.util.List<GetPagedInstanceResponseBodyDataInstance> instance;

        public static GetPagedInstanceResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetPagedInstanceResponseBodyData self = new GetPagedInstanceResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetPagedInstanceResponseBodyData setInstance(java.util.List<GetPagedInstanceResponseBodyDataInstance> instance) {
            this.instance = instance;
            return this;
        }
        public java.util.List<GetPagedInstanceResponseBodyDataInstance> getInstance() {
            return this.instance;
        }

    }

}
