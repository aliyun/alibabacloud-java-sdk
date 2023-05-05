// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20210602.models;

import com.aliyun.tea.*;

public class UpdateIsvAppResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public UpdateIsvAppResponseBody body;

    public static UpdateIsvAppResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateIsvAppResponse self = new UpdateIsvAppResponse();
        return TeaModel.build(map, self);
    }

    public UpdateIsvAppResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateIsvAppResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateIsvAppResponse setBody(UpdateIsvAppResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateIsvAppResponseBody getBody() {
        return this.body;
    }

}
