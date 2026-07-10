// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudauth20190307.models;

import com.aliyun.tea.*;

public class DeleteCustomizeFlowStrategyRequest extends TeaModel {
    /**
     * <p>The API name, same as <strong>ProductCode</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>ID_PRO</p>
     */
    @NameInMap("ApiName")
    public String apiName;

    /**
     * <p>The policy ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>38</p>
     */
    @NameInMap("Id")
    public Long id;

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
     * 
     * <strong>example:</strong>
     * <p>126005125163xxxx</p>
     */
    @NameInMap("UserId")
    public Long userId;

    public static DeleteCustomizeFlowStrategyRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteCustomizeFlowStrategyRequest self = new DeleteCustomizeFlowStrategyRequest();
        return TeaModel.build(map, self);
    }

    public DeleteCustomizeFlowStrategyRequest setApiName(String apiName) {
        this.apiName = apiName;
        return this;
    }
    public String getApiName() {
        return this.apiName;
    }

    public DeleteCustomizeFlowStrategyRequest setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

    public DeleteCustomizeFlowStrategyRequest setProductType(String productType) {
        this.productType = productType;
        return this;
    }
    public String getProductType() {
        return this.productType;
    }

    public DeleteCustomizeFlowStrategyRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DeleteCustomizeFlowStrategyRequest setUserId(Long userId) {
        this.userId = userId;
        return this;
    }
    public Long getUserId() {
        return this.userId;
    }

}
