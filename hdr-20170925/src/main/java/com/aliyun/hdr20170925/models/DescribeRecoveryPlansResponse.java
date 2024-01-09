// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hdr20170925.models;

import com.aliyun.tea.*;

public class DescribeRecoveryPlansResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeRecoveryPlansResponseBody body;

    public static DescribeRecoveryPlansResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeRecoveryPlansResponse self = new DescribeRecoveryPlansResponse();
        return TeaModel.build(map, self);
    }

    public DescribeRecoveryPlansResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeRecoveryPlansResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeRecoveryPlansResponse setBody(DescribeRecoveryPlansResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeRecoveryPlansResponseBody getBody() {
        return this.body;
    }

}
