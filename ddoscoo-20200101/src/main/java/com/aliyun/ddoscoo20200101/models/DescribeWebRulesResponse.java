// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddoscoo20200101.models;

import com.aliyun.tea.*;

public class DescribeWebRulesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeWebRulesResponseBody body;

    public static DescribeWebRulesResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeWebRulesResponse self = new DescribeWebRulesResponse();
        return TeaModel.build(map, self);
    }

    public DescribeWebRulesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeWebRulesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeWebRulesResponse setBody(DescribeWebRulesResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeWebRulesResponseBody getBody() {
        return this.body;
    }

}
