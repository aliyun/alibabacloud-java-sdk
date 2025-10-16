// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class DescribeAclCheckQuotaResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeAclCheckQuotaResponseBody body;

    public static DescribeAclCheckQuotaResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeAclCheckQuotaResponse self = new DescribeAclCheckQuotaResponse();
        return TeaModel.build(map, self);
    }

    public DescribeAclCheckQuotaResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeAclCheckQuotaResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeAclCheckQuotaResponse setBody(DescribeAclCheckQuotaResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeAclCheckQuotaResponseBody getBody() {
        return this.body;
    }

}
