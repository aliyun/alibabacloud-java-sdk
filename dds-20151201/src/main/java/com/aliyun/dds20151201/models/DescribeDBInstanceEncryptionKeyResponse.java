// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dds20151201.models;

import com.aliyun.tea.*;

public class DescribeDBInstanceEncryptionKeyResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeDBInstanceEncryptionKeyResponseBody body;

    public static DescribeDBInstanceEncryptionKeyResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeDBInstanceEncryptionKeyResponse self = new DescribeDBInstanceEncryptionKeyResponse();
        return TeaModel.build(map, self);
    }

    public DescribeDBInstanceEncryptionKeyResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeDBInstanceEncryptionKeyResponse setBody(DescribeDBInstanceEncryptionKeyResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeDBInstanceEncryptionKeyResponseBody getBody() {
        return this.body;
    }

}
