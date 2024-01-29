// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mse20190531.models;

import com.aliyun.tea.*;

public class ListZnodeChildrenResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListZnodeChildrenResponseBody body;

    public static ListZnodeChildrenResponse build(java.util.Map<String, ?> map) throws Exception {
        ListZnodeChildrenResponse self = new ListZnodeChildrenResponse();
        return TeaModel.build(map, self);
    }

    public ListZnodeChildrenResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListZnodeChildrenResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListZnodeChildrenResponse setBody(ListZnodeChildrenResponseBody body) {
        this.body = body;
        return this;
    }
    public ListZnodeChildrenResponseBody getBody() {
        return this.body;
    }

}
