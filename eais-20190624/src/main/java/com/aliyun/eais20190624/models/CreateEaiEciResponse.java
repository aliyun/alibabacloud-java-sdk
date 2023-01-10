// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eais20190624.models;

import com.aliyun.tea.*;

public class CreateEaiEciResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public CreateEaiEciResponseBody body;

    public static CreateEaiEciResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateEaiEciResponse self = new CreateEaiEciResponse();
        return TeaModel.build(map, self);
    }

    public CreateEaiEciResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateEaiEciResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateEaiEciResponse setBody(CreateEaiEciResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateEaiEciResponseBody getBody() {
        return this.body;
    }

}
