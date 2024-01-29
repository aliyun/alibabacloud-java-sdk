// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class DescribeDohSubDomainStatisticsSummaryResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeDohSubDomainStatisticsSummaryResponseBody body;

    public static DescribeDohSubDomainStatisticsSummaryResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeDohSubDomainStatisticsSummaryResponse self = new DescribeDohSubDomainStatisticsSummaryResponse();
        return TeaModel.build(map, self);
    }

    public DescribeDohSubDomainStatisticsSummaryResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeDohSubDomainStatisticsSummaryResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeDohSubDomainStatisticsSummaryResponse setBody(DescribeDohSubDomainStatisticsSummaryResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeDohSubDomainStatisticsSummaryResponseBody getBody() {
        return this.body;
    }

}
