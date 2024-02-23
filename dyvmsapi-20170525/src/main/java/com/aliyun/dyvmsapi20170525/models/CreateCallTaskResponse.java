// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dyvmsapi20170525.models;

import com.aliyun.tea.*;

public class CreateCallTaskResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateCallTaskResponseBody body;

    public static CreateCallTaskResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateCallTaskResponse self = new CreateCallTaskResponse();
        return TeaModel.build(map, self);
    }

    public CreateCallTaskResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateCallTaskResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateCallTaskResponse setBody(CreateCallTaskResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateCallTaskResponseBody getBody() {
        return this.body;
    }

}
