// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.airec20201126.models;

import com.aliyun.tea.*;

public class DeleteFilteringAlgorithmResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteFilteringAlgorithmResponseBody body;

    public static DeleteFilteringAlgorithmResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteFilteringAlgorithmResponse self = new DeleteFilteringAlgorithmResponse();
        return TeaModel.build(map, self);
    }

    public DeleteFilteringAlgorithmResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteFilteringAlgorithmResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteFilteringAlgorithmResponse setBody(DeleteFilteringAlgorithmResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteFilteringAlgorithmResponseBody getBody() {
        return this.body;
    }

}
