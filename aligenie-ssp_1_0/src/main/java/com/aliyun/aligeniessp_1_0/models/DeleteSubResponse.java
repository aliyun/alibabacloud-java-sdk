// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aligeniessp_1_0.models;

import com.aliyun.tea.*;

public class DeleteSubResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteSubResponseBody body;

    public static DeleteSubResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteSubResponse self = new DeleteSubResponse();
        return TeaModel.build(map, self);
    }

    public DeleteSubResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteSubResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteSubResponse setBody(DeleteSubResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteSubResponseBody getBody() {
        return this.body;
    }

}
