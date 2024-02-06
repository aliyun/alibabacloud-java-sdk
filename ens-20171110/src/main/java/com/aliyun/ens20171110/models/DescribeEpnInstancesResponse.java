// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class DescribeEpnInstancesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeEpnInstancesResponseBody body;

    public static DescribeEpnInstancesResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeEpnInstancesResponse self = new DescribeEpnInstancesResponse();
        return TeaModel.build(map, self);
    }

    public DescribeEpnInstancesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeEpnInstancesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeEpnInstancesResponse setBody(DescribeEpnInstancesResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeEpnInstancesResponseBody getBody() {
        return this.body;
    }

}
