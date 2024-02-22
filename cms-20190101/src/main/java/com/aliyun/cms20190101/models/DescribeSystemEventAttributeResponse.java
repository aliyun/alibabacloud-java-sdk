// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20190101.models;

import com.aliyun.tea.*;

public class DescribeSystemEventAttributeResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeSystemEventAttributeResponseBody body;

    public static DescribeSystemEventAttributeResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeSystemEventAttributeResponse self = new DescribeSystemEventAttributeResponse();
        return TeaModel.build(map, self);
    }

    public DescribeSystemEventAttributeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeSystemEventAttributeResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeSystemEventAttributeResponse setBody(DescribeSystemEventAttributeResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeSystemEventAttributeResponseBody getBody() {
        return this.body;
    }

}
