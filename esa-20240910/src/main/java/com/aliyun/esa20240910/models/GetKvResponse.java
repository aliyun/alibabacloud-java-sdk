// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class GetKvResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetKvResponseBody body;

    public static GetKvResponse build(java.util.Map<String, ?> map) throws Exception {
        GetKvResponse self = new GetKvResponse();
        return TeaModel.build(map, self);
    }

    public GetKvResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetKvResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetKvResponse setBody(GetKvResponseBody body) {
        this.body = body;
        return this;
    }
    public GetKvResponseBody getBody() {
        return this.body;
    }

}
