// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mm_multiply20210901.models;

import com.aliyun.tea.*;

public class CreateRainbowDistributionMallResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public CreateRainbowDistributionMallResponseBody body;

    public static CreateRainbowDistributionMallResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateRainbowDistributionMallResponse self = new CreateRainbowDistributionMallResponse();
        return TeaModel.build(map, self);
    }

    public CreateRainbowDistributionMallResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateRainbowDistributionMallResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateRainbowDistributionMallResponse setBody(CreateRainbowDistributionMallResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateRainbowDistributionMallResponseBody getBody() {
        return this.body;
    }

}
