// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20190315.models;

import com.aliyun.tea.*;

public class DescribeAbnormalPatternDetectionResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeAbnormalPatternDetectionResponseBody body;

    public static DescribeAbnormalPatternDetectionResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeAbnormalPatternDetectionResponse self = new DescribeAbnormalPatternDetectionResponse();
        return TeaModel.build(map, self);
    }

    public DescribeAbnormalPatternDetectionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeAbnormalPatternDetectionResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeAbnormalPatternDetectionResponse setBody(DescribeAbnormalPatternDetectionResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeAbnormalPatternDetectionResponseBody getBody() {
        return this.body;
    }

}
