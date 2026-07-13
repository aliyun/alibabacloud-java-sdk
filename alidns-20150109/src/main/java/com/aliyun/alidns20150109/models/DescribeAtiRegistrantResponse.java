// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class DescribeAtiRegistrantResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeAtiRegistrantResponseBody body;

    public static DescribeAtiRegistrantResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeAtiRegistrantResponse self = new DescribeAtiRegistrantResponse();
        return TeaModel.build(map, self);
    }

    public DescribeAtiRegistrantResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeAtiRegistrantResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeAtiRegistrantResponse setBody(DescribeAtiRegistrantResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeAtiRegistrantResponseBody getBody() {
        return this.body;
    }

}
