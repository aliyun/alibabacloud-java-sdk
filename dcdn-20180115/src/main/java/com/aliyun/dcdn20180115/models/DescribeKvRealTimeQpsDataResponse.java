// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dcdn20180115.models;

import com.aliyun.tea.*;

public class DescribeKvRealTimeQpsDataResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeKvRealTimeQpsDataResponseBody body;

    public static DescribeKvRealTimeQpsDataResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeKvRealTimeQpsDataResponse self = new DescribeKvRealTimeQpsDataResponse();
        return TeaModel.build(map, self);
    }

    public DescribeKvRealTimeQpsDataResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeKvRealTimeQpsDataResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeKvRealTimeQpsDataResponse setBody(DescribeKvRealTimeQpsDataResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeKvRealTimeQpsDataResponseBody getBody() {
        return this.body;
    }

}
