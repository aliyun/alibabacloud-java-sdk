// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class DescribeDomainResolveStatisticsSummaryResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeDomainResolveStatisticsSummaryResponseBody body;

    public static DescribeDomainResolveStatisticsSummaryResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeDomainResolveStatisticsSummaryResponse self = new DescribeDomainResolveStatisticsSummaryResponse();
        return TeaModel.build(map, self);
    }

    public DescribeDomainResolveStatisticsSummaryResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeDomainResolveStatisticsSummaryResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeDomainResolveStatisticsSummaryResponse setBody(DescribeDomainResolveStatisticsSummaryResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeDomainResolveStatisticsSummaryResponseBody getBody() {
        return this.body;
    }

}
