// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aimiaobi20230801.models;

import com.aliyun.tea.*;

public class ListSearchTasksResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListSearchTasksResponseBody body;

    public static ListSearchTasksResponse build(java.util.Map<String, ?> map) throws Exception {
        ListSearchTasksResponse self = new ListSearchTasksResponse();
        return TeaModel.build(map, self);
    }

    public ListSearchTasksResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListSearchTasksResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListSearchTasksResponse setBody(ListSearchTasksResponseBody body) {
        this.body = body;
        return this;
    }
    public ListSearchTasksResponseBody getBody() {
        return this.body;
    }

}
