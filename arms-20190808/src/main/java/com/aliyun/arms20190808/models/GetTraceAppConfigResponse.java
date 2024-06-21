// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class GetTraceAppConfigResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetTraceAppConfigResponseBody body;

    public static GetTraceAppConfigResponse build(java.util.Map<String, ?> map) throws Exception {
        GetTraceAppConfigResponse self = new GetTraceAppConfigResponse();
        return TeaModel.build(map, self);
    }

    public GetTraceAppConfigResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetTraceAppConfigResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetTraceAppConfigResponse setBody(GetTraceAppConfigResponseBody body) {
        this.body = body;
        return this;
    }
    public GetTraceAppConfigResponseBody getBody() {
        return this.body;
    }

}
