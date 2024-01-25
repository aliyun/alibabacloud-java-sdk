// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20160714.models;

import com.aliyun.tea.*;

public class DescribeUpdateBackendTaskResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeUpdateBackendTaskResponseBody body;

    public static DescribeUpdateBackendTaskResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeUpdateBackendTaskResponse self = new DescribeUpdateBackendTaskResponse();
        return TeaModel.build(map, self);
    }

    public DescribeUpdateBackendTaskResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeUpdateBackendTaskResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeUpdateBackendTaskResponse setBody(DescribeUpdateBackendTaskResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeUpdateBackendTaskResponseBody getBody() {
        return this.body;
    }

}
