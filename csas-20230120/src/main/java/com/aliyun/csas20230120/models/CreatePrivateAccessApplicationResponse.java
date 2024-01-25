// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.csas20230120.models;

import com.aliyun.tea.*;

public class CreatePrivateAccessApplicationResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreatePrivateAccessApplicationResponseBody body;

    public static CreatePrivateAccessApplicationResponse build(java.util.Map<String, ?> map) throws Exception {
        CreatePrivateAccessApplicationResponse self = new CreatePrivateAccessApplicationResponse();
        return TeaModel.build(map, self);
    }

    public CreatePrivateAccessApplicationResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreatePrivateAccessApplicationResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreatePrivateAccessApplicationResponse setBody(CreatePrivateAccessApplicationResponseBody body) {
        this.body = body;
        return this;
    }
    public CreatePrivateAccessApplicationResponseBody getBody() {
        return this.body;
    }

}
