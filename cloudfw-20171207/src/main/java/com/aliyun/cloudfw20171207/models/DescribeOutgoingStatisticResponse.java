// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class DescribeOutgoingStatisticResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeOutgoingStatisticResponseBody body;

    public static DescribeOutgoingStatisticResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeOutgoingStatisticResponse self = new DescribeOutgoingStatisticResponse();
        return TeaModel.build(map, self);
    }

    public DescribeOutgoingStatisticResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeOutgoingStatisticResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeOutgoingStatisticResponse setBody(DescribeOutgoingStatisticResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeOutgoingStatisticResponseBody getBody() {
        return this.body;
    }

}
