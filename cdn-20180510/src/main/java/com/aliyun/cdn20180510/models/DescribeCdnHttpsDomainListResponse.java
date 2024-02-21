// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cdn20180510.models;

import com.aliyun.tea.*;

public class DescribeCdnHttpsDomainListResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
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

    public DescribeCdnHttpsDomainListResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeCdnHttpsDomainListResponse setBody(DescribeCdnHttpsDomainListResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeCdnHttpsDomainListResponseBody getBody() {
        return this.body;
    }

}
