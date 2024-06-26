// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.baas20180731.models;

import com.aliyun.tea.*;

public class DescribeDownloadPathsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeDownloadPathsResponseBody body;

    public static DescribeDownloadPathsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeDownloadPathsResponse self = new DescribeDownloadPathsResponse();
        return TeaModel.build(map, self);
    }

    public DescribeDownloadPathsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeDownloadPathsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeDownloadPathsResponse setBody(DescribeDownloadPathsResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeDownloadPathsResponseBody getBody() {
        return this.body;
    }

}
