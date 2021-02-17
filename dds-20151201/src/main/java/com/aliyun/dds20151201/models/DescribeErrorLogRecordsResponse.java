// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dds20151201.models;

import com.aliyun.tea.*;

public class DescribeErrorLogRecordsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeErrorLogRecordsResponseBody body;

    public static DescribeErrorLogRecordsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeErrorLogRecordsResponse self = new DescribeErrorLogRecordsResponse();
        return TeaModel.build(map, self);
    }

    public DescribeErrorLogRecordsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeErrorLogRecordsResponse setBody(DescribeErrorLogRecordsResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeErrorLogRecordsResponseBody getBody() {
        return this.body;
    }

}
