// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cdn20180510.models;

import com.aliyun.tea.*;

public class DescribeCdnDomainLogsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeCdnDomainLogsResponseBody body;

    public static DescribeCdnDomainLogsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeCdnDomainLogsResponse self = new DescribeCdnDomainLogsResponse();
        return TeaModel.build(map, self);
    }

    public DescribeCdnDomainLogsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeCdnDomainLogsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeCdnDomainLogsResponse setBody(DescribeCdnDomainLogsResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeCdnDomainLogsResponseBody getBody() {
        return this.body;
    }

}
