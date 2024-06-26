// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.baas20180731.models;

import com.aliyun.tea.*;

public class DescribeDownloadPathsOfContractChainResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeDownloadPathsOfContractChainResponseBody body;

    public static DescribeDownloadPathsOfContractChainResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeDownloadPathsOfContractChainResponse self = new DescribeDownloadPathsOfContractChainResponse();
        return TeaModel.build(map, self);
    }

    public DescribeDownloadPathsOfContractChainResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeDownloadPathsOfContractChainResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeDownloadPathsOfContractChainResponse setBody(DescribeDownloadPathsOfContractChainResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeDownloadPathsOfContractChainResponseBody getBody() {
        return this.body;
    }

}
