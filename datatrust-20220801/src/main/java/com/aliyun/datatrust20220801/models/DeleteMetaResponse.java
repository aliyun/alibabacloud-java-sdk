// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.datatrust20220801.models;

import com.aliyun.tea.*;

public class DeleteMetaResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteMetaResponseBody body;

    public static DeleteMetaResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteMetaResponse self = new DeleteMetaResponse();
        return TeaModel.build(map, self);
    }

    public DeleteMetaResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteMetaResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteMetaResponse setBody(DeleteMetaResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteMetaResponseBody getBody() {
        return this.body;
    }

}
