// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cr20181201.models;

import com.aliyun.tea.*;

public class GetChainResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetChainResponseBody body;

    public static GetChainResponse build(java.util.Map<String, ?> map) throws Exception {
        GetChainResponse self = new GetChainResponse();
        return TeaModel.build(map, self);
    }

    public GetChainResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetChainResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetChainResponse setBody(GetChainResponseBody body) {
        this.body = body;
        return this;
    }
    public GetChainResponseBody getBody() {
        return this.body;
    }

}
