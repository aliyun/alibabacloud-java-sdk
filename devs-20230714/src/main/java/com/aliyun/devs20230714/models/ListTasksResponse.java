// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.devs20230714.models;

import com.aliyun.tea.*;

public class ListTasksResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public java.util.List<Task> body;

    public static ListTasksResponse build(java.util.Map<String, ?> map) throws Exception {
        ListTasksResponse self = new ListTasksResponse();
        return TeaModel.build(map, self);
    }

    public ListTasksResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListTasksResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListTasksResponse setBody(java.util.List<Task> body) {
        this.body = body;
        return this;
    }
    public java.util.List<Task> getBody() {
        return this.body;
    }

}
