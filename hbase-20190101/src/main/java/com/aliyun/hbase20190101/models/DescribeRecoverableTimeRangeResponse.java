// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hbase20190101.models;

import com.aliyun.tea.*;

public class DescribeRecoverableTimeRangeResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeRecoverableTimeRangeResponseBody body;

    public static DescribeRecoverableTimeRangeResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeRecoverableTimeRangeResponse self = new DescribeRecoverableTimeRangeResponse();
        return TeaModel.build(map, self);
    }

    public DescribeRecoverableTimeRangeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeRecoverableTimeRangeResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeRecoverableTimeRangeResponse setBody(DescribeRecoverableTimeRangeResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeRecoverableTimeRangeResponseBody getBody() {
        return this.body;
    }

}
