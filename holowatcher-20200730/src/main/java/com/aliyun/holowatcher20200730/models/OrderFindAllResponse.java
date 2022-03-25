// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.holowatcher20200730.models;

import com.aliyun.tea.*;

public class OrderFindAllResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public OrderFindAllResponseBody body;

    public static OrderFindAllResponse build(java.util.Map<String, ?> map) throws Exception {
        OrderFindAllResponse self = new OrderFindAllResponse();
        return TeaModel.build(map, self);
    }

    public OrderFindAllResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public OrderFindAllResponse setBody(OrderFindAllResponseBody body) {
        this.body = body;
        return this;
    }
    public OrderFindAllResponseBody getBody() {
        return this.body;
    }

}
