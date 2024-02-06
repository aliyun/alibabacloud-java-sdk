// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class DescribeDataPushResultResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeDataPushResultResponseBody body;

    public static DescribeDataPushResultResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeDataPushResultResponse self = new DescribeDataPushResultResponse();
        return TeaModel.build(map, self);
    }

    public DescribeDataPushResultResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeDataPushResultResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeDataPushResultResponse setBody(DescribeDataPushResultResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeDataPushResultResponseBody getBody() {
        return this.body;
    }

}
