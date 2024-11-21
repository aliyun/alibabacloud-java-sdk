// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class CreateOriginProtectionResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateOriginProtectionResponseBody body;

    public static CreateOriginProtectionResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateOriginProtectionResponse self = new CreateOriginProtectionResponse();
        return TeaModel.build(map, self);
    }

    public CreateOriginProtectionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateOriginProtectionResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateOriginProtectionResponse setBody(CreateOriginProtectionResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateOriginProtectionResponseBody getBody() {
        return this.body;
    }

}
