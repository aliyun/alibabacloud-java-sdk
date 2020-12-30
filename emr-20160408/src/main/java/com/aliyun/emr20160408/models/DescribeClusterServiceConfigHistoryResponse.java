// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emr20160408.models;

import com.aliyun.tea.*;

public class DescribeClusterServiceConfigHistoryResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeClusterServiceConfigHistoryResponseBody body;

    public static DescribeClusterServiceConfigHistoryResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeClusterServiceConfigHistoryResponse self = new DescribeClusterServiceConfigHistoryResponse();
        return TeaModel.build(map, self);
    }

    public DescribeClusterServiceConfigHistoryResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeClusterServiceConfigHistoryResponse setBody(DescribeClusterServiceConfigHistoryResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeClusterServiceConfigHistoryResponseBody getBody() {
        return this.body;
    }

}
