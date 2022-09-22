// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20160314.models;

import com.aliyun.tea.*;

public class DescribeCustomerIssueCategoryRequest extends TeaModel {
    @NameInMap("Layer")
    public Long layer;

    @NameInMap("RegionId")
    public String regionId;

    public static DescribeCustomerIssueCategoryRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeCustomerIssueCategoryRequest self = new DescribeCustomerIssueCategoryRequest();
        return TeaModel.build(map, self);
    }

    public DescribeCustomerIssueCategoryRequest setLayer(Long layer) {
        this.layer = layer;
        return this;
    }
    public Long getLayer() {
        return this.layer;
    }

    public DescribeCustomerIssueCategoryRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
