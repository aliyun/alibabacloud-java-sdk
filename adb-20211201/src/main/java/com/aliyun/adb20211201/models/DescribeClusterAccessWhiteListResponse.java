// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20211201.models;

import com.aliyun.tea.*;

public class DescribeClusterAccessWhiteListResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeClusterAccessWhiteListResponseBody body;

    public static DescribeClusterAccessWhiteListResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeClusterAccessWhiteListResponse self = new DescribeClusterAccessWhiteListResponse();
        return TeaModel.build(map, self);
    }

    public DescribeClusterAccessWhiteListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeClusterAccessWhiteListResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeClusterAccessWhiteListResponse setBody(DescribeClusterAccessWhiteListResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeClusterAccessWhiteListResponseBody getBody() {
        return this.body;
    }

}
