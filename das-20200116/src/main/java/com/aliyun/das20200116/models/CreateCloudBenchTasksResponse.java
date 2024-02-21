// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.das20200116.models;

import com.aliyun.tea.*;

public class CreateCloudBenchTasksResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateCloudBenchTasksResponseBody body;

    public static CreateCloudBenchTasksResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateCloudBenchTasksResponse self = new CreateCloudBenchTasksResponse();
        return TeaModel.build(map, self);
    }

    public CreateCloudBenchTasksResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateCloudBenchTasksResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateCloudBenchTasksResponse setBody(CreateCloudBenchTasksResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateCloudBenchTasksResponseBody getBody() {
        return this.body;
    }

}
