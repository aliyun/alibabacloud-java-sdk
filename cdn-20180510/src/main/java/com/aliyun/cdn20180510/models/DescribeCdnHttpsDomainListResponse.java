// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cdn20180510.models;

import com.aliyun.tea.*;

public class DescribeCdnHttpsDomainListResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeCdnHttpsDomainListResponseBody body;

    public static DescribeCdnHttpsDomainListResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeCdnHttpsDomainListResponse self = new DescribeCdnHttpsDomainListResponse();
        return TeaModel.build(map, self);
    }

    public DescribeCdnHttpsDomainListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeCdnHttpsDomainListResponse setBody(DescribeCdnHttpsDomainListResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeCdnHttpsDomainListResponseBody getBody() {
        return this.body;
    }

}
