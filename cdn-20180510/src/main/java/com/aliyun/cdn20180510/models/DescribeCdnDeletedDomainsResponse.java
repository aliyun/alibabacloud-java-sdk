// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cdn20180510.models;

import com.aliyun.tea.*;

public class DescribeCdnDeletedDomainsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeCdnDeletedDomainsResponseBody body;

    public static DescribeCdnDeletedDomainsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeCdnDeletedDomainsResponse self = new DescribeCdnDeletedDomainsResponse();
        return TeaModel.build(map, self);
    }

    public DescribeCdnDeletedDomainsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeCdnDeletedDomainsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeCdnDeletedDomainsResponse setBody(DescribeCdnDeletedDomainsResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeCdnDeletedDomainsResponseBody getBody() {
        return this.body;
    }

}
