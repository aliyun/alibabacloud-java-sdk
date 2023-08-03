// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.foasconsole20190601.models;

import com.aliyun.tea.*;

public class DescribeNamespacesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeNamespacesResponseBody body;

    public static DescribeNamespacesResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeNamespacesResponse self = new DescribeNamespacesResponse();
        return TeaModel.build(map, self);
    }

    public DescribeNamespacesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeNamespacesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeNamespacesResponse setBody(DescribeNamespacesResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeNamespacesResponseBody getBody() {
        return this.body;
    }

}
