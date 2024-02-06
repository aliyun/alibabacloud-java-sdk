// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20190315.models;

import com.aliyun.tea.*;

public class DescribeTableDetailResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeTableDetailResponseBody body;

    public static DescribeTableDetailResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeTableDetailResponse self = new DescribeTableDetailResponse();
        return TeaModel.build(map, self);
    }

    public DescribeTableDetailResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeTableDetailResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeTableDetailResponse setBody(DescribeTableDetailResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeTableDetailResponseBody getBody() {
        return this.body;
    }

}
