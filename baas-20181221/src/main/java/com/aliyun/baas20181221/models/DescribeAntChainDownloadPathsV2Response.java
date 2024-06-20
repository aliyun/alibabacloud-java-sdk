// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.baas20181221.models;

import com.aliyun.tea.*;

public class DescribeAntChainDownloadPathsV2Response extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeAntChainDownloadPathsV2ResponseBody body;

    public static DescribeAntChainDownloadPathsV2Response build(java.util.Map<String, ?> map) throws Exception {
        DescribeAntChainDownloadPathsV2Response self = new DescribeAntChainDownloadPathsV2Response();
        return TeaModel.build(map, self);
    }

    public DescribeAntChainDownloadPathsV2Response setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeAntChainDownloadPathsV2Response setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeAntChainDownloadPathsV2Response setBody(DescribeAntChainDownloadPathsV2ResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeAntChainDownloadPathsV2ResponseBody getBody() {
        return this.body;
    }

}
