// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20240330.models;

import com.aliyun.tea.*;

public class DeleteContextsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteContextsResponseBody body;

    public static DeleteContextsResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteContextsResponse self = new DeleteContextsResponse();
        return TeaModel.build(map, self);
    }

    public DeleteContextsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteContextsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteContextsResponse setBody(DeleteContextsResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteContextsResponseBody getBody() {
        return this.body;
    }

}
