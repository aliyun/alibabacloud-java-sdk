// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.baas20180731.models;

import com.aliyun.tea.*;

public class DescribeAntChainDownloadPathsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeAntChainDownloadPathsResponseBody body;

    public static DescribeAntChainDownloadPathsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeAntChainDownloadPathsResponse self = new DescribeAntChainDownloadPathsResponse();
        return TeaModel.build(map, self);
    }

    public DescribeAntChainDownloadPathsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeAntChainDownloadPathsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeAntChainDownloadPathsResponse setBody(DescribeAntChainDownloadPathsResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeAntChainDownloadPathsResponseBody getBody() {
        return this.body;
    }

}
