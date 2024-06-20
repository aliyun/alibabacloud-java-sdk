// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.baas20181221.models;

import com.aliyun.tea.*;

public class DescribeAntChainsV2Response extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeAntChainsV2ResponseBody body;

    public static DescribeAntChainsV2Response build(java.util.Map<String, ?> map) throws Exception {
        DescribeAntChainsV2Response self = new DescribeAntChainsV2Response();
        return TeaModel.build(map, self);
    }

    public DescribeAntChainsV2Response setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeAntChainsV2Response setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeAntChainsV2Response setBody(DescribeAntChainsV2ResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeAntChainsV2ResponseBody getBody() {
        return this.body;
    }

}
