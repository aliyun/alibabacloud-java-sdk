// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.baas20180731.models;

import com.aliyun.tea.*;

public class DescribeAntChainRegionNamesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeAntChainRegionNamesResponseBody body;

    public static DescribeAntChainRegionNamesResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeAntChainRegionNamesResponse self = new DescribeAntChainRegionNamesResponse();
        return TeaModel.build(map, self);
    }

    public DescribeAntChainRegionNamesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeAntChainRegionNamesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeAntChainRegionNamesResponse setBody(DescribeAntChainRegionNamesResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeAntChainRegionNamesResponseBody getBody() {
        return this.body;
    }

}
