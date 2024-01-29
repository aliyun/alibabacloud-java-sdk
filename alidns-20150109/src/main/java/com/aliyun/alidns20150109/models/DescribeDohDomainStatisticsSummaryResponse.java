// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class DescribeDohDomainStatisticsSummaryResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeDohDomainStatisticsSummaryResponseBody body;

    public static DescribeDohDomainStatisticsSummaryResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeDohDomainStatisticsSummaryResponse self = new DescribeDohDomainStatisticsSummaryResponse();
        return TeaModel.build(map, self);
    }

    public DescribeDohDomainStatisticsSummaryResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeDohDomainStatisticsSummaryResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeDohDomainStatisticsSummaryResponse setBody(DescribeDohDomainStatisticsSummaryResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeDohDomainStatisticsSummaryResponseBody getBody() {
        return this.body;
    }

}
