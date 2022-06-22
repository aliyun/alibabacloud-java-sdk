// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ahas20180901.models;

import com.aliyun.tea.*;

public class DescribeRdsSlowLogRecordsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeRdsSlowLogRecordsResponseBody body;

    public static DescribeRdsSlowLogRecordsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeRdsSlowLogRecordsResponse self = new DescribeRdsSlowLogRecordsResponse();
        return TeaModel.build(map, self);
    }

    public DescribeRdsSlowLogRecordsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeRdsSlowLogRecordsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeRdsSlowLogRecordsResponse setBody(DescribeRdsSlowLogRecordsResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeRdsSlowLogRecordsResponseBody getBody() {
        return this.body;
    }

}
