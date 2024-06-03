// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emr20210320.models;

import com.aliyun.tea.*;

public class ListNodesRequest extends TeaModel {
    /**
     * <p>The ID of the cluster.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("ClusterId")
    public String clusterId;

    /**
     * <p>The number of maximum number of records to obtain at a time. Valid values: 1 to 100.</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <p>Marks the current position where reading starts. If you set this value to null, you can start from the beginning.</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The IDs of node groups.</p>
     */
    @NameInMap("NodeGroupIds")
    public java.util.List<String> nodeGroupIds;

    /**
     * <p>An array that consists of information about the ID of the node.</p>
     */
    @NameInMap("NodeIds")
    public java.util.List<String> nodeIds;

    /**
     * <p>The names of the nodes.</p>
     */
    @NameInMap("NodeNames")
    public java.util.List<String> nodeNames;

    /**
     * <p>The status of the node.</p>
     */
    @NameInMap("NodeStates")
    public java.util.List<String> nodeStates;

    /**
     * <p>The private IP address.</p>
     */
    @NameInMap("PrivateIps")
    public java.util.List<String> privateIps;

    /**
     * <p>The public IP address.</p>
     */
    @NameInMap("PublicIps")
    public java.util.List<String> publicIps;

    /**
     * <p>The ID of the region in which you want to create the instance.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The list of tags to be bound.</p>
     */
    @NameInMap("Tags")
    public java.util.List<Tag> tags;

    public static ListNodesRequest build(java.util.Map<String, ?> map) throws Exception {
        ListNodesRequest self = new ListNodesRequest();
        return TeaModel.build(map, self);
    }

    public ListNodesRequest setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

    public ListNodesRequest setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListNodesRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListNodesRequest setNodeGroupIds(java.util.List<String> nodeGroupIds) {
        this.nodeGroupIds = nodeGroupIds;
        return this;
    }
    public java.util.List<String> getNodeGroupIds() {
        return this.nodeGroupIds;
    }

    public ListNodesRequest setNodeIds(java.util.List<String> nodeIds) {
        this.nodeIds = nodeIds;
        return this;
    }
    public java.util.List<String> getNodeIds() {
        return this.nodeIds;
    }

    public ListNodesRequest setNodeNames(java.util.List<String> nodeNames) {
        this.nodeNames = nodeNames;
        return this;
    }
    public java.util.List<String> getNodeNames() {
        return this.nodeNames;
    }

    public ListNodesRequest setNodeStates(java.util.List<String> nodeStates) {
        this.nodeStates = nodeStates;
        return this;
    }
    public java.util.List<String> getNodeStates() {
        return this.nodeStates;
    }

    public ListNodesRequest setPrivateIps(java.util.List<String> privateIps) {
        this.privateIps = privateIps;
        return this;
    }
    public java.util.List<String> getPrivateIps() {
        return this.privateIps;
    }

    public ListNodesRequest setPublicIps(java.util.List<String> publicIps) {
        this.publicIps = publicIps;
        return this;
    }
    public java.util.List<String> getPublicIps() {
        return this.publicIps;
    }

    public ListNodesRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ListNodesRequest setTags(java.util.List<Tag> tags) {
        this.tags = tags;
        return this;
    }
    public java.util.List<Tag> getTags() {
        return this.tags;
    }

}
