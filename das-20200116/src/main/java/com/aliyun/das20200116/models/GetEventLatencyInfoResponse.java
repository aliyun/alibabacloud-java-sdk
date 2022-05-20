// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.das20200116.models;

import com.aliyun.tea.*;

public class GetEventLatencyInfoResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public GetEventLatencyInfoResponseBody body;

    public static GetEventLatencyInfoResponse build(java.util.Map<String, ?> map) throws Exception {
        GetEventLatencyInfoResponse self = new GetEventLatencyInfoResponse();
        return TeaModel.build(map, self);
    }

    public GetEventLatencyInfoResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetEventLatencyInfoResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetEventLatencyInfoResponse setBody(GetEventLatencyInfoResponseBody body) {
        this.body = body;
        return this;
    }
    public GetEventLatencyInfoResponseBody getBody() {
        return this.body;
    }

}
