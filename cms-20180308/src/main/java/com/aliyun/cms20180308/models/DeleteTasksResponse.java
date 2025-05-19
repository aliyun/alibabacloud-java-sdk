// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20180308.models;

import com.aliyun.tea.*;

public class DeleteTasksResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteTasksResponseBody body;

    public static DeleteTasksResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteTasksResponse self = new DeleteTasksResponse();
        return TeaModel.build(map, self);
    }

    public DeleteTasksResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteTasksResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteTasksResponse setBody(DeleteTasksResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteTasksResponseBody getBody() {
        return this.body;
    }

}
