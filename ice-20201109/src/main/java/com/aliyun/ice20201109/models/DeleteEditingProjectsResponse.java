// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class DeleteEditingProjectsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteEditingProjectsResponseBody body;

    public static DeleteEditingProjectsResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteEditingProjectsResponse self = new DeleteEditingProjectsResponse();
        return TeaModel.build(map, self);
    }

    public DeleteEditingProjectsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteEditingProjectsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteEditingProjectsResponse setBody(DeleteEditingProjectsResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteEditingProjectsResponseBody getBody() {
        return this.body;
    }

}
