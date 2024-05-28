// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class DescribeCloudGtmSummaryResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeCloudGtmSummaryResponseBody body;

    public static DescribeCloudGtmSummaryResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeCloudGtmSummaryResponse self = new DescribeCloudGtmSummaryResponse();
        return TeaModel.build(map, self);
    }

    public DescribeCloudGtmSummaryResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeCloudGtmSummaryResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeCloudGtmSummaryResponse setBody(DescribeCloudGtmSummaryResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeCloudGtmSummaryResponseBody getBody() {
        return this.body;
    }

}
