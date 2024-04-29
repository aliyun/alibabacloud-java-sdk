// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddoscoo20200101.models;

import com.aliyun.tea.*;

public class DescribeSceneDefensePoliciesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeSceneDefensePoliciesResponseBody body;

    public static DescribeSceneDefensePoliciesResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeSceneDefensePoliciesResponse self = new DescribeSceneDefensePoliciesResponse();
        return TeaModel.build(map, self);
    }

    public DescribeSceneDefensePoliciesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeSceneDefensePoliciesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeSceneDefensePoliciesResponse setBody(DescribeSceneDefensePoliciesResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeSceneDefensePoliciesResponseBody getBody() {
        return this.body;
    }

}
