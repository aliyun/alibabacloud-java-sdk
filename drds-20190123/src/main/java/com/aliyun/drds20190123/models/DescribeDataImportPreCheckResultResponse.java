// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.drds20190123.models;

import com.aliyun.tea.*;

public class DescribeDataImportPreCheckResultResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeDataImportPreCheckResultResponseBody body;

    public static DescribeDataImportPreCheckResultResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeDataImportPreCheckResultResponse self = new DescribeDataImportPreCheckResultResponse();
        return TeaModel.build(map, self);
    }

    public DescribeDataImportPreCheckResultResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeDataImportPreCheckResultResponse setBody(DescribeDataImportPreCheckResultResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeDataImportPreCheckResultResponseBody getBody() {
        return this.body;
    }

}
