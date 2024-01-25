// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiops20200806.models;

import com.aliyun.tea.*;

public class GetEventTrentResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetEventTrentResponseBody body;

    public static GetEventTrentResponse build(java.util.Map<String, ?> map) throws Exception {
        GetEventTrentResponse self = new GetEventTrentResponse();
        return TeaModel.build(map, self);
    }

    public GetEventTrentResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetEventTrentResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetEventTrentResponse setBody(GetEventTrentResponseBody body) {
        this.body = body;
        return this;
    }
    public GetEventTrentResponseBody getBody() {
        return this.body;
    }

}
