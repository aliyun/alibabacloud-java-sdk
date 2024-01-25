// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20160714.models;

import com.aliyun.tea.*;

public class DescribeAbolishApiTaskResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeAbolishApiTaskResponseBody body;

    public static DescribeAbolishApiTaskResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeAbolishApiTaskResponse self = new DescribeAbolishApiTaskResponse();
        return TeaModel.build(map, self);
    }

    public DescribeAbolishApiTaskResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeAbolishApiTaskResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeAbolishApiTaskResponse setBody(DescribeAbolishApiTaskResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeAbolishApiTaskResponseBody getBody() {
        return this.body;
    }

}
