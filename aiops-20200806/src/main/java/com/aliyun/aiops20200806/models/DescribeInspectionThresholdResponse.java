// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiops20200806.models;

import com.aliyun.tea.*;

public class DescribeInspectionThresholdResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeInspectionThresholdResponseBody body;

    public static DescribeInspectionThresholdResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeInspectionThresholdResponse self = new DescribeInspectionThresholdResponse();
        return TeaModel.build(map, self);
    }

    public DescribeInspectionThresholdResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeInspectionThresholdResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeInspectionThresholdResponse setBody(DescribeInspectionThresholdResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeInspectionThresholdResponseBody getBody() {
        return this.body;
    }

}
