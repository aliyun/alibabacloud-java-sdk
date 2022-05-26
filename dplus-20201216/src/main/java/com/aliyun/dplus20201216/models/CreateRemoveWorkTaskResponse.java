// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dplus20201216.models;

import com.aliyun.tea.*;

public class CreateRemoveWorkTaskResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public CreateRemoveWorkTaskResponseBody body;

    public static CreateRemoveWorkTaskResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateRemoveWorkTaskResponse self = new CreateRemoveWorkTaskResponse();
        return TeaModel.build(map, self);
    }

    public CreateRemoveWorkTaskResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateRemoveWorkTaskResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateRemoveWorkTaskResponse setBody(CreateRemoveWorkTaskResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateRemoveWorkTaskResponseBody getBody() {
        return this.body;
    }

}
