// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.account_crm20160606.models;

import com.aliyun.tea.*;

public class DeleteContacterResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteContacterResponseBody body;

    public static DeleteContacterResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteContacterResponse self = new DeleteContacterResponse();
        return TeaModel.build(map, self);
    }

    public DeleteContacterResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteContacterResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteContacterResponse setBody(DeleteContacterResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteContacterResponseBody getBody() {
        return this.body;
    }

}
