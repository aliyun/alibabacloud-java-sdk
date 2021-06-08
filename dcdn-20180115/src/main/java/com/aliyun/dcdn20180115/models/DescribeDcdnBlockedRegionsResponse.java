// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dcdn20180115.models;

import com.aliyun.tea.*;

public class DescribeDcdnBlockedRegionsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeDcdnBlockedRegionsResponseBody body;

    public static DescribeDcdnBlockedRegionsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeDcdnBlockedRegionsResponse self = new DescribeDcdnBlockedRegionsResponse();
        return TeaModel.build(map, self);
    }

    public DescribeDcdnBlockedRegionsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeDcdnBlockedRegionsResponse setBody(DescribeDcdnBlockedRegionsResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeDcdnBlockedRegionsResponseBody getBody() {
        return this.body;
    }

}
