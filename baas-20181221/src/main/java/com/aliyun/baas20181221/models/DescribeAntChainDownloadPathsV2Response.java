// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.baas20181221.models;

import com.aliyun.tea.*;

public class DescribeAntChainDownloadPathsV2Response extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
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

    public DescribeAntChainDownloadPathsV2Response setBody(DescribeAntChainDownloadPathsV2ResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeAntChainDownloadPathsV2ResponseBody getBody() {
        return this.body;
    }

}
