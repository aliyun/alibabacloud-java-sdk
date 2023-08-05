// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aegis_ops20180828.models;

import com.aliyun.tea.*;

public class DescribeUploadHistoryResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeUploadHistoryResponseBody body;

    public static DescribeUploadHistoryResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeUploadHistoryResponse self = new DescribeUploadHistoryResponse();
        return TeaModel.build(map, self);
    }

    public DescribeUploadHistoryResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeUploadHistoryResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeUploadHistoryResponse setBody(DescribeUploadHistoryResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeUploadHistoryResponseBody getBody() {
        return this.body;
    }

}
