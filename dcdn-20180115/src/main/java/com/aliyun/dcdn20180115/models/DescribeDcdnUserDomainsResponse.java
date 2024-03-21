// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dcdn20180115.models;

import com.aliyun.tea.*;

public class DescribeDcdnUserDomainsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeDcdnUserDomainsResponseBody body;

    public static DescribeDcdnUserDomainsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeDcdnUserDomainsResponse self = new DescribeDcdnUserDomainsResponse();
        return TeaModel.build(map, self);
    }

    public DescribeDcdnUserDomainsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeDcdnUserDomainsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeDcdnUserDomainsResponse setBody(DescribeDcdnUserDomainsResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeDcdnUserDomainsResponseBody getBody() {
        return this.body;
    }

}
