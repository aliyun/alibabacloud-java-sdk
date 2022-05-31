// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.config20200907.models;

import com.aliyun.tea.*;

public class CreateAggregatorResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public CreateAggregatorResponseBody body;

    public static CreateAggregatorResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateAggregatorResponse self = new CreateAggregatorResponse();
        return TeaModel.build(map, self);
    }

    public CreateAggregatorResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateAggregatorResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateAggregatorResponse setBody(CreateAggregatorResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateAggregatorResponseBody getBody() {
        return this.body;
    }

}
