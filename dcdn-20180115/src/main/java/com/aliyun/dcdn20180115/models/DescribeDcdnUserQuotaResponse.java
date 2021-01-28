// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dcdn20180115.models;

import com.aliyun.tea.*;

public class DescribeDcdnUserQuotaResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
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

    public DescribeDcdnUserQuotaResponse setBody(DescribeDcdnUserQuotaResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeDcdnUserQuotaResponseBody getBody() {
        return this.body;
    }

}
