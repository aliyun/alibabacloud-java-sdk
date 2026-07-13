// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bdrc20230808.models;

import com.aliyun.tea.*;

public class DescribeProductDataRedundancyTypeStatRequest extends TeaModel {
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
    public java.util.List<Long> resourceOwnerIds;

    public static DescribeProductDataRedundancyTypeStatRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeProductDataRedundancyTypeStatRequest self = new DescribeProductDataRedundancyTypeStatRequest();
        return TeaModel.build(map, self);
    }

    public DescribeProductDataRedundancyTypeStatRequest setProductType(String productType) {
        this.productType = productType;
        return this;
    }
    public String getProductType() {
        return this.productType;
    }

    public DescribeProductDataRedundancyTypeStatRequest setResourceCategoryId(String resourceCategoryId) {
        this.resourceCategoryId = resourceCategoryId;
        return this;
    }
    public String getResourceCategoryId() {
        return this.resourceCategoryId;
    }

    public DescribeProductDataRedundancyTypeStatRequest setResourceOwnerIds(java.util.List<Long> resourceOwnerIds) {
        this.resourceOwnerIds = resourceOwnerIds;
        return this;
    }
    public java.util.List<Long> getResourceOwnerIds() {
        return this.resourceOwnerIds;
    }

}
