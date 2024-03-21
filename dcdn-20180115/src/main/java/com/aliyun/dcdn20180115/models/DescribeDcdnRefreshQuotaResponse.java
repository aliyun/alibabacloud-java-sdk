// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dcdn20180115.models;

import com.aliyun.tea.*;

public class DescribeDcdnRefreshQuotaResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeDcdnRefreshQuotaResponseBody body;

    public static DescribeDcdnRefreshQuotaResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeDcdnRefreshQuotaResponse self = new DescribeDcdnRefreshQuotaResponse();
        return TeaModel.build(map, self);
    }

    public DescribeDcdnRefreshQuotaResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeDcdnRefreshQuotaResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeDcdnRefreshQuotaResponse setBody(DescribeDcdnRefreshQuotaResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeDcdnRefreshQuotaResponseBody getBody() {
        return this.body;
    }

}
