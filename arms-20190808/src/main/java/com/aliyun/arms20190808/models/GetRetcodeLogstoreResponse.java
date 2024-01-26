// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class GetRetcodeLogstoreResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetRetcodeLogstoreResponseBody body;

    public static GetRetcodeLogstoreResponse build(java.util.Map<String, ?> map) throws Exception {
        GetRetcodeLogstoreResponse self = new GetRetcodeLogstoreResponse();
        return TeaModel.build(map, self);
    }

    public GetRetcodeLogstoreResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetRetcodeLogstoreResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetRetcodeLogstoreResponse setBody(GetRetcodeLogstoreResponseBody body) {
        this.body = body;
        return this;
    }
    public GetRetcodeLogstoreResponseBody getBody() {
        return this.body;
    }

}
