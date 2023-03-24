// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.csas20230120.models;

import com.aliyun.tea.*;

public class DetachApplication2ConnectorResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DetachApplication2ConnectorResponseBody body;

    public static DetachApplication2ConnectorResponse build(java.util.Map<String, ?> map) throws Exception {
        DetachApplication2ConnectorResponse self = new DetachApplication2ConnectorResponse();
        return TeaModel.build(map, self);
    }

    public DetachApplication2ConnectorResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DetachApplication2ConnectorResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DetachApplication2ConnectorResponse setBody(DetachApplication2ConnectorResponseBody body) {
        this.body = body;
        return this;
    }
    public DetachApplication2ConnectorResponseBody getBody() {
        return this.body;
    }

}
