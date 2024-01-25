// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hbr20170908.models;

import com.aliyun.tea.*;

public class DescribeHanaRestoresResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeHanaRestoresResponseBody body;

    public static DescribeHanaRestoresResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeHanaRestoresResponse self = new DescribeHanaRestoresResponse();
        return TeaModel.build(map, self);
    }

    public DescribeHanaRestoresResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeHanaRestoresResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeHanaRestoresResponse setBody(DescribeHanaRestoresResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeHanaRestoresResponseBody getBody() {
        return this.body;
    }

}
