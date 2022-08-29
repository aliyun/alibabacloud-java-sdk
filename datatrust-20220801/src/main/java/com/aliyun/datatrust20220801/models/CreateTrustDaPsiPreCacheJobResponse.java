// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.datatrust20220801.models;

import com.aliyun.tea.*;

public class CreateTrustDaPsiPreCacheJobResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public CreateTrustDaPsiPreCacheJobResponseBody body;

    public static CreateTrustDaPsiPreCacheJobResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateTrustDaPsiPreCacheJobResponse self = new CreateTrustDaPsiPreCacheJobResponse();
        return TeaModel.build(map, self);
    }

    public CreateTrustDaPsiPreCacheJobResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateTrustDaPsiPreCacheJobResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateTrustDaPsiPreCacheJobResponse setBody(CreateTrustDaPsiPreCacheJobResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateTrustDaPsiPreCacheJobResponseBody getBody() {
        return this.body;
    }

}
