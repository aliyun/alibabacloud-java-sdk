// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.advisor20180120.models;

import com.aliyun.tea.*;

public class DescribeAdvisorChecksResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeAdvisorChecksResponseBody body;

    public static DescribeAdvisorChecksResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeAdvisorChecksResponse self = new DescribeAdvisorChecksResponse();
        return TeaModel.build(map, self);
    }

    public DescribeAdvisorChecksResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeAdvisorChecksResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeAdvisorChecksResponse setBody(DescribeAdvisorChecksResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeAdvisorChecksResponseBody getBody() {
        return this.body;
    }

}
