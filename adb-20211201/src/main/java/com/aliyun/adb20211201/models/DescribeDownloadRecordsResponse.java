// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20211201.models;

import com.aliyun.tea.*;

public class DescribeDownloadRecordsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeDownloadRecordsResponseBody body;

    public static DescribeDownloadRecordsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeDownloadRecordsResponse self = new DescribeDownloadRecordsResponse();
        return TeaModel.build(map, self);
    }

    public DescribeDownloadRecordsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeDownloadRecordsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeDownloadRecordsResponse setBody(DescribeDownloadRecordsResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeDownloadRecordsResponseBody getBody() {
        return this.body;
    }

}
