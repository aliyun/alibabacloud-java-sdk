// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.devops20210625.models;

import com.aliyun.tea.*;

public class CreateWorkitemResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateWorkitemResponseBody body;

    public static CreateWorkitemResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateWorkitemResponse self = new CreateWorkitemResponse();
        return TeaModel.build(map, self);
    }

    public CreateWorkitemResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateWorkitemResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateWorkitemResponse setBody(CreateWorkitemResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateWorkitemResponseBody getBody() {
        return this.body;
    }

}
