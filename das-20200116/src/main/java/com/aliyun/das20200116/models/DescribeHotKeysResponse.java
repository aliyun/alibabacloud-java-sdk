// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.das20200116.models;

import com.aliyun.tea.*;

public class DescribeHotKeysResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeHotKeysResponseBody body;

    public static DescribeHotKeysResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeHotKeysResponse self = new DescribeHotKeysResponse();
        return TeaModel.build(map, self);
    }

    public DescribeHotKeysResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeHotKeysResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeHotKeysResponse setBody(DescribeHotKeysResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeHotKeysResponseBody getBody() {
        return this.body;
    }

}
