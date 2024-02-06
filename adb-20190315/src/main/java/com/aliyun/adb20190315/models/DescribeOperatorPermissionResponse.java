// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20190315.models;

import com.aliyun.tea.*;

public class DescribeOperatorPermissionResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeOperatorPermissionResponseBody body;

    public static DescribeOperatorPermissionResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeOperatorPermissionResponse self = new DescribeOperatorPermissionResponse();
        return TeaModel.build(map, self);
    }

    public DescribeOperatorPermissionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeOperatorPermissionResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeOperatorPermissionResponse setBody(DescribeOperatorPermissionResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeOperatorPermissionResponseBody getBody() {
        return this.body;
    }

}
