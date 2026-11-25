// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.apig20240327.models;

import com.aliyun.tea.*;

public class ListBatchExportTasksResponseBody extends TeaModel {
    /**
     * <p>The response status code.</p>
     * 
     * <strong>example:</strong>
     * <p>Ok</p>
     */
    @NameInMap("code")
    public String code;

    /**
     * <p>The response data.</p>
     */
    @NameInMap("data")
    public ListBatchExportTasksResponseBodyData data;

    /**
     * <p>The maximum number of records returned in this request.</p>
     * 
     * <strong>example:</strong>
     * <p>100</p>
     */
    @NameInMap("maxResults")
    public Integer maxResults;

    /**
     * <p>The response message.</p>
     * 
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("message")
    public String message;

    /**
     * <p>The starting token for the next query. This parameter is empty when no more results are available.</p>
     * 
     * <strong>example:</strong>
     * <p>token-xxx</p>
     */
    @NameInMap("nextToken")
    public String nextToken;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>CE534E1D-FCE4-5930-B784-E055EC1AEE6F</p>
     */
    @NameInMap("requestId")
    public String requestId;

    public static ListBatchExportTasksResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListBatchExportTasksResponseBody self = new ListBatchExportTasksResponseBody();
        return TeaModel.build(map, self);
    }

    public ListBatchExportTasksResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListBatchExportTasksResponseBody setData(ListBatchExportTasksResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ListBatchExportTasksResponseBodyData getData() {
        return this.data;
    }

    public ListBatchExportTasksResponseBody setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListBatchExportTasksResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListBatchExportTasksResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListBatchExportTasksResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ListBatchExportTasksResponseBodyDataItems extends TeaModel {
        /**
         * <p>The creation time of the task. Format: yyyy-MM-dd&quot;T&quot;HH:mm:ss&quot;Z&quot;.</p>
         * 
         * <strong>example:</strong>
         * <p>2026-05-26T10:00:00Z</p>
         */
        @NameInMap("createTime")
        public String createTime;

        /**
         * <p>The error message.</p>
         * 
         * <strong>example:</strong>
         * <p>some apis failed</p>
         */
        @NameInMap("errorMessage")
        public String errorMessage;

        /**
         * <p>The instance ID of the gateway associated with the task.</p>
         * 
         * <strong>example:</strong>
         * <p>gw-xxx</p>
         */
        @NameInMap("gatewayId")
        public String gatewayId;

        /**
         * <p>The number of processed items.</p>
         * 
         * <strong>example:</strong>
         * <p>5</p>
         */
        @NameInMap("processedCount")
        public Integer processedCount;

        /**
         * <p>The status of the task. Valid values: Pending, Running, Success, PartialSuccess, and Failed.</p>
         * 
         * <strong>example:</strong>
         * <p>Running</p>
         */
        @NameInMap("status")
        public String status;

        /**
         * <p>The ID of the task.</p>
         * 
         * <strong>example:</strong>
         * <p>task-xxx</p>
         */
        @NameInMap("taskId")
        public String taskId;

        /**
         * <p>The type of the task.</p>
         * 
         * <strong>example:</strong>
         * <p>BatchExport</p>
         */
        @NameInMap("taskType")
        public String taskType;

        /**
         * <p>The total number of tasks.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("totalCount")
        public Integer totalCount;

        public static ListBatchExportTasksResponseBodyDataItems build(java.util.Map<String, ?> map) throws Exception {
            ListBatchExportTasksResponseBodyDataItems self = new ListBatchExportTasksResponseBodyDataItems();
            return TeaModel.build(map, self);
        }

        public ListBatchExportTasksResponseBodyDataItems setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public ListBatchExportTasksResponseBodyDataItems setErrorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }
        public String getErrorMessage() {
            return this.errorMessage;
        }

        public ListBatchExportTasksResponseBodyDataItems setGatewayId(String gatewayId) {
            this.gatewayId = gatewayId;
            return this;
        }
        public String getGatewayId() {
            return this.gatewayId;
        }

        public ListBatchExportTasksResponseBodyDataItems setProcessedCount(Integer processedCount) {
            this.processedCount = processedCount;
            return this;
        }
        public Integer getProcessedCount() {
            return this.processedCount;
        }

        public ListBatchExportTasksResponseBodyDataItems setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public ListBatchExportTasksResponseBodyDataItems setTaskId(String taskId) {
            this.taskId = taskId;
            return this;
        }
        public String getTaskId() {
            return this.taskId;
        }

        public ListBatchExportTasksResponseBodyDataItems setTaskType(String taskType) {
            this.taskType = taskType;
            return this;
        }
        public String getTaskType() {
            return this.taskType;
        }

        public ListBatchExportTasksResponseBodyDataItems setTotalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Integer getTotalCount() {
            return this.totalCount;
        }

    }

    public static class ListBatchExportTasksResponseBodyData extends TeaModel {
        /**
         * <p>The list of tasks. Tasks are returned in descending order of creation time, with the latest tasks first.</p>
         */
        @NameInMap("items")
        public java.util.List<ListBatchExportTasksResponseBodyDataItems> items;

        /**
         * <p>The page number.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("pageNumber")
        public Integer pageNumber;

        /**
         * <p>The page size.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("pageSize")
        public Integer pageSize;

        /**
         * <p>The total number of tasks.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("totalSize")
        public Integer totalSize;

        public static ListBatchExportTasksResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListBatchExportTasksResponseBodyData self = new ListBatchExportTasksResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListBatchExportTasksResponseBodyData setItems(java.util.List<ListBatchExportTasksResponseBodyDataItems> items) {
            this.items = items;
            return this;
        }
        public java.util.List<ListBatchExportTasksResponseBodyDataItems> getItems() {
            return this.items;
        }

        public ListBatchExportTasksResponseBodyData setPageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }
        public Integer getPageNumber() {
            return this.pageNumber;
        }

        public ListBatchExportTasksResponseBodyData setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public ListBatchExportTasksResponseBodyData setTotalSize(Integer totalSize) {
            this.totalSize = totalSize;
            return this;
        }
        public Integer getTotalSize() {
            return this.totalSize;
        }

    }

}
