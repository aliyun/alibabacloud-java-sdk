// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.config20200907.models;

import com.aliyun.tea.*;

public class CreateAggregateRemediationResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateAggregateRemediationResponseBody body;

    public static CreateAggregateRemediationResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateAggregateRemediationResponse self = new CreateAggregateRemediationResponse();
        return TeaModel.build(map, self);
    }

    public CreateAggregateRemediationResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateAggregateRemediationResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateAggregateRemediationResponse setBody(CreateAggregateRemediationResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateAggregateRemediationResponseBody getBody() {
        return this.body;
    }

}
