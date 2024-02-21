// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cdn20180510.models;

import com.aliyun.tea.*;

public class DescribeDomainTopUrlVisitResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeDomainTopUrlVisitResponseBody body;

    public static DescribeDomainTopUrlVisitResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeDomainTopUrlVisitResponse self = new DescribeDomainTopUrlVisitResponse();
        return TeaModel.build(map, self);
    }

    public DescribeDomainTopUrlVisitResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeDomainTopUrlVisitResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeDomainTopUrlVisitResponse setBody(DescribeDomainTopUrlVisitResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeDomainTopUrlVisitResponseBody getBody() {
        return this.body;
    }

}
