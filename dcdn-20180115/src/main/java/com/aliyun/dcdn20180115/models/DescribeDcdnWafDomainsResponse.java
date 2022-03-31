// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dcdn20180115.models;

import com.aliyun.tea.*;

public class DescribeDcdnWafDomainsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeDcdnWafDomainsResponseBody body;

    public static DescribeDcdnWafDomainsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeDcdnWafDomainsResponse self = new DescribeDcdnWafDomainsResponse();
        return TeaModel.build(map, self);
    }

    public DescribeDcdnWafDomainsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeDcdnWafDomainsResponse setBody(DescribeDcdnWafDomainsResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeDcdnWafDomainsResponseBody getBody() {
        return this.body;
    }

}
