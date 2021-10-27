// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.drds20190123.models;

import com.aliyun.tea.*;

public class DescribeDataExportPreCheckResultResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeDataExportPreCheckResultResponseBody body;

    public static DescribeDataExportPreCheckResultResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeDataExportPreCheckResultResponse self = new DescribeDataExportPreCheckResultResponse();
        return TeaModel.build(map, self);
    }

    public DescribeDataExportPreCheckResultResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeDataExportPreCheckResultResponse setBody(DescribeDataExportPreCheckResultResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeDataExportPreCheckResultResponseBody getBody() {
        return this.body;
    }

}
