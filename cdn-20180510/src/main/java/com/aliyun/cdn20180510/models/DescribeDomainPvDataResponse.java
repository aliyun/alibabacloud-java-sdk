// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cdn20180510.models;

import com.aliyun.tea.*;

public class DescribeDomainPvDataResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeDomainPvDataResponseBody body;

    public static DescribeDomainPvDataResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeDomainPvDataResponse self = new DescribeDomainPvDataResponse();
        return TeaModel.build(map, self);
    }

    public DescribeDomainPvDataResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeDomainPvDataResponse setBody(DescribeDomainPvDataResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeDomainPvDataResponseBody getBody() {
        return this.body;
    }

}
