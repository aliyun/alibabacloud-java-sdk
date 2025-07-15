// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class DescribeLiveDomainLogExTtlResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeLiveDomainLogExTtlResponseBody body;

    public static DescribeLiveDomainLogExTtlResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeLiveDomainLogExTtlResponse self = new DescribeLiveDomainLogExTtlResponse();
        return TeaModel.build(map, self);
    }

    public DescribeLiveDomainLogExTtlResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeLiveDomainLogExTtlResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeLiveDomainLogExTtlResponse setBody(DescribeLiveDomainLogExTtlResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeLiveDomainLogExTtlResponseBody getBody() {
        return this.body;
    }

}
