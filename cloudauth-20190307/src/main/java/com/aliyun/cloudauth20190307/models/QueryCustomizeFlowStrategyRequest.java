// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudauth20190307.models;

import com.aliyun.tea.*;

public class QueryCustomizeFlowStrategyRequest extends TeaModel {
    /**
     * <p>The product type. Currently, only <strong>ANT_CLOUD_AUTH</strong> (financial-grade ID Verification) is supported. All other types have been discontinued.</p>
     * 
     * <strong>example:</strong>
     * <p>ANT_CLOUD_AUTH</p>
     */
    @NameInMap("ProductType")
    public String productType;

    /**
     * <p>The region ID.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-shanghai</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The user ID.</p>
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
