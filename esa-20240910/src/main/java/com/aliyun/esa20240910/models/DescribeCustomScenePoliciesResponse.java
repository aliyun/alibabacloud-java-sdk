// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class DescribeCustomScenePoliciesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeCustomScenePoliciesResponseBody body;

    public static DescribeCustomScenePoliciesResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeCustomScenePoliciesResponse self = new DescribeCustomScenePoliciesResponse();
        return TeaModel.build(map, self);
    }

    public DescribeCustomScenePoliciesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeCustomScenePoliciesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeCustomScenePoliciesResponse setBody(DescribeCustomScenePoliciesResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeCustomScenePoliciesResponseBody getBody() {
        return this.body;
    }

}
