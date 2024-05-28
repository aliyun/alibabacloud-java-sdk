// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class DescribeCloudGtmAddressReferenceResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeCloudGtmAddressReferenceResponseBody body;

    public static DescribeCloudGtmAddressReferenceResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeCloudGtmAddressReferenceResponse self = new DescribeCloudGtmAddressReferenceResponse();
        return TeaModel.build(map, self);
    }

    public DescribeCloudGtmAddressReferenceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeCloudGtmAddressReferenceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeCloudGtmAddressReferenceResponse setBody(DescribeCloudGtmAddressReferenceResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeCloudGtmAddressReferenceResponseBody getBody() {
        return this.body;
    }

}
