// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agency20250227.models;

import com.aliyun.tea.*;

public class GetCustomerOrderListResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetCustomerOrderListResponseBody body;

    public static GetCustomerOrderListResponse build(java.util.Map<String, ?> map) throws Exception {
        GetCustomerOrderListResponse self = new GetCustomerOrderListResponse();
        return TeaModel.build(map, self);
    }

    public GetCustomerOrderListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetCustomerOrderListResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetCustomerOrderListResponse setBody(GetCustomerOrderListResponseBody body) {
        this.body = body;
        return this;
    }
    public GetCustomerOrderListResponseBody getBody() {
        return this.body;
    }

}
