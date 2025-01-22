// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class BatchUpdateTasksResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public BatchUpdateTasksResponseBody body;

    public static BatchUpdateTasksResponse build(java.util.Map<String, ?> map) throws Exception {
        BatchUpdateTasksResponse self = new BatchUpdateTasksResponse();
        return TeaModel.build(map, self);
    }

    public BatchUpdateTasksResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public BatchUpdateTasksResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public BatchUpdateTasksResponse setBody(BatchUpdateTasksResponseBody body) {
        this.body = body;
        return this;
    }
    public BatchUpdateTasksResponseBody getBody() {
        return this.body;
    }

}
