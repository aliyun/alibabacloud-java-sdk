// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20160201.models;

import com.aliyun.tea.*;

public class DescribeSecretKeysResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeSecretKeysResponseBody body;

    public static DescribeSecretKeysResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeSecretKeysResponse self = new DescribeSecretKeysResponse();
        return TeaModel.build(map, self);
    }

    public DescribeSecretKeysResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeSecretKeysResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeSecretKeysResponse setBody(DescribeSecretKeysResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeSecretKeysResponseBody getBody() {
        return this.body;
    }

}
