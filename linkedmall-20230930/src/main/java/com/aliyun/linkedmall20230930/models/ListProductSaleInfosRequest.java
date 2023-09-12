// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkedmall20230930.models;

import com.aliyun.tea.*;

public class ListProductSaleInfosRequest extends TeaModel {
    @NameInMap("body")
    public ProductSaleInfoListQuery body;

    public static ListProductSaleInfosRequest build(java.util.Map<String, ?> map) throws Exception {
        ListProductSaleInfosRequest self = new ListProductSaleInfosRequest();
        return TeaModel.build(map, self);
    }

    public ListProductSaleInfosRequest setBody(ProductSaleInfoListQuery body) {
        this.body = body;
        return this;
    }
    public ProductSaleInfoListQuery getBody() {
        return this.body;
    }

}
