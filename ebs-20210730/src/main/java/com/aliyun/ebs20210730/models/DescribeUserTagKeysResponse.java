// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ebs20210730.models;

import com.aliyun.tea.*;

public class DescribeUserTagKeysResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeUserTagKeysResponseBody body;

    public static DescribeUserTagKeysResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeUserTagKeysResponse self = new DescribeUserTagKeysResponse();
        return TeaModel.build(map, self);
    }

    public DescribeUserTagKeysResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeUserTagKeysResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeUserTagKeysResponse setBody(DescribeUserTagKeysResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeUserTagKeysResponseBody getBody() {
        return this.body;
    }

}
