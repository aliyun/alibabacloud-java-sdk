// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class DescribeAtiAgentRegisterInfoResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeAtiAgentRegisterInfoResponseBody body;

    public static DescribeAtiAgentRegisterInfoResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeAtiAgentRegisterInfoResponse self = new DescribeAtiAgentRegisterInfoResponse();
        return TeaModel.build(map, self);
    }

    public DescribeAtiAgentRegisterInfoResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeAtiAgentRegisterInfoResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeAtiAgentRegisterInfoResponse setBody(DescribeAtiAgentRegisterInfoResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeAtiAgentRegisterInfoResponseBody getBody() {
        return this.body;
    }

}
