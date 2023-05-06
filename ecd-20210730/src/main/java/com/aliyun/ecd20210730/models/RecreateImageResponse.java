// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20210730.models;

import com.aliyun.tea.*;

public class RecreateImageResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public RecreateImageResponseBody body;

    public static RecreateImageResponse build(java.util.Map<String, ?> map) throws Exception {
        RecreateImageResponse self = new RecreateImageResponse();
        return TeaModel.build(map, self);
    }

    public RecreateImageResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RecreateImageResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public RecreateImageResponse setBody(RecreateImageResponseBody body) {
        this.body = body;
        return this;
    }
    public RecreateImageResponseBody getBody() {
        return this.body;
    }

}
