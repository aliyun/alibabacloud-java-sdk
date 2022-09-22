// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mpserverless20190615.models;

import com.aliyun.tea.*;

public class DeleteFunctionResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteFunctionResponseBody body;

    public static DeleteFunctionResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteFunctionResponse self = new DeleteFunctionResponse();
        return TeaModel.build(map, self);
    }

    public DeleteFunctionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteFunctionResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteFunctionResponse setBody(DeleteFunctionResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteFunctionResponseBody getBody() {
        return this.body;
    }

}
