// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dcdn20180115.models;

import com.aliyun.tea.*;

public class DescribeDcdnBlockedRegionsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
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

    public DescribeDcdnBlockedRegionsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeDcdnBlockedRegionsResponse setBody(DescribeDcdnBlockedRegionsResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeDcdnBlockedRegionsResponseBody getBody() {
        return this.body;
    }

}
