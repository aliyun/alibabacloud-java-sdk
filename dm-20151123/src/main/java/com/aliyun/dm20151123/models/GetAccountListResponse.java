// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dm20151123.models;

import com.aliyun.tea.*;

public class GetAccountListResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetAccountListResponseBody body;

    public static GetAccountListResponse build(java.util.Map<String, ?> map) throws Exception {
        GetAccountListResponse self = new GetAccountListResponse();
        return TeaModel.build(map, self);
    }

    public GetAccountListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetAccountListResponse setBody(GetAccountListResponseBody body) {
        this.body = body;
        return this;
    }
    public GetAccountListResponseBody getBody() {
        return this.body;
    }

}
