// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class SetColumnsVisibilityResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public SetColumnsVisibilityResponseBody body;

    public static SetColumnsVisibilityResponse build(java.util.Map<String, ?> map) throws Exception {
        SetColumnsVisibilityResponse self = new SetColumnsVisibilityResponse();
        return TeaModel.build(map, self);
    }

    public SetColumnsVisibilityResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SetColumnsVisibilityResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SetColumnsVisibilityResponse setBody(SetColumnsVisibilityResponseBody body) {
        this.body = body;
        return this;
    }
    public SetColumnsVisibilityResponseBody getBody() {
        return this.body;
    }

}
