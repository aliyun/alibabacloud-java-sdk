// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dds20151201.models;

import com.aliyun.tea.*;

public class DescribeRestoreDBInstanceListResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeRestoreDBInstanceListResponseBody body;

    public static DescribeRestoreDBInstanceListResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeRestoreDBInstanceListResponse self = new DescribeRestoreDBInstanceListResponse();
        return TeaModel.build(map, self);
    }

    public DescribeRestoreDBInstanceListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeRestoreDBInstanceListResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeRestoreDBInstanceListResponse setBody(DescribeRestoreDBInstanceListResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeRestoreDBInstanceListResponseBody getBody() {
        return this.body;
    }

}
