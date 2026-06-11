// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aisc20260101.models;

import com.aliyun.tea.*;

public class ListSubTasksResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListSubTasksResponseBody body;

    public static ListSubTasksResponse build(java.util.Map<String, ?> map) throws Exception {
        ListSubTasksResponse self = new ListSubTasksResponse();
        return TeaModel.build(map, self);
    }

    public ListSubTasksResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListSubTasksResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListSubTasksResponse setBody(ListSubTasksResponseBody body) {
        this.body = body;
        return this;
    }
    public ListSubTasksResponseBody getBody() {
        return this.body;
    }

}
