// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hbr20170908.models;

import com.aliyun.tea.*;

public class DescribeBackupClientsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeBackupClientsResponseBody body;

    public static DescribeBackupClientsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeBackupClientsResponse self = new DescribeBackupClientsResponse();
        return TeaModel.build(map, self);
    }

    public DescribeBackupClientsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeBackupClientsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeBackupClientsResponse setBody(DescribeBackupClientsResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeBackupClientsResponseBody getBody() {
        return this.body;
    }

}
