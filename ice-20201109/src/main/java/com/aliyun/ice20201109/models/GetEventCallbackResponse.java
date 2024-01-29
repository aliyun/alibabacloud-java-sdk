// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class GetEventCallbackResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetEventCallbackResponseBody body;

    public static GetEventCallbackResponse build(java.util.Map<String, ?> map) throws Exception {
        GetEventCallbackResponse self = new GetEventCallbackResponse();
        return TeaModel.build(map, self);
    }

    public GetEventCallbackResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetEventCallbackResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetEventCallbackResponse setBody(GetEventCallbackResponseBody body) {
        this.body = body;
        return this;
    }
    public GetEventCallbackResponseBody getBody() {
        return this.body;
    }

}
