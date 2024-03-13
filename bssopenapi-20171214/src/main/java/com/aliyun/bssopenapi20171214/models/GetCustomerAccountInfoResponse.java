// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bssopenapi20171214.models;

import com.aliyun.tea.*;

public class GetCustomerAccountInfoResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetCustomerAccountInfoResponseBody body;

    public static GetCustomerAccountInfoResponse build(java.util.Map<String, ?> map) throws Exception {
        GetCustomerAccountInfoResponse self = new GetCustomerAccountInfoResponse();
        return TeaModel.build(map, self);
    }

    public GetCustomerAccountInfoResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetCustomerAccountInfoResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetCustomerAccountInfoResponse setBody(GetCustomerAccountInfoResponseBody body) {
        this.body = body;
        return this;
    }
    public GetCustomerAccountInfoResponseBody getBody() {
        return this.body;
    }

}
