// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20211201.models;

import com.aliyun.tea.*;

public class DescribeAccountAllPrivilegesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeAccountAllPrivilegesResponseBody body;

    public static DescribeAccountAllPrivilegesResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeAccountAllPrivilegesResponse self = new DescribeAccountAllPrivilegesResponse();
        return TeaModel.build(map, self);
    }

    public DescribeAccountAllPrivilegesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeAccountAllPrivilegesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeAccountAllPrivilegesResponse setBody(DescribeAccountAllPrivilegesResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeAccountAllPrivilegesResponseBody getBody() {
        return this.body;
    }

}
