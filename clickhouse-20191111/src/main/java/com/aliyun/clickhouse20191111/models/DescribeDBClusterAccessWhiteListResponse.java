// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.clickhouse20191111.models;

import com.aliyun.tea.*;

public class DescribeDBClusterAccessWhiteListResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeDBClusterAccessWhiteListResponseBody body;

    public static DescribeDBClusterAccessWhiteListResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeDBClusterAccessWhiteListResponse self = new DescribeDBClusterAccessWhiteListResponse();
        return TeaModel.build(map, self);
    }

    public DescribeDBClusterAccessWhiteListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeDBClusterAccessWhiteListResponse setBody(DescribeDBClusterAccessWhiteListResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeDBClusterAccessWhiteListResponseBody getBody() {
        return this.body;
    }

}
