// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dds20151201.models;

import com.aliyun.tea.*;

public class DescribeAdvancedBackupPolicyResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeAdvancedBackupPolicyResponseBody body;

    public static DescribeAdvancedBackupPolicyResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeAdvancedBackupPolicyResponse self = new DescribeAdvancedBackupPolicyResponse();
        return TeaModel.build(map, self);
    }

    public DescribeAdvancedBackupPolicyResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeAdvancedBackupPolicyResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeAdvancedBackupPolicyResponse setBody(DescribeAdvancedBackupPolicyResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeAdvancedBackupPolicyResponseBody getBody() {
        return this.body;
    }

}
