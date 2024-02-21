// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.elasticsearch20170613.models;

import com.aliyun.tea.*;

public class CreateDataTasksResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateDataTasksResponseBody body;

    public static CreateDataTasksResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateDataTasksResponse self = new CreateDataTasksResponse();
        return TeaModel.build(map, self);
    }

    public CreateDataTasksResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateDataTasksResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateDataTasksResponse setBody(CreateDataTasksResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateDataTasksResponseBody getBody() {
        return this.body;
    }

}
