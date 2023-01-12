// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ga20191120.models;

import com.aliyun.tea.*;

public class UpdateCrossPrivateStateResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public UpdateCrossPrivateStateResponseBody body;

    public static UpdateCrossPrivateStateResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateCrossPrivateStateResponse self = new UpdateCrossPrivateStateResponse();
        return TeaModel.build(map, self);
    }

    public UpdateCrossPrivateStateResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateCrossPrivateStateResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateCrossPrivateStateResponse setBody(UpdateCrossPrivateStateResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateCrossPrivateStateResponseBody getBody() {
        return this.body;
    }

}
