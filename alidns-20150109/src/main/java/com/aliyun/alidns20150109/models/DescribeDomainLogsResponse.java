// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class DescribeDomainLogsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeDomainLogsResponseBody body;

    public static DescribeDomainLogsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeDomainLogsResponse self = new DescribeDomainLogsResponse();
        return TeaModel.build(map, self);
    }

    public DescribeDomainLogsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeDomainLogsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeDomainLogsResponse setBody(DescribeDomainLogsResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeDomainLogsResponseBody getBody() {
        return this.body;
    }

}
