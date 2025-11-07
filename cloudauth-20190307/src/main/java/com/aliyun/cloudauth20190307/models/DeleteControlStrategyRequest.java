// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudauth20190307.models;

import com.aliyun.tea.*;

public class DeleteControlStrategyRequest extends TeaModel {
    /**
     * <p>API name, same as <strong>ProductCode</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>ID_PRO</p>
     */
    @NameInMap("ApiName")
    public String apiName;

    /**
     * <p>Security rule ID.</p>
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
     * <p>Region ID.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-shanghai</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    public static DeleteControlStrategyRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteControlStrategyRequest self = new DeleteControlStrategyRequest();
        return TeaModel.build(map, self);
    }

    public DeleteControlStrategyRequest setApiName(String apiName) {
        this.apiName = apiName;
        return this;
    }
    public String getApiName() {
        return this.apiName;
    }

    public DeleteControlStrategyRequest setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

    public DeleteControlStrategyRequest setProductType(String productType) {
        this.productType = productType;
        return this;
    }
    public String getProductType() {
        return this.productType;
    }

    public DeleteControlStrategyRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
