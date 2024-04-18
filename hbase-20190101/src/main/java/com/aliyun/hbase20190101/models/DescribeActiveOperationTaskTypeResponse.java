// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hbase20190101.models;

import com.aliyun.tea.*;

public class DescribeActiveOperationTaskTypeResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeActiveOperationTaskTypeResponseBody body;

    public static DescribeActiveOperationTaskTypeResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeActiveOperationTaskTypeResponse self = new DescribeActiveOperationTaskTypeResponse();
        return TeaModel.build(map, self);
    }

    public DescribeActiveOperationTaskTypeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeActiveOperationTaskTypeResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeActiveOperationTaskTypeResponse setBody(DescribeActiveOperationTaskTypeResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeActiveOperationTaskTypeResponseBody getBody() {
        return this.body;
    }

}
