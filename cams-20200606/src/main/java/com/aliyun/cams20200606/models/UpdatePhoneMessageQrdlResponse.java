// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cams20200606.models;

import com.aliyun.tea.*;

public class UpdatePhoneMessageQrdlResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public UpdatePhoneMessageQrdlResponseBody body;

    public static UpdatePhoneMessageQrdlResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdatePhoneMessageQrdlResponse self = new UpdatePhoneMessageQrdlResponse();
        return TeaModel.build(map, self);
    }

    public UpdatePhoneMessageQrdlResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdatePhoneMessageQrdlResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdatePhoneMessageQrdlResponse setBody(UpdatePhoneMessageQrdlResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdatePhoneMessageQrdlResponseBody getBody() {
        return this.body;
    }

}
