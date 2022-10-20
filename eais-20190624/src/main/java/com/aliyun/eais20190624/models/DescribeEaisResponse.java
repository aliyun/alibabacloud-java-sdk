// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eais20190624.models;

import com.aliyun.tea.*;

public class DescribeEaisResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeEaisResponseBody body;

    public static DescribeEaisResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeEaisResponse self = new DescribeEaisResponse();
        return TeaModel.build(map, self);
    }

    public DescribeEaisResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeEaisResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeEaisResponse setBody(DescribeEaisResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeEaisResponseBody getBody() {
        return this.body;
    }

}
