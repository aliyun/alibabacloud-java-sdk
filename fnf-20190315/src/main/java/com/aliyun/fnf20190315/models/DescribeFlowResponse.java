// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.fnf20190315.models;

import com.aliyun.tea.*;

public class DescribeFlowResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeFlowResponseBody body;

    public static DescribeFlowResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeFlowResponse self = new DescribeFlowResponse();
        return TeaModel.build(map, self);
    }

    public DescribeFlowResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeFlowResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeFlowResponse setBody(DescribeFlowResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeFlowResponseBody getBody() {
        return this.body;
    }

}
