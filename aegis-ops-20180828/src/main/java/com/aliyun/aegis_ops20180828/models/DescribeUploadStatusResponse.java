// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aegis_ops20180828.models;

import com.aliyun.tea.*;

public class DescribeUploadStatusResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeUploadStatusResponseBody body;

    public static DescribeUploadStatusResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeUploadStatusResponse self = new DescribeUploadStatusResponse();
        return TeaModel.build(map, self);
    }

    public DescribeUploadStatusResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeUploadStatusResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeUploadStatusResponse setBody(DescribeUploadStatusResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeUploadStatusResponseBody getBody() {
        return this.body;
    }

}
