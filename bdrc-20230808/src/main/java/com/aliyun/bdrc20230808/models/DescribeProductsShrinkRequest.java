// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bdrc20230808.models;

import com.aliyun.tea.*;

public class DescribeProductsShrinkRequest extends TeaModel {
    /**
     * <p>Filters by the product type of the resource. If this parameter is not specified, all types are queried.</p>
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

    /**
     * <p>The list of resource owner IDs. This parameter is used in cross-account scenarios. If this parameter is left empty, data of the current account is returned by default.</p>
     * 
     * <strong>example:</strong>
     * <p>[123***7890]</p>
     */
    @NameInMap("ResourceOwnerIds")
    public String resourceOwnerIdsShrink;

    /**
     * <p>Filters by the region where the resource resides. If this parameter is not specified, all regions are queried.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-shanghai</p>
     */
    @NameInMap("ResourceRegionId")
    public String resourceRegionId;

    public static DescribeProductsShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeProductsShrinkRequest self = new DescribeProductsShrinkRequest();
        return TeaModel.build(map, self);
    }

    public DescribeProductsShrinkRequest setProductType(String productType) {
        this.productType = productType;
        return this;
    }
    public String getProductType() {
        return this.productType;
    }

    public DescribeProductsShrinkRequest setResourceCategoryId(String resourceCategoryId) {
        this.resourceCategoryId = resourceCategoryId;
        return this;
    }
    public String getResourceCategoryId() {
        return this.resourceCategoryId;
    }

    public DescribeProductsShrinkRequest setResourceOwnerIdsShrink(String resourceOwnerIdsShrink) {
        this.resourceOwnerIdsShrink = resourceOwnerIdsShrink;
        return this;
    }
    public String getResourceOwnerIdsShrink() {
        return this.resourceOwnerIdsShrink;
    }

    public DescribeProductsShrinkRequest setResourceRegionId(String resourceRegionId) {
        this.resourceRegionId = resourceRegionId;
        return this;
    }
    public String getResourceRegionId() {
        return this.resourceRegionId;
    }

}
