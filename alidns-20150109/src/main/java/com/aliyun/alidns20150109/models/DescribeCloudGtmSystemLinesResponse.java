// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class DescribeCloudGtmSystemLinesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeCloudGtmSystemLinesResponseBody body;

    public static DescribeCloudGtmSystemLinesResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeCloudGtmSystemLinesResponse self = new DescribeCloudGtmSystemLinesResponse();
        return TeaModel.build(map, self);
    }

    public DescribeCloudGtmSystemLinesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeCloudGtmSystemLinesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeCloudGtmSystemLinesResponse setBody(DescribeCloudGtmSystemLinesResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeCloudGtmSystemLinesResponseBody getBody() {
        return this.body;
    }

}
