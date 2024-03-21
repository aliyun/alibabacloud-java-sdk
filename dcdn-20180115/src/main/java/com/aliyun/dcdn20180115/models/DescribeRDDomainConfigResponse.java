// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dcdn20180115.models;

import com.aliyun.tea.*;

public class DescribeRDDomainConfigResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeRDDomainConfigResponseBody body;

    public static DescribeRDDomainConfigResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeRDDomainConfigResponse self = new DescribeRDDomainConfigResponse();
        return TeaModel.build(map, self);
    }

    public DescribeRDDomainConfigResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeRDDomainConfigResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeRDDomainConfigResponse setBody(DescribeRDDomainConfigResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeRDDomainConfigResponseBody getBody() {
        return this.body;
    }

}
