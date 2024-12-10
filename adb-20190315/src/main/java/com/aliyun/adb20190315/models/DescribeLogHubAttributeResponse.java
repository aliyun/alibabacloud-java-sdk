// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20190315.models;

import com.aliyun.tea.*;

public class DescribeLogHubAttributeResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeLogHubAttributeResponseBody body;

    public static DescribeLogHubAttributeResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeLogHubAttributeResponse self = new DescribeLogHubAttributeResponse();
        return TeaModel.build(map, self);
    }

    public DescribeLogHubAttributeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeLogHubAttributeResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeLogHubAttributeResponse setBody(DescribeLogHubAttributeResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeLogHubAttributeResponseBody getBody() {
        return this.body;
    }

}
