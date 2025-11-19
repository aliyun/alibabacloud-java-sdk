// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.das20200116.models;

import com.aliyun.tea.*;

public class DescribeSecurityIPGroupResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeSecurityIPGroupResponseBody body;

    public static DescribeSecurityIPGroupResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeSecurityIPGroupResponse self = new DescribeSecurityIPGroupResponse();
        return TeaModel.build(map, self);
    }

    public DescribeSecurityIPGroupResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeSecurityIPGroupResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeSecurityIPGroupResponse setBody(DescribeSecurityIPGroupResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeSecurityIPGroupResponseBody getBody() {
        return this.body;
    }

}
