// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class DescribeEnsRouteTablesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeEnsRouteTablesResponseBody body;

    public static DescribeEnsRouteTablesResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeEnsRouteTablesResponse self = new DescribeEnsRouteTablesResponse();
        return TeaModel.build(map, self);
    }

    public DescribeEnsRouteTablesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeEnsRouteTablesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeEnsRouteTablesResponse setBody(DescribeEnsRouteTablesResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeEnsRouteTablesResponseBody getBody() {
        return this.body;
    }

}
