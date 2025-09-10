// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eflo_controller20221215.models;

import com.aliyun.tea.*;

public class DescribeNodeTypeResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeNodeTypeResponseBody body;

    public static DescribeNodeTypeResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeNodeTypeResponse self = new DescribeNodeTypeResponse();
        return TeaModel.build(map, self);
    }

    public DescribeNodeTypeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeNodeTypeResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeNodeTypeResponse setBody(DescribeNodeTypeResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeNodeTypeResponseBody getBody() {
        return this.body;
    }

}
