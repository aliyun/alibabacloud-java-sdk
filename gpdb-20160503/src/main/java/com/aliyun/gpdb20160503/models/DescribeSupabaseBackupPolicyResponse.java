// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gpdb20160503.models;

import com.aliyun.tea.*;

public class DescribeSupabaseBackupPolicyResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeSupabaseBackupPolicyResponseBody body;

    public static DescribeSupabaseBackupPolicyResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeSupabaseBackupPolicyResponse self = new DescribeSupabaseBackupPolicyResponse();
        return TeaModel.build(map, self);
    }

    public DescribeSupabaseBackupPolicyResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeSupabaseBackupPolicyResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeSupabaseBackupPolicyResponse setBody(DescribeSupabaseBackupPolicyResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeSupabaseBackupPolicyResponseBody getBody() {
        return this.body;
    }

}
