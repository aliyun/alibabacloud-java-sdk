// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eflo_controller20221215.models;

import com.aliyun.tea.*;

public class ListNodeGroupRefreshTasksResponseBody extends TeaModel {
    /**
     * <p>The maximum number of entries per page.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <p>The pagination token for the next query. An empty value indicates that no more results exist.</p>
     * 
     * <strong>example:</strong>
     * <p>563d42ae0b17572449ec8c97f7f66069</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The list of node group refresh tasks.</p>
     */
    @NameInMap("NodeGroupRefreshTasks")
    public java.util.List<ListNodeGroupRefreshTasksResponseBodyNodeGroupRefreshTasks> nodeGroupRefreshTasks;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>03668372-18FF-5959-98D9-6B36A4643C7A</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ListNodeGroupRefreshTasksResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListNodeGroupRefreshTasksResponseBody self = new ListNodeGroupRefreshTasksResponseBody();
        return TeaModel.build(map, self);
    }

    public ListNodeGroupRefreshTasksResponseBody setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListNodeGroupRefreshTasksResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListNodeGroupRefreshTasksResponseBody setNodeGroupRefreshTasks(java.util.List<ListNodeGroupRefreshTasksResponseBodyNodeGroupRefreshTasks> nodeGroupRefreshTasks) {
        this.nodeGroupRefreshTasks = nodeGroupRefreshTasks;
        return this;
    }
    public java.util.List<ListNodeGroupRefreshTasksResponseBodyNodeGroupRefreshTasks> getNodeGroupRefreshTasks() {
        return this.nodeGroupRefreshTasks;
    }

    public ListNodeGroupRefreshTasksResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ListNodeGroupRefreshTasksResponseBodyNodeGroupRefreshTasks extends TeaModel {
        /**
         * <p>The end time of the refresh task in ISO 8601 format.</p>
         * 
         * <strong>example:</strong>
         * <p>2026-04-20T10:30:00Z</p>
         */
        @NameInMap("EndTime")
        public String endTime;

        /**
         * <p>The number of failed nodes.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("FailedCount")
        public Long failedCount;

        /**
         * <p>The number of finished nodes, including succeeded, failed, and skipped nodes.</p>
         * 
         * <strong>example:</strong>
         * <p>45</p>
         */
        @NameInMap("FinishedCount")
        public Long finishedCount;

        /**
         * <p>The maximum disruptive action level allowed for the refresh operation.</p>
         * 
         * <strong>example:</strong>
         * <p>Refresh</p>
         */
        @NameInMap("MaxDisruptiveAction")
        public String maxDisruptiveAction;

        /**
         * <p>The node group ID.</p>
         * 
         * <strong>example:</strong>
         * <p>ng-3525</p>
         */
        @NameInMap("NodeGroupId")
        public String nodeGroupId;

        /**
         * <p>The task ID.</p>
         * 
         * <strong>example:</strong>
         * <p>task-159136551662516768776</p>
         */
        @NameInMap("NodeGroupRefreshTaskId")
        public String nodeGroupRefreshTaskId;

        /**
         * <p>The start time of the refresh task in ISO 8601 format.</p>
         * 
         * <strong>example:</strong>
         * <p>2026-04-20T10:00:00Z</p>
         */
        @NameInMap("StartTime")
        public String startTime;

        /**
         * <p>The task status. Valid values:</p>
         * <ul>
         * <li>Pending: The refresh task is created and waiting to be executed.</li>
         * <li>InProgress: The refresh task is being processed.</li>
         * <li>Success: The refresh task is executed.</li>
         * <li>Failed: The refresh task failed.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>InProgress</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>The total number of nodes to refresh in this task.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("TotalNodeCount")
        public Long totalNodeCount;

        public static ListNodeGroupRefreshTasksResponseBodyNodeGroupRefreshTasks build(java.util.Map<String, ?> map) throws Exception {
            ListNodeGroupRefreshTasksResponseBodyNodeGroupRefreshTasks self = new ListNodeGroupRefreshTasksResponseBodyNodeGroupRefreshTasks();
            return TeaModel.build(map, self);
        }

        public ListNodeGroupRefreshTasksResponseBodyNodeGroupRefreshTasks setEndTime(String endTime) {
            this.endTime = endTime;
            return this;
        }
        public String getEndTime() {
            return this.endTime;
        }

        public ListNodeGroupRefreshTasksResponseBodyNodeGroupRefreshTasks setFailedCount(Long failedCount) {
            this.failedCount = failedCount;
            return this;
        }
        public Long getFailedCount() {
            return this.failedCount;
        }

        public ListNodeGroupRefreshTasksResponseBodyNodeGroupRefreshTasks setFinishedCount(Long finishedCount) {
            this.finishedCount = finishedCount;
            return this;
        }
        public Long getFinishedCount() {
            return this.finishedCount;
        }

        public ListNodeGroupRefreshTasksResponseBodyNodeGroupRefreshTasks setMaxDisruptiveAction(String maxDisruptiveAction) {
            this.maxDisruptiveAction = maxDisruptiveAction;
            return this;
        }
        public String getMaxDisruptiveAction() {
            return this.maxDisruptiveAction;
        }

        public ListNodeGroupRefreshTasksResponseBodyNodeGroupRefreshTasks setNodeGroupId(String nodeGroupId) {
            this.nodeGroupId = nodeGroupId;
            return this;
        }
        public String getNodeGroupId() {
            return this.nodeGroupId;
        }

        public ListNodeGroupRefreshTasksResponseBodyNodeGroupRefreshTasks setNodeGroupRefreshTaskId(String nodeGroupRefreshTaskId) {
            this.nodeGroupRefreshTaskId = nodeGroupRefreshTaskId;
            return this;
        }
        public String getNodeGroupRefreshTaskId() {
            return this.nodeGroupRefreshTaskId;
        }

        public ListNodeGroupRefreshTasksResponseBodyNodeGroupRefreshTasks setStartTime(String startTime) {
            this.startTime = startTime;
            return this;
        }
        public String getStartTime() {
            return this.startTime;
        }

        public ListNodeGroupRefreshTasksResponseBodyNodeGroupRefreshTasks setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public ListNodeGroupRefreshTasksResponseBodyNodeGroupRefreshTasks setTotalNodeCount(Long totalNodeCount) {
            this.totalNodeCount = totalNodeCount;
            return this;
        }
        public Long getTotalNodeCount() {
            return this.totalNodeCount;
        }

    }

}
