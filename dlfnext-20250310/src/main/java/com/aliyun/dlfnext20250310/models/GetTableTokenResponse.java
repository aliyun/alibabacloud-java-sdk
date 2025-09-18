// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dlfnext20250310.models;

import com.aliyun.tea.*;

public class GetTableTokenResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetTableTokenResponseBody body;

    public static GetTableTokenResponse build(java.util.Map<String, ?> map) throws Exception {
        GetTableTokenResponse self = new GetTableTokenResponse();
        return TeaModel.build(map, self);
    }

    public GetTableTokenResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetTableTokenResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetTableTokenResponse setBody(GetTableTokenResponseBody body) {
        this.body = body;
        return this;
    }
    public GetTableTokenResponseBody getBody() {
        return this.body;
    }

}
