// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cams20200606.models;

import com.aliyun.tea.*;

public class CreatePhoneMessageQrdlResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreatePhoneMessageQrdlResponseBody body;

    public static CreatePhoneMessageQrdlResponse build(java.util.Map<String, ?> map) throws Exception {
        CreatePhoneMessageQrdlResponse self = new CreatePhoneMessageQrdlResponse();
        return TeaModel.build(map, self);
    }

    public CreatePhoneMessageQrdlResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreatePhoneMessageQrdlResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreatePhoneMessageQrdlResponse setBody(CreatePhoneMessageQrdlResponseBody body) {
        this.body = body;
        return this;
    }
    public CreatePhoneMessageQrdlResponseBody getBody() {
        return this.body;
    }

}
