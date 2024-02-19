// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gpdb20160503.models;

import com.aliyun.tea.*;

public class DescribeLogBackupsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeLogBackupsResponseBody body;

    public static DescribeLogBackupsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeLogBackupsResponse self = new DescribeLogBackupsResponse();
        return TeaModel.build(map, self);
    }

    public DescribeLogBackupsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeLogBackupsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeLogBackupsResponse setBody(DescribeLogBackupsResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeLogBackupsResponseBody getBody() {
        return this.body;
    }

}
