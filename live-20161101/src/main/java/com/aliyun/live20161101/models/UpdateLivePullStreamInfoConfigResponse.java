// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class UpdateLivePullStreamInfoConfigResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public UpdateLivePullStreamInfoConfigResponseBody body;

    public static UpdateLivePullStreamInfoConfigResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateLivePullStreamInfoConfigResponse self = new UpdateLivePullStreamInfoConfigResponse();
        return TeaModel.build(map, self);
    }

    public UpdateLivePullStreamInfoConfigResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateLivePullStreamInfoConfigResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateLivePullStreamInfoConfigResponse setBody(UpdateLivePullStreamInfoConfigResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateLivePullStreamInfoConfigResponseBody getBody() {
        return this.body;
    }

}
