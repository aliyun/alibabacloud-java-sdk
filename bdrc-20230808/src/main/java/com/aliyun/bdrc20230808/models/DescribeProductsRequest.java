// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bdrc20230808.models;

import com.aliyun.tea.*;

public class DescribeProductsRequest extends TeaModel {
    /**
     * <p>The product type of the resource. If you omit this parameter, the API returns resources of all product types. For example, specify <code>oss</code> to query resources from Object Storage Service.</p>
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
     * <p>A list of resource owner IDs for cross-account resource queries. If you omit this parameter, the API returns resources from the current account.</p>
     * 
     * <strong>example:</strong>
     * <p>[123***7890]</p>
     */
    @NameInMap("ResourceOwnerIds")
    public java.util.List<Long> resourceOwnerIds;

    /**
     * <p>The ID of the resource\&quot;s region. If you omit this parameter, the API returns resources from all regions.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-shanghai</p>
     */
    @NameInMap("ResourceRegionId")
    public String resourceRegionId;

    public static DescribeProductsRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeProductsRequest self = new DescribeProductsRequest();
        return TeaModel.build(map, self);
    }

    public DescribeProductsRequest setProductType(String productType) {
        this.productType = productType;
        return this;
    }
    public String getProductType() {
        return this.productType;
    }

    public DescribeProductsRequest setResourceCategoryId(String resourceCategoryId) {
        this.resourceCategoryId = resourceCategoryId;
        return this;
    }
    public String getResourceCategoryId() {
        return this.resourceCategoryId;
    }

    public DescribeProductsRequest setResourceOwnerIds(java.util.List<Long> resourceOwnerIds) {
        this.resourceOwnerIds = resourceOwnerIds;
        return this;
    }
    public java.util.List<Long> getResourceOwnerIds() {
        return this.resourceOwnerIds;
    }

    public DescribeProductsRequest setResourceRegionId(String resourceRegionId) {
        this.resourceRegionId = resourceRegionId;
        return this;
    }
    public String getResourceRegionId() {
        return this.resourceRegionId;
    }

}
