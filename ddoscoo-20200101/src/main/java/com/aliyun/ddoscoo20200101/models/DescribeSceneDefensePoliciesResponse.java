// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddoscoo20200101.models;

import com.aliyun.tea.*;

public class DescribeSceneDefensePoliciesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
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

    public DescribeSceneDefensePoliciesResponse setBody(DescribeSceneDefensePoliciesResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeSceneDefensePoliciesResponseBody getBody() {
        return this.body;
    }

}
