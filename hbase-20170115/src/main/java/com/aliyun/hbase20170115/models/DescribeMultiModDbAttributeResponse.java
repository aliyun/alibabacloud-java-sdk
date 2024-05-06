// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hbase20170115.models;

import com.aliyun.tea.*;

public class DescribeMultiModDbAttributeResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeMultiModDbAttributeResponseBody body;

    public static DescribeMultiModDbAttributeResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeMultiModDbAttributeResponse self = new DescribeMultiModDbAttributeResponse();
        return TeaModel.build(map, self);
    }

    public DescribeMultiModDbAttributeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeMultiModDbAttributeResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeMultiModDbAttributeResponse setBody(DescribeMultiModDbAttributeResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeMultiModDbAttributeResponseBody getBody() {
        return this.body;
    }

}
