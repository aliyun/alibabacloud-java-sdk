// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.fc_open20210406.models;

import com.aliyun.tea.*;

public class GetAliasResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetAliasResponseBody body;

    public static GetAliasResponse build(java.util.Map<String, ?> map) throws Exception {
        GetAliasResponse self = new GetAliasResponse();
        return TeaModel.build(map, self);
    }

    public GetAliasResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetAliasResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetAliasResponse setBody(GetAliasResponseBody body) {
        this.body = body;
        return this;
    }
    public GetAliasResponseBody getBody() {
        return this.body;
    }

}
