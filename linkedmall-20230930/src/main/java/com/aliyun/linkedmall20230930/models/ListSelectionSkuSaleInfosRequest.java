// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkedmall20230930.models;

import com.aliyun.tea.*;

public class ListSelectionSkuSaleInfosRequest extends TeaModel {
    @NameInMap("body")
    public SkuSaleInfoListQuery body;

    public static ListSelectionSkuSaleInfosRequest build(java.util.Map<String, ?> map) throws Exception {
        ListSelectionSkuSaleInfosRequest self = new ListSelectionSkuSaleInfosRequest();
        return TeaModel.build(map, self);
    }

    public ListSelectionSkuSaleInfosRequest setBody(SkuSaleInfoListQuery body) {
        this.body = body;
        return this;
    }
    public SkuSaleInfoListQuery getBody() {
        return this.body;
    }

}
