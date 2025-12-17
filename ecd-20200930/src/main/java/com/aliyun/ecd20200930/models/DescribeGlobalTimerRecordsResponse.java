// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class DescribeGlobalTimerRecordsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeGlobalTimerRecordsResponseBody body;

    public static DescribeGlobalTimerRecordsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeGlobalTimerRecordsResponse self = new DescribeGlobalTimerRecordsResponse();
        return TeaModel.build(map, self);
    }

    public DescribeGlobalTimerRecordsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeGlobalTimerRecordsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeGlobalTimerRecordsResponse setBody(DescribeGlobalTimerRecordsResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeGlobalTimerRecordsResponseBody getBody() {
        return this.body;
    }

}
