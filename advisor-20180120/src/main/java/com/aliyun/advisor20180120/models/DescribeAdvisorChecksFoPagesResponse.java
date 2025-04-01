// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.advisor20180120.models;

import com.aliyun.tea.*;

public class DescribeAdvisorChecksFoPagesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeAdvisorChecksFoPagesResponseBody body;

    public static DescribeAdvisorChecksFoPagesResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeAdvisorChecksFoPagesResponse self = new DescribeAdvisorChecksFoPagesResponse();
        return TeaModel.build(map, self);
    }

    public DescribeAdvisorChecksFoPagesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeAdvisorChecksFoPagesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeAdvisorChecksFoPagesResponse setBody(DescribeAdvisorChecksFoPagesResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeAdvisorChecksFoPagesResponseBody getBody() {
        return this.body;
    }

}
