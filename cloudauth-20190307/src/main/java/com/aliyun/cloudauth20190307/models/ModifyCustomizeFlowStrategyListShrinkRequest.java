// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudauth20190307.models;

import com.aliyun.tea.*;

public class ModifyCustomizeFlowStrategyListShrinkRequest extends TeaModel {
    /**
     * <p>The product type. Currently, only <strong>ANT_CLOUD_AUTH</strong> (financial-grade ID Verification) is supported. All other types have been discontinued.</p>
     * 
     * <strong>example:</strong>
     * <p>ANT_CLOUD_AUTH</p>
     */
    @NameInMap("ProductType")
    public String productType;

    /**
     * <p>The policy list.</p>
     */
    @NameInMap("StrategyObject")
    public String strategyObjectShrink;

    public static ModifyCustomizeFlowStrategyListShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyCustomizeFlowStrategyListShrinkRequest self = new ModifyCustomizeFlowStrategyListShrinkRequest();
        return TeaModel.build(map, self);
    }

    public ModifyCustomizeFlowStrategyListShrinkRequest setProductType(String productType) {
        this.productType = productType;
        return this;
    }
    public String getProductType() {
        return this.productType;
    }

    public ModifyCustomizeFlowStrategyListShrinkRequest setStrategyObjectShrink(String strategyObjectShrink) {
        this.strategyObjectShrink = strategyObjectShrink;
        return this;
    }
    public String getStrategyObjectShrink() {
        return this.strategyObjectShrink;
    }

}
