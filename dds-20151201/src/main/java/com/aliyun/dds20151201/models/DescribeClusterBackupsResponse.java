// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dds20151201.models;

import com.aliyun.tea.*;

public class DescribeClusterBackupsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeClusterBackupsResponseBody body;

    public static DescribeClusterBackupsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeClusterBackupsResponse self = new DescribeClusterBackupsResponse();
        return TeaModel.build(map, self);
    }

    public DescribeClusterBackupsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeClusterBackupsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeClusterBackupsResponse setBody(DescribeClusterBackupsResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeClusterBackupsResponseBody getBody() {
        return this.body;
    }

}
