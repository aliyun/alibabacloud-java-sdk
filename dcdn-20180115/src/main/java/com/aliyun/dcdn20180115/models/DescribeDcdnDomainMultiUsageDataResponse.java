// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dcdn20180115.models;

import com.aliyun.tea.*;

public class DescribeDcdnDomainMultiUsageDataResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeDcdnDomainMultiUsageDataResponseBody body;

    public static DescribeDcdnDomainMultiUsageDataResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeDcdnDomainMultiUsageDataResponse self = new DescribeDcdnDomainMultiUsageDataResponse();
        return TeaModel.build(map, self);
    }

    public DescribeDcdnDomainMultiUsageDataResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeDcdnDomainMultiUsageDataResponse setBody(DescribeDcdnDomainMultiUsageDataResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeDcdnDomainMultiUsageDataResponseBody getBody() {
        return this.body;
    }

}
