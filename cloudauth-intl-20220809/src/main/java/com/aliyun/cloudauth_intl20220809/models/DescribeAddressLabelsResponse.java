// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudauth_intl20220809.models;

import com.aliyun.tea.*;

public class DescribeAddressLabelsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeAddressLabelsResponseBody body;

    public static DescribeAddressLabelsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeAddressLabelsResponse self = new DescribeAddressLabelsResponse();
        return TeaModel.build(map, self);
    }

    public DescribeAddressLabelsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeAddressLabelsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeAddressLabelsResponse setBody(DescribeAddressLabelsResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeAddressLabelsResponseBody getBody() {
        return this.body;
    }

}
