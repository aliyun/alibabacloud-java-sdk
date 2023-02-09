// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aisearch20230101.models;

import com.aliyun.tea.*;

public class ListBatchTasksResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public ListBatchTasksResponseBody body;

    public static ListBatchTasksResponse build(java.util.Map<String, ?> map) throws Exception {
        ListBatchTasksResponse self = new ListBatchTasksResponse();
        return TeaModel.build(map, self);
    }

    public ListBatchTasksResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListBatchTasksResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListBatchTasksResponse setBody(ListBatchTasksResponseBody body) {
        this.body = body;
        return this;
    }
    public ListBatchTasksResponseBody getBody() {
        return this.body;
    }

}
