// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class UpdateImageTransformResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateImageTransformResponseBody body;

    public static UpdateImageTransformResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateImageTransformResponse self = new UpdateImageTransformResponse();
        return TeaModel.build(map, self);
    }

    public UpdateImageTransformResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateImageTransformResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateImageTransformResponse setBody(UpdateImageTransformResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateImageTransformResponseBody getBody() {
        return this.body;
    }

}
