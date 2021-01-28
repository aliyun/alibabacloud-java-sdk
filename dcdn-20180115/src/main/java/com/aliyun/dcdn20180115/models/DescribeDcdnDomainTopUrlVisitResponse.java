// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dcdn20180115.models;

import com.aliyun.tea.*;

public class DescribeDcdnDomainTopUrlVisitResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
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

    public DescribeDcdnDomainTopUrlVisitResponse setBody(DescribeDcdnDomainTopUrlVisitResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeDcdnDomainTopUrlVisitResponseBody getBody() {
        return this.body;
    }

}
