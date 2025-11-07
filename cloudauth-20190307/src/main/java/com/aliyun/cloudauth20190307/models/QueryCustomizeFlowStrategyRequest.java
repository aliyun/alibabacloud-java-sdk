// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudauth20190307.models;

import com.aliyun.tea.*;

public class QueryCustomizeFlowStrategyRequest extends TeaModel {
    /**
     * <p>Product type, currently only supports <strong>ANT_CLOUD_AUTH</strong> (Financial-grade Real Person), all others have been phased out.</p>
     * 
     * <strong>example:</strong>
     * <p>ANT_CLOUD_AUTH</p>
     */
    @NameInMap("ProductType")
    public String productType;

    /**
     * <p>regionId</p>
     * 
     * <strong>example:</strong>
     * <p>cn-shanghai</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>User ID</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>126005125163xxxx</p>
     */
    @NameInMap("UserId")
    public Long userId;

    public static QueryCustomizeFlowStrategyRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryCustomizeFlowStrategyRequest self = new QueryCustomizeFlowStrategyRequest();
        return TeaModel.build(map, self);
    }

    public QueryCustomizeFlowStrategyRequest setProductType(String productType) {
        this.productType = productType;
        return this;
    }
    public String getProductType() {
        return this.productType;
    }

    public QueryCustomizeFlowStrategyRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public QueryCustomizeFlowStrategyRequest setUserId(Long userId) {
        this.userId = userId;
        return this;
    }
    public Long getUserId() {
        return this.userId;
    }

}
