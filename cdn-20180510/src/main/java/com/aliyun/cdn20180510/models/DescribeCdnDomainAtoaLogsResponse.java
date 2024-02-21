// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cdn20180510.models;

import com.aliyun.tea.*;

public class DescribeCdnDomainAtoaLogsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeCdnDomainAtoaLogsResponseBody body;

    public static DescribeCdnDomainAtoaLogsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeCdnDomainAtoaLogsResponse self = new DescribeCdnDomainAtoaLogsResponse();
        return TeaModel.build(map, self);
    }

    public DescribeCdnDomainAtoaLogsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeCdnDomainAtoaLogsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeCdnDomainAtoaLogsResponse setBody(DescribeCdnDomainAtoaLogsResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeCdnDomainAtoaLogsResponseBody getBody() {
        return this.body;
    }

}
