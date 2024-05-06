// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hbase20170115.models;

import com.aliyun.tea.*;

public class DescribeBackupPolicyResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeBackupPolicyResponseBody body;

    public static DescribeBackupPolicyResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeBackupPolicyResponse self = new DescribeBackupPolicyResponse();
        return TeaModel.build(map, self);
    }

    public DescribeBackupPolicyResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeBackupPolicyResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeBackupPolicyResponse setBody(DescribeBackupPolicyResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeBackupPolicyResponseBody getBody() {
        return this.body;
    }

}
