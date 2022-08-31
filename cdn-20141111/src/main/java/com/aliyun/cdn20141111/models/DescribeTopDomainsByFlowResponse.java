// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cdn20141111.models;

import com.aliyun.tea.*;

public class DescribeTopDomainsByFlowResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeTopDomainsByFlowResponseBody body;

    public static DescribeTopDomainsByFlowResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeTopDomainsByFlowResponse self = new DescribeTopDomainsByFlowResponse();
        return TeaModel.build(map, self);
    }

    public DescribeTopDomainsByFlowResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeTopDomainsByFlowResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeTopDomainsByFlowResponse setBody(DescribeTopDomainsByFlowResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeTopDomainsByFlowResponseBody getBody() {
        return this.body;
    }

}
