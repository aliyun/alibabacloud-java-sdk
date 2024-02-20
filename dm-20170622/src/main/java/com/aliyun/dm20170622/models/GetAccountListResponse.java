// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dm20170622.models;

import com.aliyun.tea.*;

public class GetAccountListResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
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

    public GetAccountListResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetAccountListResponse setBody(GetAccountListResponseBody body) {
        this.body = body;
        return this;
    }
    public GetAccountListResponseBody getBody() {
        return this.body;
    }

}
