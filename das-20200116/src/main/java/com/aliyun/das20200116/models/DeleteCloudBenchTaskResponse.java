// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.das20200116.models;

import com.aliyun.tea.*;

public class DeleteCloudBenchTaskResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteCloudBenchTaskResponseBody body;

    public static DeleteCloudBenchTaskResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteCloudBenchTaskResponse self = new DeleteCloudBenchTaskResponse();
        return TeaModel.build(map, self);
    }

    public DeleteCloudBenchTaskResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteCloudBenchTaskResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteCloudBenchTaskResponse setBody(DeleteCloudBenchTaskResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteCloudBenchTaskResponseBody getBody() {
        return this.body;
    }

}
