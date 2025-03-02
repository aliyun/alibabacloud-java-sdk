// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dytnsapi20230101.models;

import com.aliyun.tea.*;

public class DescribeNumberHLRResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeNumberHLRResponseBody body;

    public static DescribeNumberHLRResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeNumberHLRResponse self = new DescribeNumberHLRResponse();
        return TeaModel.build(map, self);
    }

    public DescribeNumberHLRResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeNumberHLRResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeNumberHLRResponse setBody(DescribeNumberHLRResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeNumberHLRResponseBody getBody() {
        return this.body;
    }

}
