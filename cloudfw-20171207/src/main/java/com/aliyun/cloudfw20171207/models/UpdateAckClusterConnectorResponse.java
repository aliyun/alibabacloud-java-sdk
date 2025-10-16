// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class UpdateAckClusterConnectorResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateAckClusterConnectorResponseBody body;

    public static UpdateAckClusterConnectorResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateAckClusterConnectorResponse self = new UpdateAckClusterConnectorResponse();
        return TeaModel.build(map, self);
    }

    public UpdateAckClusterConnectorResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateAckClusterConnectorResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateAckClusterConnectorResponse setBody(UpdateAckClusterConnectorResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateAckClusterConnectorResponseBody getBody() {
        return this.body;
    }

}
