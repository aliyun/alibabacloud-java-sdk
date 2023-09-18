// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkedmall20230930.models;

import com.aliyun.tea.*;

public class ListSelectionProductSaleInfosRequest extends TeaModel {
    @NameInMap("body")
    public ProductSaleInfoListQuery body;

    public static ListSelectionProductSaleInfosRequest build(java.util.Map<String, ?> map) throws Exception {
        ListSelectionProductSaleInfosRequest self = new ListSelectionProductSaleInfosRequest();
        return TeaModel.build(map, self);
    }

    public ListSelectionProductSaleInfosRequest setBody(ProductSaleInfoListQuery body) {
        this.body = body;
        return this;
    }
    public ProductSaleInfoListQuery getBody() {
        return this.body;
    }

}
