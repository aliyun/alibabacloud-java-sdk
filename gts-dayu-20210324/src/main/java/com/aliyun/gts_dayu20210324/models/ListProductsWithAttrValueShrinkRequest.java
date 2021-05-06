// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gts_dayu20210324.models;

import com.aliyun.tea.*;

public class ListProductsWithAttrValueShrinkRequest extends TeaModel {
    // productIds
    @NameInMap("productIds")
    public String productIdsShrink;

    public static ListProductsWithAttrValueShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        ListProductsWithAttrValueShrinkRequest self = new ListProductsWithAttrValueShrinkRequest();
        return TeaModel.build(map, self);
    }

    public ListProductsWithAttrValueShrinkRequest setProductIdsShrink(String productIdsShrink) {
        this.productIdsShrink = productIdsShrink;
        return this;
    }
    public String getProductIdsShrink() {
        return this.productIdsShrink;
    }

}
