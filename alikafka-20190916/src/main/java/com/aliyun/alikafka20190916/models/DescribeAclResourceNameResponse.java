// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alikafka20190916.models;

import com.aliyun.tea.*;

public class DescribeAclResourceNameResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeAclResourceNameResponseBody body;

    public static DescribeAclResourceNameResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeAclResourceNameResponse self = new DescribeAclResourceNameResponse();
        return TeaModel.build(map, self);
    }

    public DescribeAclResourceNameResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeAclResourceNameResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeAclResourceNameResponse setBody(DescribeAclResourceNameResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeAclResourceNameResponseBody getBody() {
        return this.body;
    }

}
