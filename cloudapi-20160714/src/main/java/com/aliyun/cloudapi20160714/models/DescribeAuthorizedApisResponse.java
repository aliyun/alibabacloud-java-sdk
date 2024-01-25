// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20160714.models;

import com.aliyun.tea.*;

public class DescribeAuthorizedApisResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeAuthorizedApisResponseBody body;

    public static DescribeAuthorizedApisResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeAuthorizedApisResponse self = new DescribeAuthorizedApisResponse();
        return TeaModel.build(map, self);
    }

    public DescribeAuthorizedApisResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeAuthorizedApisResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeAuthorizedApisResponse setBody(DescribeAuthorizedApisResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeAuthorizedApisResponseBody getBody() {
        return this.body;
    }

}
