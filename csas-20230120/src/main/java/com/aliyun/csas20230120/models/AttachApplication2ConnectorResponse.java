// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.csas20230120.models;

import com.aliyun.tea.*;

public class AttachApplication2ConnectorResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public AttachApplication2ConnectorResponseBody body;

    public static AttachApplication2ConnectorResponse build(java.util.Map<String, ?> map) throws Exception {
        AttachApplication2ConnectorResponse self = new AttachApplication2ConnectorResponse();
        return TeaModel.build(map, self);
    }

    public AttachApplication2ConnectorResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AttachApplication2ConnectorResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public AttachApplication2ConnectorResponse setBody(AttachApplication2ConnectorResponseBody body) {
        this.body = body;
        return this;
    }
    public AttachApplication2ConnectorResponseBody getBody() {
        return this.body;
    }

}
