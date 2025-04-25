// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bssopenapi20230930.models;

import com.aliyun.tea.*;

public class DescribeUserSpnSummaryInfoResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeUserSpnSummaryInfoResponseBody body;

    public static DescribeUserSpnSummaryInfoResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeUserSpnSummaryInfoResponse self = new DescribeUserSpnSummaryInfoResponse();
        return TeaModel.build(map, self);
    }

    public DescribeUserSpnSummaryInfoResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeUserSpnSummaryInfoResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeUserSpnSummaryInfoResponse setBody(DescribeUserSpnSummaryInfoResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeUserSpnSummaryInfoResponseBody getBody() {
        return this.body;
    }

}
