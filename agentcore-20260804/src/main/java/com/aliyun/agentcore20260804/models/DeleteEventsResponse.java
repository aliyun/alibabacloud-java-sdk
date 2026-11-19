// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentcore20260804.models;

import com.aliyun.tea.*;

public class DeleteEventsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteEventsResponseBody body;

    public static DeleteEventsResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteEventsResponse self = new DeleteEventsResponse();
        return TeaModel.build(map, self);
    }

    public DeleteEventsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteEventsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteEventsResponse setBody(DeleteEventsResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteEventsResponseBody getBody() {
        return this.body;
    }

}
