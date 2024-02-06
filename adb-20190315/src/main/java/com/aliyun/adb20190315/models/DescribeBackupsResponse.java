// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20190315.models;

import com.aliyun.tea.*;

public class DescribeBackupsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeBackupsResponseBody body;

    public static DescribeBackupsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeBackupsResponse self = new DescribeBackupsResponse();
        return TeaModel.build(map, self);
    }

    public DescribeBackupsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeBackupsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeBackupsResponse setBody(DescribeBackupsResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeBackupsResponseBody getBody() {
        return this.body;
    }

}
