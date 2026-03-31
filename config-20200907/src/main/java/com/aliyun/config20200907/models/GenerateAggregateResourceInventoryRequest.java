// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.config20200907.models;

import com.aliyun.tea.*;

public class GenerateAggregateResourceInventoryRequest extends TeaModel {
    /**
     * <p>The IDs of member accounts in the account group. Separate multiple member account IDs with commas (,).</p>
     * 
     * <strong>example:</strong>
     * <p>126672004088****</p>
     */
    @NameInMap("AccountIds")
    public String accountIds;

    /**
     * <p>The ID of the account group.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ca-a91d626622af0035****</p>
     */
    @NameInMap("AggregatorId")
    public String aggregatorId;

    /**
     * <p>The IDs of the regions to which the resources belong. Separate multiple region IDs with commas (,).</p>
     * 
     * <strong>example:</strong>
     * <p>cn-shanghai</p>
     */
    @NameInMap("Regions")
    public String regions;

    /**
     * <p>Indicates whether the resource is deleted. Valid values:</p>
     * <ul>
     * <li>1 (default): The resource is retained.</li>
     * <li>0: The resource is deleted.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("ResourceDeleted")
    public Integer resourceDeleted;

    /**
     * <p>The resource types. Separate multiple resource types with commas (,).</p>
     * 
     * <strong>example:</strong>
     * <p>ACS::ECS::Instance</p>
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

    public GenerateAggregateResourceInventoryRequest setResourceDeleted(Integer resourceDeleted) {
        this.resourceDeleted = resourceDeleted;
        return this;
    }
    public Integer getResourceDeleted() {
        return this.resourceDeleted;
    }

    public GenerateAggregateResourceInventoryRequest setResourceTypes(String resourceTypes) {
        this.resourceTypes = resourceTypes;
        return this;
    }
    public String getResourceTypes() {
        return this.resourceTypes;
    }

}
