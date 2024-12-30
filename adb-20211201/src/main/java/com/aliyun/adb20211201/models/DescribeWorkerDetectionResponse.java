// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20211201.models;

import com.aliyun.tea.*;

public class DescribeWorkerDetectionResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeWorkerDetectionResponseBody body;

    public static DescribeWorkerDetectionResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeWorkerDetectionResponse self = new DescribeWorkerDetectionResponse();
        return TeaModel.build(map, self);
    }

    public DescribeWorkerDetectionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeWorkerDetectionResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeWorkerDetectionResponse setBody(DescribeWorkerDetectionResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeWorkerDetectionResponseBody getBody() {
        return this.body;
    }

}
