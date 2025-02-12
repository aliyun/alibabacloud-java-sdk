// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gpdb20160503.models;

import com.aliyun.tea.*;

public class DescribeCreateIndexJobResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeCreateIndexJobResponseBody body;

    public static DescribeCreateIndexJobResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeCreateIndexJobResponse self = new DescribeCreateIndexJobResponse();
        return TeaModel.build(map, self);
    }

    public DescribeCreateIndexJobResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeCreateIndexJobResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeCreateIndexJobResponse setBody(DescribeCreateIndexJobResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeCreateIndexJobResponseBody getBody() {
        return this.body;
    }

}
