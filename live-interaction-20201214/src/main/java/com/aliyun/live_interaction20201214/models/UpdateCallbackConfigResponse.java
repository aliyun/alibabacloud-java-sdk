// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live_interaction20201214.models;

import com.aliyun.tea.*;

public class UpdateCallbackConfigResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public UpdateCallbackConfigResponseBody body;

    public static UpdateCallbackConfigResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateCallbackConfigResponse self = new UpdateCallbackConfigResponse();
        return TeaModel.build(map, self);
    }

    public UpdateCallbackConfigResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateCallbackConfigResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateCallbackConfigResponse setBody(UpdateCallbackConfigResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateCallbackConfigResponseBody getBody() {
        return this.body;
    }

}
