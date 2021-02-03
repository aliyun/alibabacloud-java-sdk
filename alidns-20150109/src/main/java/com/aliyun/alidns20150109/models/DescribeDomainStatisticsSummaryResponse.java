// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class DescribeDomainStatisticsSummaryResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
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

    public DescribeDomainStatisticsSummaryResponse setBody(DescribeDomainStatisticsSummaryResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeDomainStatisticsSummaryResponseBody getBody() {
        return this.body;
    }

}
