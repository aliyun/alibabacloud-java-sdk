// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class DeleteFormDataResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteFormDataResponseBody body;

    public static DeleteFormDataResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteFormDataResponse self = new DeleteFormDataResponse();
        return TeaModel.build(map, self);
    }

    public DeleteFormDataResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteFormDataResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteFormDataResponse setBody(DeleteFormDataResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteFormDataResponseBody getBody() {
        return this.body;
    }

}
