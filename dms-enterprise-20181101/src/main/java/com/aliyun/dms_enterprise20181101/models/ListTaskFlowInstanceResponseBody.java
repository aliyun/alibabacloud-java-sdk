// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class ListTaskFlowInstanceResponseBody extends TeaModel {
    @NameInMap("DAGInstanceList")
    public ListTaskFlowInstanceResponseBodyDAGInstanceList DAGInstanceList;

    /**
     * <p>The error code returned if the request fails.</p>
     * 
     * <strong>example:</strong>
     * <p>UnknownError</p>
     */
    @NameInMap("ErrorCode")
    public String errorCode;

    /**
     * <p>The error message returned if the request fails.</p>
     * 
     * <strong>example:</strong>
     * <p>UnknownError</p>
     */
    @NameInMap("ErrorMessage")
    public String errorMessage;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>8CFF2295-8249-5287-B888-DBD4F0D76CB0</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request is successful. Valid values:</p>
     * <ul>
     * <li><strong>true</strong>: The request is successful.</li>
     * <li><strong>false</strong>: The request fails.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    /**
     * <p>The total number of execution records returned.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("TotalCount")
    public Integer totalCount;

    public static ListTaskFlowInstanceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListTaskFlowInstanceResponseBody self = new ListTaskFlowInstanceResponseBody();
        return TeaModel.build(map, self);
    }

    public ListTaskFlowInstanceResponseBody setDAGInstanceList(ListTaskFlowInstanceResponseBodyDAGInstanceList DAGInstanceList) {
        this.DAGInstanceList = DAGInstanceList;
        return this;
    }
    public ListTaskFlowInstanceResponseBodyDAGInstanceList getDAGInstanceList() {
        return this.DAGInstanceList;
    }

    public ListTaskFlowInstanceResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public ListTaskFlowInstanceResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public ListTaskFlowInstanceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListTaskFlowInstanceResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public ListTaskFlowInstanceResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class ListTaskFlowInstanceResponseBodyDAGInstanceListDAGInstance extends TeaModel {
        @NameInMap("BusinessTime")
        public String businessTime;

        @NameInMap("DagId")
        public String dagId;

        @NameInMap("DagName")
        public String dagName;

        @NameInMap("DagVersion")
        public String dagVersion;

        @NameInMap("EndTime")
        public String endTime;

        @NameInMap("HistoryDagId")
        public Long historyDagId;

        @NameInMap("Id")
        public Long id;

        @NameInMap("Message")
        public String message;

        @NameInMap("OwnerName")
        public String ownerName;

        @NameInMap("Status")
        public Integer status;

        @NameInMap("TriggerType")
        public Integer triggerType;

        @NameInMap("startTime")
        public String startTime;

        public static ListTaskFlowInstanceResponseBodyDAGInstanceListDAGInstance build(java.util.Map<String, ?> map) throws Exception {
            ListTaskFlowInstanceResponseBodyDAGInstanceListDAGInstance self = new ListTaskFlowInstanceResponseBodyDAGInstanceListDAGInstance();
            return TeaModel.build(map, self);
        }

        public ListTaskFlowInstanceResponseBodyDAGInstanceListDAGInstance setBusinessTime(String businessTime) {
            this.businessTime = businessTime;
            return this;
        }
        public String getBusinessTime() {
            return this.businessTime;
        }

        public ListTaskFlowInstanceResponseBodyDAGInstanceListDAGInstance setDagId(String dagId) {
            this.dagId = dagId;
            return this;
        }
        public String getDagId() {
            return this.dagId;
        }

        public ListTaskFlowInstanceResponseBodyDAGInstanceListDAGInstance setDagName(String dagName) {
            this.dagName = dagName;
            return this;
        }
        public String getDagName() {
            return this.dagName;
        }

        public ListTaskFlowInstanceResponseBodyDAGInstanceListDAGInstance setDagVersion(String dagVersion) {
            this.dagVersion = dagVersion;
            return this;
        }
        public String getDagVersion() {
            return this.dagVersion;
        }

        public ListTaskFlowInstanceResponseBodyDAGInstanceListDAGInstance setEndTime(String endTime) {
            this.endTime = endTime;
            return this;
        }
        public String getEndTime() {
            return this.endTime;
        }

        public ListTaskFlowInstanceResponseBodyDAGInstanceListDAGInstance setHistoryDagId(Long historyDagId) {
            this.historyDagId = historyDagId;
            return this;
        }
        public Long getHistoryDagId() {
            return this.historyDagId;
        }

        public ListTaskFlowInstanceResponseBodyDAGInstanceListDAGInstance setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public ListTaskFlowInstanceResponseBodyDAGInstanceListDAGInstance setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public ListTaskFlowInstanceResponseBodyDAGInstanceListDAGInstance setOwnerName(String ownerName) {
            this.ownerName = ownerName;
            return this;
        }
        public String getOwnerName() {
            return this.ownerName;
        }

        public ListTaskFlowInstanceResponseBodyDAGInstanceListDAGInstance setStatus(Integer status) {
            this.status = status;
            return this;
        }
        public Integer getStatus() {
            return this.status;
        }

        public ListTaskFlowInstanceResponseBodyDAGInstanceListDAGInstance setTriggerType(Integer triggerType) {
            this.triggerType = triggerType;
            return this;
        }
        public Integer getTriggerType() {
            return this.triggerType;
        }

        public ListTaskFlowInstanceResponseBodyDAGInstanceListDAGInstance setStartTime(String startTime) {
            this.startTime = startTime;
            return this;
        }
        public String getStartTime() {
            return this.startTime;
        }

    }

    public static class ListTaskFlowInstanceResponseBodyDAGInstanceList extends TeaModel {
        @NameInMap("DAGInstance")
        public java.util.List<ListTaskFlowInstanceResponseBodyDAGInstanceListDAGInstance> DAGInstance;

        public static ListTaskFlowInstanceResponseBodyDAGInstanceList build(java.util.Map<String, ?> map) throws Exception {
            ListTaskFlowInstanceResponseBodyDAGInstanceList self = new ListTaskFlowInstanceResponseBodyDAGInstanceList();
            return TeaModel.build(map, self);
        }

        public ListTaskFlowInstanceResponseBodyDAGInstanceList setDAGInstance(java.util.List<ListTaskFlowInstanceResponseBodyDAGInstanceListDAGInstance> DAGInstance) {
            this.DAGInstance = DAGInstance;
            return this;
        }
        public java.util.List<ListTaskFlowInstanceResponseBodyDAGInstanceListDAGInstance> getDAGInstance() {
            return this.DAGInstance;
        }

    }

}
