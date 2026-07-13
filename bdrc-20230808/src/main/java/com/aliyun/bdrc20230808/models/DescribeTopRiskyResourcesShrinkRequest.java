// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bdrc20230808.models;

import com.aliyun.tea.*;

public class DescribeTopRiskyResourcesShrinkRequest extends TeaModel {
    /**
     * <p>The ID of the resource category.</p>
     * 
     * <strong>example:</strong>
     * <p>rc-000***123</p>
     */
    @NameInMap("ResourceCategoryId")
    public String resourceCategoryId;

    @NameInMap("ResourceOwnerIds")
    public String resourceOwnerIdsShrink;

    /**
     * <p>The resource type.</p>
     * 
     * <strong>example:</strong>
     * <p>ACS::ECS::Instance</p>
     */
    @NameInMap("ResourceType")
    public String resourceType;

    public static DescribeTopRiskyResourcesShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeTopRiskyResourcesShrinkRequest self = new DescribeTopRiskyResourcesShrinkRequest();
        return TeaModel.build(map, self);
    }

    public DescribeTopRiskyResourcesShrinkRequest setResourceCategoryId(String resourceCategoryId) {
        this.resourceCategoryId = resourceCategoryId;
        return this;
    }
    public String getResourceCategoryId() {
        return this.resourceCategoryId;
    }

    public DescribeTopRiskyResourcesShrinkRequest setResourceOwnerIdsShrink(String resourceOwnerIdsShrink) {
        this.resourceOwnerIdsShrink = resourceOwnerIdsShrink;
        return this;
    }
    public String getResourceOwnerIdsShrink() {
        return this.resourceOwnerIdsShrink;
    }

    public DescribeTopRiskyResourcesShrinkRequest setResourceType(String resourceType) {
        this.resourceType = resourceType;
        return this;
    }
    public String getResourceType() {
        return this.resourceType;
    }

}
