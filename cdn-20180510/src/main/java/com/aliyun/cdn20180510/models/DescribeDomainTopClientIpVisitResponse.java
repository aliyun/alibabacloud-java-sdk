// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cdn20180510.models;

import com.aliyun.tea.*;

public class DescribeDomainTopClientIpVisitResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeDomainTopClientIpVisitResponseBody body;

    public static DescribeDomainTopClientIpVisitResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeDomainTopClientIpVisitResponse self = new DescribeDomainTopClientIpVisitResponse();
        return TeaModel.build(map, self);
    }

    public DescribeDomainTopClientIpVisitResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeDomainTopClientIpVisitResponse setBody(DescribeDomainTopClientIpVisitResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeDomainTopClientIpVisitResponseBody getBody() {
        return this.body;
    }

}
