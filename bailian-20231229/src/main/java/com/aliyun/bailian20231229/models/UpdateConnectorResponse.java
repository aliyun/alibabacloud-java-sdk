// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bailian20231229.models;

import com.aliyun.tea.*;

public class UpdateConnectorResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateConnectorResponseBody body;

    public static UpdateConnectorResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateConnectorResponse self = new UpdateConnectorResponse();
        return TeaModel.build(map, self);
    }

    public UpdateConnectorResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateConnectorResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateConnectorResponse setBody(UpdateConnectorResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateConnectorResponseBody getBody() {
        return this.body;
    }

}
