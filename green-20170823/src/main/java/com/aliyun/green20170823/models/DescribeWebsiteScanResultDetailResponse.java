// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.green20170823.models;

import com.aliyun.tea.*;

public class DescribeWebsiteScanResultDetailResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeWebsiteScanResultDetailResponseBody body;

    public static DescribeWebsiteScanResultDetailResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeWebsiteScanResultDetailResponse self = new DescribeWebsiteScanResultDetailResponse();
        return TeaModel.build(map, self);
    }

    public DescribeWebsiteScanResultDetailResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeWebsiteScanResultDetailResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeWebsiteScanResultDetailResponse setBody(DescribeWebsiteScanResultDetailResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeWebsiteScanResultDetailResponseBody getBody() {
        return this.body;
    }

}
