// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.baas20180731.models;

import com.aliyun.tea.*;

public class DescribeAntChainRegionsForSaleResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeAntChainRegionsForSaleResponseBody body;

    public static DescribeAntChainRegionsForSaleResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeAntChainRegionsForSaleResponse self = new DescribeAntChainRegionsForSaleResponse();
        return TeaModel.build(map, self);
    }

    public DescribeAntChainRegionsForSaleResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeAntChainRegionsForSaleResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeAntChainRegionsForSaleResponse setBody(DescribeAntChainRegionsForSaleResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeAntChainRegionsForSaleResponseBody getBody() {
        return this.body;
    }

}
