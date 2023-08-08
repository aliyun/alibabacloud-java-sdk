// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudauth_intl20220809.models;

import com.aliyun.tea.*;

public class DeleteVerifyResultResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteVerifyResultResponseBody body;

    public static DeleteVerifyResultResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteVerifyResultResponse self = new DeleteVerifyResultResponse();
        return TeaModel.build(map, self);
    }

    public DeleteVerifyResultResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteVerifyResultResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteVerifyResultResponse setBody(DeleteVerifyResultResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteVerifyResultResponseBody getBody() {
        return this.body;
    }

}
