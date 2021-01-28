// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dcdn20180115.models;

import com.aliyun.tea.*;

public class DescribeDcdnIpaUserDomainsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
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

    public DescribeDcdnIpaUserDomainsResponse setBody(DescribeDcdnIpaUserDomainsResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeDcdnIpaUserDomainsResponseBody getBody() {
        return this.body;
    }

}
