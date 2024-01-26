// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class GetSourceMapInfoResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetSourceMapInfoResponseBody body;

    public static GetSourceMapInfoResponse build(java.util.Map<String, ?> map) throws Exception {
        GetSourceMapInfoResponse self = new GetSourceMapInfoResponse();
        return TeaModel.build(map, self);
    }

    public GetSourceMapInfoResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetSourceMapInfoResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetSourceMapInfoResponse setBody(GetSourceMapInfoResponseBody body) {
        this.body = body;
        return this;
    }
    public GetSourceMapInfoResponseBody getBody() {
        return this.body;
    }

}
