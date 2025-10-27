// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.fnf20190315.models;

import com.aliyun.tea.*;

public class DescribeMapRunResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeMapRunResponseBody body;

    public static DescribeMapRunResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeMapRunResponse self = new DescribeMapRunResponse();
        return TeaModel.build(map, self);
    }

    public DescribeMapRunResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeMapRunResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeMapRunResponse setBody(DescribeMapRunResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeMapRunResponseBody getBody() {
        return this.body;
    }

}
