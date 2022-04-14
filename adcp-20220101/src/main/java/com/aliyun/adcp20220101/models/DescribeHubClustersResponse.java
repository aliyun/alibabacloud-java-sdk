// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adcp20220101.models;

import com.aliyun.tea.*;

public class DescribeHubClustersResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeHubClustersResponseBody body;

    public static DescribeHubClustersResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeHubClustersResponse self = new DescribeHubClustersResponse();
        return TeaModel.build(map, self);
    }

    public DescribeHubClustersResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeHubClustersResponse setBody(DescribeHubClustersResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeHubClustersResponseBody getBody() {
        return this.body;
    }

}
