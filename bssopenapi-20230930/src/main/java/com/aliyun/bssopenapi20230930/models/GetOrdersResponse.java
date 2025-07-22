// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bssopenapi20230930.models;

import com.aliyun.tea.*;

public class GetOrdersResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetOrdersResponseBody body;

    public static GetOrdersResponse build(java.util.Map<String, ?> map) throws Exception {
        GetOrdersResponse self = new GetOrdersResponse();
        return TeaModel.build(map, self);
    }

    public GetOrdersResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetOrdersResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetOrdersResponse setBody(GetOrdersResponseBody body) {
        this.body = body;
        return this;
    }
    public GetOrdersResponseBody getBody() {
        return this.body;
    }

}
