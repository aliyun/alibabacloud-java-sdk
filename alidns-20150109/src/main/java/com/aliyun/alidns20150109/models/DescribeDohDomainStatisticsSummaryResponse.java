// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class DescribeDohDomainStatisticsSummaryResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
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

    public DescribeDohDomainStatisticsSummaryResponse setBody(DescribeDohDomainStatisticsSummaryResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeDohDomainStatisticsSummaryResponseBody getBody() {
        return this.body;
    }

}
