// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cdn20180510.models;

import com.aliyun.tea.*;

public class DescribeDomainFileSizeProportionDataResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeDomainFileSizeProportionDataResponseBody body;

    public static DescribeDomainFileSizeProportionDataResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeDomainFileSizeProportionDataResponse self = new DescribeDomainFileSizeProportionDataResponse();
        return TeaModel.build(map, self);
    }

    public DescribeDomainFileSizeProportionDataResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeDomainFileSizeProportionDataResponse setBody(DescribeDomainFileSizeProportionDataResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeDomainFileSizeProportionDataResponseBody getBody() {
        return this.body;
    }

}
