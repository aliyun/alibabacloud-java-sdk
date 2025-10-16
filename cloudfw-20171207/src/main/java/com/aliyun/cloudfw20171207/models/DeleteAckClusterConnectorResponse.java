// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class DeleteAckClusterConnectorResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteAckClusterConnectorResponseBody body;

    public static DeleteAckClusterConnectorResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteAckClusterConnectorResponse self = new DeleteAckClusterConnectorResponse();
        return TeaModel.build(map, self);
    }

    public DeleteAckClusterConnectorResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteAckClusterConnectorResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteAckClusterConnectorResponse setBody(DeleteAckClusterConnectorResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteAckClusterConnectorResponseBody getBody() {
        return this.body;
    }

}
