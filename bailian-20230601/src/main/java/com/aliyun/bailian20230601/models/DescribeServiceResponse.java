// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bailian20230601.models;

import com.aliyun.tea.*;

public class DescribeServiceResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeServiceResponseBody body;

    public static DescribeServiceResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeServiceResponse self = new DescribeServiceResponse();
        return TeaModel.build(map, self);
    }

    public DescribeServiceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeServiceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeServiceResponse setBody(DescribeServiceResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeServiceResponseBody getBody() {
        return this.body;
    }

}
