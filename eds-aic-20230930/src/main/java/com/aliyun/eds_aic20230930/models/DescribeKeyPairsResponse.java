// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eds_aic20230930.models;

import com.aliyun.tea.*;

public class DescribeKeyPairsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeKeyPairsResponseBody body;

    public static DescribeKeyPairsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeKeyPairsResponse self = new DescribeKeyPairsResponse();
        return TeaModel.build(map, self);
    }

    public DescribeKeyPairsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeKeyPairsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeKeyPairsResponse setBody(DescribeKeyPairsResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeKeyPairsResponseBody getBody() {
        return this.body;
    }

}
