// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class DescribeCloudGtmInstanceConfigFullInfoResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeCloudGtmInstanceConfigFullInfoResponseBody body;

    public static DescribeCloudGtmInstanceConfigFullInfoResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeCloudGtmInstanceConfigFullInfoResponse self = new DescribeCloudGtmInstanceConfigFullInfoResponse();
        return TeaModel.build(map, self);
    }

    public DescribeCloudGtmInstanceConfigFullInfoResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeCloudGtmInstanceConfigFullInfoResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeCloudGtmInstanceConfigFullInfoResponse setBody(DescribeCloudGtmInstanceConfigFullInfoResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeCloudGtmInstanceConfigFullInfoResponseBody getBody() {
        return this.body;
    }

}
