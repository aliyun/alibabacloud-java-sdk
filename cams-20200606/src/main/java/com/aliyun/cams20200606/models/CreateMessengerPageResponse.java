// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cams20200606.models;

import com.aliyun.tea.*;

public class CreateMessengerPageResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateMessengerPageResponseBody body;

    public static CreateMessengerPageResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateMessengerPageResponse self = new CreateMessengerPageResponse();
        return TeaModel.build(map, self);
    }

    public CreateMessengerPageResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateMessengerPageResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateMessengerPageResponse setBody(CreateMessengerPageResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateMessengerPageResponseBody getBody() {
        return this.body;
    }

}
