// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.config20190108.models;

import com.aliyun.tea.*;

public class ListAggregateDiscoveredResourcesRequest extends TeaModel {
    @NameInMap("ResourceId")
    public String resourceId;

    @NameInMap("ResourceDeleted")
    public Integer resourceDeleted;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("ResourceTypes")
    public String resourceTypes;

    @NameInMap("Regions")
    public String regions;

    @NameInMap("ComplianceType")
    public String complianceType;

    @NameInMap("AggregatorId")
    public String aggregatorId;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    public static ListAggregateDiscoveredResourcesRequest build(java.util.Map<String, ?> map) throws Exception {
        ListAggregateDiscoveredResourcesRequest self = new ListAggregateDiscoveredResourcesRequest();
        return TeaModel.build(map, self);
    }

    public ListAggregateDiscoveredResourcesRequest setResourceId(String resourceId) {
        this.resourceId = resourceId;
        return this;
    }
    public String getResourceId() {
        return this.resourceId;
    }

    public ListAggregateDiscoveredResourcesRequest setResourceDeleted(Integer resourceDeleted) {
        this.resourceDeleted = resourceDeleted;
        return this;
    }
    public Integer getResourceDeleted() {
        return this.resourceDeleted;
    }

    public ListAggregateDiscoveredResourcesRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListAggregateDiscoveredResourcesRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListAggregateDiscoveredResourcesRequest setResourceTypes(String resourceTypes) {
        this.resourceTypes = resourceTypes;
        return this;
    }
    public String getResourceTypes() {
        return this.resourceTypes;
    }

    public ListAggregateDiscoveredResourcesRequest setRegions(String regions) {
        this.regions = regions;
        return this;
    }
    public String getRegions() {
        return this.regions;
    }

    public ListAggregateDiscoveredResourcesRequest setComplianceType(String complianceType) {
        this.complianceType = complianceType;
        return this;
    }
    public String getComplianceType() {
        return this.complianceType;
    }

    public ListAggregateDiscoveredResourcesRequest setAggregatorId(String aggregatorId) {
        this.aggregatorId = aggregatorId;
        return this;
    }
    public String getAggregatorId() {
        return this.aggregatorId;
    }

    public ListAggregateDiscoveredResourcesRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

}
