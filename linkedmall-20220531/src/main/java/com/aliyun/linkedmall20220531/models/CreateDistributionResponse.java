// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkedmall20220531.models;

import com.aliyun.tea.*;

public class CreateDistributionResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public CreateDistributionResponseBody body;

    public static CreateDistributionResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateDistributionResponse self = new CreateDistributionResponse();
        return TeaModel.build(map, self);
    }

    public CreateDistributionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateDistributionResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateDistributionResponse setBody(CreateDistributionResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateDistributionResponseBody getBody() {
        return this.body;
    }

}
