// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.airec20201126.models;

import com.aliyun.tea.*;

public class CreateFilteringAlgorithmResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateFilteringAlgorithmResponseBody body;

    public static CreateFilteringAlgorithmResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateFilteringAlgorithmResponse self = new CreateFilteringAlgorithmResponse();
        return TeaModel.build(map, self);
    }

    public CreateFilteringAlgorithmResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateFilteringAlgorithmResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateFilteringAlgorithmResponse setBody(CreateFilteringAlgorithmResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateFilteringAlgorithmResponseBody getBody() {
        return this.body;
    }

}
