// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class DescribeDnsCacheDomainsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeDnsCacheDomainsResponseBody body;

    public static DescribeDnsCacheDomainsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeDnsCacheDomainsResponse self = new DescribeDnsCacheDomainsResponse();
        return TeaModel.build(map, self);
    }

    public DescribeDnsCacheDomainsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeDnsCacheDomainsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeDnsCacheDomainsResponse setBody(DescribeDnsCacheDomainsResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeDnsCacheDomainsResponseBody getBody() {
        return this.body;
    }

}
