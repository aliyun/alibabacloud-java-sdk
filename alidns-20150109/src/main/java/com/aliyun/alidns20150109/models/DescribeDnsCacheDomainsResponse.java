// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class DescribeDnsCacheDomainsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
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

    public DescribeDnsCacheDomainsResponse setBody(DescribeDnsCacheDomainsResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeDnsCacheDomainsResponseBody getBody() {
        return this.body;
    }

}
