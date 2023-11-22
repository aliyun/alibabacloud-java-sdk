// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cams20200606.models;

import com.aliyun.tea.*;

public class DeletePhoneMessageQrdlResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DeletePhoneMessageQrdlResponseBody body;

    public static DeletePhoneMessageQrdlResponse build(java.util.Map<String, ?> map) throws Exception {
        DeletePhoneMessageQrdlResponse self = new DeletePhoneMessageQrdlResponse();
        return TeaModel.build(map, self);
    }

    public DeletePhoneMessageQrdlResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeletePhoneMessageQrdlResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeletePhoneMessageQrdlResponse setBody(DeletePhoneMessageQrdlResponseBody body) {
        this.body = body;
        return this;
    }
    public DeletePhoneMessageQrdlResponseBody getBody() {
        return this.body;
    }

}
