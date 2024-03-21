// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dcdn20180115.models;

import com.aliyun.tea.*;

public class DescribeDcdnUserQuotaResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeDcdnUserQuotaResponseBody body;

    public static DescribeDcdnUserQuotaResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeDcdnUserQuotaResponse self = new DescribeDcdnUserQuotaResponse();
        return TeaModel.build(map, self);
    }

    public DescribeDcdnUserQuotaResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeDcdnUserQuotaResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeDcdnUserQuotaResponse setBody(DescribeDcdnUserQuotaResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeDcdnUserQuotaResponseBody getBody() {
        return this.body;
    }

}
