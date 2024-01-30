// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dds20151201.models;

import com.aliyun.tea.*;

public class DescribeActiveOperationTaskCountResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeActiveOperationTaskCountResponseBody body;

    public static DescribeActiveOperationTaskCountResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeActiveOperationTaskCountResponse self = new DescribeActiveOperationTaskCountResponse();
        return TeaModel.build(map, self);
    }

    public DescribeActiveOperationTaskCountResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeActiveOperationTaskCountResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeActiveOperationTaskCountResponse setBody(DescribeActiveOperationTaskCountResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeActiveOperationTaskCountResponseBody getBody() {
        return this.body;
    }

}
