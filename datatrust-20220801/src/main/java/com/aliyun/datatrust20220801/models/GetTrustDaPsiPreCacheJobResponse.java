// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.datatrust20220801.models;

import com.aliyun.tea.*;

public class GetTrustDaPsiPreCacheJobResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public GetTrustDaPsiPreCacheJobResponseBody body;

    public static GetTrustDaPsiPreCacheJobResponse build(java.util.Map<String, ?> map) throws Exception {
        GetTrustDaPsiPreCacheJobResponse self = new GetTrustDaPsiPreCacheJobResponse();
        return TeaModel.build(map, self);
    }

    public GetTrustDaPsiPreCacheJobResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetTrustDaPsiPreCacheJobResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetTrustDaPsiPreCacheJobResponse setBody(GetTrustDaPsiPreCacheJobResponseBody body) {
        this.body = body;
        return this;
    }
    public GetTrustDaPsiPreCacheJobResponseBody getBody() {
        return this.body;
    }

}
