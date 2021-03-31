// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class DescribeDeploymentSetsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeDeploymentSetsResponseBody body;

    public static DescribeDeploymentSetsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeDeploymentSetsResponse self = new DescribeDeploymentSetsResponse();
        return TeaModel.build(map, self);
    }

    public DescribeDeploymentSetsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeDeploymentSetsResponse setBody(DescribeDeploymentSetsResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeDeploymentSetsResponseBody getBody() {
        return this.body;
    }

}
