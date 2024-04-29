// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddoscoo20200101.models;

import com.aliyun.tea.*;

public class CreatePortResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreatePortResponseBody body;

    public static CreatePortResponse build(java.util.Map<String, ?> map) throws Exception {
        CreatePortResponse self = new CreatePortResponse();
        return TeaModel.build(map, self);
    }

    public CreatePortResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreatePortResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreatePortResponse setBody(CreatePortResponseBody body) {
        this.body = body;
        return this;
    }
    public CreatePortResponseBody getBody() {
        return this.body;
    }

}
