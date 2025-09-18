// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emr20210320.models;

import com.aliyun.tea.*;

public class ListComponentInstancesRequest extends TeaModel {
    /**
     * <p>The list of component names.</p>
     * 
     * <strong>example:</strong>
     * <p>c-b933c5aac8fe****</p>
     */
    @NameInMap("ApplicationNames")
    public java.util.List<String> applicationNames;

    /**
     * <p>The cluster ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>C-8CFEBCCFFEF5****</p>
     */
    @NameInMap("ClusterId")
    public String clusterId;

    /**
     * <p>The list of component names.</p>
     * 
     * <strong>example:</strong>
     * <p>[&quot;HDFS&quot;]</p>
     */
    @NameInMap("ComponentNames")
    public java.util.List<String> componentNames;

    /**
     * <p>The list of component status.</p>
     * 
     * <strong>example:</strong>
     * <p>null</p>
     */
    @NameInMap("ComponentStates")
    public java.util.List<String> componentStates;

    /**
     * <p>The maximum number of entries returned.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <p>The pagination token that is used in the next request to retrieve a new page of results. If you leave this parameter empty, the query starts from the beginning.</p>
     * 
     * <strong>example:</strong>
     * <p>“”</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The list of instance IDs.</p>
     * 
     * <strong>example:</strong>
     * <p>DD6B1B2A-5837-5237-ABE4-FF0C89568980</p>
     */
    @NameInMap("NodeIds")
    public java.util.List<String> nodeIds;

    /**
     * <p>The instance IDs.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("NodeNames")
    public java.util.List<String> nodeNames;

    /**
     * <p>The region ID. You can call the <a href="url">ListRegions</a> view.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The zone ID.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou-i</p>
     */
    @NameInMap("ZoneId")
    public String zoneId;

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

    public ListComponentInstancesRequest setZoneId(String zoneId) {
        this.zoneId = zoneId;
        return this;
    }
    public String getZoneId() {
        return this.zoneId;
    }

}
