// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gpdb20160503.models;

import com.aliyun.tea.*;

public class DescribeAIServiceResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeAIServiceResponseBody body;

    public static DescribeAIServiceResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeAIServiceResponse self = new DescribeAIServiceResponse();
        return TeaModel.build(map, self);
    }

    public DescribeAIServiceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeAIServiceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeAIServiceResponse setBody(DescribeAIServiceResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeAIServiceResponseBody getBody() {
        return this.body;
    }

}
