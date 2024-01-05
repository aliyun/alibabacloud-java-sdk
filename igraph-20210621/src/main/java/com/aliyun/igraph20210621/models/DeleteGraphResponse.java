// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.igraph20210621.models;

import com.aliyun.tea.*;

public class DeleteGraphResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteGraphResponseBody body;

    public static DeleteGraphResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteGraphResponse self = new DeleteGraphResponse();
        return TeaModel.build(map, self);
    }

    public DeleteGraphResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteGraphResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteGraphResponse setBody(DeleteGraphResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteGraphResponseBody getBody() {
        return this.body;
    }

}
