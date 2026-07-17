// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class DescribeAtiAgentRegisterInfoMarketResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeAtiAgentRegisterInfoMarketResponseBody body;

    public static DescribeAtiAgentRegisterInfoMarketResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeAtiAgentRegisterInfoMarketResponse self = new DescribeAtiAgentRegisterInfoMarketResponse();
        return TeaModel.build(map, self);
    }

    public DescribeAtiAgentRegisterInfoMarketResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeAtiAgentRegisterInfoMarketResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeAtiAgentRegisterInfoMarketResponse setBody(DescribeAtiAgentRegisterInfoMarketResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeAtiAgentRegisterInfoMarketResponseBody getBody() {
        return this.body;
    }

}
