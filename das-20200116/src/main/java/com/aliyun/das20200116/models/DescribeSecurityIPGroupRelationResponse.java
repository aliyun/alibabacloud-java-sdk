// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.das20200116.models;

import com.aliyun.tea.*;

public class DescribeSecurityIPGroupRelationResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeSecurityIPGroupRelationResponseBody body;

    public static DescribeSecurityIPGroupRelationResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeSecurityIPGroupRelationResponse self = new DescribeSecurityIPGroupRelationResponse();
        return TeaModel.build(map, self);
    }

    public DescribeSecurityIPGroupRelationResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeSecurityIPGroupRelationResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeSecurityIPGroupRelationResponse setBody(DescribeSecurityIPGroupRelationResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeSecurityIPGroupRelationResponseBody getBody() {
        return this.body;
    }

}
