// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bdrc20230808.models;

import com.aliyun.tea.*;

public class DescribeTopRiskyResourcesRequest extends TeaModel {
    /**
     * <p>The ID of the resource category.</p>
     * 
     * <strong>example:</strong>
     * <p>rc-000***123</p>
     */
    @NameInMap("ResourceCategoryId")
    public String resourceCategoryId;

    @NameInMap("ResourceOwnerIds")
    public java.util.List<Long> resourceOwnerIds;

    /**
     * <p>The resource type.</p>
     * 
     * <strong>example:</strong>
     * <p>ACS::ECS::Instance</p>
     */
    @NameInMap("ResourceType")
    public String resourceType;

    public static DescribeTopRiskyResourcesRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeTopRiskyResourcesRequest self = new DescribeTopRiskyResourcesRequest();
        return TeaModel.build(map, self);
    }

    public DescribeTopRiskyResourcesRequest setResourceCategoryId(String resourceCategoryId) {
        this.resourceCategoryId = resourceCategoryId;
        return this;
    }
    public String getResourceCategoryId() {
        return this.resourceCategoryId;
    }

    public DescribeTopRiskyResourcesRequest setResourceOwnerIds(java.util.List<Long> resourceOwnerIds) {
        this.resourceOwnerIds = resourceOwnerIds;
        return this;
    }
    public java.util.List<Long> getResourceOwnerIds() {
        return this.resourceOwnerIds;
    }

    public DescribeTopRiskyResourcesRequest setResourceType(String resourceType) {
        this.resourceType = resourceType;
        return this;
    }
    public String getResourceType() {
        return this.resourceType;
    }

}
