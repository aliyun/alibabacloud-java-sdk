// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.nas20170626.models;

import com.aliyun.tea.*;

public class CreateAccessPointResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateAccessPointResponseBody body;

    public static CreateAccessPointResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateAccessPointResponse self = new CreateAccessPointResponse();
        return TeaModel.build(map, self);
    }

    public CreateAccessPointResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateAccessPointResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateAccessPointResponse setBody(CreateAccessPointResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateAccessPointResponseBody getBody() {
        return this.body;
    }

}
