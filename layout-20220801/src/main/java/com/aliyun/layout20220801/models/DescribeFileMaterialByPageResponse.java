// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.layout20220801.models;

import com.aliyun.tea.*;

public class DescribeFileMaterialByPageResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeFileMaterialByPageResponseBody body;

    public static DescribeFileMaterialByPageResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeFileMaterialByPageResponse self = new DescribeFileMaterialByPageResponse();
        return TeaModel.build(map, self);
    }

    public DescribeFileMaterialByPageResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeFileMaterialByPageResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeFileMaterialByPageResponse setBody(DescribeFileMaterialByPageResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeFileMaterialByPageResponseBody getBody() {
        return this.body;
    }

}
