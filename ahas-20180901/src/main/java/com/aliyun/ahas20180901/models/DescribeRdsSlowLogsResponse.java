// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ahas20180901.models;

import com.aliyun.tea.*;

public class DescribeRdsSlowLogsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeRdsSlowLogsResponseBody body;

    public static DescribeRdsSlowLogsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeRdsSlowLogsResponse self = new DescribeRdsSlowLogsResponse();
        return TeaModel.build(map, self);
    }

    public DescribeRdsSlowLogsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeRdsSlowLogsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeRdsSlowLogsResponse setBody(DescribeRdsSlowLogsResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeRdsSlowLogsResponseBody getBody() {
        return this.body;
    }

}
