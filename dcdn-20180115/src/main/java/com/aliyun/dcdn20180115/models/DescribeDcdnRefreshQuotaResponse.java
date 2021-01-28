// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dcdn20180115.models;

import com.aliyun.tea.*;

public class DescribeDcdnRefreshQuotaResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
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

    public DescribeDcdnRefreshQuotaResponse setBody(DescribeDcdnRefreshQuotaResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeDcdnRefreshQuotaResponseBody getBody() {
        return this.body;
    }

}
