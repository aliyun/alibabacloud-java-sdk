// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20211201.models;

import com.aliyun.tea.*;

public class ListApsOptimizationTasksResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListApsOptimizationTasksResponseBody body;

    public static ListApsOptimizationTasksResponse build(java.util.Map<String, ?> map) throws Exception {
        ListApsOptimizationTasksResponse self = new ListApsOptimizationTasksResponse();
        return TeaModel.build(map, self);
    }

    public ListApsOptimizationTasksResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListApsOptimizationTasksResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListApsOptimizationTasksResponse setBody(ListApsOptimizationTasksResponseBody body) {
        this.body = body;
        return this;
    }
    public ListApsOptimizationTasksResponseBody getBody() {
        return this.body;
    }

}
