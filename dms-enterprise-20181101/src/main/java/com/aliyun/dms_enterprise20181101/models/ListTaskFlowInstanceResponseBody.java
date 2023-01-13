// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class ListTaskFlowInstanceResponseBody extends TeaModel {
    /**
     * <p>The information about the execution records returned.</p>
     */
    @NameInMap("DAGInstanceList")
    public ListTaskFlowInstanceResponseBodyDAGInstanceList DAGInstanceList;

    /**
     * <p>The error code returned if the request fails.</p>
     */
    @NameInMap("ErrorCode")
    public String errorCode;

    /**
     * <p>The error message returned if the request fails.</p>
     */
    @NameInMap("ErrorMessage")
    public String errorMessage;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request is successful. Valid values:</p>
     * <br>
     * <p>*   **true**: The request is successful.</p>
     * <p>*   **false**: The request fails.</p>
     */
    @NameInMap("Success")
    public Boolean success;

    /**
     * <p>The total number of execution records returned.</p>
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
        /**
         * <p>The business time of the task flow. The time is displayed in the yyyy-MM-DD HH:mm:ss format.</p>
         */
        @NameInMap("BusinessTime")
        public String businessTime;

        /**
         * <p>The ID of the task flow.</p>
         */
        @NameInMap("DagId")
        public String dagId;

        /**
         * <p>The name of the task flow.</p>
         */
        @NameInMap("DagName")
        public String dagName;

        @NameInMap("DagVersion")
        public String dagVersion;

        /**
         * <p>The time when the execution of the task flow was complete. The time is displayed in the yyyy-MM-DD HH:mm:ss format.</p>
         */
        @NameInMap("EndTime")
        public String endTime;

        /**
         * <p>The ID of the previously published version of the task flow.</p>
         */
        @NameInMap("HistoryDagId")
        public Long historyDagId;

        /**
         * <p>The ID of the execution record.</p>
         */
        @NameInMap("Id")
        public Long id;

        /**
         * <p>The description of the task.</p>
         */
        @NameInMap("Message")
        public String message;

        /**
         * <p>The name of the task flow owner.</p>
         */
        @NameInMap("OwnerName")
        public String ownerName;

        /**
         * <p>The status of the task flow. Valid values:</p>
         * <br>
         * <p>*   **0**: The task flow is waiting to be scheduled.</p>
         * <p>*   **1**: The task flow is being executed.</p>
         * <p>*   **2**: The task flow is paused.</p>
         * <p>*   **3**: The task flow failed.</p>
         * <p>*   **4**: The task flow is executed.</p>
         * <p>*   **5**: The task flow is complete.</p>
         */
        @NameInMap("Status")
        public Integer status;

        /**
         * <p>The mode in which the task flow is triggered. Valid values:</p>
         * <br>
         * <p>*   **0**: The task flow is automatically triggered based on periodic scheduling.</p>
         * <p>*   **1**: The task flow is manually triggered.</p>
         */
        @NameInMap("TriggerType")
        public Integer triggerType;

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
