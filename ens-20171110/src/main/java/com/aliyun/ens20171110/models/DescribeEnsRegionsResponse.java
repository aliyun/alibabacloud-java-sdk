// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class DescribeEnsRegionsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeEnsRegionsResponseBody body;

    public static DescribeEnsRegionsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeEnsRegionsResponse self = new DescribeEnsRegionsResponse();
        return TeaModel.build(map, self);
    }

    public DescribeEnsRegionsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeEnsRegionsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeEnsRegionsResponse setBody(DescribeEnsRegionsResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeEnsRegionsResponseBody getBody() {
        return this.body;
    }

}
