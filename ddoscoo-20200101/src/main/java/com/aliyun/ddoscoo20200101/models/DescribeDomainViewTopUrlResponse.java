// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddoscoo20200101.models;

import com.aliyun.tea.*;

public class DescribeDomainViewTopUrlResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeDomainViewTopUrlResponseBody body;

    public static DescribeDomainViewTopUrlResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeDomainViewTopUrlResponse self = new DescribeDomainViewTopUrlResponse();
        return TeaModel.build(map, self);
    }

    public DescribeDomainViewTopUrlResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeDomainViewTopUrlResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeDomainViewTopUrlResponse setBody(DescribeDomainViewTopUrlResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeDomainViewTopUrlResponseBody getBody() {
        return this.body;
    }

}
