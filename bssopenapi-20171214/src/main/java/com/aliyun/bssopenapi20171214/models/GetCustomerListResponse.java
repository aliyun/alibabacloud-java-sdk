// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bssopenapi20171214.models;

import com.aliyun.tea.*;

public class GetCustomerListResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetCustomerListResponseBody body;

    public static GetCustomerListResponse build(java.util.Map<String, ?> map) throws Exception {
        GetCustomerListResponse self = new GetCustomerListResponse();
        return TeaModel.build(map, self);
    }

    public GetCustomerListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetCustomerListResponse setBody(GetCustomerListResponseBody body) {
        this.body = body;
        return this;
    }
    public GetCustomerListResponseBody getBody() {
        return this.body;
    }

}
