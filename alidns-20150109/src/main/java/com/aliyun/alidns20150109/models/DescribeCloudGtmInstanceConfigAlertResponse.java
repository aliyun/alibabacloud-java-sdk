// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class DescribeCloudGtmInstanceConfigAlertResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeCloudGtmInstanceConfigAlertResponseBody body;

    public static DescribeCloudGtmInstanceConfigAlertResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeCloudGtmInstanceConfigAlertResponse self = new DescribeCloudGtmInstanceConfigAlertResponse();
        return TeaModel.build(map, self);
    }

    public DescribeCloudGtmInstanceConfigAlertResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeCloudGtmInstanceConfigAlertResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeCloudGtmInstanceConfigAlertResponse setBody(DescribeCloudGtmInstanceConfigAlertResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeCloudGtmInstanceConfigAlertResponseBody getBody() {
        return this.body;
    }

}
