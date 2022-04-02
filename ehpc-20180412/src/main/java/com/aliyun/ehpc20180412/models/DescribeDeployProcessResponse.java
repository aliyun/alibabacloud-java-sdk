// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ehpc20180412.models;

import com.aliyun.tea.*;

public class DescribeDeployProcessResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeDeployProcessResponseBody body;

    public static DescribeDeployProcessResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeDeployProcessResponse self = new DescribeDeployProcessResponse();
        return TeaModel.build(map, self);
    }

    public DescribeDeployProcessResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeDeployProcessResponse setBody(DescribeDeployProcessResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeDeployProcessResponseBody getBody() {
        return this.body;
    }

}
