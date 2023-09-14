// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emr20210320.models;

import com.aliyun.tea.*;

public class ListNodeGroupsRequest extends TeaModel {
    /**
     * <p>集群ID。</p>
     */
    @NameInMap("ClusterId")
    public String clusterId;

    /**
     * <p>一次获取的最大记录数。取值范围：1~100。</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <p>标记当前开始读取的位置，置空表示从头开始。</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>节点组ID列表。</p>
     */
    @NameInMap("NodeGroupIds")
    public java.util.List<String> nodeGroupIds;

    /**
     * <p>节点组名称列表。</p>
     */
    @NameInMap("NodeGroupNames")
    public java.util.List<String> nodeGroupNames;

    /**
     * <p>节点组状态。</p>
     */
    @NameInMap("NodeGroupStates")
    public java.util.List<String> nodeGroupStates;

    /**
     * <p>节点组类型列表。</p>
     */
    @NameInMap("NodeGroupTypes")
    public java.util.List<String> nodeGroupTypes;

    /**
     * <p>区域ID。</p>
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
