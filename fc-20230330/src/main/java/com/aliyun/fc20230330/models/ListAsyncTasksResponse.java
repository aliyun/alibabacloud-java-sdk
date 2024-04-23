// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.fc20230330.models;

import com.aliyun.tea.*;

public class ListAsyncTasksResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListAsyncTaskOutput body;

    public static ListAsyncTasksResponse build(java.util.Map<String, ?> map) throws Exception {
        ListAsyncTasksResponse self = new ListAsyncTasksResponse();
        return TeaModel.build(map, self);
    }

    public ListAsyncTasksResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListAsyncTasksResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListAsyncTasksResponse setBody(ListAsyncTaskOutput body) {
        this.body = body;
        return this;
    }
    public ListAsyncTaskOutput getBody() {
        return this.body;
    }

}
