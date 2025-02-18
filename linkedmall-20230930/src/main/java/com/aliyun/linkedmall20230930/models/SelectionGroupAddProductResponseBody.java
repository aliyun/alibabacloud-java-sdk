// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkedmall20230930.models;

import com.aliyun.tea.*;

public class SelectionGroupAddProductResponseBody extends TeaModel {
    @NameInMap("productIds")
    public java.util.List<String> productIds;

    public static SelectionGroupAddProductResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SelectionGroupAddProductResponseBody self = new SelectionGroupAddProductResponseBody();
        return TeaModel.build(map, self);
    }

    public SelectionGroupAddProductResponseBody setProductIds(java.util.List<String> productIds) {
        this.productIds = productIds;
        return this;
    }
    public java.util.List<String> getProductIds() {
        return this.productIds;
    }

}
