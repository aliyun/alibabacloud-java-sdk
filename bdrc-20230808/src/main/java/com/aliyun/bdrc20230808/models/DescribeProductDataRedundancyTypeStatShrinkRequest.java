// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bdrc20230808.models;

import com.aliyun.tea.*;

public class DescribeProductDataRedundancyTypeStatShrinkRequest extends TeaModel {
    /**
     * <p>The type of the cloud service.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>oss</p>
     */
    @NameInMap("ProductType")
    public String productType;

    /**
     * <p>The resource category ID.</p>
     * 
     * <strong>example:</strong>
     * <p>rc-000***123</p>
     */
    @NameInMap("ResourceCategoryId")
    public String resourceCategoryId;

    @NameInMap("ResourceOwnerIds")
    public String resourceOwnerIdsShrink;

    public static DescribeProductDataRedundancyTypeStatShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeProductDataRedundancyTypeStatShrinkRequest self = new DescribeProductDataRedundancyTypeStatShrinkRequest();
        return TeaModel.build(map, self);
    }

    public DescribeProductDataRedundancyTypeStatShrinkRequest setProductType(String productType) {
        this.productType = productType;
        return this;
    }
    public String getProductType() {
        return this.productType;
    }

    public DescribeProductDataRedundancyTypeStatShrinkRequest setResourceCategoryId(String resourceCategoryId) {
        this.resourceCategoryId = resourceCategoryId;
        return this;
    }
    public String getResourceCategoryId() {
        return this.resourceCategoryId;
    }

    public DescribeProductDataRedundancyTypeStatShrinkRequest setResourceOwnerIdsShrink(String resourceOwnerIdsShrink) {
        this.resourceOwnerIdsShrink = resourceOwnerIdsShrink;
        return this;
    }
    public String getResourceOwnerIdsShrink() {
        return this.resourceOwnerIdsShrink;
    }

}
