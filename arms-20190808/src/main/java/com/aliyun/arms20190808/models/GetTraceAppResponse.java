// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class GetTraceAppResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetTraceAppResponseBody body;

    public static GetTraceAppResponse build(java.util.Map<String, ?> map) throws Exception {
        GetTraceAppResponse self = new GetTraceAppResponse();
        return TeaModel.build(map, self);
    }

    public GetTraceAppResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetTraceAppResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetTraceAppResponse setBody(GetTraceAppResponseBody body) {
        this.body = body;
        return this;
    }
    public GetTraceAppResponseBody getBody() {
        return this.body;
    }

}
