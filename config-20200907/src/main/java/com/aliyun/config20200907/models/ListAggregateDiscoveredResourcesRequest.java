// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.config20200907.models;

import com.aliyun.tea.*;

public class ListAggregateDiscoveredResourcesRequest extends TeaModel {
    /**
     * <p>The ID of the account group.</p>
     * <p>For more information about how to obtain the ID of an account group, see <a href="https://help.aliyun.com/document_detail/255797.html">ListAggregators</a>.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ca-c560626622af0005****</p>
     */
    @NameInMap("AggregatorId")
    public String aggregatorId;

    /**
     * <p>The end of the time range to query. This is a standard UTC timestamp. The following limits apply:</p>
     * <ul>
     * <li><p>The value must be a timestamp in milliseconds.</p>
     * </li>
     * <li><p>The value cannot be earlier than StartUpdateTimestamp. The interval between StartUpdateTimestamp and EndUpdateTimestamp cannot exceed 30 days.</p>
     * </li>
     * <li><p>You must specify both StartUpdateTimestamp and EndUpdateTimestamp, or leave both empty.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>1724947200000</p>
     */
    @NameInMap("EndUpdateTimestamp")
    public Long endUpdateTimestamp;

    /**
     * <p>The resource types to exclude. Separate multiple resource types with commas (,). This parameter has a higher priority than the ResourceTypes parameter.</p>
     * 
     * <strong>example:</strong>
     * <p>ACS::ECS::Instance,ACS::ECS::NetworkInterface</p>
     */
    @NameInMap("ExcludeResourceTypes")
    public String excludeResourceTypes;

    /**
     * <p>The maximum number of entries to return for a single request. Valid values: 1 to 100.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <p>If the response is truncated, use the <code>NextToken</code> to retrieve the next page of results.</p>
     * 
     * <strong>example:</strong>
     * <p>IWBjqMYSy0is7zSMGu16****</p>
     * 
     * <strong>if can be null:</strong>
     * <p>false</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The ID of the region where the resource resides. Separate multiple region IDs with commas (,).</p>
     * 
     * <strong>example:</strong>
     * <p>cn-huhehaote</p>
     */
    @NameInMap("Regions")
    public String regions;

    /**
     * <p>The ID of the Alibaba Cloud account to which the resources to be queried belong. The account is a member of the account group.</p>
     * 
     * <strong>example:</strong>
     * <p>100931896542****</p>
     */
    @NameInMap("ResourceAccountId")
    public Long resourceAccountId;

    /**
     * <p>The status of the resource. Valid values:</p>
     * <ul>
     * <li><p>0: The resource is deleted. A resource is displayed as Deleted in Cloud Config after it is deleted from the source Alibaba Cloud service.</p>
     * </li>
     * <li><p>1 (Default): The resource is active. A resource is displayed as Active in Cloud Config if it is properly managed.</p>
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
     * <p>launch-advisor-20200330</p>
     */
    @NameInMap("ResourceName")
    public String resourceName;

    @NameInMap("ResourceOwnerId")
    @Deprecated
    public Long resourceOwnerId;

    /**
     * <p>The resource type. Separate multiple resource types with commas (,).</p>
     * 
     * <strong>example:</strong>
     * <p>ACS::ECS::NetworkInterface</p>
     */
    @NameInMap("ResourceTypes")
    public String resourceTypes;

    /**
     * <p>The start of the time range to query. This is a standard UTC timestamp. The following limits apply:</p>
     * <ul>
     * <li><p>The value must be a timestamp in milliseconds.</p>
     * </li>
     * <li><p>The value cannot be later than EndUpdateTimestamp. The interval between StartUpdateTimestamp and EndUpdateTimestamp cannot exceed 30 days.</p>
     * </li>
     * <li><p>You must specify both StartUpdateTimestamp and EndUpdateTimestamp, or leave both empty.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>1722441600000</p>
     */
    @NameInMap("StartUpdateTimestamp")
    public Long startUpdateTimestamp;

    public static ListAggregateDiscoveredResourcesRequest build(java.util.Map<String, ?> map) throws Exception {
        ListAggregateDiscoveredResourcesRequest self = new ListAggregateDiscoveredResourcesRequest();
        return TeaModel.build(map, self);
    }

    public ListAggregateDiscoveredResourcesRequest setAggregatorId(String aggregatorId) {
        this.aggregatorId = aggregatorId;
        return this;
    }
    public String getAggregatorId() {
        return this.aggregatorId;
    }

    public ListAggregateDiscoveredResourcesRequest setEndUpdateTimestamp(Long endUpdateTimestamp) {
        this.endUpdateTimestamp = endUpdateTimestamp;
        return this;
    }
    public Long getEndUpdateTimestamp() {
        return this.endUpdateTimestamp;
    }

    public ListAggregateDiscoveredResourcesRequest setExcludeResourceTypes(String excludeResourceTypes) {
        this.excludeResourceTypes = excludeResourceTypes;
        return this;
    }
    public String getExcludeResourceTypes() {
        return this.excludeResourceTypes;
    }

    public ListAggregateDiscoveredResourcesRequest setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListAggregateDiscoveredResourcesRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListAggregateDiscoveredResourcesRequest setRegions(String regions) {
        this.regions = regions;
        return this;
    }
    public String getRegions() {
        return this.regions;
    }

    public ListAggregateDiscoveredResourcesRequest setResourceAccountId(Long resourceAccountId) {
        this.resourceAccountId = resourceAccountId;
        return this;
    }
    public Long getResourceAccountId() {
        return this.resourceAccountId;
    }

    public ListAggregateDiscoveredResourcesRequest setResourceDeleted(Integer resourceDeleted) {
        this.resourceDeleted = resourceDeleted;
        return this;
    }
    public Integer getResourceDeleted() {
        return this.resourceDeleted;
    }

    public ListAggregateDiscoveredResourcesRequest setResourceId(String resourceId) {
        this.resourceId = resourceId;
        return this;
    }
    public String getResourceId() {
        return this.resourceId;
    }

    public ListAggregateDiscoveredResourcesRequest setResourceName(String resourceName) {
        this.resourceName = resourceName;
        return this;
    }
    public String getResourceName() {
        return this.resourceName;
    }

    @Deprecated
    public ListAggregateDiscoveredResourcesRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public ListAggregateDiscoveredResourcesRequest setResourceTypes(String resourceTypes) {
        this.resourceTypes = resourceTypes;
        return this;
    }
    public String getResourceTypes() {
        return this.resourceTypes;
    }

    public ListAggregateDiscoveredResourcesRequest setStartUpdateTimestamp(Long startUpdateTimestamp) {
        this.startUpdateTimestamp = startUpdateTimestamp;
        return this;
    }
    public Long getStartUpdateTimestamp() {
        return this.startUpdateTimestamp;
    }

}
