// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddoscoo20200101.models;

import com.aliyun.tea.*;

public class DescribeWebCCRulesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeWebCCRulesResponseBody body;

    public static DescribeWebCCRulesResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeWebCCRulesResponse self = new DescribeWebCCRulesResponse();
        return TeaModel.build(map, self);
    }

    public DescribeWebCCRulesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeWebCCRulesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeWebCCRulesResponse setBody(DescribeWebCCRulesResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeWebCCRulesResponseBody getBody() {
        return this.body;
    }

}
