// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataphin_public20230630.models;

import com.aliyun.tea.*;

public class CreateComputeSourceResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateComputeSourceResponseBody body;

    public static CreateComputeSourceResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateComputeSourceResponse self = new CreateComputeSourceResponse();
        return TeaModel.build(map, self);
    }

    public CreateComputeSourceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateComputeSourceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateComputeSourceResponse setBody(CreateComputeSourceResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateComputeSourceResponseBody getBody() {
        return this.body;
    }

}
