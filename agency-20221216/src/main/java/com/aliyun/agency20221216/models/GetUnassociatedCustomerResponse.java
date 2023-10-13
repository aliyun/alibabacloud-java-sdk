// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agency20221216.models;

import com.aliyun.tea.*;

public class GetUnassociatedCustomerResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public GetUnassociatedCustomerResponseBody body;

    public static GetUnassociatedCustomerResponse build(java.util.Map<String, ?> map) throws Exception {
        GetUnassociatedCustomerResponse self = new GetUnassociatedCustomerResponse();
        return TeaModel.build(map, self);
    }

    public GetUnassociatedCustomerResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetUnassociatedCustomerResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetUnassociatedCustomerResponse setBody(GetUnassociatedCustomerResponseBody body) {
        this.body = body;
        return this;
    }
    public GetUnassociatedCustomerResponseBody getBody() {
        return this.body;
    }

}
