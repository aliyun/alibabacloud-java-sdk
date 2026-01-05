// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms20250414.models;

import com.aliyun.tea.*;

public class DescribeFileUploadSignatureResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeFileUploadSignatureResponseBody body;

    public static DescribeFileUploadSignatureResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeFileUploadSignatureResponse self = new DescribeFileUploadSignatureResponse();
        return TeaModel.build(map, self);
    }

    public DescribeFileUploadSignatureResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeFileUploadSignatureResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeFileUploadSignatureResponse setBody(DescribeFileUploadSignatureResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeFileUploadSignatureResponseBody getBody() {
        return this.body;
    }

}
