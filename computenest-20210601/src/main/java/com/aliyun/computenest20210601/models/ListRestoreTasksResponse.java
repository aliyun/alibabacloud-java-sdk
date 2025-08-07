// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.computenest20210601.models;

import com.aliyun.tea.*;

public class ListRestoreTasksResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListRestoreTasksResponseBody body;

    public static ListRestoreTasksResponse build(java.util.Map<String, ?> map) throws Exception {
        ListRestoreTasksResponse self = new ListRestoreTasksResponse();
        return TeaModel.build(map, self);
    }

    public ListRestoreTasksResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListRestoreTasksResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListRestoreTasksResponse setBody(ListRestoreTasksResponseBody body) {
        this.body = body;
        return this;
    }
    public ListRestoreTasksResponseBody getBody() {
        return this.body;
    }

}
