// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.config20200907.models;

import com.aliyun.tea.*;

public class ListDiscoveredResourcesRequest extends TeaModel {
    /**
     * <p>The end of the time range to query resources, specified as a UNIX timestamp in milliseconds. Note:</p>
     * <ul>
     * <li><p>The value cannot be earlier than StartUpdateTimestamp.</p>
     * </li>
     * <li><p>The time interval between StartUpdateTimestamp and EndUpdateTimestamp cannot exceed 30 days.</p>
     * </li>
     * <li><p>Specify both StartUpdateTimestamp and EndUpdateTimestamp, or leave both blank.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>1724947200000</p>
     */
    @NameInMap("EndUpdateTimestamp")
    public Long endUpdateTimestamp;

    /**
     * <p>The resource types to exclude. Separate multiple resource types with commas (,). This parameter takes precedence over the ResourceTypes parameter.</p>
     * 
     * <strong>example:</strong>
     * <p>ACS::ECS::Instance,ACS::ECS::NetworkInterface</p>
     */
    @NameInMap("ExcludeResourceTypes")
    public String excludeResourceTypes;

    /**
     * <p>The maximum number of entries to return on each page. Valid values: 1 to 100.</p>
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
     * <p>A pagination token. If the response is truncated, use this token in a subsequent request to retrieve the next page of results.</p>
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
     * <li><p>0: The resource is deleted. If you delete a resource in the corresponding Alibaba Cloud service, Cloud Config displays the resource as <strong>Deleted</strong>.</p>
     * </li>
     * <li><p>1 (Default): The resource is active. If a resource is managed, Cloud Config displays the resource as <strong>Active</strong>.</p>
     * </li>
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

    /**
     * <p>The resource name.</p>
     * 
     * <strong>example:</strong>
     * <p>test-resource-name</p>
     */
    @NameInMap("ResourceName")
    public String resourceName;

    /**
     * <p>The resource type. Separate multiple resource types with commas (,).</p>
     * 
     * <strong>example:</strong>
     * <p>ACS::ECS::NetworkInterface</p>
     */
    @NameInMap("ResourceTypes")
    public String resourceTypes;

    /**
     * <p>The start of the time range to query resources, specified as a UNIX timestamp in milliseconds. Note:</p>
     * <ul>
     * <li><p>The value cannot be later than EndUpdateTimestamp.</p>
     * </li>
     * <li><p>The time interval between StartUpdateTimestamp and EndUpdateTimestamp cannot exceed 30 days.</p>
     * </li>
     * <li><p>Specify both StartUpdateTimestamp and EndUpdateTimestamp, or leave both blank.</p>
     * </li>
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
