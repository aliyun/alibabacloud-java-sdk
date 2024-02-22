// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20190101.models;

import com.aliyun.tea.*;

public class DescribeCustomEventAttributeResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeCustomEventAttributeResponseBody body;

    public static DescribeCustomEventAttributeResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeCustomEventAttributeResponse self = new DescribeCustomEventAttributeResponse();
        return TeaModel.build(map, self);
    }

    public DescribeCustomEventAttributeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeCustomEventAttributeResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeCustomEventAttributeResponse setBody(DescribeCustomEventAttributeResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeCustomEventAttributeResponseBody getBody() {
        return this.body;
    }

}
