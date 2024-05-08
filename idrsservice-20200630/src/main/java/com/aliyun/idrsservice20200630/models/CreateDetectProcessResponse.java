// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.idrsservice20200630.models;

import com.aliyun.tea.*;

public class CreateDetectProcessResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateDetectProcessResponseBody body;

    public static CreateDetectProcessResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateDetectProcessResponse self = new CreateDetectProcessResponse();
        return TeaModel.build(map, self);
    }

    public CreateDetectProcessResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateDetectProcessResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateDetectProcessResponse setBody(CreateDetectProcessResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateDetectProcessResponseBody getBody() {
        return this.body;
    }

}
