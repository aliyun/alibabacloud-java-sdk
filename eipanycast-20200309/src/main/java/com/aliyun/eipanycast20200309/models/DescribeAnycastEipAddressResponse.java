// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eipanycast20200309.models;

import com.aliyun.tea.*;

public class DescribeAnycastEipAddressResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeAnycastEipAddressResponseBody body;

    public static DescribeAnycastEipAddressResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeAnycastEipAddressResponse self = new DescribeAnycastEipAddressResponse();
        return TeaModel.build(map, self);
    }

    public DescribeAnycastEipAddressResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeAnycastEipAddressResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeAnycastEipAddressResponse setBody(DescribeAnycastEipAddressResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeAnycastEipAddressResponseBody getBody() {
        return this.body;
    }

}
