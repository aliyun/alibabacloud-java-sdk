// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cdn20180510.models;

import com.aliyun.tea.*;

public class DescribeDomainUvDataResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeDomainUvDataResponseBody body;

    public static DescribeDomainUvDataResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeDomainUvDataResponse self = new DescribeDomainUvDataResponse();
        return TeaModel.build(map, self);
    }

    public DescribeDomainUvDataResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeDomainUvDataResponse setBody(DescribeDomainUvDataResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeDomainUvDataResponseBody getBody() {
        return this.body;
    }

}
