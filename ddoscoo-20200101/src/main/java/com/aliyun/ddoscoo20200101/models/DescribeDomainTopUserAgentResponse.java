// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddoscoo20200101.models;

import com.aliyun.tea.*;

public class DescribeDomainTopUserAgentResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeDomainTopUserAgentResponseBody body;

    public static DescribeDomainTopUserAgentResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeDomainTopUserAgentResponse self = new DescribeDomainTopUserAgentResponse();
        return TeaModel.build(map, self);
    }

    public DescribeDomainTopUserAgentResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeDomainTopUserAgentResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeDomainTopUserAgentResponse setBody(DescribeDomainTopUserAgentResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeDomainTopUserAgentResponseBody getBody() {
        return this.body;
    }

}
