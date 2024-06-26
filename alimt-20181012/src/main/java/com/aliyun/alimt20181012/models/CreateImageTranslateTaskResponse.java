// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alimt20181012.models;

import com.aliyun.tea.*;

public class CreateImageTranslateTaskResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateImageTranslateTaskResponseBody body;

    public static CreateImageTranslateTaskResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateImageTranslateTaskResponse self = new CreateImageTranslateTaskResponse();
        return TeaModel.build(map, self);
    }

    public CreateImageTranslateTaskResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateImageTranslateTaskResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateImageTranslateTaskResponse setBody(CreateImageTranslateTaskResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateImageTranslateTaskResponseBody getBody() {
        return this.body;
    }

}
