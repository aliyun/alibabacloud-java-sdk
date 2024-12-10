// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20211201.models;

import com.aliyun.tea.*;

public class DescribeCompactionServiceSwitchResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeCompactionServiceSwitchResponseBody body;

    public static DescribeCompactionServiceSwitchResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeCompactionServiceSwitchResponse self = new DescribeCompactionServiceSwitchResponse();
        return TeaModel.build(map, self);
    }

    public DescribeCompactionServiceSwitchResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeCompactionServiceSwitchResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeCompactionServiceSwitchResponse setBody(DescribeCompactionServiceSwitchResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeCompactionServiceSwitchResponseBody getBody() {
        return this.body;
    }

}
