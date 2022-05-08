// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20160714.models;

import com.aliyun.tea.*;

public class DescribeAppSecurityResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeAppSecurityResponseBody body;

    public static DescribeAppSecurityResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeAppSecurityResponse self = new DescribeAppSecurityResponse();
        return TeaModel.build(map, self);
    }

    public DescribeAppSecurityResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeAppSecurityResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeAppSecurityResponse setBody(DescribeAppSecurityResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeAppSecurityResponseBody getBody() {
        return this.body;
    }

}
