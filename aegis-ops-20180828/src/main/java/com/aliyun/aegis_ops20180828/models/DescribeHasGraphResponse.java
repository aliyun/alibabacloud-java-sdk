// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aegis_ops20180828.models;

import com.aliyun.tea.*;

public class DescribeHasGraphResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeHasGraphResponseBody body;

    public static DescribeHasGraphResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeHasGraphResponse self = new DescribeHasGraphResponse();
        return TeaModel.build(map, self);
    }

    public DescribeHasGraphResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeHasGraphResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeHasGraphResponse setBody(DescribeHasGraphResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeHasGraphResponseBody getBody() {
        return this.body;
    }

}
