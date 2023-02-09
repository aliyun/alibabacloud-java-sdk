// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aisearch20230101.models;

import com.aliyun.tea.*;

public class CreateBatchTasksResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public CreateBatchTasksResponseBody body;

    public static CreateBatchTasksResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateBatchTasksResponse self = new CreateBatchTasksResponse();
        return TeaModel.build(map, self);
    }

    public CreateBatchTasksResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateBatchTasksResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateBatchTasksResponse setBody(CreateBatchTasksResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateBatchTasksResponseBody getBody() {
        return this.body;
    }

}
