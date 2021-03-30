// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mhub20170825.models;

import com.aliyun.tea.*;

public class QueryProductInfoRequest extends TeaModel {
    @NameInMap("ProductId")
    public String productId;

    public static QueryProductInfoRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryProductInfoRequest self = new QueryProductInfoRequest();
        return TeaModel.build(map, self);
    }

    public QueryProductInfoRequest setProductId(String productId) {
        this.productId = productId;
        return this;
    }
    public String getProductId() {
        return this.productId;
    }

}
