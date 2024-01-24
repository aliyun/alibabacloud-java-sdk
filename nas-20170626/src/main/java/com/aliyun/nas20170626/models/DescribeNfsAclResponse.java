// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.nas20170626.models;

import com.aliyun.tea.*;

public class DescribeNfsAclResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeNfsAclResponseBody body;

    public static DescribeNfsAclResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeNfsAclResponse self = new DescribeNfsAclResponse();
        return TeaModel.build(map, self);
    }

    public DescribeNfsAclResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeNfsAclResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeNfsAclResponse setBody(DescribeNfsAclResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeNfsAclResponseBody getBody() {
        return this.body;
    }

}
