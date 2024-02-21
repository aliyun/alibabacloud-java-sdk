// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cdn20180510.models;

import com.aliyun.tea.*;

public class DescribeDomainTopReferVisitResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeDomainTopReferVisitResponseBody body;

    public static DescribeDomainTopReferVisitResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeDomainTopReferVisitResponse self = new DescribeDomainTopReferVisitResponse();
        return TeaModel.build(map, self);
    }

    public DescribeDomainTopReferVisitResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeDomainTopReferVisitResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeDomainTopReferVisitResponse setBody(DescribeDomainTopReferVisitResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeDomainTopReferVisitResponseBody getBody() {
        return this.body;
    }

}
