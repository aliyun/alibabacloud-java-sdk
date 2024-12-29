// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20211201.models;

import com.aliyun.tea.*;

public class DescribeApsHiveWorkloadResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeApsHiveWorkloadResponseBody body;

    public static DescribeApsHiveWorkloadResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeApsHiveWorkloadResponse self = new DescribeApsHiveWorkloadResponse();
        return TeaModel.build(map, self);
    }

    public DescribeApsHiveWorkloadResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeApsHiveWorkloadResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeApsHiveWorkloadResponse setBody(DescribeApsHiveWorkloadResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeApsHiveWorkloadResponseBody getBody() {
        return this.body;
    }

}
