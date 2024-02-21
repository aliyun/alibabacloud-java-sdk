// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.elasticsearch20170613.models;

import com.aliyun.tea.*;

public class ListDataTasksResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListDataTasksResponseBody body;

    public static ListDataTasksResponse build(java.util.Map<String, ?> map) throws Exception {
        ListDataTasksResponse self = new ListDataTasksResponse();
        return TeaModel.build(map, self);
    }

    public ListDataTasksResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListDataTasksResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListDataTasksResponse setBody(ListDataTasksResponseBody body) {
        this.body = body;
        return this;
    }
    public ListDataTasksResponseBody getBody() {
        return this.body;
    }

}
