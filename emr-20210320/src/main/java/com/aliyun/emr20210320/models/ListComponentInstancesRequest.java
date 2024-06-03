// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emr20210320.models;

import com.aliyun.tea.*;

public class ListComponentInstancesRequest extends TeaModel {
    /**
     * <p>应用名称列表。</p>
     */
    @NameInMap("ApplicationNames")
    public java.util.List<String> applicationNames;

    /**
     * <p>集群ID。</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("ClusterId")
    public String clusterId;

    /**
     * <p>组件名称列表。</p>
     */
    @NameInMap("ComponentNames")
    public java.util.List<String> componentNames;

    @NameInMap("ComponentStates")
    public java.util.List<String> componentStates;

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
     * <p>节点ID列表。</p>
     */
    @NameInMap("NodeIds")
    public java.util.List<String> nodeIds;

    /**
     * <p>节点名称列表。</p>
     */
    @NameInMap("NodeNames")
    public java.util.List<String> nodeNames;

    /**
     * <p>地域ID。</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    public static ListComponentInstancesRequest build(java.util.Map<String, ?> map) throws Exception {
        ListComponentInstancesRequest self = new ListComponentInstancesRequest();
        return TeaModel.build(map, self);
    }

    public ListComponentInstancesRequest setApplicationNames(java.util.List<String> applicationNames) {
        this.applicationNames = applicationNames;
        return this;
    }
    public java.util.List<String> getApplicationNames() {
        return this.applicationNames;
    }

    public ListComponentInstancesRequest setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

    public ListComponentInstancesRequest setComponentNames(java.util.List<String> componentNames) {
        this.componentNames = componentNames;
        return this;
    }
    public java.util.List<String> getComponentNames() {
        return this.componentNames;
    }

    public ListComponentInstancesRequest setComponentStates(java.util.List<String> componentStates) {
        this.componentStates = componentStates;
        return this;
    }
    public java.util.List<String> getComponentStates() {
        return this.componentStates;
    }

    public ListComponentInstancesRequest setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListComponentInstancesRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListComponentInstancesRequest setNodeIds(java.util.List<String> nodeIds) {
        this.nodeIds = nodeIds;
        return this;
    }
    public java.util.List<String> getNodeIds() {
        return this.nodeIds;
    }

    public ListComponentInstancesRequest setNodeNames(java.util.List<String> nodeNames) {
        this.nodeNames = nodeNames;
        return this;
    }
    public java.util.List<String> getNodeNames() {
        return this.nodeNames;
    }

    public ListComponentInstancesRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
