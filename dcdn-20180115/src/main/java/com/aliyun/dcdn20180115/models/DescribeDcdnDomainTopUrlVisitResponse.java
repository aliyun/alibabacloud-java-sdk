// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dcdn20180115.models;

import com.aliyun.tea.*;

public class DescribeDcdnDomainTopUrlVisitResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeDcdnDomainTopUrlVisitResponseBody body;

    public static DescribeDcdnDomainTopUrlVisitResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeDcdnDomainTopUrlVisitResponse self = new DescribeDcdnDomainTopUrlVisitResponse();
        return TeaModel.build(map, self);
    }

    public DescribeDcdnDomainTopUrlVisitResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeDcdnDomainTopUrlVisitResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeDcdnDomainTopUrlVisitResponse setBody(DescribeDcdnDomainTopUrlVisitResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeDcdnDomainTopUrlVisitResponseBody getBody() {
        return this.body;
    }

}
