// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eds_aic20230930.models;

import com.aliyun.tea.*;

public class CreateScreenshotResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateScreenshotResponseBody body;

    public static CreateScreenshotResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateScreenshotResponse self = new CreateScreenshotResponse();
        return TeaModel.build(map, self);
    }

    public CreateScreenshotResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateScreenshotResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateScreenshotResponse setBody(CreateScreenshotResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateScreenshotResponseBody getBody() {
        return this.body;
    }

}
