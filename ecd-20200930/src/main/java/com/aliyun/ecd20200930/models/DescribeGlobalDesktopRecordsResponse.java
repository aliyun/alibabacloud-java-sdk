// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class DescribeGlobalDesktopRecordsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeGlobalDesktopRecordsResponseBody body;

    public static DescribeGlobalDesktopRecordsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeGlobalDesktopRecordsResponse self = new DescribeGlobalDesktopRecordsResponse();
        return TeaModel.build(map, self);
    }

    public DescribeGlobalDesktopRecordsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeGlobalDesktopRecordsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeGlobalDesktopRecordsResponse setBody(DescribeGlobalDesktopRecordsResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeGlobalDesktopRecordsResponseBody getBody() {
        return this.body;
    }

}
