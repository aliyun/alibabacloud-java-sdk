// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.advisor20180120.models;

import com.aliyun.tea.*;

public class DescribeAdvicesPageResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeAdvicesPageResponseBody body;

    public static DescribeAdvicesPageResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeAdvicesPageResponse self = new DescribeAdvicesPageResponse();
        return TeaModel.build(map, self);
    }

    public DescribeAdvicesPageResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeAdvicesPageResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeAdvicesPageResponse setBody(DescribeAdvicesPageResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeAdvicesPageResponseBody getBody() {
        return this.body;
    }

}
