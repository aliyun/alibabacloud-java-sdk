// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloud_siem20220616.models;

import com.aliyun.tea.*;

public class DescribeImportedLogCountResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeImportedLogCountResponseBody body;

    public static DescribeImportedLogCountResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeImportedLogCountResponse self = new DescribeImportedLogCountResponse();
        return TeaModel.build(map, self);
    }

    public DescribeImportedLogCountResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeImportedLogCountResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeImportedLogCountResponse setBody(DescribeImportedLogCountResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeImportedLogCountResponseBody getBody() {
        return this.body;
    }

}
