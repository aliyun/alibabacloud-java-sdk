// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.apig20240327.models;

import com.aliyun.tea.*;

public class GetTraceConfigResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetTraceConfigResponseBody body;

    public static GetTraceConfigResponse build(java.util.Map<String, ?> map) throws Exception {
        GetTraceConfigResponse self = new GetTraceConfigResponse();
        return TeaModel.build(map, self);
    }

    public GetTraceConfigResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetTraceConfigResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetTraceConfigResponse setBody(GetTraceConfigResponseBody body) {
        this.body = body;
        return this;
    }
    public GetTraceConfigResponseBody getBody() {
        return this.body;
    }

}
