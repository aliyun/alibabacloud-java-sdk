// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20190315.models;

import com.aliyun.tea.*;

public class DescribeDBClusterAccessWhiteListResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
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

    public DescribeDBClusterAccessWhiteListResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeDBClusterAccessWhiteListResponse setBody(DescribeDBClusterAccessWhiteListResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeDBClusterAccessWhiteListResponseBody getBody() {
        return this.body;
    }

}
