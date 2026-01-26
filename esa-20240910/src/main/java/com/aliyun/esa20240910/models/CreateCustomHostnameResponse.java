// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class CreateCustomHostnameResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateCustomHostnameResponseBody body;

    public static CreateCustomHostnameResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateCustomHostnameResponse self = new CreateCustomHostnameResponse();
        return TeaModel.build(map, self);
    }

    public CreateCustomHostnameResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateCustomHostnameResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateCustomHostnameResponse setBody(CreateCustomHostnameResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateCustomHostnameResponseBody getBody() {
        return this.body;
    }

}
