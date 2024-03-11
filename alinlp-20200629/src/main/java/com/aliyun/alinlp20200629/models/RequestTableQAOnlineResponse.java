// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alinlp20200629.models;

import com.aliyun.tea.*;

public class RequestTableQAOnlineResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public RequestTableQAOnlineResponseBody body;

    public static RequestTableQAOnlineResponse build(java.util.Map<String, ?> map) throws Exception {
        RequestTableQAOnlineResponse self = new RequestTableQAOnlineResponse();
        return TeaModel.build(map, self);
    }

    public RequestTableQAOnlineResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RequestTableQAOnlineResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public RequestTableQAOnlineResponse setBody(RequestTableQAOnlineResponseBody body) {
        this.body = body;
        return this;
    }
    public RequestTableQAOnlineResponseBody getBody() {
        return this.body;
    }

}
