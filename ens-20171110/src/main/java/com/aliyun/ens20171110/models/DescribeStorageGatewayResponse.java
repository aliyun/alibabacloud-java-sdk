// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class DescribeStorageGatewayResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeStorageGatewayResponseBody body;

    public static DescribeStorageGatewayResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeStorageGatewayResponse self = new DescribeStorageGatewayResponse();
        return TeaModel.build(map, self);
    }

    public DescribeStorageGatewayResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeStorageGatewayResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeStorageGatewayResponse setBody(DescribeStorageGatewayResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeStorageGatewayResponseBody getBody() {
        return this.body;
    }

}
