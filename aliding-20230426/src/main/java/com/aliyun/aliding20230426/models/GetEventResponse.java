// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class GetEventResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetEventResponseBody body;

    public static GetEventResponse build(java.util.Map<String, ?> map) throws Exception {
        GetEventResponse self = new GetEventResponse();
        return TeaModel.build(map, self);
    }

    public GetEventResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetEventResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetEventResponse setBody(GetEventResponseBody body) {
        this.body = body;
        return this;
    }
    public GetEventResponseBody getBody() {
        return this.body;
    }

}
