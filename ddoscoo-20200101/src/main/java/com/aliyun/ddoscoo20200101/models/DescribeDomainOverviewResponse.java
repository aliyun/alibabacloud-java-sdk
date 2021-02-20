// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddoscoo20200101.models;

import com.aliyun.tea.*;

public class DescribeDomainOverviewResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeDomainOverviewResponseBody body;

    public static DescribeDomainOverviewResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeDomainOverviewResponse self = new DescribeDomainOverviewResponse();
        return TeaModel.build(map, self);
    }

    public DescribeDomainOverviewResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeDomainOverviewResponse setBody(DescribeDomainOverviewResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeDomainOverviewResponseBody getBody() {
        return this.body;
    }

}
