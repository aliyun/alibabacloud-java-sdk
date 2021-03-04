// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bssopenapi20171214.models;

import com.aliyun.tea.*;

public class GetCustomerAccountInfoResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
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

    public GetCustomerAccountInfoResponse setBody(GetCustomerAccountInfoResponseBody body) {
        this.body = body;
        return this;
    }
    public GetCustomerAccountInfoResponseBody getBody() {
        return this.body;
    }

}
