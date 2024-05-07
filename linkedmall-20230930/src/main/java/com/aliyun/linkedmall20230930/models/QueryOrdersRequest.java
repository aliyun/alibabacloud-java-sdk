// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkedmall20230930.models;

import com.aliyun.tea.*;

public class QueryOrdersRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("body")
    public OrderPageQuery body;

    public static QueryOrdersRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryOrdersRequest self = new QueryOrdersRequest();
        return TeaModel.build(map, self);
    }

    public QueryOrdersRequest setBody(OrderPageQuery body) {
        this.body = body;
        return this;
    }
    public OrderPageQuery getBody() {
        return this.body;
    }

}
