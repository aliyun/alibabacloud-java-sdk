// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gts_dayu20210324.models;

import com.aliyun.tea.*;

public class ListProductsWithAttrValueRequest extends TeaModel {
    // productIds
    @NameInMap("productIds")
    public java.util.List<Long> productIds;

    public static ListProductsWithAttrValueRequest build(java.util.Map<String, ?> map) throws Exception {
        ListProductsWithAttrValueRequest self = new ListProductsWithAttrValueRequest();
        return TeaModel.build(map, self);
    }

    public ListProductsWithAttrValueRequest setProductIds(java.util.List<Long> productIds) {
        this.productIds = productIds;
        return this;
    }
    public java.util.List<Long> getProductIds() {
        return this.productIds;
    }

}
