// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cdn20180510.models;

import com.aliyun.tea.*;

public class DescribeDomainMultiUsageDataResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeDomainMultiUsageDataResponseBody body;

    public static DescribeDomainMultiUsageDataResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeDomainMultiUsageDataResponse self = new DescribeDomainMultiUsageDataResponse();
        return TeaModel.build(map, self);
    }

    public DescribeDomainMultiUsageDataResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeDomainMultiUsageDataResponse setBody(DescribeDomainMultiUsageDataResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeDomainMultiUsageDataResponseBody getBody() {
        return this.body;
    }

}
