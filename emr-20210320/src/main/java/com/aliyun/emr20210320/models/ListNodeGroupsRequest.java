// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emr20210320.models;

import com.aliyun.tea.*;

public class ListNodeGroupsRequest extends TeaModel {
    /**
     * <p>The cluster ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>c-b933c5aac8fe****</p>
     */
    @NameInMap("ClusterId")
    public String clusterId;

    /**
     * <p>The number of maximum number of records to obtain at a time. Valid values: 1 to 100.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <p>Marks the current position where reading starts. If you set this value to null, you can start from the beginning.</p>
     * 
     * <strong>example:</strong>
     * <p>DD6B1B2A-5837-5237-ABE4-FF0C89568980</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The IDs of node groups. Valid values of the number of array elements N: 1 to 100.</p>
     * 
     * <strong>example:</strong>
     * <p>c-b933c5aac8fe****</p>
     */
    @NameInMap("NodeGroupIds")
    public java.util.List<String> nodeGroupIds;

    /**
     * <p>The list of node group names. Valid values of the number of array elements N: 1 to 100.</p>
     * 
     * <strong>example:</strong>
     * <p>DD6B1B2A-5837-5237-ABE4-FF0C89568980</p>
     */
    @NameInMap("NodeGroupNames")
    public java.util.List<String> nodeGroupNames;

    /**
     * <p>The status of the node group. Valid values of the number of array elements N: 1 to 100.</p>
     * 
     * <strong>example:</strong>
     * <p>[&quot;CORE&quot;]</p>
     */
    @NameInMap("NodeGroupStates")
    public java.util.List<String> nodeGroupStates;

    /**
     * <p>The list of node group types. Valid values of the number of array elements N: 1 to 100.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("NodeGroupTypes")
    public java.util.List<String> nodeGroupTypes;

    /**
     * <p>The ID of the region in which you want to create the instance.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    public static ListNodeGroupsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListNodeGroupsRequest self = new ListNodeGroupsRequest();
        return TeaModel.build(map, self);
    }

    public ListNodeGroupsRequest setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

    public ListNodeGroupsRequest setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListNodeGroupsRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListNodeGroupsRequest setNodeGroupIds(java.util.List<String> nodeGroupIds) {
        this.nodeGroupIds = nodeGroupIds;
        return this;
    }
    public java.util.List<String> getNodeGroupIds() {
        return this.nodeGroupIds;
    }

    public ListNodeGroupsRequest setNodeGroupNames(java.util.List<String> nodeGroupNames) {
        this.nodeGroupNames = nodeGroupNames;
        return this;
    }
    public java.util.List<String> getNodeGroupNames() {
        return this.nodeGroupNames;
    }

    public ListNodeGroupsRequest setNodeGroupStates(java.util.List<String> nodeGroupStates) {
        this.nodeGroupStates = nodeGroupStates;
        return this;
    }
    public java.util.List<String> getNodeGroupStates() {
        return this.nodeGroupStates;
    }

    public ListNodeGroupsRequest setNodeGroupTypes(java.util.List<String> nodeGroupTypes) {
        this.nodeGroupTypes = nodeGroupTypes;
        return this;
    }
    public java.util.List<String> getNodeGroupTypes() {
        return this.nodeGroupTypes;
    }

    public ListNodeGroupsRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
