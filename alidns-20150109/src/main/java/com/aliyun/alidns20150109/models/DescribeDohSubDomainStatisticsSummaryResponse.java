// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class DescribeDohSubDomainStatisticsSummaryResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
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

    public DescribeDohSubDomainStatisticsSummaryResponse setBody(DescribeDohSubDomainStatisticsSummaryResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeDohSubDomainStatisticsSummaryResponseBody getBody() {
        return this.body;
    }

}
