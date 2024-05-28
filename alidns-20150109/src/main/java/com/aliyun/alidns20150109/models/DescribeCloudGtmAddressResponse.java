// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class DescribeCloudGtmAddressResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeCloudGtmAddressResponseBody body;

    public static DescribeCloudGtmAddressResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeCloudGtmAddressResponse self = new DescribeCloudGtmAddressResponse();
        return TeaModel.build(map, self);
    }

    public DescribeCloudGtmAddressResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeCloudGtmAddressResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeCloudGtmAddressResponse setBody(DescribeCloudGtmAddressResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeCloudGtmAddressResponseBody getBody() {
        return this.body;
    }

}
