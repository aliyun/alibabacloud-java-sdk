// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddi20200617.models;

import com.aliyun.tea.*;

public class ListFlowClusterAllRequest extends TeaModel {
    // 产品类型。固定值DATABRICKS_INSIGHT。
    @NameInMap("ProductType")
    public String productType;

    // 地域ID。您可以调用DescribeRegions查看最新的阿里云地域列表。
    @NameInMap("RegionId")
    public String regionId;

    // 资源组ID。您可以调用ListResourceGroups查看资源组ID。
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    public static ListFlowClusterAllRequest build(java.util.Map<String, ?> map) throws Exception {
        ListFlowClusterAllRequest self = new ListFlowClusterAllRequest();
        return TeaModel.build(map, self);
    }

    public ListFlowClusterAllRequest setProductType(String productType) {
        this.productType = productType;
        return this;
    }
    public String getProductType() {
        return this.productType;
    }

    public ListFlowClusterAllRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ListFlowClusterAllRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

}
