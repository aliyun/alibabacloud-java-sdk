// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20190315.models;

import com.aliyun.tea.*;

public class DescribeDownloadRecordsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
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

    public DescribeDownloadRecordsResponse setBody(DescribeDownloadRecordsResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeDownloadRecordsResponseBody getBody() {
        return this.body;
    }

}
