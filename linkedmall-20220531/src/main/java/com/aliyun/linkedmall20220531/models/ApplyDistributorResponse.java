// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkedmall20220531.models;

import com.aliyun.tea.*;

public class ApplyDistributorResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public ApplyDistributorResponseBody body;

    public static ApplyDistributorResponse build(java.util.Map<String, ?> map) throws Exception {
        ApplyDistributorResponse self = new ApplyDistributorResponse();
        return TeaModel.build(map, self);
    }

    public ApplyDistributorResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ApplyDistributorResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ApplyDistributorResponse setBody(ApplyDistributorResponseBody body) {
        this.body = body;
        return this;
    }
    public ApplyDistributorResponseBody getBody() {
        return this.body;
    }

}
