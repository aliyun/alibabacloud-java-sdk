// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imp20210630.models;

import com.aliyun.tea.*;

public class DeleteSensitiveWordResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteSensitiveWordResponseBody body;

    public static DeleteSensitiveWordResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteSensitiveWordResponse self = new DeleteSensitiveWordResponse();
        return TeaModel.build(map, self);
    }

    public DeleteSensitiveWordResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteSensitiveWordResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteSensitiveWordResponse setBody(DeleteSensitiveWordResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteSensitiveWordResponseBody getBody() {
        return this.body;
    }

}
