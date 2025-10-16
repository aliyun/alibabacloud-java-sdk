// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentrun20250910.models;

import com.aliyun.tea.*;

public class GetMemoryEventResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetMemoryEventResponseBody body;

    public static GetMemoryEventResponse build(java.util.Map<String, ?> map) throws Exception {
        GetMemoryEventResponse self = new GetMemoryEventResponse();
        return TeaModel.build(map, self);
    }

    public GetMemoryEventResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetMemoryEventResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetMemoryEventResponse setBody(GetMemoryEventResponseBody body) {
        this.body = body;
        return this;
    }
    public GetMemoryEventResponseBody getBody() {
        return this.body;
    }

}
