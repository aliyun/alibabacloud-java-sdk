// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.baas20180731.models;

import com.aliyun.tea.*;

public class DescribeOrgnaizationChaincodesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeOrgnaizationChaincodesResponseBody body;

    public static DescribeOrgnaizationChaincodesResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeOrgnaizationChaincodesResponse self = new DescribeOrgnaizationChaincodesResponse();
        return TeaModel.build(map, self);
    }

    public DescribeOrgnaizationChaincodesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeOrgnaizationChaincodesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeOrgnaizationChaincodesResponse setBody(DescribeOrgnaizationChaincodesResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeOrgnaizationChaincodesResponseBody getBody() {
        return this.body;
    }

}
