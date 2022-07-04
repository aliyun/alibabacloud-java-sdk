// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.antiddos_public20170518.models;

import com.aliyun.tea.*;

public class DescribeIpDdosThresholdResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeIpDdosThresholdResponseBody body;

    public static DescribeIpDdosThresholdResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeIpDdosThresholdResponse self = new DescribeIpDdosThresholdResponse();
        return TeaModel.build(map, self);
    }

    public DescribeIpDdosThresholdResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeIpDdosThresholdResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeIpDdosThresholdResponse setBody(DescribeIpDdosThresholdResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeIpDdosThresholdResponseBody getBody() {
        return this.body;
    }

}
