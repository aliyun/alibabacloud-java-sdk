// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agency20180703.models;

import com.aliyun.tea.*;

public class GetAccountInfoResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public GetAccountInfoResponseBody body;

    public static GetAccountInfoResponse build(java.util.Map<String, ?> map) throws Exception {
        GetAccountInfoResponse self = new GetAccountInfoResponse();
        return TeaModel.build(map, self);
    }

    public GetAccountInfoResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetAccountInfoResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetAccountInfoResponse setBody(GetAccountInfoResponseBody body) {
        this.body = body;
        return this;
    }
    public GetAccountInfoResponseBody getBody() {
        return this.body;
    }

}
