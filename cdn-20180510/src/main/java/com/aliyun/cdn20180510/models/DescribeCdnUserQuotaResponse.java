// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cdn20180510.models;

import com.aliyun.tea.*;

public class DescribeCdnUserQuotaResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeCdnUserQuotaResponseBody body;

    public static DescribeCdnUserQuotaResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeCdnUserQuotaResponse self = new DescribeCdnUserQuotaResponse();
        return TeaModel.build(map, self);
    }

    public DescribeCdnUserQuotaResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeCdnUserQuotaResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeCdnUserQuotaResponse setBody(DescribeCdnUserQuotaResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeCdnUserQuotaResponseBody getBody() {
        return this.body;
    }

}
