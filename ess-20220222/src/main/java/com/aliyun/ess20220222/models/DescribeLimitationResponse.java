// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ess20220222.models;

import com.aliyun.tea.*;

public class DescribeLimitationResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeLimitationResponseBody body;

    public static DescribeLimitationResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeLimitationResponse self = new DescribeLimitationResponse();
        return TeaModel.build(map, self);
    }

    public DescribeLimitationResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeLimitationResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeLimitationResponse setBody(DescribeLimitationResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeLimitationResponseBody getBody() {
        return this.body;
    }

}
