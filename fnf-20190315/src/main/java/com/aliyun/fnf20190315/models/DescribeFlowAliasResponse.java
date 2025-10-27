// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.fnf20190315.models;

import com.aliyun.tea.*;

public class DescribeFlowAliasResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeFlowAliasResponseBody body;

    public static DescribeFlowAliasResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeFlowAliasResponse self = new DescribeFlowAliasResponse();
        return TeaModel.build(map, self);
    }

    public DescribeFlowAliasResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeFlowAliasResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeFlowAliasResponse setBody(DescribeFlowAliasResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeFlowAliasResponseBody getBody() {
        return this.body;
    }

}
