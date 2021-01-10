// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class DescribeLiveUserDomainsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeLiveUserDomainsResponseBody body;

    public static DescribeLiveUserDomainsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeLiveUserDomainsResponse self = new DescribeLiveUserDomainsResponse();
        return TeaModel.build(map, self);
    }

    public DescribeLiveUserDomainsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeLiveUserDomainsResponse setBody(DescribeLiveUserDomainsResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeLiveUserDomainsResponseBody getBody() {
        return this.body;
    }

}
