// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20190315.models;

import com.aliyun.tea.*;

public class DescribeControllerDetectionResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeControllerDetectionResponseBody body;

    public static DescribeControllerDetectionResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeControllerDetectionResponse self = new DescribeControllerDetectionResponse();
        return TeaModel.build(map, self);
    }

    public DescribeControllerDetectionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeControllerDetectionResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeControllerDetectionResponse setBody(DescribeControllerDetectionResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeControllerDetectionResponseBody getBody() {
        return this.body;
    }

}
