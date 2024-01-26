// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class DescribeUserConnectionRecordsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeUserConnectionRecordsResponseBody body;

    public static DescribeUserConnectionRecordsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeUserConnectionRecordsResponse self = new DescribeUserConnectionRecordsResponse();
        return TeaModel.build(map, self);
    }

    public DescribeUserConnectionRecordsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeUserConnectionRecordsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeUserConnectionRecordsResponse setBody(DescribeUserConnectionRecordsResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeUserConnectionRecordsResponseBody getBody() {
        return this.body;
    }

}
