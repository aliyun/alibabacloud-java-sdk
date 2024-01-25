// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hbr20170908.models;

import com.aliyun.tea.*;

public class DescribeHanaBackupsAsyncResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeHanaBackupsAsyncResponseBody body;

    public static DescribeHanaBackupsAsyncResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeHanaBackupsAsyncResponse self = new DescribeHanaBackupsAsyncResponse();
        return TeaModel.build(map, self);
    }

    public DescribeHanaBackupsAsyncResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeHanaBackupsAsyncResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeHanaBackupsAsyncResponse setBody(DescribeHanaBackupsAsyncResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeHanaBackupsAsyncResponseBody getBody() {
        return this.body;
    }

}
