// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudauth20190307.models;

import com.aliyun.tea.*;

public class ModifyCustomizeFlowStrategyListShrinkRequest extends TeaModel {
    /**
     * <p>Product type, currently only supports <strong>ANT_CLOUD_AUTH</strong> (Financial-grade real person), all others have been phased out.</p>
     * 
     * <strong>example:</strong>
     * <p>ANT_CLOUD_AUTH</p>
     */
    @NameInMap("ProductType")
    public String productType;

    /**
     * <p>Strategy list.</p>
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
