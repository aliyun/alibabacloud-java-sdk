// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gpdb20160503.models;

import com.aliyun.tea.*;

public class DescribeUserEncryptionKeyListResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeUserEncryptionKeyListResponseBody body;

    public static DescribeUserEncryptionKeyListResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeUserEncryptionKeyListResponse self = new DescribeUserEncryptionKeyListResponse();
        return TeaModel.build(map, self);
    }

    public DescribeUserEncryptionKeyListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeUserEncryptionKeyListResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeUserEncryptionKeyListResponse setBody(DescribeUserEncryptionKeyListResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeUserEncryptionKeyListResponseBody getBody() {
        return this.body;
    }

}
