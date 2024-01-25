// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adp20210720.models;

import com.aliyun.tea.*;

public class BatchAddEnvironmentNodesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public BatchAddEnvironmentNodesResponseBody body;

    public static BatchAddEnvironmentNodesResponse build(java.util.Map<String, ?> map) throws Exception {
        BatchAddEnvironmentNodesResponse self = new BatchAddEnvironmentNodesResponse();
        return TeaModel.build(map, self);
    }

    public BatchAddEnvironmentNodesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public BatchAddEnvironmentNodesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public BatchAddEnvironmentNodesResponse setBody(BatchAddEnvironmentNodesResponseBody body) {
        this.body = body;
        return this;
    }
    public BatchAddEnvironmentNodesResponseBody getBody() {
        return this.body;
    }

}
