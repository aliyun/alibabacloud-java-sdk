// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live_interaction20201214.models;

import com.aliyun.tea.*;

public class UpdateAppStatusResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public UpdateAppStatusResponseBody body;

    public static UpdateAppStatusResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateAppStatusResponse self = new UpdateAppStatusResponse();
        return TeaModel.build(map, self);
    }

    public UpdateAppStatusResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateAppStatusResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateAppStatusResponse setBody(UpdateAppStatusResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateAppStatusResponseBody getBody() {
        return this.body;
    }

}
