// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.config20200907.models;

import com.aliyun.tea.*;

public class GenerateAggregateResourceInventoryRequest extends TeaModel {
    /**
     * <p>The IDs of member accounts in the account group. Separate multiple member account IDs with commas (,).</p>
     */
    @NameInMap("AccountIds")
    public String accountIds;

    /**
     * <p>The ID of the account group.</p>
     */
    @NameInMap("AggregatorId")
    public String aggregatorId;

    /**
     * <p>The IDs of the regions to which the resources belong. Separate multiple region IDs with commas (,).</p>
     */
    @NameInMap("Regions")
    public String regions;

    /**
     * <p>The resource types. Separate multiple resource types with commas (,).</p>
     */
    @NameInMap("ResourceTypes")
    public String resourceTypes;

    public static GenerateAggregateResourceInventoryRequest build(java.util.Map<String, ?> map) throws Exception {
        GenerateAggregateResourceInventoryRequest self = new GenerateAggregateResourceInventoryRequest();
        return TeaModel.build(map, self);
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

}
