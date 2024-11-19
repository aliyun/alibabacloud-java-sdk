// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aimath20241114.models;

import com.aliyun.tea.*;

public class GenStepResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GenStepResponseBody body;

    public static GenStepResponse build(java.util.Map<String, ?> map) throws Exception {
        GenStepResponse self = new GenStepResponse();
        return TeaModel.build(map, self);
    }

    public GenStepResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GenStepResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GenStepResponse setBody(GenStepResponseBody body) {
        this.body = body;
        return this;
    }
    public GenStepResponseBody getBody() {
        return this.body;
    }

}
