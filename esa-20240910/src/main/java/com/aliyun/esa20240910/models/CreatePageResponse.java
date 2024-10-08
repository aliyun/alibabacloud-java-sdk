// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class CreatePageResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreatePageResponseBody body;

    public static CreatePageResponse build(java.util.Map<String, ?> map) throws Exception {
        CreatePageResponse self = new CreatePageResponse();
        return TeaModel.build(map, self);
    }

    public CreatePageResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreatePageResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreatePageResponse setBody(CreatePageResponseBody body) {
        this.body = body;
        return this;
    }
    public CreatePageResponseBody getBody() {
        return this.body;
    }

}
