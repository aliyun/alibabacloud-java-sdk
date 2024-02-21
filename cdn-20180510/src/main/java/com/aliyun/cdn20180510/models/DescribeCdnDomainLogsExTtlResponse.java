// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cdn20180510.models;

import com.aliyun.tea.*;

public class DescribeCdnDomainLogsExTtlResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeCdnDomainLogsExTtlResponseBody body;

    public static DescribeCdnDomainLogsExTtlResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeCdnDomainLogsExTtlResponse self = new DescribeCdnDomainLogsExTtlResponse();
        return TeaModel.build(map, self);
    }

    public DescribeCdnDomainLogsExTtlResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeCdnDomainLogsExTtlResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeCdnDomainLogsExTtlResponse setBody(DescribeCdnDomainLogsExTtlResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeCdnDomainLogsExTtlResponseBody getBody() {
        return this.body;
    }

}
