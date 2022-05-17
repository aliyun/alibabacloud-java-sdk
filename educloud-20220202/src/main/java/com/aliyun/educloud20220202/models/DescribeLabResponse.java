// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.educloud20220202.models;

import com.aliyun.tea.*;

public class DescribeLabResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeLabResponseBody body;

    public static DescribeLabResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeLabResponse self = new DescribeLabResponse();
        return TeaModel.build(map, self);
    }

    public DescribeLabResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeLabResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeLabResponse setBody(DescribeLabResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeLabResponseBody getBody() {
        return this.body;
    }

}
