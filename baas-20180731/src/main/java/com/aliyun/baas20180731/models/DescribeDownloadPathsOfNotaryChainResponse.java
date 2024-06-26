// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.baas20180731.models;

import com.aliyun.tea.*;

public class DescribeDownloadPathsOfNotaryChainResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeDownloadPathsOfNotaryChainResponseBody body;

    public static DescribeDownloadPathsOfNotaryChainResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeDownloadPathsOfNotaryChainResponse self = new DescribeDownloadPathsOfNotaryChainResponse();
        return TeaModel.build(map, self);
    }

    public DescribeDownloadPathsOfNotaryChainResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeDownloadPathsOfNotaryChainResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeDownloadPathsOfNotaryChainResponse setBody(DescribeDownloadPathsOfNotaryChainResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeDownloadPathsOfNotaryChainResponseBody getBody() {
        return this.body;
    }

}
