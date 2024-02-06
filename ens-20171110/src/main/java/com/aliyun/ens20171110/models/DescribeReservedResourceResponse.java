// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class DescribeReservedResourceResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeReservedResourceResponseBody body;

    public static DescribeReservedResourceResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeReservedResourceResponse self = new DescribeReservedResourceResponse();
        return TeaModel.build(map, self);
    }

    public DescribeReservedResourceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeReservedResourceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeReservedResourceResponse setBody(DescribeReservedResourceResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeReservedResourceResponseBody getBody() {
        return this.body;
    }

}
