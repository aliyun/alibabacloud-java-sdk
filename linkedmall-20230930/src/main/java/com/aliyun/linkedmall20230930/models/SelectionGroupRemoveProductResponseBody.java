// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkedmall20230930.models;

import com.aliyun.tea.*;

public class SelectionGroupRemoveProductResponseBody extends TeaModel {
    @NameInMap("productIds")
    public java.util.List<String> productIds;

    public static SelectionGroupRemoveProductResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SelectionGroupRemoveProductResponseBody self = new SelectionGroupRemoveProductResponseBody();
        return TeaModel.build(map, self);
    }

    public SelectionGroupRemoveProductResponseBody setProductIds(java.util.List<String> productIds) {
        this.productIds = productIds;
        return this;
    }
    public java.util.List<String> getProductIds() {
        return this.productIds;
    }

}
