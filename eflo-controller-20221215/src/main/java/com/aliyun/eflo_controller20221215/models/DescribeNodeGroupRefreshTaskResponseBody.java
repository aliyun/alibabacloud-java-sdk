// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eflo_controller20221215.models;

import com.aliyun.tea.*;

public class DescribeNodeGroupRefreshTaskResponseBody extends TeaModel {
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
     * <p>The maximum number of entries per page.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <p>The token for the next query. An empty value of NextToken indicates that no more results exist.</p>
     * 
     * <strong>example:</strong>
     * <p>7ed93fda-5e7f-436a-ae5a-bd8e6b04e36b</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The ID of the node group.</p>
     * 
     * <strong>example:</strong>
     * <p>ng-3525</p>
     */
    @NameInMap("NodeGroupId")
    public String nodeGroupId;

    /**
     * <p>The ID of the refresh task.</p>
     * 
     * <strong>example:</strong>
     * <p>task-159136551662516768776</p>
     */
    @NameInMap("NodeGroupRefreshTaskId")
    public String nodeGroupRefreshTaskId;

    /**
     * <p>The list of nodes.</p>
     */
    @NameInMap("Nodes")
    public java.util.List<DescribeNodeGroupRefreshTaskResponseBodyNodes> nodes;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>4FD06DF0-9167-5C6F-A145-F30CA4A15D54</p>
     */
    @NameInMap("RequestId")
    public String requestId;

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
     * <li>Pending: the refresh task is created and waiting to be executed.</li>
     * <li>InProgress: the refresh task is being processed.</li>
     * <li>Success: the refresh task is executed.</li>
     * <li>Failed: the refresh task failed to be executed.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>InProgress</p>
     */
    @NameInMap("Status")
    public String status;

    /**
     * <p>The total number of nodes to be refreshed in the task.</p>
     * 
     * <strong>example:</strong>
     * <p>100</p>
     */
    @NameInMap("TotalNodeCount")
    public Long totalNodeCount;

    public static DescribeNodeGroupRefreshTaskResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeNodeGroupRefreshTaskResponseBody self = new DescribeNodeGroupRefreshTaskResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeNodeGroupRefreshTaskResponseBody setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public DescribeNodeGroupRefreshTaskResponseBody setFailedCount(Long failedCount) {
        this.failedCount = failedCount;
        return this;
    }
    public Long getFailedCount() {
        return this.failedCount;
    }

    public DescribeNodeGroupRefreshTaskResponseBody setFinishedCount(Long finishedCount) {
        this.finishedCount = finishedCount;
        return this;
    }
    public Long getFinishedCount() {
        return this.finishedCount;
    }

    public DescribeNodeGroupRefreshTaskResponseBody setMaxDisruptiveAction(String maxDisruptiveAction) {
        this.maxDisruptiveAction = maxDisruptiveAction;
        return this;
    }
    public String getMaxDisruptiveAction() {
        return this.maxDisruptiveAction;
    }

    public DescribeNodeGroupRefreshTaskResponseBody setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public DescribeNodeGroupRefreshTaskResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public DescribeNodeGroupRefreshTaskResponseBody setNodeGroupId(String nodeGroupId) {
        this.nodeGroupId = nodeGroupId;
        return this;
    }
    public String getNodeGroupId() {
        return this.nodeGroupId;
    }

    public DescribeNodeGroupRefreshTaskResponseBody setNodeGroupRefreshTaskId(String nodeGroupRefreshTaskId) {
        this.nodeGroupRefreshTaskId = nodeGroupRefreshTaskId;
        return this;
    }
    public String getNodeGroupRefreshTaskId() {
        return this.nodeGroupRefreshTaskId;
    }

    public DescribeNodeGroupRefreshTaskResponseBody setNodes(java.util.List<DescribeNodeGroupRefreshTaskResponseBodyNodes> nodes) {
        this.nodes = nodes;
        return this;
    }
    public java.util.List<DescribeNodeGroupRefreshTaskResponseBodyNodes> getNodes() {
        return this.nodes;
    }

    public DescribeNodeGroupRefreshTaskResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeNodeGroupRefreshTaskResponseBody setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

    public DescribeNodeGroupRefreshTaskResponseBody setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public DescribeNodeGroupRefreshTaskResponseBody setTotalNodeCount(Long totalNodeCount) {
        this.totalNodeCount = totalNodeCount;
        return this;
    }
    public Long getTotalNodeCount() {
        return this.totalNodeCount;
    }

    public static class DescribeNodeGroupRefreshTaskResponseBodyNodesPropertyDrifts extends TeaModel {
        /**
         * <p>The current value of the node property. Complex types are serialized as JSON strings.</p>
         * 
         * <strong>example:</strong>
         * <p>old-role</p>
         */
        @NameInMap("ActualValue")
        public String actualValue;

        /**
         * <p>The minimum action required to apply the target value: Refresh / Reboot / Reimage. For more information, see the MaxDisruptiveAction parameter description in the RefreshNodeGroupNodes operation.</p>
         * 
         * <strong>example:</strong>
         * <p>Refresh</p>
         */
        @NameInMap("MinRequiredAction")
        public String minRequiredAction;

        /**
         * <p>The property path in dot notation.</p>
         * 
         * <strong>example:</strong>
         * <p>RamRoleName</p>
         */
        @NameInMap("PropertyPath")
        public String propertyPath;

