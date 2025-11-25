// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class DescribeAclBackupListResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeAclBackupListResponseBody body;

    public static DescribeAclBackupListResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeAclBackupListResponse self = new DescribeAclBackupListResponse();
        return TeaModel.build(map, self);
    }

    public DescribeAclBackupListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeAclBackupListResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeAclBackupListResponse setBody(DescribeAclBackupListResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeAclBackupListResponseBody getBody() {
        return this.body;
    }

}
