// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hbase20170115.models;

import com.aliyun.tea.*;

public class DescribeSubscriptionPermissionResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeSubscriptionPermissionResponseBody body;

    public static DescribeSubscriptionPermissionResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeSubscriptionPermissionResponse self = new DescribeSubscriptionPermissionResponse();
        return TeaModel.build(map, self);
    }

    public DescribeSubscriptionPermissionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeSubscriptionPermissionResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeSubscriptionPermissionResponse setBody(DescribeSubscriptionPermissionResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeSubscriptionPermissionResponseBody getBody() {
        return this.body;
    }

}
