// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddosbgp20171120.models;

import com.aliyun.tea.*;

public class DescribeTopTrafficResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeTopTrafficResponseBody body;

    public static DescribeTopTrafficResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeTopTrafficResponse self = new DescribeTopTrafficResponse();
        return TeaModel.build(map, self);
    }

    public DescribeTopTrafficResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeTopTrafficResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeTopTrafficResponse setBody(DescribeTopTrafficResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeTopTrafficResponseBody getBody() {
        return this.body;
    }

}
