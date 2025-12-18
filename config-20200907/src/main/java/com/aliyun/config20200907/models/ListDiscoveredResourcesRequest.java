// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.config20200907.models;

import com.aliyun.tea.*;

public class ListDiscoveredResourcesRequest extends TeaModel {
    /**
     * <p>The end time of the time range for querying resources. The value is a timestamp in the UTC format. When you specify this parameter, take note of the following limits:</p>
     * <ul>
     * <li>The value must be a timestamp in milliseconds.</li>
     * <li>The value cannot be less than the value of the StartUpdateTimestamp parameter. The interval between the value and the value of the StartUpdateTimestamp parameter must be less than or equal to 30 days.</li>
     * <li>The StartUpdateTimestamp and EndUpdateTimestamp parameters must be specified at the same time or left empty at the same time.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>1724947200000</p>
     */
    @NameInMap("EndUpdateTimestamp")
    public Long endUpdateTimestamp;

    /**
     * <p>The types of resources that are excluded. Separate multiple values with commas (,). If this parameter conflicts with the ResourceTypes parameter, this parameter prevails.</p>
     * 
     * <strong>example:</strong>
     * <p>ACS::ECS::Instance,ACS::ECS::NetworkInterface</p>
     */
    @NameInMap("ExcludeResourceTypes")
    public String excludeResourceTypes;

    /**
     * <p>The maximum number of entries returned for a single request. Valid values: 1 to 100.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     * 
     * <strong>if can be null:</strong>
     * <p>true</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <p>The <code>token</code> that you want to use to initiate the current request. If the response of the previous request is truncated, you can use this token to initiate another request and obtain the remaining entries.</p>
     * 
     * <strong>example:</strong>
     * <p>IWBjqMYSy0is7zSMGu16****</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The ID of the region where the resource resides. Separate multiple region IDs with commas (,).</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("Regions")
    public String regions;

    /**
     * <p>The status of the resource. Valid values:</p>
     * <ul>
     * <li>0: The resource is deleted. If a resource is deleted from the desired cloud service, <strong>Deleted</strong> is displayed in the resource list in the Cloud Config console.</li>
     * <li>1 (default): The resource is retained. If a resource is managed as expected, <strong>Active</strong> is displayed in the resource list in the Cloud Config console.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("ResourceDeleted")
    public Integer resourceDeleted;

    /**
     * <p>The resource ID.</p>
     * 
     * <strong>example:</strong>
     * <p>eni-hp31cqoba96jagtz****</p>
     */
    @NameInMap("ResourceId")
    public String resourceId;

    @NameInMap("ResourceName")
    public String resourceName;

    /**
     * <p>The type of the resource. Separate multiple resource types with commas (,).</p>
     * 
     * <strong>example:</strong>
     * <p>ACS::ECS::NetworkInterface</p>
     */
    @NameInMap("ResourceTypes")
    public String resourceTypes;

    /**
     * <p>The start time of the time range for querying resources. The value is a timestamp in the UTC format. When you specify this parameter, take note of the following limits:</p>
     * <ul>
     * <li>The value must be a timestamp in milliseconds.</li>
     * <li>The value cannot be greater than the value of the EndUpdateTimestamp parameter. The interval between the value and the value of the EndUpdateTimestamp parameter must be less than or equal to 30 days.</li>
     * <li>The StartUpdateTimestamp and EndUpdateTimestamp parameters must be specified at the same time or left blank at the same time.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>1722441600000</p>
     */
    @NameInMap("StartUpdateTimestamp")
    public Long startUpdateTimestamp;

    public static ListDiscoveredResourcesRequest build(java.util.Map<String, ?> map) throws Exception {
        ListDiscoveredResourcesRequest self = new ListDiscoveredResourcesRequest();
        return TeaModel.build(map, self);
    }

    public ListDiscoveredResourcesRequest setEndUpdateTimestamp(Long endUpdateTimestamp) {
        this.endUpdateTimestamp = endUpdateTimestamp;
        return this;
    }
    public Long getEndUpdateTimestamp() {
        return this.endUpdateTimestamp;
    }

    public ListDiscoveredResourcesRequest setExcludeResourceTypes(String excludeResourceTypes) {
        this.excludeResourceTypes = excludeResourceTypes;
        return this;
    }
    public String getExcludeResourceTypes() {
        return this.excludeResourceTypes;
    }

    public ListDiscoveredResourcesRequest setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListDiscoveredResourcesRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListDiscoveredResourcesRequest setRegions(String regions) {
        this.regions = regions;
        return this;
    }
    public String getRegions() {
        return this.regions;
    }

    public ListDiscoveredResourcesRequest setResourceDeleted(Integer resourceDeleted) {
        this.resourceDeleted = resourceDeleted;
        return this;
    }
    public Integer getResourceDeleted() {
        return this.resourceDeleted;
    }

    public ListDiscoveredResourcesRequest setResourceId(String resourceId) {
        this.resourceId = resourceId;
        return this;
    }
    public String getResourceId() {
        return this.resourceId;
    }

    public ListDiscoveredResourcesRequest setResourceName(String resourceName) {
        this.resourceName = resourceName;
        return this;
    }
    public String getResourceName() {
        return this.resourceName;
    }

    public ListDiscoveredResourcesRequest setResourceTypes(String resourceTypes) {
        this.resourceTypes = resourceTypes;
        return this;
    }
    public String getResourceTypes() {
        return this.resourceTypes;
    }

    public ListDiscoveredResourcesRequest setStartUpdateTimestamp(Long startUpdateTimestamp) {
        this.startUpdateTimestamp = startUpdateTimestamp;
        return this;
    }
    public Long getStartUpdateTimestamp() {
        return this.startUpdateTimestamp;
    }

}
