// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.config20200907.models;

import com.aliyun.tea.*;

public class GenerateAggregateResourceInventoryRequest extends TeaModel {
    @NameInMap("Regions")
    public String regions;

    @NameInMap("ResourceTypes")
    public String resourceTypes;

    @NameInMap("AccountIds")
    public String accountIds;

    @NameInMap("AggregatorId")
    public String aggregatorId;

    public static GenerateAggregateResourceInventoryRequest build(java.util.Map<String, ?> map) throws Exception {
        GenerateAggregateResourceInventoryRequest self = new GenerateAggregateResourceInventoryRequest();
        return TeaModel.build(map, self);
    }

    public GenerateAggregateResourceInventoryRequest setRegions(String regions) {
        this.regions = regions;
        return this;
    }
    public String getRegions() {
        return this.regions;
    }

    public GenerateAggregateResourceInventoryRequest setResourceTypes(String resourceTypes) {
        this.resourceTypes = resourceTypes;
        return this;
    }
    public String getResourceTypes() {
        return this.resourceTypes;
    }

    public GenerateAggregateResourceInventoryRequest setAccountIds(String accountIds) {
        this.accountIds = accountIds;
        return this;
    }
    public String getAccountIds() {
        return this.accountIds;
    }

    public GenerateAggregateResourceInventoryRequest setAggregatorId(String aggregatorId) {
        this.aggregatorId = aggregatorId;
        return this;
    }
    public String getAggregatorId() {
        return this.aggregatorId;
    }

}
