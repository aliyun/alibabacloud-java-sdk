// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adcp20220101.models;

import com.aliyun.tea.*;

public class DescribeHubClusterDetailsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeHubClusterDetailsResponseBody body;

    public static DescribeHubClusterDetailsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeHubClusterDetailsResponse self = new DescribeHubClusterDetailsResponse();
        return TeaModel.build(map, self);
    }

    public DescribeHubClusterDetailsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeHubClusterDetailsResponse setBody(DescribeHubClusterDetailsResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeHubClusterDetailsResponseBody getBody() {
        return this.body;
    }

}
