// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20211201.models;

import com.aliyun.tea.*;

public class DescribeApsJobDetailResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeApsJobDetailResponseBody body;

    public static DescribeApsJobDetailResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeApsJobDetailResponse self = new DescribeApsJobDetailResponse();
        return TeaModel.build(map, self);
    }

    public DescribeApsJobDetailResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeApsJobDetailResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeApsJobDetailResponse setBody(DescribeApsJobDetailResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeApsJobDetailResponseBody getBody() {
        return this.body;
    }

}
