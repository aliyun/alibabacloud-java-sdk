// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dcdn20180115.models;

import com.aliyun.tea.*;

public class DescribeDcdnDomainTopReferVisitResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeDcdnDomainTopReferVisitResponseBody body;

    public static DescribeDcdnDomainTopReferVisitResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeDcdnDomainTopReferVisitResponse self = new DescribeDcdnDomainTopReferVisitResponse();
        return TeaModel.build(map, self);
    }

    public DescribeDcdnDomainTopReferVisitResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeDcdnDomainTopReferVisitResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeDcdnDomainTopReferVisitResponse setBody(DescribeDcdnDomainTopReferVisitResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeDcdnDomainTopReferVisitResponseBody getBody() {
        return this.body;
    }

}
