// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class DescribeDomainStatisticsSummaryResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeDomainStatisticsSummaryResponseBody body;

    public static DescribeDomainStatisticsSummaryResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeDomainStatisticsSummaryResponse self = new DescribeDomainStatisticsSummaryResponse();
        return TeaModel.build(map, self);
    }

    public DescribeDomainStatisticsSummaryResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeDomainStatisticsSummaryResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeDomainStatisticsSummaryResponse setBody(DescribeDomainStatisticsSummaryResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeDomainStatisticsSummaryResponseBody getBody() {
        return this.body;
    }

}
