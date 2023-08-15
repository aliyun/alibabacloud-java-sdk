// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hbase20190101.models;

import com.aliyun.tea.*;

public class DescribeSubDomainResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeSubDomainResponseBody body;

    public static DescribeSubDomainResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeSubDomainResponse self = new DescribeSubDomainResponse();
        return TeaModel.build(map, self);
    }

    public DescribeSubDomainResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeSubDomainResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeSubDomainResponse setBody(DescribeSubDomainResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeSubDomainResponseBody getBody() {
        return this.body;
    }

}
