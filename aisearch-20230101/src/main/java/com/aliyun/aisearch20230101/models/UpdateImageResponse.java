// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aisearch20230101.models;

import com.aliyun.tea.*;

public class UpdateImageResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public UpdateImageResponseBody body;

    public static UpdateImageResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateImageResponse self = new UpdateImageResponse();
        return TeaModel.build(map, self);
    }

    public UpdateImageResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateImageResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateImageResponse setBody(UpdateImageResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateImageResponseBody getBody() {
        return this.body;
    }

}
