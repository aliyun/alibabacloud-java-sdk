// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hbr20170908.models;

import com.aliyun.tea.*;

public class DescribeRecoverableOtsInstancesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeRecoverableOtsInstancesResponseBody body;

    public static DescribeRecoverableOtsInstancesResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeRecoverableOtsInstancesResponse self = new DescribeRecoverableOtsInstancesResponse();
        return TeaModel.build(map, self);
    }

    public DescribeRecoverableOtsInstancesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeRecoverableOtsInstancesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeRecoverableOtsInstancesResponse setBody(DescribeRecoverableOtsInstancesResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeRecoverableOtsInstancesResponseBody getBody() {
        return this.body;
    }

}
