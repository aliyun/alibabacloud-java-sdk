// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudauth20190307.models;

import com.aliyun.tea.*;

public class QueryControlStrategyRequest extends TeaModel {
    /**
     * <p>Product type, currently only supports ANT_CLOUD_AUTH (financial-grade real person), all others have been phased out.</p>
     * 
     * <strong>example:</strong>
     * <p>ANT_CLOUD_AUTH</p>
     */
    @NameInMap("ProductType")
    public String productType;

    /**
     * <p>Region ID</p>
     * 
     * <strong>example:</strong>
     * <p>cn-shanghai</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    public static QueryControlStrategyRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryControlStrategyRequest self = new QueryControlStrategyRequest();
        return TeaModel.build(map, self);
    }

    public QueryControlStrategyRequest setProductType(String productType) {
        this.productType = productType;
        return this;
    }
    public String getProductType() {
        return this.productType;
    }

    public QueryControlStrategyRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
