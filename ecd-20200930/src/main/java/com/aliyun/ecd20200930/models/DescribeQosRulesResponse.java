// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class DescribeQosRulesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeQosRulesResponseBody body;

    public static DescribeQosRulesResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeQosRulesResponse self = new DescribeQosRulesResponse();
        return TeaModel.build(map, self);
    }

    public DescribeQosRulesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeQosRulesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeQosRulesResponse setBody(DescribeQosRulesResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeQosRulesResponseBody getBody() {
        return this.body;
    }

}
