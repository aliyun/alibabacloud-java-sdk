// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.apig20240327.models;

import com.aliyun.tea.*;

public class ListBatchExportTasksResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>Ok</p>
     */
    @NameInMap("code")
    public String code;

    @NameInMap("data")
    public ListBatchExportTasksResponseBodyData data;

    /**
     * <strong>example:</strong>
     * <p>100</p>
     */
    @NameInMap("maxResults")
    public Integer maxResults;

    /**
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("message")
    public String message;

    /**
     * <strong>example:</strong>
     * <p>token-xxx</p>
     */
    @NameInMap("nextToken")
    public String nextToken;

    /**
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
         * <strong>example:</strong>
         * <p>2026-05-26T10:00:00Z</p>
         */
        @NameInMap("createTime")
        public String createTime;

        /**
         * <strong>example:</strong>
         * <p>some apis failed</p>
         */
        @NameInMap("errorMessage")
        public String errorMessage;

        /**
         * <strong>example:</strong>
         * <p>gw-xxx</p>
         */
        @NameInMap("gatewayId")
        public String gatewayId;

        /**
         * <strong>example:</strong>
         * <p>5</p>
         */
        @NameInMap("processedCount")
        public Integer processedCount;

        /**
         * <strong>example:</strong>
         * <p>Running</p>
         */
        @NameInMap("status")
        public String status;

        /**
         * <strong>example:</strong>
         * <p>task-xxx</p>
         */
        @NameInMap("taskId")
        public String taskId;

        /**
         * <strong>example:</strong>
         * <p>BatchExport</p>
         */
        @NameInMap("taskType")
        public String taskType;

        /**
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
        @NameInMap("items")
        public java.util.List<ListBatchExportTasksResponseBodyDataItems> items;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("pageNumber")
        public Integer pageNumber;

        /**
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("pageSize")
        public Integer pageSize;

        /**
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
