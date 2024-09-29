// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emrstudio20240430.models;

import com.aliyun.tea.*;

public class ListResourceGroupsRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("maxResults")
    public Integer maxResults;

    /**
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("nextToken")
    public String nextToken;

    /**
     * <strong>example:</strong>
     * <p>name</p>
     */
    @NameInMap("resourceGroupName")
    public String resourceGroupName;

    /**
     * <strong>example:</strong>
     * <p>CLUSTER_RESOURCE_GROUP</p>
     */
    @NameInMap("resourceGroupType")
    public String resourceGroupType;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>w-lxyy60mpgpg****</p>
     */
    @NameInMap("workspaceId")
    public String workspaceId;

    public static ListResourceGroupsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListResourceGroupsRequest self = new ListResourceGroupsRequest();
        return TeaModel.build(map, self);
    }

    public ListResourceGroupsRequest setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListResourceGroupsRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListResourceGroupsRequest setResourceGroupName(String resourceGroupName) {
        this.resourceGroupName = resourceGroupName;
        return this;
    }
    public String getResourceGroupName() {
        return this.resourceGroupName;
    }

    public ListResourceGroupsRequest setResourceGroupType(String resourceGroupType) {
        this.resourceGroupType = resourceGroupType;
        return this;
    }
    public String getResourceGroupType() {
        return this.resourceGroupType;
    }

    public ListResourceGroupsRequest setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

}
