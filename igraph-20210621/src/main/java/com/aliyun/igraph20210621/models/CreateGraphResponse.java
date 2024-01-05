// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.igraph20210621.models;

import com.aliyun.tea.*;

public class CreateGraphResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public CreateGraphResponseBody body;

    public static CreateGraphResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateGraphResponse self = new CreateGraphResponse();
        return TeaModel.build(map, self);
    }

    public CreateGraphResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateGraphResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateGraphResponse setBody(CreateGraphResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateGraphResponseBody getBody() {
        return this.body;
    }

}
