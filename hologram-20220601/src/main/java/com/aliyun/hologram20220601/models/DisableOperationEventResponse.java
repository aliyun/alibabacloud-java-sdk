// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hologram20220601.models;

import com.aliyun.tea.*;

public class DisableOperationEventResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DisableOperationEventResponseBody body;

    public static DisableOperationEventResponse build(java.util.Map<String, ?> map) throws Exception {
        DisableOperationEventResponse self = new DisableOperationEventResponse();
        return TeaModel.build(map, self);
    }

    public DisableOperationEventResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DisableOperationEventResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DisableOperationEventResponse setBody(DisableOperationEventResponseBody body) {
        this.body = body;
        return this;
    }
    public DisableOperationEventResponseBody getBody() {
        return this.body;
    }

}
