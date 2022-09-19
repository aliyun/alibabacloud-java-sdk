// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20211201.models;

import com.aliyun.tea.*;

public class DescribeAsyncResultsDownloadUrlByJobIdResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeAsyncResultsDownloadUrlByJobIdResponseBody body;

    public static DescribeAsyncResultsDownloadUrlByJobIdResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeAsyncResultsDownloadUrlByJobIdResponse self = new DescribeAsyncResultsDownloadUrlByJobIdResponse();
        return TeaModel.build(map, self);
    }

    public DescribeAsyncResultsDownloadUrlByJobIdResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeAsyncResultsDownloadUrlByJobIdResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeAsyncResultsDownloadUrlByJobIdResponse setBody(DescribeAsyncResultsDownloadUrlByJobIdResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeAsyncResultsDownloadUrlByJobIdResponseBody getBody() {
        return this.body;
    }

}
