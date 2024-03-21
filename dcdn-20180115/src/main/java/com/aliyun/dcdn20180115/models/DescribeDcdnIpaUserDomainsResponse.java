// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dcdn20180115.models;

import com.aliyun.tea.*;

public class DescribeDcdnIpaUserDomainsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeDcdnIpaUserDomainsResponseBody body;

    public static DescribeDcdnIpaUserDomainsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeDcdnIpaUserDomainsResponse self = new DescribeDcdnIpaUserDomainsResponse();
        return TeaModel.build(map, self);
    }

    public DescribeDcdnIpaUserDomainsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeDcdnIpaUserDomainsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeDcdnIpaUserDomainsResponse setBody(DescribeDcdnIpaUserDomainsResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeDcdnIpaUserDomainsResponseBody getBody() {
        return this.body;
    }

}
