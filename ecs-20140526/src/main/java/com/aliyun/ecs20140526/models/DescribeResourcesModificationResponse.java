// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class DescribeResourcesModificationResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeResourcesModificationResponseBody body;

    public static DescribeResourcesModificationResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeResourcesModificationResponse self = new DescribeResourcesModificationResponse();
        return TeaModel.build(map, self);
    }

    public DescribeResourcesModificationResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeResourcesModificationResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeResourcesModificationResponse setBody(DescribeResourcesModificationResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeResourcesModificationResponseBody getBody() {
        return this.body;
    }

}
