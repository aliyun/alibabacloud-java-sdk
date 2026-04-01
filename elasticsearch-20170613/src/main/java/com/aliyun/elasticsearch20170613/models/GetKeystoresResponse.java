// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.elasticsearch20170613.models;

import com.aliyun.tea.*;

public class GetKeystoresResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetKeystoresResponseBody body;

    public static GetKeystoresResponse build(java.util.Map<String, ?> map) throws Exception {
        GetKeystoresResponse self = new GetKeystoresResponse();
        return TeaModel.build(map, self);
    }

    public GetKeystoresResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetKeystoresResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetKeystoresResponse setBody(GetKeystoresResponseBody body) {
        this.body = body;
        return this;
    }
    public GetKeystoresResponseBody getBody() {
        return this.body;
    }

}
