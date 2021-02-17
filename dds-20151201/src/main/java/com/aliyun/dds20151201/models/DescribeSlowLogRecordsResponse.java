// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dds20151201.models;

import com.aliyun.tea.*;

public class DescribeSlowLogRecordsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeSlowLogRecordsResponseBody body;

    public static DescribeSlowLogRecordsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeSlowLogRecordsResponse self = new DescribeSlowLogRecordsResponse();
        return TeaModel.build(map, self);
    }

    public DescribeSlowLogRecordsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeSlowLogRecordsResponse setBody(DescribeSlowLogRecordsResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeSlowLogRecordsResponseBody getBody() {
        return this.body;
    }

}
