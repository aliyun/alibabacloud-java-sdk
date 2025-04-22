// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dyplsapi20170525.models;

import com.aliyun.tea.*;

public class DeleteSecretAPhoneNoToCustResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteSecretAPhoneNoToCustResponseBody body;

    public static DeleteSecretAPhoneNoToCustResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteSecretAPhoneNoToCustResponse self = new DeleteSecretAPhoneNoToCustResponse();
        return TeaModel.build(map, self);
    }

    public DeleteSecretAPhoneNoToCustResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteSecretAPhoneNoToCustResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteSecretAPhoneNoToCustResponse setBody(DeleteSecretAPhoneNoToCustResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteSecretAPhoneNoToCustResponseBody getBody() {
        return this.body;
    }

}
