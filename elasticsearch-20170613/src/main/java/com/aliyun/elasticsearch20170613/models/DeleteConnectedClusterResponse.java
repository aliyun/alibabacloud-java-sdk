// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.elasticsearch20170613.models;

import com.aliyun.tea.*;

public class DeleteConnectedClusterResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteConnectedClusterResponseBody body;

    public static DeleteConnectedClusterResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteConnectedClusterResponse self = new DeleteConnectedClusterResponse();
        return TeaModel.build(map, self);
    }

    public DeleteConnectedClusterResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteConnectedClusterResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteConnectedClusterResponse setBody(DeleteConnectedClusterResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteConnectedClusterResponseBody getBody() {
        return this.body;
    }

}