        /**
         * <p>Indicates whether the property was skipped because it exceeded the MaxDisruptiveAction constraint.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("Skipped")
        public Boolean skipped;

        /**
         * <p>The target value of the node property. Complex types are serialized as JSON strings.</p>
         * 
         * <strong>example:</strong>
         * <p>new-role</p>
         */
        @NameInMap("TargetValue")
        public String targetValue;

        public static DescribeNodeGroupRefreshTaskResponseBodyNodesPropertyDrifts build(java.util.Map<String, ?> map) throws Exception {
            DescribeNodeGroupRefreshTaskResponseBodyNodesPropertyDrifts self = new DescribeNodeGroupRefreshTaskResponseBodyNodesPropertyDrifts();
            return TeaModel.build(map, self);
        }

        public DescribeNodeGroupRefreshTaskResponseBodyNodesPropertyDrifts setActualValue(String actualValue) {
            this.actualValue = actualValue;
            return this;
        }
        public String getActualValue() {
            return this.actualValue;
        }

        public DescribeNodeGroupRefreshTaskResponseBodyNodesPropertyDrifts setMinRequiredAction(String minRequiredAction) {
            this.minRequiredAction = minRequiredAction;
            return this;
        }
        public String getMinRequiredAction() {
            return this.minRequiredAction;
        }

        public DescribeNodeGroupRefreshTaskResponseBodyNodesPropertyDrifts setPropertyPath(String propertyPath) {
            this.propertyPath = propertyPath;
            return this;
        }
        public String getPropertyPath() {
            return this.propertyPath;
        }

        public DescribeNodeGroupRefreshTaskResponseBodyNodesPropertyDrifts setSkipped(Boolean skipped) {
            this.skipped = skipped;
            return this;
        }
        public Boolean getSkipped() {
            return this.skipped;
        }

        public DescribeNodeGroupRefreshTaskResponseBodyNodesPropertyDrifts setTargetValue(String targetValue) {
            this.targetValue = targetValue;
            return this;
        }
        public String getTargetValue() {
            return this.targetValue;
        }

    }

    public static class DescribeNodeGroupRefreshTaskResponseBodyNodes extends TeaModel {
        /**
         * <p>The action level actually executed on the node. If multiple properties are refreshed on the node, the highest required action level is used. Valid values:</p>
         * <ul>
         * <li>Refresh: in-place refresh.</li>
         * <li>Reboot: restart.</li>
         * <li>Reimage: reimage.
         * If the entire node is skipped, this value is empty.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Refresh</p>
         */
        @NameInMap("Action")
        public String action;

        /**
         * <p>The error code.</p>
         * 
         * <strong>example:</strong>
         * <p>NodeInMaintenance</p>
         */
        @NameInMap("ErrorCode")
        public String errorCode;

        /**
         * <p>The error message.</p>
         * 
         * <strong>example:</strong>
         * <p>The node has been confirmed for maintenance and there is no need to confirm the maintenance again. sn: 21B917666,status:ClusterNodeRepairing</p>
         */
        @NameInMap("ErrorMessage")
        public String errorMessage;

        /**
         * <p>The ID of the node.</p>
         * 
         * <strong>example:</strong>
         * <p>node-001</p>
         */
        @NameInMap("NodeId")
        public String nodeId;

        /**
         * <p>The property drift list for the node, including both executed and skipped properties.</p>
         */
        @NameInMap("PropertyDrifts")
        public java.util.List<DescribeNodeGroupRefreshTaskResponseBodyNodesPropertyDrifts> propertyDrifts;

        /**
         * <p>The node refresh status. Valid values:</p>
         * <ul>
         * <li>Pending: the node is waiting to be refreshed.</li>
         * <li>InProgress: the node is being refreshed.</li>
         * <li>Success: the node is refreshed.</li>
         * <li>Failed: the node failed to be refreshed.</li>
         * <li>Skipped: all properties to be refreshed on the node exceeded the MaxDisruptiveAction constraint and were skipped.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Success</p>
         */
        @NameInMap("Status")
        public String status;

        public static DescribeNodeGroupRefreshTaskResponseBodyNodes build(java.util.Map<String, ?> map) throws Exception {
            DescribeNodeGroupRefreshTaskResponseBodyNodes self = new DescribeNodeGroupRefreshTaskResponseBodyNodes();
            return TeaModel.build(map, self);
        }

        public DescribeNodeGroupRefreshTaskResponseBodyNodes setAction(String action) {
            this.action = action;
            return this;
        }
        public String getAction() {
            return this.action;
        }

        public DescribeNodeGroupRefreshTaskResponseBodyNodes setErrorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }
        public String getErrorCode() {
            return this.errorCode;
        }

        public DescribeNodeGroupRefreshTaskResponseBodyNodes setErrorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }
        public String getErrorMessage() {
            return this.errorMessage;
        }

        public DescribeNodeGroupRefreshTaskResponseBodyNodes setNodeId(String nodeId) {
            this.nodeId = nodeId;
            return this;
        }
        public String getNodeId() {
            return this.nodeId;
        }

        public DescribeNodeGroupRefreshTaskResponseBodyNodes setPropertyDrifts(java.util.List<DescribeNodeGroupRefreshTaskResponseBodyNodesPropertyDrifts> propertyDrifts) {
            this.propertyDrifts = propertyDrifts;
            return this;
        }
        public java.util.List<DescribeNodeGroupRefreshTaskResponseBodyNodesPropertyDrifts> getPropertyDrifts() {
            return this.propertyDrifts;
        }

        public DescribeNodeGroupRefreshTaskResponseBodyNodes setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

}
