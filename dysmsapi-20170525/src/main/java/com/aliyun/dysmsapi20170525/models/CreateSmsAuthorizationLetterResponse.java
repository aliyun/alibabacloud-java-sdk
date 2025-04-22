// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dysmsapi20170525.models;

import com.aliyun.tea.*;

public class CreateSmsAuthorizationLetterResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateSmsAuthorizationLetterResponseBody body;

    public static CreateSmsAuthorizationLetterResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateSmsAuthorizationLetterResponse self = new CreateSmsAuthorizationLetterResponse();
        return TeaModel.build(map, self);
    }

    public CreateSmsAuthorizationLetterResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateSmsAuthorizationLetterResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateSmsAuthorizationLetterResponse setBody(CreateSmsAuthorizationLetterResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateSmsAuthorizationLetterResponseBody getBody() {
        return this.body;
    }

}
