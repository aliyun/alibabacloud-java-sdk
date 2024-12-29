// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20211201.models;

import com.aliyun.tea.*;

public class ListApsOptimizationTasksResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>InvalidInput</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    /**
     * <strong>example:</strong>
     * <ul>
     * <li></li>
     * </ul>
     */
    @NameInMap("Items")
    public java.util.List<ListApsOptimizationTasksResponseBodyItems> items;

    /**
     * <strong>example:</strong>
     * <p>SUCCESS</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <strong>example:</strong>
     * <p>30</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <strong>example:</strong>
     * <p><strong><strong><strong>-3EEC-</strong></strong></strong>-9F06-******</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    /**
     * <strong>example:</strong>
     * <p>15</p>
     */
    @NameInMap("TotalCount")
    public Long totalCount;

    public static ListApsOptimizationTasksResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListApsOptimizationTasksResponseBody self = new ListApsOptimizationTasksResponseBody();
        return TeaModel.build(map, self);
    }

    public ListApsOptimizationTasksResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListApsOptimizationTasksResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public ListApsOptimizationTasksResponseBody setItems(java.util.List<ListApsOptimizationTasksResponseBodyItems> items) {
        this.items = items;
        return this;
    }
    public java.util.List<ListApsOptimizationTasksResponseBodyItems> getItems() {
        return this.items;
    }

    public ListApsOptimizationTasksResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListApsOptimizationTasksResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListApsOptimizationTasksResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListApsOptimizationTasksResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListApsOptimizationTasksResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public ListApsOptimizationTasksResponseBody setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static class ListApsOptimizationTasksResponseBodyItems extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("ComputeUnit")
        public String computeUnit;

        /**
         * <strong>example:</strong>
         * <p>2022-01-23T02:18Z</p>
         */
        @NameInMap("CreatedTime")
        public String createdTime;

        /**
         * <strong>example:</strong>
         * <p>amv-*******</p>
         */
        @NameInMap("DBClusterId")
        public String DBClusterId;

        /**
         * <strong>example:</strong>
         * <p>2022-09-30T00:15Z</p>
         */
        @NameInMap("ModifiedTime")
        public String modifiedTime;

        /**
         * <strong>example:</strong>
         * <p>StrategyValue</p>
         */
        @NameInMap("StrategyType")
        public String strategyType;

        /**
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("TaskDesc")
        public String taskDesc;

        /**
         * <strong>example:</strong>
         * <p>1000</p>
         */
        @NameInMap("TaskDuration")
        public Long taskDuration;

        /**
         * <strong>example:</strong>
         * <p>sj-hz******</p>
         */
        @NameInMap("TaskId")
        public String taskId;

        /**
         * <strong>example:</strong>
         * <ul>
         * <li></li>
         * </ul>
         */
        @NameInMap("TaskMessage")
        public String taskMessage;

        /**
         * <strong>example:</strong>
         * <p>RUNNING</p>
         */
        @NameInMap("TaskStatus")
        public String taskStatus;

        public static ListApsOptimizationTasksResponseBodyItems build(java.util.Map<String, ?> map) throws Exception {
            ListApsOptimizationTasksResponseBodyItems self = new ListApsOptimizationTasksResponseBodyItems();
            return TeaModel.build(map, self);
        }

        public ListApsOptimizationTasksResponseBodyItems setComputeUnit(String computeUnit) {
            this.computeUnit = computeUnit;
            return this;
        }
        public String getComputeUnit() {
            return this.computeUnit;
        }

        public ListApsOptimizationTasksResponseBodyItems setCreatedTime(String createdTime) {
            this.createdTime = createdTime;
            return this;
        }
        public String getCreatedTime() {
            return this.createdTime;
        }

        public ListApsOptimizationTasksResponseBodyItems setDBClusterId(String DBClusterId) {
            this.DBClusterId = DBClusterId;
            return this;
        }
        public String getDBClusterId() {
            return this.DBClusterId;
        }

        public ListApsOptimizationTasksResponseBodyItems setModifiedTime(String modifiedTime) {
            this.modifiedTime = modifiedTime;
            return this;
        }
        public String getModifiedTime() {
            return this.modifiedTime;
        }

        public ListApsOptimizationTasksResponseBodyItems setStrategyType(String strategyType) {
            this.strategyType = strategyType;
            return this;
        }
        public String getStrategyType() {
            return this.strategyType;
        }

        public ListApsOptimizationTasksResponseBodyItems setTaskDesc(String taskDesc) {
            this.taskDesc = taskDesc;
            return this;
        }
        public String getTaskDesc() {
            return this.taskDesc;
        }

        public ListApsOptimizationTasksResponseBodyItems setTaskDuration(Long taskDuration) {
            this.taskDuration = taskDuration;
            return this;
        }
        public Long getTaskDuration() {
            return this.taskDuration;
        }

        public ListApsOptimizationTasksResponseBodyItems setTaskId(String taskId) {
            this.taskId = taskId;
            return this;
        }
        public String getTaskId() {
            return this.taskId;
        }

        public ListApsOptimizationTasksResponseBodyItems setTaskMessage(String taskMessage) {
            this.taskMessage = taskMessage;
            return this;
        }
        public String getTaskMessage() {
            return this.taskMessage;
        }

        public ListApsOptimizationTasksResponseBodyItems setTaskStatus(String taskStatus) {
            this.taskStatus = taskStatus;
            return this;
        }
        public String getTaskStatus() {
            return this.taskStatus;
        }

    }

}
