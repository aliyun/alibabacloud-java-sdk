// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eflo_controller20221215.models;

import com.aliyun.tea.*;

public class ListNodeGroupRefreshTasksShrinkRequest extends TeaModel {
    /**
     * <p>The cluster ID.</p>
     * 
     * <strong>example:</strong>
     * <p>i118191731740041623425</p>
     */
    @NameInMap("ClusterId")
    public String clusterId;

    /**
     * <p>The maximum number of entries per page for a paging query. Valid values: 1 to 500. Default value: 100.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <p>The pagination token. Set this parameter to the NextToken value returned in the previous call. You do not need to set this parameter for the first request.</p>
     * 
     * <strong>example:</strong>
     * <p>563d42ae0b17572449ec8c97f7f66069</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The node group ID.</p>
     * 
     * <strong>example:</strong>
     * <p>ng-3525</p>
     */
    @NameInMap("NodeGroupId")
    public String nodeGroupId;

    /**
     * <p>The list of task statuses. Valid values:</p>
     * <ul>
     * <li>Pending: The refresh task is created and waiting to be executed.</li>
     * <li>InProgress: The refresh task is being processed.</li>
     * <li>Success: The refresh task is executed.</li>
     * <li>Failed: The refresh task failed.</li>
     * </ul>
     */
    @NameInMap("Statuses")
    public String statusesShrink;

    public static ListNodeGroupRefreshTasksShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        ListNodeGroupRefreshTasksShrinkRequest self = new ListNodeGroupRefreshTasksShrinkRequest();
        return TeaModel.build(map, self);
    }

    public ListNodeGroupRefreshTasksShrinkRequest setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

    public ListNodeGroupRefreshTasksShrinkRequest setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListNodeGroupRefreshTasksShrinkRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListNodeGroupRefreshTasksShrinkRequest setNodeGroupId(String nodeGroupId) {
        this.nodeGroupId = nodeGroupId;
        return this;
    }
    public String getNodeGroupId() {
        return this.nodeGroupId;
    }

    public ListNodeGroupRefreshTasksShrinkRequest setStatusesShrink(String statusesShrink) {
        this.statusesShrink = statusesShrink;
        return this;
    }
    public String getStatusesShrink() {
        return this.statusesShrink;
    }

}
