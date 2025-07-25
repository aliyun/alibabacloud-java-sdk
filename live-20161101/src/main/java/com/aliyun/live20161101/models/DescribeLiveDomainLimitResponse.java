// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class DescribeLiveDomainLimitResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeLiveDomainLimitResponseBody body;

    public static DescribeLiveDomainLimitResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeLiveDomainLimitResponse self = new DescribeLiveDomainLimitResponse();
        return TeaModel.build(map, self);
    }

    public DescribeLiveDomainLimitResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeLiveDomainLimitResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeLiveDomainLimitResponse setBody(DescribeLiveDomainLimitResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeLiveDomainLimitResponseBody getBody() {
        return this.body;
    }

}
