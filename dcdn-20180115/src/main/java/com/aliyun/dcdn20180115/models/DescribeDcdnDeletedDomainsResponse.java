// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dcdn20180115.models;

import com.aliyun.tea.*;

public class DescribeDcdnDeletedDomainsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
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

    public DescribeDcdnDeletedDomainsResponse setBody(DescribeDcdnDeletedDomainsResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeDcdnDeletedDomainsResponseBody getBody() {
        return this.body;
    }

}
