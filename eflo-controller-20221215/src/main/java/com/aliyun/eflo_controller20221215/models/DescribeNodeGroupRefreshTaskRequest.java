// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eflo_controller20221215.models;

import com.aliyun.tea.*;

public class DescribeNodeGroupRefreshTaskRequest extends TeaModel {
    /**
     * <p>The maximum number of entries per page for a paged query. Valid values: 1 to 500. Default value: 100. For more information about paging, set this parameter together with NextToken.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <p>The pagination token. Set this parameter to the NextToken value returned in the previous call. You do not need to set this parameter for the first request. This parameter is used to paginate through the node list in the current refresh task.</p>
     * 
     * <strong>example:</strong>
     * <p>563d42ae0b17572449ec8c97f7f66069</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The ID of the refresh task.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>task-159136551662516768776</p>
     */
    @NameInMap("NodeGroupRefreshTaskId")
    public String nodeGroupRefreshTaskId;

    /**
     * <p>The node refresh statuses to filter by. Valid values:</p>
     * <ul>
     * <li>Pending: the node is waiting to be refreshed.</li>
     * <li>InProgress: the node is being refreshed.</li>
     * <li>Success: the node is refreshed.</li>
     * <li>Failed: the node failed to be refreshed.</li>
     * <li>Skipped: all properties to be refreshed on the node exceeded the MaxDisruptiveAction constraint and were skipped.</li>
     * </ul>
     */
    @NameInMap("NodeStatuses")
    public java.util.List<String> nodeStatuses;

    public static DescribeNodeGroupRefreshTaskRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeNodeGroupRefreshTaskRequest self = new DescribeNodeGroupRefreshTaskRequest();
        return TeaModel.build(map, self);
    }

    public DescribeNodeGroupRefreshTaskRequest setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public DescribeNodeGroupRefreshTaskRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public DescribeNodeGroupRefreshTaskRequest setNodeGroupRefreshTaskId(String nodeGroupRefreshTaskId) {
        this.nodeGroupRefreshTaskId = nodeGroupRefreshTaskId;
        return this;
    }
    public String getNodeGroupRefreshTaskId() {
        return this.nodeGroupRefreshTaskId;
    }

    public DescribeNodeGroupRefreshTaskRequest setNodeStatuses(java.util.List<String> nodeStatuses) {
        this.nodeStatuses = nodeStatuses;
        return this;
    }
    public java.util.List<String> getNodeStatuses() {
        return this.nodeStatuses;
    }

}
