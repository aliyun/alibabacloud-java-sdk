// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class DescribeCloudGtmAddressPoolReferenceResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeCloudGtmAddressPoolReferenceResponseBody body;

    public static DescribeCloudGtmAddressPoolReferenceResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeCloudGtmAddressPoolReferenceResponse self = new DescribeCloudGtmAddressPoolReferenceResponse();
        return TeaModel.build(map, self);
    }

    public DescribeCloudGtmAddressPoolReferenceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeCloudGtmAddressPoolReferenceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeCloudGtmAddressPoolReferenceResponse setBody(DescribeCloudGtmAddressPoolReferenceResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeCloudGtmAddressPoolReferenceResponseBody getBody() {
        return this.body;
    }

}
