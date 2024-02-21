// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.das20200116.models;

import com.aliyun.tea.*;

public class DescribeTopHotKeysResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeTopHotKeysResponseBody body;

    public static DescribeTopHotKeysResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeTopHotKeysResponse self = new DescribeTopHotKeysResponse();
        return TeaModel.build(map, self);
    }

    public DescribeTopHotKeysResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeTopHotKeysResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeTopHotKeysResponse setBody(DescribeTopHotKeysResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeTopHotKeysResponseBody getBody() {
        return this.body;
    }

}
