// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.baas20180731.models;

import com.aliyun.tea.*;

public class DescribePublicAntChainDownloadPathsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribePublicAntChainDownloadPathsResponseBody body;

    public static DescribePublicAntChainDownloadPathsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribePublicAntChainDownloadPathsResponse self = new DescribePublicAntChainDownloadPathsResponse();
        return TeaModel.build(map, self);
    }

    public DescribePublicAntChainDownloadPathsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribePublicAntChainDownloadPathsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribePublicAntChainDownloadPathsResponse setBody(DescribePublicAntChainDownloadPathsResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribePublicAntChainDownloadPathsResponseBody getBody() {
        return this.body;
    }

}
