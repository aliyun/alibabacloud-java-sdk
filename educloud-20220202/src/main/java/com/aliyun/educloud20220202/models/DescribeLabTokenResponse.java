// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.educloud20220202.models;

import com.aliyun.tea.*;

public class DescribeLabTokenResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeLabTokenResponseBody body;

    public static DescribeLabTokenResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeLabTokenResponse self = new DescribeLabTokenResponse();
        return TeaModel.build(map, self);
    }

    public DescribeLabTokenResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeLabTokenResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeLabTokenResponse setBody(DescribeLabTokenResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeLabTokenResponseBody getBody() {
        return this.body;
    }

}
