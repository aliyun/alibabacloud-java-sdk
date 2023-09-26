// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20160701.models;

import com.aliyun.tea.*;

public class DescribeSystemParamsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeSystemParamsResponseBody body;

    public static DescribeSystemParamsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeSystemParamsResponse self = new DescribeSystemParamsResponse();
        return TeaModel.build(map, self);
    }

    public DescribeSystemParamsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeSystemParamsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeSystemParamsResponse setBody(DescribeSystemParamsResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeSystemParamsResponseBody getBody() {
        return this.body;
    }

}
