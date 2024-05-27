// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class DescribeCloudGtmAddressPoolResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeCloudGtmAddressPoolResponseBody body;

    public static DescribeCloudGtmAddressPoolResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeCloudGtmAddressPoolResponse self = new DescribeCloudGtmAddressPoolResponse();
        return TeaModel.build(map, self);
    }

    public DescribeCloudGtmAddressPoolResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeCloudGtmAddressPoolResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeCloudGtmAddressPoolResponse setBody(DescribeCloudGtmAddressPoolResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeCloudGtmAddressPoolResponseBody getBody() {
        return this.body;
    }

}
