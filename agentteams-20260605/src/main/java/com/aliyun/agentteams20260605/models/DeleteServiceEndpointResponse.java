// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentteams20260605.models;

import com.aliyun.tea.*;

public class DeleteServiceEndpointResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteServiceEndpointResponseBody body;

    public static DeleteServiceEndpointResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteServiceEndpointResponse self = new DeleteServiceEndpointResponse();
        return TeaModel.build(map, self);
    }

    public DeleteServiceEndpointResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteServiceEndpointResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteServiceEndpointResponse setBody(DeleteServiceEndpointResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteServiceEndpointResponseBody getBody() {
        return this.body;
    }

}
