// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class DescribeEnsRegionIdResourceResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeEnsRegionIdResourceResponseBody body;

    public static DescribeEnsRegionIdResourceResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeEnsRegionIdResourceResponse self = new DescribeEnsRegionIdResourceResponse();
        return TeaModel.build(map, self);
    }

    public DescribeEnsRegionIdResourceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeEnsRegionIdResourceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeEnsRegionIdResourceResponse setBody(DescribeEnsRegionIdResourceResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeEnsRegionIdResourceResponseBody getBody() {
        return this.body;
    }

}
