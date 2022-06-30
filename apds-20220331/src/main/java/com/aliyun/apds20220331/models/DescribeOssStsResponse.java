// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.apds20220331.models;

import com.aliyun.tea.*;

public class DescribeOssStsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeOssStsResponseBody body;

    public static DescribeOssStsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeOssStsResponse self = new DescribeOssStsResponse();
        return TeaModel.build(map, self);
    }

    public DescribeOssStsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeOssStsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeOssStsResponse setBody(DescribeOssStsResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeOssStsResponseBody getBody() {
        return this.body;
    }

}
