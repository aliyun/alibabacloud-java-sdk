// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class DescribeNetworkAttributeResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeNetworkAttributeResponseBody body;

    public static DescribeNetworkAttributeResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeNetworkAttributeResponse self = new DescribeNetworkAttributeResponse();
        return TeaModel.build(map, self);
    }

    public DescribeNetworkAttributeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeNetworkAttributeResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeNetworkAttributeResponse setBody(DescribeNetworkAttributeResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeNetworkAttributeResponseBody getBody() {
        return this.body;
    }

}
