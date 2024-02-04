// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imm20200930.models;

import com.aliyun.tea.*;

public class CreateLocationDateClusteringTaskResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateLocationDateClusteringTaskResponseBody body;

    public static CreateLocationDateClusteringTaskResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateLocationDateClusteringTaskResponse self = new CreateLocationDateClusteringTaskResponse();
        return TeaModel.build(map, self);
    }

    public CreateLocationDateClusteringTaskResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateLocationDateClusteringTaskResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateLocationDateClusteringTaskResponse setBody(CreateLocationDateClusteringTaskResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateLocationDateClusteringTaskResponseBody getBody() {
        return this.body;
    }

}
