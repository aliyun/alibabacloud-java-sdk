// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.das20200116.models;

import com.aliyun.tea.*;

public class CreateCloudBenchTasksResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
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

    public CreateCloudBenchTasksResponse setBody(CreateCloudBenchTasksResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateCloudBenchTasksResponseBody getBody() {
        return this.body;
    }

}
