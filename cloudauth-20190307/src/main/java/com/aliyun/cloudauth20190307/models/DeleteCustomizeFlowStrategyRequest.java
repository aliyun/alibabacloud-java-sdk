// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudauth20190307.models;

import com.aliyun.tea.*;

public class DeleteCustomizeFlowStrategyRequest extends TeaModel {
    /**
     * <p>API name, same as <strong>ProductCode</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>ID_PRO</p>
     */
    @NameInMap("ApiName")
    public String apiName;

    /**
     * <p>Policy ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>38</p>
     */
    @NameInMap("Id")
    public Long id;

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
