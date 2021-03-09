// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiccs20191015.models;

import com.aliyun.tea.*;

public class GetCustomerInfoResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetCustomerInfoResponseBody body;

    public static GetCustomerInfoResponse build(java.util.Map<String, ?> map) throws Exception {
        GetCustomerInfoResponse self = new GetCustomerInfoResponse();
        return TeaModel.build(map, self);
    }

    public GetCustomerInfoResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetCustomerInfoResponse setBody(GetCustomerInfoResponseBody body) {
        this.body = body;
        return this;
    }
    public GetCustomerInfoResponseBody getBody() {
        return this.body;
    }

}
