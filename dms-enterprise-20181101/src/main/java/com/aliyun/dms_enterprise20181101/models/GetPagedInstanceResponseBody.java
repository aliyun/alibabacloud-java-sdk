// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class GetPagedInstanceResponseBody extends TeaModel {
    @NameInMap("Data")
    public GetPagedInstanceResponseBodyData data;

    @NameInMap("ErrorCode")
    public String errorCode;

    @NameInMap("ErrorMessage")
    public String errorMessage;

    @NameInMap("PageIndex")
    public Long pageIndex;

    @NameInMap("PageSize")
    public Long pageSize;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    @NameInMap("Total")
    public Long total;

    /**
     * <p>Id of the request</p>
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
        @NameInMap("BusinessTime")
        public String businessTime;

        @NameInMap("CheckStatus")
        public Long checkStatus;

        @NameInMap("DagId")
        public Long dagId;

        @NameInMap("Delete")
        public String delete;

        @NameInMap("EndTime")
        public String endTime;

        @NameInMap("GmtCreate")
        public String gmtCreate;

        @NameInMap("GmtModified")
        public String gmtModified;

        @NameInMap("HistoryDagId")
        public Long historyDagId;

        @NameInMap("Id")
        public Long id;

        @NameInMap("LastRunningContext")
        public String lastRunningContext;

        @NameInMap("Msg")
        public String msg;

        @NameInMap("Status")
        public Long status;

        @NameInMap("TaskType")
        public Long taskType;

        @NameInMap("TenantId")
        public String tenantId;

        @NameInMap("TriggerType")
        public Long triggerType;

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
