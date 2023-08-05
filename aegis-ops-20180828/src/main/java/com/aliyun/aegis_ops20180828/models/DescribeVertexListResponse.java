// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aegis_ops20180828.models;

import com.aliyun.tea.*;

public class DescribeVertexListResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeVertexListResponseBody body;

    public static DescribeVertexListResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeVertexListResponse self = new DescribeVertexListResponse();
        return TeaModel.build(map, self);
    }

    public DescribeVertexListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeVertexListResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeVertexListResponse setBody(DescribeVertexListResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeVertexListResponseBody getBody() {
        return this.body;
    }

}
