// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cdn20180510.models;

import com.aliyun.tea.*;

public class DescribeDomainPathDataResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeDomainPathDataResponseBody body;

    public static DescribeDomainPathDataResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeDomainPathDataResponse self = new DescribeDomainPathDataResponse();
        return TeaModel.build(map, self);
    }

    public DescribeDomainPathDataResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeDomainPathDataResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeDomainPathDataResponse setBody(DescribeDomainPathDataResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeDomainPathDataResponseBody getBody() {
        return this.body;
    }

}
