// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ehpc20180412.models;

import com.aliyun.tea.*;

public class CreateGWSImageResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateGWSImageResponseBody body;

    public static CreateGWSImageResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateGWSImageResponse self = new CreateGWSImageResponse();
        return TeaModel.build(map, self);
    }

    public CreateGWSImageResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateGWSImageResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateGWSImageResponse setBody(CreateGWSImageResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateGWSImageResponseBody getBody() {
        return this.body;
    }

}
