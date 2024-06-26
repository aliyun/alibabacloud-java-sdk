// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.baas20180731.models;

import com.aliyun.tea.*;

public class DescribeAntChainDownloadPathsNewResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeAntChainDownloadPathsNewResponseBody body;

    public static DescribeAntChainDownloadPathsNewResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeAntChainDownloadPathsNewResponse self = new DescribeAntChainDownloadPathsNewResponse();
        return TeaModel.build(map, self);
    }

    public DescribeAntChainDownloadPathsNewResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeAntChainDownloadPathsNewResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeAntChainDownloadPathsNewResponse setBody(DescribeAntChainDownloadPathsNewResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeAntChainDownloadPathsNewResponseBody getBody() {
        return this.body;
    }

}
