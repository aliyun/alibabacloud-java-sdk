// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkedmall20230930.models;

import com.aliyun.tea.*;

public class ListSkuSaleInfosRequest extends TeaModel {
    @NameInMap("body")
    public SkuSaleInfoListQuery body;

    public static ListSkuSaleInfosRequest build(java.util.Map<String, ?> map) throws Exception {
        ListSkuSaleInfosRequest self = new ListSkuSaleInfosRequest();
        return TeaModel.build(map, self);
    }

    public ListSkuSaleInfosRequest setBody(SkuSaleInfoListQuery body) {
        this.body = body;
        return this;
    }
    public SkuSaleInfoListQuery getBody() {
        return this.body;
    }

}
