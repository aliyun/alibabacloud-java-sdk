// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aegis_ops20180828.models;

import com.aliyun.tea.*;

public class PushProtocolByUuidResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public PushProtocolByUuidResponseBody body;

    public static PushProtocolByUuidResponse build(java.util.Map<String, ?> map) throws Exception {
        PushProtocolByUuidResponse self = new PushProtocolByUuidResponse();
        return TeaModel.build(map, self);
    }

    public PushProtocolByUuidResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public PushProtocolByUuidResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public PushProtocolByUuidResponse setBody(PushProtocolByUuidResponseBody body) {
        this.body = body;
        return this;
    }
    public PushProtocolByUuidResponseBody getBody() {
        return this.body;
    }

}
