// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class CreateAckClusterConnectorResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateAckClusterConnectorResponseBody body;

    public static CreateAckClusterConnectorResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateAckClusterConnectorResponse self = new CreateAckClusterConnectorResponse();
        return TeaModel.build(map, self);
    }

    public CreateAckClusterConnectorResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateAckClusterConnectorResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateAckClusterConnectorResponse setBody(CreateAckClusterConnectorResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateAckClusterConnectorResponseBody getBody() {
        return this.body;
    }

}
