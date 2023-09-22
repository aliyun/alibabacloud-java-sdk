// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudauth_intl20220809.models;

import com.aliyun.tea.*;

public class DescribeWeb3AddressLabelsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeWeb3AddressLabelsResponseBody body;

    public static DescribeWeb3AddressLabelsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeWeb3AddressLabelsResponse self = new DescribeWeb3AddressLabelsResponse();
        return TeaModel.build(map, self);
    }

    public DescribeWeb3AddressLabelsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeWeb3AddressLabelsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeWeb3AddressLabelsResponse setBody(DescribeWeb3AddressLabelsResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeWeb3AddressLabelsResponseBody getBody() {
        return this.body;
    }

}
