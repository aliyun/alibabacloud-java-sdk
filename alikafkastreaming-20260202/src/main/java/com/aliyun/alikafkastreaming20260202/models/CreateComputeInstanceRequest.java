// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alikafkastreaming20260202.models;

import com.aliyun.tea.*;

public class CreateComputeInstanceRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("PaidType")
    public Long paidType;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    @NameInMap("ResourceType")
    public String resourceType;

    public static CreateComputeInstanceRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateComputeInstanceRequest self = new CreateComputeInstanceRequest();
        return TeaModel.build(map, self);
    }

    public CreateComputeInstanceRequest setPaidType(Long paidType) {
        this.paidType = paidType;
        return this;
    }
    public Long getPaidType() {
        return this.paidType;
    }

    public CreateComputeInstanceRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public CreateComputeInstanceRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public CreateComputeInstanceRequest setResourceType(String resourceType) {
        this.resourceType = resourceType;
        return this;
    }
    public String getResourceType() {
        return this.resourceType;
    }

}
