// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20190315.models;

import com.aliyun.tea.*;

public class DescribeResubmitConfigResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeResubmitConfigResponseBody body;

    public static DescribeResubmitConfigResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeResubmitConfigResponse self = new DescribeResubmitConfigResponse();
        return TeaModel.build(map, self);
    }

    public DescribeResubmitConfigResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeResubmitConfigResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeResubmitConfigResponse setBody(DescribeResubmitConfigResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeResubmitConfigResponseBody getBody() {
        return this.body;
    }

}
