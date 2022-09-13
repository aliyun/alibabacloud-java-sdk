// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cd2021127.models;

import com.aliyun.tea.*;

public class DeleteLabelResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteLabelResponseBody body;

    public static DeleteLabelResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteLabelResponse self = new DeleteLabelResponse();
        return TeaModel.build(map, self);
    }

    public DeleteLabelResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteLabelResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteLabelResponse setBody(DeleteLabelResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteLabelResponseBody getBody() {
        return this.body;
    }

}
