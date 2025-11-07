// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudauth20190307.models;

import com.aliyun.tea.*;

public class ModifyControlStrategyShrinkRequest extends TeaModel {
    /**
     * <p>List of security alarm rules.</p>
     */
    @NameInMap("ControlStrategyList")
    public String controlStrategyListShrink;

    /**
     * <p>Product type, currently only supports <strong>ANT_CLOUD_AUTH</strong> (Financial-grade Real Person), all others are phased out.</p>
     * 
     * <strong>example:</strong>
     * <p>ANT_CLOUD_AUTH</p>
     */
    @NameInMap("ProductType")
    public String productType;

    /**
     * <p>Region ID of the intelligent access gateway instance.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-shanghai</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    public static ModifyControlStrategyShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyControlStrategyShrinkRequest self = new ModifyControlStrategyShrinkRequest();
        return TeaModel.build(map, self);
    }

    public ModifyControlStrategyShrinkRequest setControlStrategyListShrink(String controlStrategyListShrink) {
        this.controlStrategyListShrink = controlStrategyListShrink;
        return this;
    }
    public String getControlStrategyListShrink() {
        return this.controlStrategyListShrink;
    }

    public ModifyControlStrategyShrinkRequest setProductType(String productType) {
        this.productType = productType;
        return this;
    }
    public String getProductType() {
        return this.productType;
    }

    public ModifyControlStrategyShrinkRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
