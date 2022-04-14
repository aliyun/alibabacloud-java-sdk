// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adcp20220101.models;

import com.aliyun.tea.*;

public class DescribeHubClusterKubeconfigResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeHubClusterKubeconfigResponseBody body;

    public static DescribeHubClusterKubeconfigResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeHubClusterKubeconfigResponse self = new DescribeHubClusterKubeconfigResponse();
        return TeaModel.build(map, self);
    }

    public DescribeHubClusterKubeconfigResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeHubClusterKubeconfigResponse setBody(DescribeHubClusterKubeconfigResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeHubClusterKubeconfigResponseBody getBody() {
        return this.body;
    }

}
