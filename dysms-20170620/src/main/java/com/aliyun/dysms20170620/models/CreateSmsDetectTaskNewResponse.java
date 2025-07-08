// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dysms20170620.models;

import com.aliyun.tea.*;

public class CreateSmsDetectTaskNewResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateSmsDetectTaskNewResponseBody body;

    public static CreateSmsDetectTaskNewResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateSmsDetectTaskNewResponse self = new CreateSmsDetectTaskNewResponse();
        return TeaModel.build(map, self);
    }

    public CreateSmsDetectTaskNewResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateSmsDetectTaskNewResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateSmsDetectTaskNewResponse setBody(CreateSmsDetectTaskNewResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateSmsDetectTaskNewResponseBody getBody() {
        return this.body;
    }

}
