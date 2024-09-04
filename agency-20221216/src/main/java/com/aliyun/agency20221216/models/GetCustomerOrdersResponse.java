// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agency20221216.models;

import com.aliyun.tea.*;

public class GetCustomerOrdersResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetCustomerOrdersResponseBody body;

    public static GetCustomerOrdersResponse build(java.util.Map<String, ?> map) throws Exception {
        GetCustomerOrdersResponse self = new GetCustomerOrdersResponse();
        return TeaModel.build(map, self);
    }

    public GetCustomerOrdersResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetCustomerOrdersResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetCustomerOrdersResponse setBody(GetCustomerOrdersResponseBody body) {
        this.body = body;
        return this;
    }
    public GetCustomerOrdersResponseBody getBody() {
        return this.body;
    }

}
