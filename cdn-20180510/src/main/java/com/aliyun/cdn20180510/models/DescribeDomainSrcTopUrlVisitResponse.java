// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cdn20180510.models;

import com.aliyun.tea.*;

public class DescribeDomainSrcTopUrlVisitResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeDomainSrcTopUrlVisitResponseBody body;

    public static DescribeDomainSrcTopUrlVisitResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeDomainSrcTopUrlVisitResponse self = new DescribeDomainSrcTopUrlVisitResponse();
        return TeaModel.build(map, self);
    }

    public DescribeDomainSrcTopUrlVisitResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeDomainSrcTopUrlVisitResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeDomainSrcTopUrlVisitResponse setBody(DescribeDomainSrcTopUrlVisitResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeDomainSrcTopUrlVisitResponseBody getBody() {
        return this.body;
    }

}
