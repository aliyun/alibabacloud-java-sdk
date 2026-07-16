// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloud_siem20241212.models;

import com.aliyun.tea.*;

public class UpdateDataConnectorResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateDataConnectorResponseBody body;

    public static UpdateDataConnectorResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateDataConnectorResponse self = new UpdateDataConnectorResponse();
        return TeaModel.build(map, self);
    }

    public UpdateDataConnectorResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateDataConnectorResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateDataConnectorResponse setBody(UpdateDataConnectorResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateDataConnectorResponseBody getBody() {
        return this.body;
    }

}
