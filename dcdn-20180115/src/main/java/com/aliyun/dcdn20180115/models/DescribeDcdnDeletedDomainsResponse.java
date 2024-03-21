// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dcdn20180115.models;

import com.aliyun.tea.*;

public class DescribeDcdnDeletedDomainsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeDcdnDeletedDomainsResponseBody body;

    public static DescribeDcdnDeletedDomainsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeDcdnDeletedDomainsResponse self = new DescribeDcdnDeletedDomainsResponse();
        return TeaModel.build(map, self);
    }

    public DescribeDcdnDeletedDomainsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeDcdnDeletedDomainsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeDcdnDeletedDomainsResponse setBody(DescribeDcdnDeletedDomainsResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeDcdnDeletedDomainsResponseBody getBody() {
        return this.body;
    }

}
