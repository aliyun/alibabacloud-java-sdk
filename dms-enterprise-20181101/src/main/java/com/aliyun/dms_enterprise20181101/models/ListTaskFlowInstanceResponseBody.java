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
        /**
         * <p>The business time of the task flow. The time is displayed in the yyyy-MM-DD HH:mm:ss format.</p>
         * 
         * <strong>example:</strong>
         * <p>2021-11-10 14:37:26</p>
         */
        @NameInMap("BusinessTime")
        public String businessTime;

        /**
         * <p>The ID of the task flow.</p>
         * 
         * <strong>example:</strong>
         * <p>7***</p>
         */
        @NameInMap("DagId")
        public String dagId;

        /**
         * <p>The name of the task flow.</p>
         * 
         * <strong>example:</strong>
         * <p>Spark_SQL_test</p>
         */
        @NameInMap("DagName")
        public String dagName;

        /**
         * <p>The version of the task flow.</p>
         * 
         * <strong>example:</strong>
         * <p>[]</p>
         */
        @NameInMap("DagVersion")
        public String dagVersion;

        /**
         * <p>The time when the execution of the task flow was complete. The time is displayed in the yyyy-MM-DD HH:mm:ss format.</p>
         * 
         * <strong>example:</strong>
         * <p>2021-11-11 14:38:57</p>
         */
        @NameInMap("EndTime")
        public String endTime;

        /**
         * <p>The ID of the previously published version of the task flow.</p>
         * 
         * <strong>example:</strong>
         * <p>2****</p>
         */
        @NameInMap("HistoryDagId")
        public Long historyDagId;

        /**
         * <p>The ID of the execution record.</p>
         * 
         * <strong>example:</strong>
         * <p>9234</p>
         */
        @NameInMap("Id")
        public Long id;

        /**
         * <p>The description of the task.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("Message")
        public String message;

        /**
         * <p>The name of the task flow owner.</p>
         * 
         * <strong>example:</strong>
         * <p>test_name</p>
         */
        @NameInMap("OwnerName")
        public String ownerName;

        /**
         * <p>The status of the task flow. Valid values:</p>
         * <ul>
         * <li><strong>0</strong>: The task flow is waiting to be scheduled.</li>
         * <li><strong>1</strong>: The task flow is being executed.</li>
         * <li><strong>2</strong>: The task flow is paused.</li>
         * <li><strong>3</strong>: The task flow failed.</li>
         * <li><strong>4</strong>: The task flow is executed.</li>
         * <li><strong>5</strong>: The task flow is complete.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>4</p>
         */
        @NameInMap("Status")
        public Integer status;

        /**
         * <p>The mode in which the task flow is triggered. Valid values:</p>
         * <ul>
         * <li><strong>0</strong>: The task flow is automatically triggered based on periodic scheduling.</li>
         * <li><strong>1</strong>: The task flow is manually triggered.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("TriggerType")
        public Integer triggerType;

        /**
         * <p>The time when the execution of the task flow was start. The time is displayed in the yyyy-MM-DD HH:mm:ss format.</p>
         * 
         * <strong>example:</strong>
         * <p>2021-11-11 14:35:57</p>
         */
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
