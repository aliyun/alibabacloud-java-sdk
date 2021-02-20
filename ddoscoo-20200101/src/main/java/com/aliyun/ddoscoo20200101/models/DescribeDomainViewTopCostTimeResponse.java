// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddoscoo20200101.models;

import com.aliyun.tea.*;

public class DescribeDomainViewTopCostTimeResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeDomainViewTopCostTimeResponseBody body;

    public static DescribeDomainViewTopCostTimeResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeDomainViewTopCostTimeResponse self = new DescribeDomainViewTopCostTimeResponse();
        return TeaModel.build(map, self);
    }

    public DescribeDomainViewTopCostTimeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeDomainViewTopCostTimeResponse setBody(DescribeDomainViewTopCostTimeResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeDomainViewTopCostTimeResponseBody getBody() {
        return this.body;
    }

}
