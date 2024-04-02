// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.green20170823.models;

import com.aliyun.tea.*;

public class DescribeWebsiteScanResultResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeWebsiteScanResultResponseBody body;

    public static DescribeWebsiteScanResultResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeWebsiteScanResultResponse self = new DescribeWebsiteScanResultResponse();
        return TeaModel.build(map, self);
    }

    public DescribeWebsiteScanResultResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeWebsiteScanResultResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeWebsiteScanResultResponse setBody(DescribeWebsiteScanResultResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeWebsiteScanResultResponseBody getBody() {
        return this.body;
    }

}
