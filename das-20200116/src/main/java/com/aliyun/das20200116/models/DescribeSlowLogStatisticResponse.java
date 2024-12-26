// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.das20200116.models;

import com.aliyun.tea.*;

public class DescribeSlowLogStatisticResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeSlowLogStatisticResponseBody body;

    public static DescribeSlowLogStatisticResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeSlowLogStatisticResponse self = new DescribeSlowLogStatisticResponse();
        return TeaModel.build(map, self);
    }

    public DescribeSlowLogStatisticResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeSlowLogStatisticResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeSlowLogStatisticResponse setBody(DescribeSlowLogStatisticResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeSlowLogStatisticResponseBody getBody() {
        return this.body;
    }

}
