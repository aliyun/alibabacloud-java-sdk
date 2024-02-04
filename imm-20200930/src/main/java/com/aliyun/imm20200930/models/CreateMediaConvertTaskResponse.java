// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imm20200930.models;

import com.aliyun.tea.*;

public class CreateMediaConvertTaskResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateMediaConvertTaskResponseBody body;

    public static CreateMediaConvertTaskResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateMediaConvertTaskResponse self = new CreateMediaConvertTaskResponse();
        return TeaModel.build(map, self);
    }

    public CreateMediaConvertTaskResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateMediaConvertTaskResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateMediaConvertTaskResponse setBody(CreateMediaConvertTaskResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateMediaConvertTaskResponseBody getBody() {
        return this.body;
    }

}
