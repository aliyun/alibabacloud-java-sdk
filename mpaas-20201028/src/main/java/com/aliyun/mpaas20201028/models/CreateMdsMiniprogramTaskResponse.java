// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mpaas20201028.models;

import com.aliyun.tea.*;

public class CreateMdsMiniprogramTaskResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateMdsMiniprogramTaskResponseBody body;

    public static CreateMdsMiniprogramTaskResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateMdsMiniprogramTaskResponse self = new CreateMdsMiniprogramTaskResponse();
        return TeaModel.build(map, self);
    }

    public CreateMdsMiniprogramTaskResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateMdsMiniprogramTaskResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateMdsMiniprogramTaskResponse setBody(CreateMdsMiniprogramTaskResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateMdsMiniprogramTaskResponseBody getBody() {
        return this.body;
    }

}
