// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class DescribeOutgoingDomainResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeOutgoingDomainResponseBody body;

    public static DescribeOutgoingDomainResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeOutgoingDomainResponse self = new DescribeOutgoingDomainResponse();
        return TeaModel.build(map, self);
    }

    public DescribeOutgoingDomainResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeOutgoingDomainResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeOutgoingDomainResponse setBody(DescribeOutgoingDomainResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeOutgoingDomainResponseBody getBody() {
        return this.body;
    }

}
