// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20160714.models;

import com.aliyun.tea.*;

public class DescribeApiQpsDataResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeApiQpsDataResponseBody body;

    public static DescribeApiQpsDataResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeApiQpsDataResponse self = new DescribeApiQpsDataResponse();
        return TeaModel.build(map, self);
    }

    public DescribeApiQpsDataResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeApiQpsDataResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeApiQpsDataResponse setBody(DescribeApiQpsDataResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeApiQpsDataResponseBody getBody() {
        return this.body;
    }

}
