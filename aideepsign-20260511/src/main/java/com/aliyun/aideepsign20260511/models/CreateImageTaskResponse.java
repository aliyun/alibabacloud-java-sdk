// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aideepsign20260511.models;

import com.aliyun.tea.*;

public class CreateImageTaskResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateImageTaskResponseBody body;

    public static CreateImageTaskResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateImageTaskResponse self = new CreateImageTaskResponse();
        return TeaModel.build(map, self);
    }

    public CreateImageTaskResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateImageTaskResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateImageTaskResponse setBody(CreateImageTaskResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateImageTaskResponseBody getBody() {
        return this.body;
    }

}
