// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class RespondEventResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public RespondEventResponseBody body;

    public static RespondEventResponse build(java.util.Map<String, ?> map) throws Exception {
        RespondEventResponse self = new RespondEventResponse();
        return TeaModel.build(map, self);
    }

    public RespondEventResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RespondEventResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public RespondEventResponse setBody(RespondEventResponseBody body) {
        this.body = body;
        return this;
    }
    public RespondEventResponseBody getBody() {
        return this.body;
    }

}
