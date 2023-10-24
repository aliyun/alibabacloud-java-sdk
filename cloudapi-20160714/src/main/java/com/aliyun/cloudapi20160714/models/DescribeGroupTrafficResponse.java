// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20160714.models;

import com.aliyun.tea.*;

public class DescribeGroupTrafficResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeGroupTrafficResponseBody body;

    public static DescribeGroupTrafficResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeGroupTrafficResponse self = new DescribeGroupTrafficResponse();
        return TeaModel.build(map, self);
    }

    public DescribeGroupTrafficResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeGroupTrafficResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeGroupTrafficResponse setBody(DescribeGroupTrafficResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeGroupTrafficResponseBody getBody() {
        return this.body;
    }

}
