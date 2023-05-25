// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.das20200116.models;

import com.aliyun.tea.*;

public class CreateQueryOptimizeTagResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public CreateQueryOptimizeTagResponseBody body;

    public static CreateQueryOptimizeTagResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateQueryOptimizeTagResponse self = new CreateQueryOptimizeTagResponse();
        return TeaModel.build(map, self);
    }

    public CreateQueryOptimizeTagResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateQueryOptimizeTagResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateQueryOptimizeTagResponse setBody(CreateQueryOptimizeTagResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateQueryOptimizeTagResponseBody getBody() {
        return this.body;
    }

}
