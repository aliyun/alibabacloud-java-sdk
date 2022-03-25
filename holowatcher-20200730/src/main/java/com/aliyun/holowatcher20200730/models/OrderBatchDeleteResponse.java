// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.holowatcher20200730.models;

import com.aliyun.tea.*;

public class OrderBatchDeleteResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public OrderBatchDeleteResponseBody body;

    public static OrderBatchDeleteResponse build(java.util.Map<String, ?> map) throws Exception {
        OrderBatchDeleteResponse self = new OrderBatchDeleteResponse();
        return TeaModel.build(map, self);
    }

    public OrderBatchDeleteResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public OrderBatchDeleteResponse setBody(OrderBatchDeleteResponseBody body) {
        this.body = body;
        return this;
    }
    public OrderBatchDeleteResponseBody getBody() {
        return this.body;
    }

}
