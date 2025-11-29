// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gpdb20160503.models;

import com.aliyun.tea.*;

public class DescribePrivateRAGServiceResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribePrivateRAGServiceResponseBody body;

    public static DescribePrivateRAGServiceResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribePrivateRAGServiceResponse self = new DescribePrivateRAGServiceResponse();
        return TeaModel.build(map, self);
    }

    public DescribePrivateRAGServiceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribePrivateRAGServiceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribePrivateRAGServiceResponse setBody(DescribePrivateRAGServiceResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribePrivateRAGServiceResponseBody getBody() {
        return this.body;
    }

}
